package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("am")
public class class32 {

    @ObfuscatedName("am.m")
    public static int field692 = 0;

    @ObfuscatedName("am.r")
    public static int field716 = field692 + 202;

    @ObfuscatedName("am.n")
    public static int[] field699 = new int[256];

    @ObfuscatedName("am.d")
    public static int field698 = 0;

    @ObfuscatedName("am.o")
    public static int field703 = 0;

    @ObfuscatedName("am.as")
    public static int field693 = 0;

    @ObfuscatedName("am.ae")
    public static int field705 = 0;

    @ObfuscatedName("am.ai")
    public static int field706 = 0;

    @ObfuscatedName("am.am")
    public static int field709 = 0;

    @ObfuscatedName("am.ax")
    public static int field708 = 10;

    @ObfuscatedName("am.ay")
    public static String field701 = "";

    @ObfuscatedName("am.az")
    public static int field710 = 0;

    @ObfuscatedName("am.av")
    public static String field711 = "";

    @ObfuscatedName("am.ap")
    public static String field715 = "";

    @ObfuscatedName("am.at")
    public static String field713 = "";

    @ObfuscatedName("am.al")
    public static String field714 = "";

    @ObfuscatedName("am.ac")
    public static String field727 = "";

    @ObfuscatedName("am.ar")
    public static class159 field721 = class159.field2580;

    @ObfuscatedName("am.ag")
    public static boolean field717 = true;

    @ObfuscatedName("am.aq")
    public static int field718 = 0;

    @ObfuscatedName("am.au")
    public static String field726 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("am.aw")
    public static String field702 = "1234567890";

    @ObfuscatedName("am.af")
    public static boolean field722 = false;

    @ObfuscatedName("am.bf")
    public static int field723 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.j(Lfa;Lfa;I)I")
    public static int method147(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3102("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3102("logo", "")) {
            var2++;
        }
        if (arg1.method3102("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3102("titlebox", "")) {
            var2++;
        }
        if (arg1.method3102("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3102("runes", "")) {
            var2++;
        }
        if (arg1.method3102("title_mute", "")) {
            var2++;
        }
        if (arg1.method3103("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3103("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3102("sl_back", "");
        arg1.method3102("sl_flags", "");
        arg1.method3102("sl_arrows", "");
        arg1.method3102("sl_stars", "");
        arg1.method3102("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ag.m(I)I")
    public static int method921() {
        return 9;
    }

    @ObfuscatedName("dj.f(Ljava/awt/Component;Lfa;Lfa;ZIB)V")
    public static void method2694(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field707) {
            field710 = arg4;
            class80.method1725();
            byte[] var5 = arg1.method3101("title.jpg", "");
            Statics.field2241 = new class79(var5, arg0);
            Statics.field694 = Statics.field2241.method1652();
            if ((client.field278 & 0x20000000) == 0) {
                Statics.field756 = class77.method5(arg2, "logo", "");
            } else {
                Statics.field756 = class77.method5(arg2, "logo_deadman_mode", "");
            }
            Statics.field3149 = class77.method5(arg2, "titlebox", "");
            Statics.field719 = class77.method5(arg2, "titlebutton", "");
            Statics.field1750 = class77.method862(arg2, "runes", "");
            Statics.field2635 = class77.method862(arg2, "title_mute", "");
            Statics.field778 = class77.method5(arg2, "options_radio_buttons,0", "");
            Statics.field2036 = class77.method5(arg2, "options_radio_buttons,2", "");
            Statics.field1842 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1842[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1842[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1842[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1842[var9 + 192] = 16777215;
            }
            Statics.field2211 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2211[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2211[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2211[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2211[var13 + 192] = 16777215;
            }
            Statics.field704 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field704[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field704[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field704[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field704[var17 + 192] = 16777215;
            }
            Statics.field700 = new int[256];
            Statics.field2145 = new int[32768];
            Statics.field2895 = new int[32768];
            method199((class81) null);
            Statics.field1515 = new int[32768];
            Statics.field2654 = new int[32768];
            if (arg3) {
                field714 = "";
                field727 = "";
            }
            Statics.field65 = 0;
            Statics.field1084 = "";
            field717 = true;
            field722 = false;
            if (Statics.field2278.field136) {
                class183.method1081(2);
            } else {
                class168 var18 = Statics.field2166;
                int var19 = var18.method3099("scape main");
                int var20 = var18.method3095(var19, "");
                class183.field2941 = 1;
                Statics.field3039 = var18;
                Statics.field2946 = var19;
                Statics.field779 = var20;
                Statics.field2943 = 255;
                Statics.field2587 = false;
                Statics.field2875 = 2;
            }
            class171.method2721(false);
            Statics.field707 = true;
            field692 = (Statics.field2049 - client.field512) / 2;
            field716 = field692 + 202;
            Statics.field2241.method1605(field692, 0);
            Statics.field694.method1605(field692 + 382, 0);
            Statics.field756.method1758(field692 + 382 - Statics.field756.field1408 / 2, 18);
        } else if (arg4 == 4) {
            field710 = 4;
        }
    }

    @ObfuscatedName("a.l(Leb;I)V")
    public static void method60(class144 arg0) {
        if (!field722) {
            if ((class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4) && class140.field2131 >= field692 + 765 - 50 && class140.field2143 >= 453) {
                Statics.field2278.field136 = !Statics.field2278.field136;
                class9.method2680();
                if (Statics.field2278.field136) {
                    Statics.field2944.method3421();
                    class183.field2941 = 1;
                    Statics.field3039 = null;
                } else {
                    class168 var6 = Statics.field2166;
                    int var7 = var6.method3099("scape main");
                    int var8 = var6.method3095(var7, "");
                    class183.method869(var6, var7, var8, 255, false);
                }
            }
            if (client.field297 != 5) {
                field706++;
                if (client.field297 == 10 || client.field297 == 11) {
                    if (client.field284 == 0) {
                        if (class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4) {
                            int var9 = field692 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class140.field2131 >= var9 && class140.field2131 <= var9 + var11 && class140.field2143 >= var10 && class140.field2143 <= var10 + var12) {
                                if (class26.method2998()) {
                                    field722 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field621 != null && class26.method2998()) {
                            field722 = true;
                        }
                    }
                    int var13 = class140.field2141;
                    int var14 = class140.field2131;
                    int var15 = class140.field2143;
                    if (!Statics.field753 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field710 == 0) {
                        int var16 = field716 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class138.method2983(client.method608("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field716 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field278 & 0x4) != 0) {
                                if ((client.field278 & 0x400) == 0) {
                                    field711 = class157.field2422;
                                    field715 = class157.field2514;
                                    field713 = class157.field2515;
                                } else {
                                    field711 = class157.field2519;
                                    field715 = class157.field2520;
                                    field713 = class157.field2380;
                                }
                                field710 = 1;
                                field718 = 0;
                            } else if ((client.field278 & 0x400) == 0) {
                                field711 = class157.field2509;
                                field715 = class157.field2510;
                                field713 = class157.field2464;
                                field710 = 2;
                                field718 = 0;
                            } else {
                                field711 = class157.field2516;
                                field715 = class157.field2410;
                                field713 = class157.field2518;
                                field710 = 1;
                                field718 = 0;
                            }
                        }
                    } else if (field710 == 1) {
                        while (class137.method176()) {
                            if (Statics.field2096 == 84) {
                                field711 = class157.field2509;
                                field715 = class157.field2510;
                                field713 = class157.field2464;
                                field710 = 2;
                                field718 = 0;
                            } else if (Statics.field2096 == 13) {
                                field710 = 0;
                            }
                        }
                        int var19 = field716 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field711 = class157.field2509;
                            field715 = class157.field2510;
                            field713 = class157.field2464;
                            field710 = 2;
                            field718 = 0;
                        }
                        int var21 = field716 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field710 = 0;
                        }
                    } else if (field710 == 2) {
                        short var22 = 231;
                        int var40 = var22 + 30;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field718 = 0;
                        }
                        var40 += 15;
                        if (var13 == 1 && var15 >= var40 - 15 && var15 < var40) {
                            field718 = 1;
                        }
                        var40 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method139(class157.field2362, class157.field2541, class157.field2542);
                            field710 = 5;
                            return;
                        }
                        int var24 = field716 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field714 = field714.trim();
                            if (field714.length() == 0) {
                                method139(class157.field2415, class157.field2416, class157.field2470);
                                return;
                            }
                            if (field727.length() == 0) {
                                method139(class157.field2418, class157.field2341, class157.field2477);
                                return;
                            }
                            method139(class157.field2333, class157.field2525, class157.field2524);
                            field721 = Statics.field2278.field138.containsKey(class163.method588(field714)) ? class159.field2583 : class159.field2580;
                            client.method695(20);
                            return;
                        }
                        int var26 = field716 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field710 = 0;
                            field714 = "";
                            field727 = "";
                            Statics.field65 = 0;
                            Statics.field1084 = "";
                            field717 = true;
                        }
                        while (true) {
                            while (class137.method176()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field726.length(); var28++) {
                                    if (Statics.field209 == field726.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2096 == 13) {
                                    field710 = 0;
                                    field714 = "";
                                    field727 = "";
                                    Statics.field65 = 0;
                                    Statics.field1084 = "";
                                    field717 = true;
                                } else if (field718 == 0) {
                                    if (Statics.field2096 == 85 && field714.length() > 0) {
                                        field714 = field714.substring(0, field714.length() - 1);
                                    }
                                    if (Statics.field2096 == 84 || Statics.field2096 == 80) {
                                        field718 = 1;
                                    }
                                    if (var27 && field714.length() < 320) {
                                        field714 = field714 + Statics.field209;
                                    }
                                } else if (field718 == 1) {
                                    if (Statics.field2096 == 85 && field727.length() > 0) {
                                        field727 = field727.substring(0, field727.length() - 1);
                                    }
                                    if (Statics.field2096 == 84 || Statics.field2096 == 80) {
                                        field718 = 0;
                                    }
                                    if (Statics.field2096 == 84) {
                                        field714 = field714.trim();
                                        if (field714.length() == 0) {
                                            method139(class157.field2415, class157.field2416, class157.field2470);
                                            return;
                                        }
                                        if (field727.length() == 0) {
                                            method139(class157.field2418, class157.field2341, class157.field2477);
                                            return;
                                        }
                                        method139(class157.field2333, class157.field2525, class157.field2524);
                                        field721 = Statics.field2278.field138.containsKey(class163.method588(field714)) ? class159.field2583 : class159.field2580;
                                        client.method695(20);
                                        return;
                                    }
                                    if (var27 && field727.length() < 20) {
                                        field727 = field727 + Statics.field209;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field710 == 4) {
                        int var29 = field716 + 180 - 80;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field1084.trim();
                            if (Statics.field1084.length() != 6) {
                                method139(class157.field2331, class157.field2332, class157.field2452);
                                return;
                            }
                            Statics.field65 = Integer.parseInt(Statics.field1084);
                            Statics.field1084 = "";
                            field721 = field717 ? class159.field2579 : class159.field2588;
                            method139(class157.field2333, class157.field2525, class157.field2524);
                            client.method695(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field716 + 180 - 9 && var14 <= field716 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field717 = !field717;
                        }
                        if (var13 == 1 && var14 >= field716 + 180 - 34 && var14 <= field716 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class138.method2983(client.method608("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var31 = field716 + 180 + 80;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field710 = 0;
                            field714 = "";
                            field727 = "";
                            Statics.field65 = 0;
                            Statics.field1084 = "";
                        }
                        while (class137.method176()) {
                            boolean var32 = false;
                            for (int var33 = 0; var33 < field702.length(); var33++) {
                                if (Statics.field209 == field702.charAt(var33)) {
                                    var32 = true;
                                    break;
                                }
                            }
                            if (Statics.field2096 == 13) {
                                field710 = 0;
                                field714 = "";
                                field727 = "";
                                Statics.field65 = 0;
                                Statics.field1084 = "";
                            } else {
                                if (Statics.field2096 == 85 && Statics.field1084.length() > 0) {
                                    Statics.field1084 = Statics.field1084.substring(0, Statics.field1084.length() - 1);
                                }
                                if (Statics.field2096 == 84) {
                                    Statics.field1084.trim();
                                    if (Statics.field1084.length() != 6) {
                                        method139(class157.field2331, class157.field2332, class157.field2452);
                                        return;
                                    }
                                    Statics.field65 = Integer.parseInt(Statics.field1084);
                                    Statics.field1084 = "";
                                    field721 = field717 ? class159.field2579 : class159.field2588;
                                    method139(class157.field2333, class157.field2525, class157.field2524);
                                    client.method695(20);
                                    return;
                                }
                                if (var32 && Statics.field1084.length() < 6) {
                                    Statics.field1084 = Statics.field1084 + Statics.field209;
                                }
                            }
                        }
                    } else if (field710 == 5) {
                        int var34 = field716 + 180 - 80;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method1585();
                            return;
                        }
                        int var36 = field716 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field711 = class157.field2509;
                            field715 = class157.field2510;
                            field713 = class157.field2464;
                            field710 = 2;
                            field718 = 0;
                            field727 = "";
                        }
                        while (class137.method176()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field726.length(); var38++) {
                                if (Statics.field209 == field726.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field2096 == 13) {
                                field711 = class157.field2509;
                                field715 = class157.field2510;
                                field713 = class157.field2464;
                                field710 = 2;
                                field718 = 0;
                                field727 = "";
                            } else {
                                if (Statics.field2096 == 85 && field714.length() > 0) {
                                    field714 = field714.substring(0, field714.length() - 1);
                                }
                                if (Statics.field2096 == 84) {
                                    method1585();
                                    return;
                                }
                                if (var37 && field714.length() < 320) {
                                    field714 = field714 + Statics.field209;
                                }
                            }
                        }
                    } else if (field710 == 6) {
                        while (true) {
                            do {
                                if (!class137.method176()) {
                                    short var39 = 321;
                                    if (var13 == 1 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                                        field711 = class157.field2509;
                                        field715 = class157.field2510;
                                        field713 = class157.field2464;
                                        field710 = 2;
                                        field718 = 0;
                                        field727 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2096 != 84 && Statics.field2096 != 13);
                            field711 = class157.field2509;
                            field715 = class157.field2510;
                            field713 = class157.field2464;
                            field710 = 2;
                            field718 = 0;
                            field727 = "";
                        }
                    }
                }
            }
        } else if (class140.field2141 == 1 || !Statics.field753 && class140.field2141 == 4) {
            int var1 = field692 + 280;
            if (class140.field2131 >= var1 && class140.field2131 <= var1 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                Statics.method762(0, 0);
            } else if (class140.field2131 >= var1 + 15 && class140.field2131 <= var1 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                Statics.method762(0, 1);
            } else {
                int var2 = field692 + 390;
                if (class140.field2131 >= var2 && class140.field2131 <= var2 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                    Statics.method762(1, 0);
                } else if (class140.field2131 >= var2 + 15 && class140.field2131 <= var2 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                    Statics.method762(1, 1);
                } else {
                    int var3 = field692 + 500;
                    if (class140.field2131 >= var3 && class140.field2131 <= var3 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                        Statics.method762(2, 0);
                    } else if (class140.field2131 >= var3 + 15 && class140.field2131 <= var3 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                        Statics.method762(2, 1);
                    } else {
                        int var4 = field692 + 610;
                        if (class140.field2131 >= var4 && class140.field2131 <= var4 + 14 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                            Statics.method762(3, 0);
                        } else if (class140.field2131 >= var4 + 15 && class140.field2131 <= var4 + 80 && class140.field2143 >= 4 && class140.field2143 <= 18) {
                            Statics.method762(3, 1);
                        } else if (class140.field2131 >= field692 + 708 && class140.field2143 >= 4 && class140.field2131 <= field692 + 708 + 50 && class140.field2143 <= 20) {
                            field722 = false;
                            Statics.field2241.method1605(field692, 0);
                            Statics.field694.method1605(field692 + 382, 0);
                            Statics.field756.method1758(field692 + 382 - Statics.field756.field1408 / 2, 18);
                        } else if (field723 != -1) {
                            class26 var5 = Statics.field616[field723];
                            method666(var5);
                            field722 = false;
                            Statics.field2241.method1605(field692, 0);
                            Statics.field694.method1605(field692 + 382, 0);
                            Statics.field756.method1758(field692 + 382 - Statics.field756.field1408 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.u(I)V")
    public static void method1585() {
        field714 = field714.trim();
        if (field714.length() == 0) {
            method139(class157.field2362, class157.field2541, class157.field2542);
            return;
        }
        long var0 = class10.method2976();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method2154(var0, field714);
        }
        switch(var2) {
            case 2:
                method139(class157.field2543, class157.field2544, class157.field2545);
                field710 = 6;
                break;
            case 3:
                method139(class157.field2546, class157.field2408, class157.field2548);
                break;
            case 4:
                method139(class157.field2549, class157.field2550, class157.field2551);
                break;
            case 5:
                method139(class157.field2552, class157.field2553, class157.field2554);
                break;
            case 6:
                method139(class157.field2321, class157.field2488, class157.field2557);
                break;
            case 7:
                method139(class157.field2558, class157.field2559, class157.field2565);
        }
    }

    @ObfuscatedName("by.a(Lhj;Lhj;Lhj;ZS)V")
    public static void method1515(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field692 = (Statics.field2049 - client.field512) / 2;
            field716 = field692 + 202;
        }
        if (field722) {
            if (Statics.field750 == null) {
                Statics.field750 = class77.method751(Statics.field71, "sl_back", "");
            }
            if (Statics.field649 == null) {
                Statics.field649 = class77.method862(Statics.field71, "sl_flags", "");
            }
            if (Statics.field1749 == null) {
                Statics.field1749 = class77.method862(Statics.field71, "sl_arrows", "");
            }
            if (Statics.field2290 == null) {
                Statics.field2290 = class77.method862(Statics.field71, "sl_stars", "");
            }
            class80.method1697(field692, 23, 765, 480, 0);
            class80.method1700(field692, 0, 125, 23, 12425273, 9135624);
            class80.method1700(field692 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3812(class157.field2561, field692 + 62, 15, 0, -1);
            if (Statics.field2290 != null) {
                Statics.field2290[1].method1758(field692 + 140, 1);
                arg1.method3809(class157.field2338, field692 + 152, 10, 16777215, -1);
                Statics.field2290[0].method1758(field692 + 140, 12);
                arg1.method3809(class157.field2370, field692 + 152, 21, 16777215, -1);
            }
            if (Statics.field1749 != null) {
                int var4 = field692 + 280;
                if (class26.field620[0] == 0 && class26.field633[0] == 0) {
                    Statics.field1749[2].method1758(var4, 4);
                } else {
                    Statics.field1749[0].method1758(var4, 4);
                }
                if (class26.field620[0] == 0 && class26.field633[0] == 1) {
                    Statics.field1749[3].method1758(var4 + 15, 4);
                } else {
                    Statics.field1749[1].method1758(var4 + 15, 4);
                }
                arg0.method3809(class157.field2564, var4 + 32, 17, 16777215, -1);
                int var5 = field692 + 390;
                if (class26.field620[0] == 1 && class26.field633[0] == 0) {
                    Statics.field1749[2].method1758(var5, 4);
                } else {
                    Statics.field1749[0].method1758(var5, 4);
                }
                if (class26.field620[0] == 1 && class26.field633[0] == 1) {
                    Statics.field1749[3].method1758(var5 + 15, 4);
                } else {
                    Statics.field1749[1].method1758(var5 + 15, 4);
                }
                arg0.method3809(class157.field2497, var5 + 32, 17, 16777215, -1);
                int var6 = field692 + 500;
                if (class26.field620[0] == 2 && class26.field633[0] == 0) {
                    Statics.field1749[2].method1758(var6, 4);
                } else {
                    Statics.field1749[0].method1758(var6, 4);
                }
                if (class26.field620[0] == 2 && class26.field633[0] == 1) {
                    Statics.field1749[3].method1758(var6 + 15, 4);
                } else {
                    Statics.field1749[1].method1758(var6 + 15, 4);
                }
                arg0.method3809(class157.field2463, var6 + 32, 17, 16777215, -1);
                int var7 = field692 + 610;
                if (class26.field620[0] == 3 && class26.field633[0] == 0) {
                    Statics.field1749[2].method1758(var7, 4);
                } else {
                    Statics.field1749[0].method1758(var7, 4);
                }
                if (class26.field620[0] == 3 && class26.field633[0] == 1) {
                    Statics.field1749[3].method1758(var7 + 15, 4);
                } else {
                    Statics.field1749[1].method1758(var7 + 15, 4);
                }
                arg0.method3809(class157.field2522, var7 + 32, 17, 16777215, -1);
            }
            class80.method1697(field692 + 708, 4, 50, 16, 0);
            arg1.method3812(class157.field2534, field692 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field278 & var9;
            for (int var11 = 0; var11 < class26.field617; var11++) {
                class26 var12 = Statics.field616[var11];
                if ((var12.field623 & var9) == var10 || (var12.field623 & var9) == 0) {
                    var8++;
                }
            }
            field723 = -1;
            if (Statics.field750 != null) {
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
                int var24 = field692 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field617; var27++) {
                    class26 var28 = Statics.field616[var27];
                    if ((var28.field623 & var9) == var10 || (var28.field623 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field630);
                        if (var28.field630 == -1) {
                            var30 = class157.field2568;
                            var29 = false;
                        } else if (var28.field630 > 1980) {
                            var30 = class157.field2569;
                            var29 = false;
                        }
                        int var31 = 0;
                        byte var32;
                        if (var28.method636()) {
                            var31 = 16711680;
                            if (var28.method651()) {
                                var32 = 5;
                            } else {
                                var32 = 4;
                            }
                        } else if (var28.method634()) {
                            if (var28.method651()) {
                                var32 = 3;
                            } else {
                                var32 = 2;
                            }
                        } else if (var28.method651()) {
                            var32 = 1;
                        } else {
                            var32 = 0;
                        }
                        if (class140.field2135 >= var24 && class140.field2136 >= var23 && class140.field2135 < var13 + var24 && class140.field2136 < var14 + var23 && var29) {
                            field723 = var27;
                            Statics.field750[var32].method1610(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field750[var32].method1605(var24, var23);
                        }
                        if (Statics.field649 != null) {
                            Statics.field649[(var28.method651() ? 8 : 0) + var28.field627].method1758(var24 + 29, var23);
                        }
                        arg0.method3812(Integer.toString(var28.field622), var24 + 15, var14 / 2 + var23 + 5, var31, -1);
                        arg1.method3812(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var33 = arg1.method3896(Statics.field616[field723].field634) + 6;
                    int var34 = arg1.field3183 + 8;
                    class80.method1697(class140.field2135 - var33 / 2, class140.field2136 + 20 + 5, var33, var34, 16777120);
                    class80.method1692(class140.field2135 - var33 / 2, class140.field2136 + 20 + 5, var33, var34, 0);
                    arg1.method3812(Statics.field616[field723].field634, class140.field2135, class140.field2136 + 20 + 5 + arg1.field3183 + 4, 0, -1);
                }
            }
            try {
                Graphics var35 = Statics.field245.getGraphics();
                Statics.field1441.method1516(var35, 0, 0);
            } catch (Exception var118) {
                Statics.field245.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2241.method1605(field692, 0);
            Statics.field694.method1605(field692 + 382, 0);
            Statics.field756.method1758(field692 + 382 - Statics.field756.field1408 / 2, 18);
        }
        if (client.field297 == 0 || client.field297 == 5) {
            byte var37 = 20;
            arg0.method3812(class157.field2508, field716 + 180, 245 - var37, 16777215, -1);
            int var38 = 253 - var37;
            class80.method1692(field716 + 180 - 152, var38, 304, 34, 9179409);
            class80.method1692(field716 + 180 - 151, var38 + 1, 302, 32, 0);
            class80.method1697(field716 + 180 - 150, var38 + 2, field708 * 3, 30, 9179409);
            class80.method1697(field708 * 3 + (field716 + 180 - 150), var38 + 2, 300 - field708 * 3, 30, 0);
            arg0.method3812(field701, field716 + 180, 276 - var37, 16777215, -1);
        }
        if (client.field297 == 20) {
            Statics.field3149.method1758(field716 + 180 - Statics.field3149.field1408 / 2, 271 - Statics.field3149.field1411 / 2);
            short var39 = 211;
            arg0.method3812(field711, field716 + 180, var39, 16776960, 0);
            int var120 = var39 + 15;
            arg0.method3812(field715, field716 + 180, var120, 16776960, 0);
            int var121 = var120 + 15;
            arg0.method3812(field713, field716 + 180, var121, 16776960, 0);
            int var122 = var121 + 15;
            int var123 = var122 + 10;
            if (field710 != 4) {
                arg0.method3809(class157.field2527, field716 + 180 - 110, var123, 16777215, 0);
                short var40 = 200;
                String var41;
                for (var41 = field714; arg0.method3896(var41) > var40; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method3809(class223.method3842(var41), field716 + 180 - 70, var123, 16777215, 0);
                var120 = var123 + 15;
                String var43 = class157.field2314;
                String var44 = field727;
                String var45 = class163.method2737('*', var44.length());
                arg0.method3809(var43 + var45, field716 + 180 - 108, var120, 16777215, 0);
                var120 += 15;
            }
        }
        if (client.field297 == 10 || client.field297 == 11) {
            Statics.field3149.method1758(field716, 171);
            if (field710 == 0) {
                short var46 = 251;
                arg0.method3812(class157.field2530, field716 + 180, var46, 16776960, 0);
                int var124 = var46 + 30;
                int var47 = field716 + 180 - 80;
                short var48 = 291;
                Statics.field719.method1758(var47 - 73, var48 - 20);
                arg0.method3813(class157.field2494, var47 - 73, var48 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var49 = field716 + 180 + 80;
                Statics.field719.method1758(var49 - 73, var48 - 20);
                arg0.method3813(class157.field2532, var49 - 73, var48 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field710 == 1) {
                arg0.method3812(class157.field2372, field716 + 180, 211, 16776960, 0);
                short var50 = 236;
                arg0.method3812(field711, field716 + 180, var50, 16777215, 0);
                int var125 = var50 + 15;
                arg0.method3812(field715, field716 + 180, var125, 16777215, 0);
                int var126 = var125 + 15;
                arg0.method3812(field713, field716 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                int var51 = field716 + 180 - 80;
                short var52 = 321;
                Statics.field719.method1758(var51 - 73, var52 - 20);
                arg0.method3812(class157.field2312, var51, var52 + 5, 16777215, 0);
                int var53 = field716 + 180 + 80;
                Statics.field719.method1758(var53 - 73, var52 - 20);
                arg0.method3812(class157.field2534, var53, var52 + 5, 16777215, 0);
            } else if (field710 == 2) {
                short var54 = 211;
                arg0.method3812(field711, field716 + 180, var54, 16776960, 0);
                int var128 = var54 + 15;
                arg0.method3812(field715, field716 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3812(field713, field716 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var131 = var130 + 10;
                arg0.method3809(class157.field2527, field716 + 180 - 110, var131, 16777215, 0);
                short var55 = 200;
                String var56;
                for (var56 = field714; arg0.method3896(var56) > var55; var56 = var56.substring(1)) {
                }
                arg0.method3809(class223.method3842(var56) + (field718 == 0 & client.field287 % 40 < 20 ? class2.method1505(16776960) + class2.field23 : ""), field716 + 180 - 70, var131, 16777215, 0);
                var128 = var131 + 15;
                String var58 = class157.field2314;
                String var59 = field727;
                String var60 = class163.method2737('*', var59.length());
                arg0.method3809(var58 + var60 + (field718 == 1 & client.field287 % 40 < 20 ? class2.method1505(16776960) + class2.field23 : ""), field716 + 180 - 108, var128, 16777215, 0);
                var128 += 15;
                int var61 = field716 + 180 - 80;
                short var62 = 321;
                Statics.field719.method1758(var61 - 73, var62 - 20);
                arg0.method3812(class157.field2533, var61, var62 + 5, 16777215, 0);
                int var63 = field716 + 180 + 80;
                Statics.field719.method1758(var63 - 73, var62 - 20);
                arg0.method3812(class157.field2534, var63, var62 + 5, 16777215, 0);
                short var64 = 357;
                arg1.method3812(class157.field2499, field716 + 180, var64, 16776960, 0);
            } else if (field710 == 4) {
                arg0.method3812(class157.field2428, field716 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3812(field711, field716 + 180, var65, 16777215, 0);
                int var132 = var65 + 15;
                arg0.method3812(field715, field716 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method3812(field713, field716 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                String var67 = class157.field2322;
                String var68 = Statics.field1084;
                String var69 = class163.method2737('*', var68.length());
                arg0.method3809(var67 + var69 + (client.field287 % 40 < 20 ? class2.method1505(16776960) + class2.field23 : ""), field716 + 180 - 108, var134, 16777215, 0);
                int var135 = var134 - 8;
                arg0.method3809(class157.field2305, field716 + 180 - 9, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method3809(class157.field2326, field716 + 180 - 9, var136, 16776960, 0);
                int var70 = field716 + 180 - 9 + arg0.method3896(class157.field2326) + 15;
                int var71 = var136 - arg0.field3183;
                class81 var72;
                if (field717) {
                    var72 = Statics.field2036;
                } else {
                    var72 = Statics.field778;
                }
                var72.method1758(var70, var71);
                var132 = var136 + 15;
                int var73 = field716 + 180 - 80;
                short var74 = 321;
                Statics.field719.method1758(var73 - 73, var74 - 20);
                arg0.method3812(class157.field2312, var73, var74 + 5, 16777215, 0);
                int var75 = field716 + 180 + 80;
                Statics.field719.method1758(var75 - 73, var74 - 20);
                arg0.method3812(class157.field2534, var75, var74 + 5, 16777215, 0);
                arg1.method3812(class157.field2523, field716 + 180, var74 + 36, 255, 0);
            } else if (field710 == 5) {
                arg0.method3812(class157.field2536, field716 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3812(field711, field716 + 180, var76, 16776960, 0);
                int var137 = var76 + 15;
                arg2.method3812(field715, field716 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg2.method3812(field713, field716 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 14;
                arg0.method3809(class157.field2537, field716 + 180 - 145, var140, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field714; arg0.method3896(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3809(class223.method3842(var78) + (client.field287 % 40 < 20 ? class2.method1505(16776960) + class2.field23 : ""), field716 + 180 - 34, var140, 16777215, 0);
                var137 = var140 + 15;
                int var79 = field716 + 180 - 80;
                short var80 = 321;
                Statics.field719.method1758(var79 - 73, var80 - 20);
                arg0.method3812(class157.field2505, var79, var80 + 5, 16777215, 0);
                int var81 = field716 + 180 + 80;
                Statics.field719.method1758(var81 - 73, var80 - 20);
                arg0.method3812(class157.field2539, var81, var80 + 5, 16777215, 0);
            } else if (field710 == 6) {
                short var82 = 211;
                arg0.method3812(field711, field716 + 180, var82, 16776960, 0);
                int var141 = var82 + 15;
                arg0.method3812(field715, field716 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method3812(field713, field716 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var83 = field716 + 180;
                short var84 = 321;
                Statics.field719.method1758(var83 - 73, var84 - 20);
                arg0.method3812(class157.field2539, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field706 > 0) {
            int var85 = field706;
            short var86 = 256;
            field693 += var85 * 128;
            if (field693 > Statics.field2145.length) {
                field693 -= Statics.field2145.length;
                int var87 = (int) (Math.random() * 12.0D);
                method199(Statics.field1750[var87]);
            }
            int var88 = 0;
            int var89 = var85 * 128;
            int var90 = (var86 - var85) * 128;
            for (int var91 = 0; var91 < var90; var91++) {
                int var92 = Statics.field1515[var88 + var89] - Statics.field2145[field693 + var88 & Statics.field2145.length - 1] * var85 / 6;
                if (var92 < 0) {
                    var92 = 0;
                }
                Statics.field1515[var88++] = var92;
            }
            for (int var93 = var86 - var85; var93 < var86; var93++) {
                int var94 = var93 * 128;
                for (int var95 = 0; var95 < 128; var95++) {
                    int var96 = (int) (Math.random() * 100.0D);
                    if (var96 < 50 && var95 > 10 && var95 < 118) {
                        Statics.field1515[var94 + var95] = 255;
                    } else {
                        Statics.field1515[var94 + var95] = 0;
                    }
                }
            }
            if (field698 > 0) {
                field698 -= var85 * 4;
            }
            if (field703 > 0) {
                field703 -= var85 * 4;
            }
            if (field698 == 0 && field703 == 0) {
                int var97 = (int) (Math.random() * (double) (2000 / var85));
                if (var97 == 0) {
                    field698 = 1024;
                }
                if (var97 == 1) {
                    field703 = 1024;
                }
            }
            for (int var98 = 0; var98 < var86 - var85; var98++) {
                field699[var98] = field699[var85 + var98];
            }
            for (int var99 = var86 - var85; var99 < var86; var99++) {
                field699[var99] = (int) (Math.sin((double) field709 / 14.0D) * 16.0D + Math.sin((double) field709 / 15.0D) * 14.0D + Math.sin((double) field709 / 16.0D) * 12.0D);
                field709++;
            }
            field705 += var85 * 1586968251;
            int var100 = ((client.field287 & 0x1) + var85) / 2;
            if (var100 > 0) {
                for (int var101 = 0; var101 < field705 * 2036458732; var101++) {
                    int var102 = (int) (Math.random() * 124.0D) + 2;
                    int var103 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1515[(var103 << 7) + var102] = 192;
                }
                field705 = 0;
                int var104 = 0;
                label446: while (true) {
                    if (var104 >= var86) {
                        int var108 = 0;
                        while (true) {
                            if (var108 >= 128) {
                                break label446;
                            }
                            int var109 = 0;
                            for (int var110 = -var100; var110 < var86; var110++) {
                                int var111 = var110 * 128;
                                if (var100 + var110 < var86) {
                                    var109 += Statics.field2654[var100 * 128 + var108 + var111];
                                }
                                if (var110 - (var100 + 1) >= 0) {
                                    var109 -= Statics.field2654[var108 + var111 - (var100 + 1) * 128];
                                }
                                if (var110 >= 0) {
                                    Statics.field1515[var108 + var111] = var109 / (var100 * 2 + 1);
                                }
                            }
                            var108++;
                        }
                    }
                    int var105 = 0;
                    int var106 = var104 * 128;
                    for (int var107 = -var100; var107 < 128; var107++) {
                        if (var100 + var107 < 128) {
                            var105 += Statics.field1515[var106 + var107 + var100];
                        }
                        if (var107 - (var100 + 1) >= 0) {
                            var105 -= Statics.field1515[var106 + var107 - (var100 + 1)];
                        }
                        if (var107 >= 0) {
                            Statics.field2654[var106 + var107] = var105 / (var100 * 2 + 1);
                        }
                    }
                    var104++;
                }
            }
            field706 = 0;
        }
        method156();
        Statics.field2635[Statics.field2278.field136 ? 1 : 0].method1758(field692 + 765 - 40, 463);
        if (client.field297 > 5 && client.field284 == 0) {
            if (Statics.field160 == null) {
                Statics.field160 = class77.method5(Statics.field71, "sl_button", "");
            } else {
                int var112 = field692 + 5;
                short var113 = 463;
                byte var114 = 100;
                byte var115 = 35;
                Statics.field160.method1758(var112, var113);
                arg0.method3812(class157.field2560 + " " + client.field422, var114 / 2 + var112, var115 / 2 + var113 - 2, 16777215, 0);
                if (Statics.field621 == null) {
                    arg1.method3812(class157.field2571, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                } else {
                    arg1.method3812(class157.field2462, var114 / 2 + var112, var115 / 2 + var113 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var116 = Statics.field245.getGraphics();
            Statics.field1441.method1516(var116, 0, 0);
        } catch (Exception var119) {
            Statics.field245.repaint();
        }
    }

    @ObfuscatedName("k.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method139(String arg0, String arg1, String arg2) {
        field711 = arg0;
        field715 = arg1;
        field713 = arg2;
    }

    @ObfuscatedName("r.i(Lcp;I)V")
    public static final void method199(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2145.length; var2++) {
            Statics.field2145[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2145[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2895[var8] = (Statics.field2145[var8 - 1] + Statics.field2145[var8 + 1] + Statics.field2145[var8 - 128] + Statics.field2145[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2145;
            Statics.field2145 = Statics.field2895;
            Statics.field2895 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1411; var11++) {
            for (int var12 = 0; var12 < arg0.field1408; var12++) {
                if (arg0.field1409[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1412;
                    int var14 = var11 + 16 + arg0.field1410;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2145[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cx.t(IIIB)I")
    public static final int method1959(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("w.k(B)V")
    public static final void method156() {
        short var0 = 256;
        if (field698 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field698 > 768) {
                    Statics.field700[var1] = method1959(Statics.field1842[var1], Statics.field2211[var1], 1024 - field698);
                } else if (field698 > 256) {
                    Statics.field700[var1] = Statics.field2211[var1];
                } else {
                    Statics.field700[var1] = method1959(Statics.field2211[var1], Statics.field1842[var1], 256 - field698);
                }
            }
        } else if (field703 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field703 > 768) {
                    Statics.field700[var2] = method1959(Statics.field1842[var2], Statics.field704[var2], 1024 - field703);
                } else if (field703 > 256) {
                    Statics.field700[var2] = Statics.field704[var2];
                } else {
                    Statics.field700[var2] = method1959(Statics.field704[var2], Statics.field1842[var2], 256 - field703);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field700[var3] = Statics.field1842[var3];
            }
        }
        class80.method1693(field692, 9, field692 + 128, var0 + 7);
        Statics.field2241.method1605(field692, 0);
        class80.method1752();
        int var4 = 0;
        int var5 = field692 + Statics.field1441.field1382 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field699[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1515[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field700[var10];
                    int var14 = Statics.field1441.field1388[var5];
                    Statics.field1441.field1388[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1441.field1382 + var8 - 128;
        }
        class80.method1693(field692 + 765 - 128, 9, field692 + 765, var0 + 7);
        Statics.field694.method1605(field692 + 382, 0);
        class80.method1752();
        int var15 = 0;
        int var16 = field692 + Statics.field1441.field1382 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field699[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1515[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field700[var22];
                    int var26 = Statics.field1441.field1388[var20];
                    Statics.field1441.field1388[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1441.field1382 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("aa.s(Lb;I)V")
    public static void method666(class26 arg0) {
        if (arg0.method651() != client.field282) {
            client.field282 = arg0.method651();
            boolean var1 = arg0.method651();
            if (Statics.field1751 != var1) {
                class52.method584();
                Statics.field1751 = var1;
            }
        }
        Statics.field960 = arg0.field625;
        client.field422 = arg0.field622;
        client.field278 = arg0.field623;
        Statics.field165 = client.field280 == 0 ? 43594 : arg0.field622 + 40000;
        Statics.field1990 = client.field280 == 0 ? 443 : arg0.field622 + 50000;
        Statics.field220 = Statics.field165;
    }
}

package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ar")
public class class32 {

    @ObfuscatedName("ar.f")
    public static int field721 = 0;

    @ObfuscatedName("ar.x")
    public static int field747 = field721 + 202;

    @ObfuscatedName("ar.n")
    public static int[] field728 = new int[256];

    @ObfuscatedName("ar.r")
    public static int field727 = 0;

    @ObfuscatedName("ar.b")
    public static int field749 = 0;

    @ObfuscatedName("ar.ak")
    public static int field731 = 0;

    @ObfuscatedName("ar.ai")
    public static int field723 = 0;

    @ObfuscatedName("ar.au")
    public static int field730 = 0;

    @ObfuscatedName("ar.ar")
    public static int field734 = 0;

    @ObfuscatedName("ar.aw")
    public static int field741 = 10;

    @ObfuscatedName("ar.at")
    public static String field736 = "";

    @ObfuscatedName("ar.al")
    public static int field737 = 0;

    @ObfuscatedName("ar.aj")
    public static String field738 = "";

    @ObfuscatedName("ar.ag")
    public static String field720 = "";

    @ObfuscatedName("ar.ay")
    public static String field740 = "";

    @ObfuscatedName("ar.az")
    public static String field735 = "";

    @ObfuscatedName("ar.ac")
    public static String field742 = "";

    @ObfuscatedName("ar.aa")
    public static String field733 = "";

    @ObfuscatedName("ar.ao")
    public static class159 field739 = class159.field2608;

    @ObfuscatedName("ar.an")
    public static boolean field745 = true;

    @ObfuscatedName("ar.ae")
    public static int field746 = 0;

    @ObfuscatedName("ar.ap")
    public static String field724 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ax")
    public static String field748 = "1234567890";

    @ObfuscatedName("ar.as")
    public static boolean field743 = false;

    @ObfuscatedName("ar.br")
    public static int field750 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.v(Lfh;Lfh;I)I")
    public static int method3137(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3053("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3053("logo", "")) {
            var2++;
        }
        if (arg1.method3053("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3053("titlebox", "")) {
            var2++;
        }
        if (arg1.method3053("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3053("runes", "")) {
            var2++;
        }
        if (arg1.method3053("title_mute", "")) {
            var2++;
        }
        if (arg1.method3044("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3044("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3053("sl_back", "");
        arg1.method3053("sl_flags", "");
        arg1.method3053("sl_arrows", "");
        arg1.method3053("sl_stars", "");
        arg1.method3053("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cn.f(I)I")
    public static int method2050() {
        return 9;
    }

    @ObfuscatedName("k.i(Ljava/awt/Component;Lfh;Lfh;ZIS)V")
    public static void method557(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field732) {
            field737 = arg4;
            class80.method1688();
            byte[] var5 = arg1.method3046("title.jpg", "");
            Statics.field1357 = new class79(var5, arg0);
            Statics.field2306 = Statics.field1357.method1602();
            if ((client.field293 & 0x20000000) == 0) {
                Statics.field3147 = Statics.method970(arg2, "logo", "");
            } else {
                Statics.field3147 = Statics.method970(arg2, "logo_deadman_mode", "");
            }
            Statics.field722 = Statics.method970(arg2, "titlebox", "");
            Statics.field744 = Statics.method970(arg2, "titlebutton", "");
            Statics.field2717 = class77.method95(arg2, "runes", "");
            Statics.field3152 = class77.method95(arg2, "title_mute", "");
            Statics.field1596 = Statics.method970(arg2, "options_radio_buttons,0", "");
            Statics.field586 = Statics.method970(arg2, "options_radio_buttons,2", "");
            Statics.field726 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field726[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field726[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field726[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field726[var9 + 192] = 16777215;
            }
            Statics.field1746 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1746[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1746[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1746[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1746[var13 + 192] = 16777215;
            }
            Statics.field623 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field623[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field623[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field623[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field623[var17 + 192] = 16777215;
            }
            Statics.field2673 = new int[256];
            Statics.field729 = new int[32768];
            Statics.field725 = new int[32768];
            method2932((class81) null);
            Statics.field607 = new int[32768];
            Statics.field180 = new int[32768];
            if (arg3) {
                field742 = "";
                field733 = "";
            }
            Statics.field212 = 0;
            Statics.field2196 = "";
            field745 = true;
            field743 = false;
            if (Statics.field666.field151) {
                class183.field2958 = 1;
                Statics.field2959 = null;
                Statics.field2956 = -1;
                Statics.field2709 = -1;
                Statics.field2104 = 0;
                Statics.field2710 = false;
                Statics.field2939 = 2;
            } else {
                class168 var18 = Statics.field2160;
                int var19 = var18.method3040("scape main");
                int var20 = var18.method3041(var19, "");
                class183.method2794(2, var18, var19, var20, 255, false);
            }
            class171.method2638(false);
            Statics.field732 = true;
            field721 = (Statics.field1957 - client.field502) / 2;
            field747 = field721 + 202;
            Statics.field1357.method1612(field721, 0);
            Statics.field2306.method1612(field721 + 382, 0);
            Statics.field3147.method1754(field721 + 382 - Statics.field3147.field1414 / 2, 18);
        } else if (arg4 == 4) {
            field737 = 4;
        }
    }

    @ObfuscatedName("af.d(Lei;B)V")
    public static void method619(class144 arg0) {
        if (!field743) {
            if ((class140.field2166 == 1 || !Statics.field571 && class140.field2166 == 4) && class140.field2167 >= field721 + 765 - 50 && class140.field2168 >= 453) {
                Statics.field666.field151 = !Statics.field666.field151;
                class9.method178();
                if (Statics.field666.field151) {
                    Statics.field2963.method3371();
                    class183.field2958 = 1;
                    Statics.field2959 = null;
                } else {
                    class183.method1(Statics.field2160, "scape main", "", 255, false);
                }
            }
            if (client.field475 != 5) {
                field730++;
                if (client.field475 == 10 || client.field475 == 11) {
                    if (client.field480 == 0) {
                        if (class140.field2166 == 1 || !Statics.field571 && class140.field2166 == 4) {
                            int var6 = field721 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class140.field2167 >= var6 && class140.field2167 <= var6 + var8 && class140.field2168 >= var7 && class140.field2168 <= var7 + var9) {
                                method160();
                                return;
                            }
                        }
                        if (Statics.field3126 != null) {
                            method160();
                        }
                    }
                    int var10 = class140.field2166;
                    int var11 = class140.field2167;
                    int var12 = class140.field2168;
                    if (!Statics.field571 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field737 == 0) {
                        int var13 = field747 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class138.method2051(client.method1591("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field747 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field293 & 0x2000000) != 0) {
                                field738 = "";
                                field720 = class157.field2542;
                                field740 = class157.field2378;
                                field735 = class157.field2496;
                                field737 = 1;
                                field746 = 0;
                            } else if ((client.field293 & 0x4) != 0) {
                                if ((client.field293 & 0x400) == 0) {
                                    field720 = class157.field2533;
                                    field740 = class157.field2534;
                                    field735 = class157.field2535;
                                } else {
                                    field720 = class157.field2541;
                                    field740 = class157.field2540;
                                    field735 = class157.field2463;
                                }
                                field738 = class157.field2532;
                                field737 = 1;
                                field746 = 0;
                            } else if ((client.field293 & 0x400) == 0) {
                                field720 = class157.field2529;
                                field740 = class157.field2530;
                                field735 = class157.field2531;
                                field737 = 2;
                                field746 = 0;
                            } else {
                                field720 = class157.field2536;
                                field740 = class157.field2537;
                                field735 = class157.field2538;
                                field738 = class157.field2532;
                                field737 = 1;
                                field746 = 0;
                            }
                        }
                    } else if (field737 == 1) {
                        while (class137.method564()) {
                            if (Statics.field2120 == 84) {
                                field720 = class157.field2529;
                                field740 = class157.field2530;
                                field735 = class157.field2531;
                                field737 = 2;
                                field746 = 0;
                            } else if (Statics.field2120 == 13) {
                                field737 = 0;
                            }
                        }
                        int var16 = field747 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field720 = class157.field2529;
                            field740 = class157.field2530;
                            field735 = class157.field2531;
                            field737 = 2;
                            field746 = 0;
                        }
                        int var18 = field747 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field737 = 0;
                        }
                    } else if (field737 == 2) {
                        short var19 = 231;
                        int var41 = var19 + 30;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field746 = 0;
                        }
                        var41 += 15;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field746 = 1;
                        }
                        var41 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method5(class157.field2568, class157.field2569, class157.field2504);
                            field737 = 5;
                            return;
                        }
                        int var21 = field747 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field742 = field742.trim();
                            if (field742.length() == 0) {
                                method5(class157.field2435, class157.field2436, class157.field2437);
                                return;
                            }
                            if (field733.length() == 0) {
                                method5(class157.field2448, class157.field2479, class157.field2440);
                                return;
                            }
                            method5(class157.field2423, class157.field2548, class157.field2549);
                            field739 = Statics.field666.field146.containsKey(class163.method118(field742)) ? class159.field2613 : class159.field2608;
                            client.method1513(20);
                            return;
                        }
                        int var23 = field747 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field737 = 0;
                            field742 = "";
                            field733 = "";
                            Statics.field212 = 0;
                            Statics.field2196 = "";
                            field745 = true;
                        }
                        while (true) {
                            while (class137.method564()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field724.length(); var25++) {
                                    if (Statics.field2111 == field724.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2120 == 13) {
                                    field737 = 0;
                                    field742 = "";
                                    field733 = "";
                                    Statics.field212 = 0;
                                    Statics.field2196 = "";
                                    field745 = true;
                                } else if (field746 == 0) {
                                    if (Statics.field2120 == 85 && field742.length() > 0) {
                                        field742 = field742.substring(0, field742.length() - 1);
                                    }
                                    if (Statics.field2120 == 84 || Statics.field2120 == 80) {
                                        field746 = 1;
                                    }
                                    if (var24 && field742.length() < 320) {
                                        field742 = field742 + Statics.field2111;
                                    }
                                } else if (field746 == 1) {
                                    if (Statics.field2120 == 85 && field733.length() > 0) {
                                        field733 = field733.substring(0, field733.length() - 1);
                                    }
                                    if (Statics.field2120 == 84 || Statics.field2120 == 80) {
                                        field746 = 0;
                                    }
                                    if (Statics.field2120 == 84) {
                                        field742 = field742.trim();
                                        if (field742.length() == 0) {
                                            method5(class157.field2435, class157.field2436, class157.field2437);
                                            return;
                                        }
                                        if (field733.length() == 0) {
                                            method5(class157.field2448, class157.field2479, class157.field2440);
                                            return;
                                        }
                                        method5(class157.field2423, class157.field2548, class157.field2549);
                                        field739 = Statics.field666.field146.containsKey(class163.method118(field742)) ? class159.field2613 : class159.field2608;
                                        client.method1513(20);
                                        return;
                                    }
                                    if (var24 && field733.length() < 20) {
                                        field733 = field733 + Statics.field2111;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field737 == 3) {
                        int var26 = field747 + 180;
                        short var27 = 276;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field720 = class157.field2529;
                            field740 = class157.field2530;
                            field735 = class157.field2531;
                            field737 = 2;
                            field746 = 0;
                        }
                        int var28 = field747 + 180;
                        short var29 = 326;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            method5(class157.field2568, class157.field2569, class157.field2504);
                            field737 = 5;
                            return;
                        }
                    } else if (field737 == 4) {
                        int var30 = field747 + 180 - 80;
                        short var31 = 321;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            Statics.field2196.trim();
                            if (Statics.field2196.length() != 6) {
                                method5(class157.field2354, class157.field2355, class157.field2411);
                                return;
                            }
                            Statics.field212 = Integer.parseInt(Statics.field2196);
                            Statics.field2196 = "";
                            field739 = field745 ? class159.field2606 : class159.field2609;
                            method5(class157.field2423, class157.field2548, class157.field2549);
                            client.method1513(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field747 + 180 - 9 && var11 <= field747 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field745 = !field745;
                        }
                        if (var10 == 1 && var11 >= field747 + 180 - 34 && var11 <= field747 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class138.method2051(client.method1591("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var32 = field747 + 180 + 80;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            field737 = 0;
                            field742 = "";
                            field733 = "";
                            Statics.field212 = 0;
                            Statics.field2196 = "";
                        }
                        while (class137.method564()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field748.length(); var34++) {
                                if (Statics.field2111 == field748.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field2120 == 13) {
                                field737 = 0;
                                field742 = "";
                                field733 = "";
                                Statics.field212 = 0;
                                Statics.field2196 = "";
                            } else {
                                if (Statics.field2120 == 85 && Statics.field2196.length() > 0) {
                                    Statics.field2196 = Statics.field2196.substring(0, Statics.field2196.length() - 1);
                                }
                                if (Statics.field2120 == 84) {
                                    Statics.field2196.trim();
                                    if (Statics.field2196.length() != 6) {
                                        method5(class157.field2354, class157.field2355, class157.field2411);
                                        return;
                                    }
                                    Statics.field212 = Integer.parseInt(Statics.field2196);
                                    Statics.field2196 = "";
                                    field739 = field745 ? class159.field2606 : class159.field2609;
                                    method5(class157.field2423, class157.field2548, class157.field2549);
                                    client.method1513(20);
                                    return;
                                }
                                if (var33 && Statics.field2196.length() < 6) {
                                    Statics.field2196 = Statics.field2196 + Statics.field2111;
                                }
                            }
                        }
                    } else if (field737 == 5) {
                        int var35 = field747 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            method708();
                            return;
                        }
                        int var37 = field747 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field720 = class157.field2529;
                            field740 = class157.field2530;
                            field735 = class157.field2531;
                            field737 = 2;
                            field746 = 0;
                            field733 = "";
                        }
                        while (class137.method564()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field724.length(); var39++) {
                                if (Statics.field2111 == field724.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field2120 == 13) {
                                field720 = class157.field2529;
                                field740 = class157.field2530;
                                field735 = class157.field2531;
                                field737 = 2;
                                field746 = 0;
                                field733 = "";
                            } else {
                                if (Statics.field2120 == 85 && field742.length() > 0) {
                                    field742 = field742.substring(0, field742.length() - 1);
                                }
                                if (Statics.field2120 == 84) {
                                    method708();
                                    return;
                                }
                                if (var38 && field742.length() < 320) {
                                    field742 = field742 + Statics.field2111;
                                }
                            }
                        }
                    } else if (field737 == 6) {
                        while (true) {
                            do {
                                if (!class137.method564()) {
                                    short var40 = 321;
                                    if (var10 == 1 && var12 >= var40 - 20 && var12 <= var40 + 20) {
                                        field720 = class157.field2529;
                                        field740 = class157.field2530;
                                        field735 = class157.field2531;
                                        field737 = 2;
                                        field746 = 0;
                                        field733 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2120 != 84 && Statics.field2120 != 13);
                            field720 = class157.field2529;
                            field740 = class157.field2530;
                            field735 = class157.field2531;
                            field737 = 2;
                            field746 = 0;
                            field733 = "";
                        }
                    }
                }
            }
        } else if (class140.field2166 == 1 || !Statics.field571 && class140.field2166 == 4) {
            int var1 = field721 + 280;
            if (class140.field2167 >= var1 && class140.field2167 <= var1 + 14 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                class26.method84(0, 0);
            } else if (class140.field2167 >= var1 + 15 && class140.field2167 <= var1 + 80 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                class26.method84(0, 1);
            } else {
                int var2 = field721 + 390;
                if (class140.field2167 >= var2 && class140.field2167 <= var2 + 14 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                    class26.method84(1, 0);
                } else if (class140.field2167 >= var2 + 15 && class140.field2167 <= var2 + 80 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                    class26.method84(1, 1);
                } else {
                    int var3 = field721 + 500;
                    if (class140.field2167 >= var3 && class140.field2167 <= var3 + 14 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                        class26.method84(2, 0);
                    } else if (class140.field2167 >= var3 + 15 && class140.field2167 <= var3 + 80 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                        class26.method84(2, 1);
                    } else {
                        int var4 = field721 + 610;
                        if (class140.field2167 >= var4 && class140.field2167 <= var4 + 14 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                            class26.method84(3, 0);
                        } else if (class140.field2167 >= var4 + 15 && class140.field2167 <= var4 + 80 && class140.field2168 >= 4 && class140.field2168 <= 18) {
                            class26.method84(3, 1);
                        } else if (class140.field2167 >= field721 + 708 && class140.field2168 >= 4 && class140.field2167 <= field721 + 708 + 50 && class140.field2168 <= 20) {
                            field743 = false;
                            Statics.field1357.method1612(field721, 0);
                            Statics.field2306.method1612(field721 + 382, 0);
                            Statics.field3147.method1754(field721 + 382 - Statics.field3147.field1414 / 2, 18);
                        } else if (field750 != -1) {
                            class26 var5 = Statics.field638[field750];
                            method2886(var5);
                            field743 = false;
                            Statics.field1357.method1612(field721, 0);
                            Statics.field2306.method1612(field721 + 382, 0);
                            Statics.field3147.method1754(field721 + 382 - Statics.field3147.field1414 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.o(I)V")
    public static void method708() {
        field742 = field742.trim();
        if (field742.length() == 0) {
            method5(class157.field2568, class157.field2569, class157.field2504);
            return;
        }
        long var0 = class10.method2152();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method2946(var0, field742);
        }
        switch(var2) {
            case 2:
                method5(class157.field2571, class157.field2572, class157.field2442);
                field737 = 6;
                break;
            case 3:
                method5(class157.field2405, class157.field2575, class157.field2365);
                break;
            case 4:
                method5(class157.field2577, class157.field2578, class157.field2561);
                break;
            case 5:
                method5(class157.field2580, class157.field2581, class157.field2547);
                break;
            case 6:
                method5(class157.field2579, class157.field2584, class157.field2585);
                break;
            case 7:
                method5(class157.field2543, class157.field2587, class157.field2562);
        }
    }

    @ObfuscatedName("m.c(Lhi;Lhi;Lhi;ZB)V")
    public static void method205(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field721 = (Statics.field1957 - client.field502) / 2;
            field747 = field721 + 202;
        }
        if (field743) {
            method553(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1357.method1612(field721, 0);
            Statics.field2306.method1612(field721 + 382, 0);
            Statics.field3147.method1754(field721 + 382 - Statics.field3147.field1414 / 2, 18);
        }
        if (client.field475 == 0 || client.field475 == 5) {
            byte var4 = 20;
            arg0.method3764(class157.field2528, field747 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1705(field747 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1705(field747 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1745(field747 + 180 - 150, var5 + 2, field741 * 3, 30, 9179409);
            class80.method1745(field741 * 3 + (field747 + 180 - 150), var5 + 2, 300 - field741 * 3, 30, 0);
            arg0.method3764(field736, field747 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field475 == 20) {
            Statics.field722.method1754(field747 + 180 - Statics.field722.field1414 / 2, 271 - Statics.field722.field1412 / 2);
            short var6 = 211;
            arg0.method3764(field720, field747 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3764(field740, field747 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3764(field735, field747 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field737 != 4) {
                arg0.method3769(class157.field2364, field747 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field742; arg0.method3758(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3769(class223.method3778(var8), field747 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3769(class157.field2356 + class163.method2930(field733), field747 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field475 == 10 || client.field475 == 11) {
            Statics.field722.method1754(field747, 171);
            if (field737 == 0) {
                short var9 = 251;
                arg0.method3764(class157.field2553, field747 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field747 + 180 - 80;
                short var11 = 291;
                Statics.field744.method1754(var10 - 73, var11 - 20);
                arg0.method3765(class157.field2554, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field747 + 180 + 80;
                Statics.field744.method1754(var12 - 73, var11 - 20);
                arg0.method3765(class157.field2583, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field737 == 1) {
                arg0.method3764(field738, field747 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3764(field720, field747 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3764(field740, field747 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3764(field735, field747 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field747 + 180 - 80;
                short var15 = 321;
                Statics.field744.method1754(var14 - 73, var15 - 20);
                arg0.method3764(class157.field2326, var14, var15 + 5, 16777215, 0);
                int var16 = field747 + 180 + 80;
                Statics.field744.method1754(var16 - 73, var15 - 20);
                arg0.method3764(class157.field2482, var16, var15 + 5, 16777215, 0);
            } else if (field737 == 2) {
                short var17 = 211;
                arg0.method3764(field720, field747 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3764(field740, field747 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3764(field735, field747 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3769(class157.field2364, field747 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field742; arg0.method3758(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3769(class223.method3778(var19) + (field746 == 0 & client.field298 % 40 < 20 ? Statics.method2835(16776960) + class2.field20 : ""), field747 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3769(class157.field2356 + class163.method2930(field733) + (field746 == 1 & client.field298 % 40 < 20 ? Statics.method2835(16776960) + class2.field20 : ""), field747 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field747 + 180 - 80;
                short var21 = 321;
                Statics.field744.method1754(var20 - 73, var21 - 20);
                arg0.method3764(class157.field2556, var20, var21 + 5, 16777215, 0);
                int var22 = field747 + 180 + 80;
                Statics.field744.method1754(var22 - 73, var21 - 20);
                arg0.method3764(class157.field2482, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3764(class157.field2582, field747 + 180, var23, 16776960, 0);
            } else if (field737 == 3) {
                short var24 = 201;
                arg0.method3764(class157.field2558, field747 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3764(class157.field2502, field747 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3764(class157.field2560, field747 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field747 + 180;
                short var26 = 276;
                Statics.field744.method1754(var25 - 73, var26 - 20);
                arg2.method3764(class157.field2387, var25, var26 + 5, 16777215, 0);
                int var27 = field747 + 180;
                short var28 = 326;
                Statics.field744.method1754(var27 - 73, var28 - 20);
                arg2.method3764(class157.field2398, var27, var28 + 5, 16777215, 0);
            } else if (field737 == 4) {
                arg0.method3764(class157.field2514, field747 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3764(field720, field747 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3764(field740, field747 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3764(field735, field747 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3769(class157.field2489 + class163.method2930(Statics.field2196) + (client.field298 % 40 < 20 ? Statics.method2835(16776960) + class2.field20 : ""), field747 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3769(class157.field2328, field747 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3769(class157.field2329, field747 + 180 - 9, var98, 16776960, 0);
                int var30 = field747 + 180 - 9 + arg0.method3758(class157.field2329) + 15;
                int var31 = var98 - arg0.field3182;
                class81 var32;
                if (field745) {
                    var32 = Statics.field586;
                } else {
                    var32 = Statics.field1596;
                }
                var32.method1754(var30, var31);
                var94 = var98 + 15;
                int var33 = field747 + 180 - 80;
                short var34 = 321;
                Statics.field744.method1754(var33 - 73, var34 - 20);
                arg0.method3764(class157.field2326, var33, var34 + 5, 16777215, 0);
                int var35 = field747 + 180 + 80;
                Statics.field744.method1754(var35 - 73, var34 - 20);
                arg0.method3764(class157.field2482, var35, var34 + 5, 16777215, 0);
                arg1.method3764(class157.field2524, field747 + 180, var34 + 36, 255, 0);
            } else if (field737 == 5) {
                arg0.method3764(class157.field2564, field747 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3764(field720, field747 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3764(field740, field747 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3764(field735, field747 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3769(class157.field2565, field747 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field742; arg0.method3758(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3769(class223.method3778(var38) + (client.field298 % 40 < 20 ? Statics.method2835(16776960) + class2.field20 : ""), field747 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field747 + 180 - 80;
                short var40 = 321;
                Statics.field744.method1754(var39 - 73, var40 - 20);
                arg0.method3764(class157.field2337, var39, var40 + 5, 16777215, 0);
                int var41 = field747 + 180 + 80;
                Statics.field744.method1754(var41 - 73, var40 - 20);
                arg0.method3764(class157.field2567, var41, var40 + 5, 16777215, 0);
            } else if (field737 == 6) {
                short var42 = 211;
                arg0.method3764(field720, field747 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3764(field740, field747 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3764(field735, field747 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field747 + 180;
                short var44 = 321;
                Statics.field744.method1754(var43 - 73, var44 - 20);
                arg0.method3764(class157.field2567, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field730 > 0) {
            method133(field730);
            field730 = 0;
        }
        short var45 = 256;
        if (field727 > 0) {
            for (int var46 = 0; var46 < 256; var46++) {
                if (field727 > 768) {
                    Statics.field2673[var46] = method2277(Statics.field726[var46], Statics.field1746[var46], 1024 - field727);
                } else if (field727 > 256) {
                    Statics.field2673[var46] = Statics.field1746[var46];
                } else {
                    Statics.field2673[var46] = method2277(Statics.field1746[var46], Statics.field726[var46], 256 - field727);
                }
            }
        } else if (field749 > 0) {
            for (int var47 = 0; var47 < 256; var47++) {
                if (field749 > 768) {
                    Statics.field2673[var47] = method2277(Statics.field726[var47], Statics.field623[var47], 1024 - field749);
                } else if (field749 > 256) {
                    Statics.field2673[var47] = Statics.field623[var47];
                } else {
                    Statics.field2673[var47] = method2277(Statics.field623[var47], Statics.field726[var47], 256 - field749);
                }
            }
        } else {
            for (int var48 = 0; var48 < 256; var48++) {
                Statics.field2673[var48] = Statics.field726[var48];
            }
        }
        class80.method1684(field721, 9, field721 + 128, var45 + 7);
        Statics.field1357.method1612(field721, 0);
        class80.method1683();
        int var49 = 0;
        int var50 = field721 + Statics.field2039.field1388 * 9;
        for (int var51 = 1; var51 < var45 - 1; var51++) {
            int var52 = (var45 - var51) * field728[var51] / var45;
            int var53 = var52 + 22;
            if (var53 < 0) {
                var53 = 0;
            }
            var49 += var53;
            for (int var54 = var53; var54 < 128; var54++) {
                int var55 = Statics.field607[var49++];
                if (var55 == 0) {
                    var50++;
                } else {
                    int var57 = 256 - var55;
                    int var58 = Statics.field2673[var55];
                    int var59 = Statics.field2039.field1392[var50];
                    Statics.field2039.field1392[var50++] = ((var58 & 0xFF00FF) * var55 + (var59 & 0xFF00FF) * var57 & 0xFF00FF00) + ((var58 & 0xFF00) * var55 + (var59 & 0xFF00) * var57 & 0xFF0000) >> 8;
                }
            }
            var50 += Statics.field2039.field1388 + var53 - 128;
        }
        class80.method1684(field721 + 765 - 128, 9, field721 + 765, var45 + 7);
        Statics.field2306.method1612(field721 + 382, 0);
        class80.method1683();
        int var60 = 0;
        int var61 = field721 + Statics.field2039.field1388 * 9 + 24 + 637;
        for (int var62 = 1; var62 < var45 - 1; var62++) {
            int var63 = (var45 - var62) * field728[var62] / var45;
            int var64 = 103 - var63;
            int var65 = var61 + var63;
            for (int var66 = 0; var66 < var64; var66++) {
                int var67 = Statics.field607[var60++];
                if (var67 == 0) {
                    var65++;
                } else {
                    int var69 = 256 - var67;
                    int var70 = Statics.field2673[var67];
                    int var71 = Statics.field2039.field1392[var65];
                    Statics.field2039.field1392[var65++] = ((var70 & 0xFF00) * var67 + (var71 & 0xFF00) * var69 & 0xFF0000) + ((var70 & 0xFF00FF) * var67 + (var71 & 0xFF00FF) * var69 & 0xFF00FF00) >> 8;
                }
            }
            var60 += 128 - var64;
            var61 = Statics.field2039.field1388 - var64 - var63 + var65;
        }
        Statics.field3152[Statics.field666.field151 ? 1 : 0].method1754(field721 + 765 - 40, 463);
        if (client.field475 > 5 && client.field480 == 0) {
            if (Statics.field244 == null) {
                Statics.field244 = Statics.method970(Statics.field165, "sl_button", "");
            } else {
                int var72 = field721 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field244.method1754(var72, var73);
                arg0.method3764(class157.field2483 + " " + client.field289, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field3126 == null) {
                    arg1.method3764(class157.field2599, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3764(class157.field2598, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field1854.getGraphics();
            Statics.field2039.method1509(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field1854.repaint();
        }
    }

    @ObfuscatedName("v.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5(String arg0, String arg1, String arg2) {
        field720 = arg0;
        field740 = arg1;
        field735 = arg2;
    }

    @ObfuscatedName("fn.j(Lcs;I)V")
    public static final void method2932(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field729.length; var2++) {
            Statics.field729[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field729[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field725[var8] = (Statics.field729[var8 - 1] + Statics.field729[var8 + 1] + Statics.field729[var8 - 128] + Statics.field729[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field729;
            Statics.field729 = Statics.field725;
            Statics.field725 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1412; var11++) {
            for (int var12 = 0; var12 < arg0.field1414; var12++) {
                if (arg0.field1415[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1416;
                    int var14 = var11 + 16 + arg0.field1417;
                    int var15 = (var14 << 7) + var13;
                    Statics.field729[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("h.a(II)V")
    public static final void method133(int arg0) {
        short var1 = 256;
        field731 += arg0 * 128;
        if (field731 > Statics.field729.length) {
            field731 -= Statics.field729.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2932(Statics.field2717[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field607[var3 + var4] - Statics.field729[field731 + var3 & Statics.field729.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field607[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field607[var9 + var10] = 255;
                } else {
                    Statics.field607[var9 + var10] = 0;
                }
            }
        }
        if (field727 > 0) {
            field727 -= arg0 * 4;
        }
        if (field749 > 0) {
            field749 -= arg0 * 4;
        }
        if (field727 == 0 && field749 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field727 = 1024;
            }
            if (var12 == 1) {
                field749 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field728[var13] = field728[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field728[var14] = (int) (Math.sin((double) field734 / 14.0D) * 16.0D + Math.sin((double) field734 / 15.0D) * 14.0D + Math.sin((double) field734 / 16.0D) * 12.0D);
            field734++;
        }
        field723 += arg0 * 393549083;
        int var15 = ((client.field298 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field723 * -2038965396; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field607[(var18 << 7) + var17] = 192;
        }
        field723 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field607[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field607[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field180[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field180[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field180[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field607[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("do.y(IIIB)I")
    public static final int method2277(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("k.h(Lhi;Lhi;I)V")
    public static void method553(class224 arg0, class224 arg1) {
        if (Statics.field588 == null) {
            Statics.field588 = class77.method1501(Statics.field165, "sl_back", "");
        }
        if (Statics.field693 == null) {
            Statics.field693 = class77.method95(Statics.field165, "sl_flags", "");
        }
        if (Statics.field2076 == null) {
            Statics.field2076 = class77.method95(Statics.field165, "sl_arrows", "");
        }
        if (Statics.field2670 == null) {
            Statics.field2670 = class77.method95(Statics.field165, "sl_stars", "");
        }
        class80.method1745(field721, 23, 765, 480, 0);
        class80.method1694(field721, 0, 125, 23, 12425273, 9135624);
        class80.method1694(field721 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3764(class157.field2589, field721 + 62, 15, 0, -1);
        if (Statics.field2670 != null) {
            Statics.field2670[1].method1754(field721 + 140, 1);
            arg1.method3769(class157.field2590, field721 + 152, 10, 16777215, -1);
            Statics.field2670[0].method1754(field721 + 140, 12);
            arg1.method3769(class157.field2591, field721 + 152, 21, 16777215, -1);
        }
        if (Statics.field2076 != null) {
            int var2 = field721 + 280;
            if (class26.field639[0] == 0 && class26.field651[0] == 0) {
                Statics.field2076[2].method1754(var2, 4);
            } else {
                Statics.field2076[0].method1754(var2, 4);
            }
            if (class26.field639[0] == 0 && class26.field651[0] == 1) {
                Statics.field2076[3].method1754(var2 + 15, 4);
            } else {
                Statics.field2076[1].method1754(var2 + 15, 4);
            }
            arg0.method3769(class157.field2592, var2 + 32, 17, 16777215, -1);
            int var3 = field721 + 390;
            if (class26.field639[0] == 1 && class26.field651[0] == 0) {
                Statics.field2076[2].method1754(var3, 4);
            } else {
                Statics.field2076[0].method1754(var3, 4);
            }
            if (class26.field639[0] == 1 && class26.field651[0] == 1) {
                Statics.field2076[3].method1754(var3 + 15, 4);
            } else {
                Statics.field2076[1].method1754(var3 + 15, 4);
            }
            arg0.method3769(class157.field2330, var3 + 32, 17, 16777215, -1);
            int var4 = field721 + 500;
            if (class26.field639[0] == 2 && class26.field651[0] == 0) {
                Statics.field2076[2].method1754(var4, 4);
            } else {
                Statics.field2076[0].method1754(var4, 4);
            }
            if (class26.field639[0] == 2 && class26.field651[0] == 1) {
                Statics.field2076[3].method1754(var4 + 15, 4);
            } else {
                Statics.field2076[1].method1754(var4 + 15, 4);
            }
            arg0.method3769(class157.field2594, var4 + 32, 17, 16777215, -1);
            int var5 = field721 + 610;
            if (class26.field639[0] == 3 && class26.field651[0] == 0) {
                Statics.field2076[2].method1754(var5, 4);
            } else {
                Statics.field2076[0].method1754(var5, 4);
            }
            if (class26.field639[0] == 3 && class26.field651[0] == 1) {
                Statics.field2076[3].method1754(var5 + 15, 4);
            } else {
                Statics.field2076[1].method1754(var5 + 15, 4);
            }
            arg0.method3769(class157.field2460, var5 + 32, 17, 16777215, -1);
        }
        class80.method1745(field721 + 708, 4, 50, 16, 0);
        arg1.method3764(class157.field2482, field721 + 708 + 25, 16, 16777215, -1);
        field750 = -1;
        if (Statics.field588 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field636) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field636) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field636) {
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
            int var17 = field721 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field636; var20++) {
                class26 var21 = Statics.field638[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field642);
                if (var21.field642 == -1) {
                    var23 = class157.field2596;
                    var22 = false;
                } else if (var21.field642 > 1980) {
                    var23 = class157.field2597;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method591()) {
                    if (var21.method599()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method582()) {
                    var24 = 16711680;
                    if (var21.method599()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method579()) {
                    if (var21.method599()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method599()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class140.field2161 >= var17 && class140.field2170 >= var16 && class140.field2161 < var6 + var17 && class140.field2170 < var7 + var16 && var22) {
                    field750 = var20;
                    Statics.field588[var25].method1618(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field588[var25].method1612(var17, var16);
                }
                if (Statics.field693 != null) {
                    Statics.field693[(var21.method599() ? 8 : 0) + var21.field631].method1754(var17 + 29, var16);
                }
                arg0.method3764(Integer.toString(var21.field640), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3764(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3758(Statics.field638[field750].field644) + 6;
                int var27 = arg1.field3182 + 8;
                class80.method1745(class140.field2161 - var26 / 2, class140.field2170 + 20 + 5, var26, var27, 16777120);
                class80.method1705(class140.field2161 - var26 / 2, class140.field2170 + 20 + 5, var26, var27, 0);
                arg1.method3764(Statics.field638[field750].field644, class140.field2161, class140.field2170 + 20 + 5 + arg1.field3182 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1854.getGraphics();
            Statics.field2039.method1509(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1854.repaint();
        }
    }

    @ObfuscatedName("ei.z(Lg;I)V")
    public static void method2886(class26 arg0) {
        if (arg0.method599() != client.field406) {
            client.field406 = arg0.method599();
            class52.method2239(arg0.method599());
        }
        Statics.field169 = arg0.field643;
        client.field289 = arg0.field640;
        client.field293 = arg0.field632;
        Statics.field2252 = client.field291 == 0 ? 43594 : arg0.field640 + 40000;
        Statics.field156 = client.field291 == 0 ? 443 : arg0.field640 + 50000;
        Statics.field1004 = Statics.field2252;
    }

    @ObfuscatedName("l.w(I)V")
    public static void method160() {
        if (class26.method1157()) {
            field743 = true;
        }
    }
}

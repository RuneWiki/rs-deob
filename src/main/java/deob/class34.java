package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("av")
public class class34 {

    @ObfuscatedName("av.d")
    public static int field737 = 0;

    @ObfuscatedName("av.w")
    public static int field749 = field737 + 202;

    @ObfuscatedName("av.p")
    public static int[] field743 = new int[256];

    @ObfuscatedName("av.h")
    public static int field745 = 0;

    @ObfuscatedName("av.l")
    public static int field770 = 0;

    @ObfuscatedName("av.af")
    public static int field739 = 0;

    @ObfuscatedName("av.am")
    public static int field750 = 0;

    @ObfuscatedName("av.ap")
    public static int field746 = 0;

    @ObfuscatedName("av.aa")
    public static int field736 = 0;

    @ObfuscatedName("av.ar")
    public static int field751 = 10;

    @ObfuscatedName("av.av")
    public static String field752 = "";

    @ObfuscatedName("av.ao")
    public static int field774 = 0;

    @ObfuscatedName("av.aq")
    public static String field768 = "";

    @ObfuscatedName("av.ax")
    public static String field755 = "";

    @ObfuscatedName("av.at")
    public static String field747 = "";

    @ObfuscatedName("av.aw")
    public static String field769 = "";

    @ObfuscatedName("av.ab")
    public static String field758 = "";

    @ObfuscatedName("av.al")
    public static String field759 = "";

    @ObfuscatedName("av.ad")
    public static class163 field760 = class163.field2666;

    @ObfuscatedName("av.ai")
    public static boolean field748 = true;

    @ObfuscatedName("av.az")
    public static int field762 = 0;

    @ObfuscatedName("av.au")
    public static String field763 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("av.ay")
    public static String field764 = "1234567890";

    @ObfuscatedName("av.ae")
    public static boolean field761 = false;

    @ObfuscatedName("av.bn")
    public static int field766 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.a(Ljava/awt/Component;Lfu;Lfu;ZII)V")
    public static void method3139(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field741) {
            field774 = arg4;
            class83.method1754();
            byte[] var5 = arg1.method3134("title.jpg", "");
            Statics.field2125 = new class82(var5, arg0);
            Statics.field2154 = Statics.field2125.method1668();
            if ((client.field281 & 0x20000000) == 0) {
                Statics.field740 = class80.method2335(arg2, "logo", "");
            } else {
                Statics.field740 = class80.method2335(arg2, "logo_deadman_mode", "");
            }
            Statics.field738 = class80.method2335(arg2, "titlebox", "");
            Statics.field2318 = class80.method2335(arg2, "titlebutton", "");
            Statics.field754 = class80.method2341(arg2, "runes", "");
            Statics.field2766 = class80.method2341(arg2, "title_mute", "");
            Statics.field742 = class80.method2335(arg2, "options_radio_buttons,0", "");
            Statics.field1652 = class80.method2335(arg2, "options_radio_buttons,2", "");
            Statics.field744 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field744[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field744[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field744[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field744[var9 + 192] = 16777215;
            }
            Statics.field274 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field274[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field274[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field274[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field274[var13 + 192] = 16777215;
            }
            Statics.field26 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field26[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field26[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field26[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field26[var17 + 192] = 16777215;
            }
            Statics.field2146 = new int[256];
            Statics.field21 = new int[32768];
            Statics.field2120 = new int[32768];
            method14((class84) null);
            Statics.field150 = new int[32768];
            Statics.field2160 = new int[32768];
            if (arg3) {
                field758 = "";
                field759 = "";
            }
            Statics.field157 = 0;
            Statics.field1455 = "";
            field748 = true;
            field761 = false;
            if (Statics.field2040.field134) {
                class187.field3017 = 1;
                Statics.field3018 = null;
                Statics.field3020 = -1;
                Statics.field3023 = -1;
                Statics.field2952 = 0;
                Statics.field3021 = false;
                Statics.field586 = 2;
            } else {
                class172 var18 = Statics.field141;
                int var19 = var18.method3132("scape main");
                int var20 = var18.method3121(var19, "");
                class187.field3017 = 1;
                Statics.field3018 = var18;
                Statics.field3020 = var19;
                Statics.field3023 = var20;
                Statics.field2952 = 255;
                Statics.field3021 = false;
                Statics.field586 = 2;
            }
            class175.method3024(false);
            Statics.field741 = true;
            field737 = (Statics.field2375 - client.field347 * 765) / 2;
            field749 = field737 + 202;
            Statics.field2125.method1710(field737, 0);
            Statics.field2154.method1710(field737 + 382, 0);
            Statics.field740.method1803(field737 + 382 - Statics.field740.field1498 / 2, 18);
        } else if (arg4 == 4) {
            field774 = 4;
        }
    }

    @ObfuscatedName("ef.d(I)V")
    public static void method2751() {
        if (!Statics.field741) {
            return;
        }
        Statics.field738 = null;
        Statics.field2318 = null;
        Statics.field754 = null;
        Statics.field2125 = null;
        Statics.field2154 = null;
        Statics.field740 = null;
        Statics.field2766 = null;
        Statics.field742 = null;
        Statics.field1652 = null;
        Statics.field1070 = null;
        Statics.field567 = null;
        Statics.field1467 = null;
        Statics.field28 = null;
        Statics.field2357 = null;
        Statics.field744 = null;
        Statics.field274 = null;
        Statics.field26 = null;
        Statics.field2146 = null;
        Statics.field21 = null;
        Statics.field2120 = null;
        Statics.field150 = null;
        Statics.field2160 = null;
        class187.field3017 = 1;
        Statics.field3018 = null;
        Statics.field3020 = -1;
        Statics.field3023 = -1;
        Statics.field2952 = 0;
        Statics.field3021 = false;
        Statics.field586 = 2;
        class175.method3024(true);
        Statics.field741 = false;
    }

    @ObfuscatedName("de.v(Lev;I)V")
    public static void method2718(class148 arg0) {
        if (!field761) {
            if ((class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4) && class144.field2224 >= field737 + 765 - 50 && class144.field2227 >= 453) {
                Statics.field2040.field134 = !Statics.field2040.field134;
                class9.method1623();
                if (Statics.field2040.field134) {
                    Statics.field3016.method3462();
                    class187.field3017 = 1;
                    Statics.field3018 = null;
                } else {
                    class187.method3112(Statics.field141, "scape main", "", 255, false);
                }
            }
            if (client.field289 != 5) {
                field746++;
                if (client.field289 == 10 || client.field289 == 11) {
                    if (client.field490 == 0) {
                        if (class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4) {
                            int var6 = field737 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class144.field2224 >= var6 && class144.field2224 <= var6 + var8 && class144.field2227 >= var7 && class144.field2227 <= var7 + var9) {
                                if (class28.method188()) {
                                    field761 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field2135 != null && class28.method188()) {
                            field761 = true;
                        }
                    }
                    int var10 = class144.field2228;
                    int var11 = class144.field2224;
                    int var12 = class144.field2227;
                    if (!Statics.field627 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field774 == 0) {
                        int var13 = field749 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class142.method1595(client.method184("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field749 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field281 & 0x2000000) != 0) {
                                field768 = "";
                                field755 = class161.field2598;
                                field747 = class161.field2509;
                                field769 = class161.field2600;
                                field774 = 1;
                                field762 = 0;
                            } else if ((client.field281 & 0x4) != 0) {
                                if ((client.field281 & 0x400) == 0) {
                                    field755 = class161.field2427;
                                    field747 = class161.field2580;
                                    field769 = class161.field2591;
                                } else {
                                    field755 = class161.field2500;
                                    field747 = class161.field2503;
                                    field769 = class161.field2597;
                                }
                                field768 = class161.field2588;
                                field774 = 1;
                                field762 = 0;
                            } else if ((client.field281 & 0x400) == 0) {
                                field755 = class161.field2585;
                                field747 = class161.field2586;
                                field769 = class161.field2587;
                                field774 = 2;
                                field762 = 0;
                            } else {
                                field755 = class161.field2584;
                                field747 = class161.field2581;
                                field769 = class161.field2594;
                                field768 = class161.field2588;
                                field774 = 1;
                                field762 = 0;
                            }
                        }
                    } else if (field774 == 1) {
                        while (class141.method597()) {
                            if (Statics.field2048 == 84) {
                                field755 = class161.field2585;
                                field747 = class161.field2586;
                                field769 = class161.field2587;
                                field774 = 2;
                                field762 = 0;
                            } else if (Statics.field2048 == 13) {
                                field774 = 0;
                            }
                        }
                        int var16 = field749 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field755 = class161.field2585;
                            field747 = class161.field2586;
                            field769 = class161.field2587;
                            field774 = 2;
                            field762 = 0;
                        }
                        int var18 = field749 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field774 = 0;
                        }
                    } else if (field774 == 2) {
                        short var19 = 231;
                        int var41 = var19 + 30;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field762 = 0;
                        }
                        var41 += 15;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field762 = 1;
                        }
                        var41 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method3537(class161.field2551, class161.field2615, class161.field2626);
                            field774 = 5;
                            return;
                        }
                        int var21 = field749 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field758 = field758.trim();
                            if (field758.length() == 0) {
                                method3537(class161.field2497, class161.field2492, class161.field2379);
                                return;
                            }
                            if (field759.length() == 0) {
                                method3537(class161.field2494, class161.field2589, class161.field2496);
                                return;
                            }
                            method3537(class161.field2603, class161.field2384, class161.field2605);
                            field760 = Statics.field2040.field137.containsKey(class167.method2188(field758)) ? class163.field2672 : class163.field2666;
                            client.method169(20);
                            return;
                        }
                        int var23 = field749 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field774 = 0;
                            field758 = "";
                            field759 = "";
                            Statics.field157 = 0;
                            Statics.field1455 = "";
                            field748 = true;
                        }
                        while (true) {
                            while (class141.method597()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field763.length(); var25++) {
                                    if (Statics.field616 == field763.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2048 == 13) {
                                    field774 = 0;
                                    field758 = "";
                                    field759 = "";
                                    Statics.field157 = 0;
                                    Statics.field1455 = "";
                                    field748 = true;
                                } else if (field762 == 0) {
                                    if (Statics.field2048 == 85 && field758.length() > 0) {
                                        field758 = field758.substring(0, field758.length() - 1);
                                    }
                                    if (Statics.field2048 == 84 || Statics.field2048 == 80) {
                                        field762 = 1;
                                    }
                                    if (var24 && field758.length() < 320) {
                                        field758 = field758 + Statics.field616;
                                    }
                                } else if (field762 == 1) {
                                    if (Statics.field2048 == 85 && field759.length() > 0) {
                                        field759 = field759.substring(0, field759.length() - 1);
                                    }
                                    if (Statics.field2048 == 84 || Statics.field2048 == 80) {
                                        field762 = 0;
                                    }
                                    if (Statics.field2048 == 84) {
                                        field758 = field758.trim();
                                        if (field758.length() == 0) {
                                            method3537(class161.field2497, class161.field2492, class161.field2379);
                                            return;
                                        }
                                        if (field759.length() == 0) {
                                            method3537(class161.field2494, class161.field2589, class161.field2496);
                                            return;
                                        }
                                        method3537(class161.field2603, class161.field2384, class161.field2605);
                                        field760 = Statics.field2040.field137.containsKey(class167.method2188(field758)) ? class163.field2672 : class163.field2666;
                                        client.method169(20);
                                        return;
                                    }
                                    if (var24 && field759.length() < 20) {
                                        field759 = field759 + Statics.field616;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field774 == 3) {
                        int var26 = field749 + 180;
                        short var27 = 276;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field755 = class161.field2585;
                            field747 = class161.field2586;
                            field769 = class161.field2587;
                            field774 = 2;
                            field762 = 0;
                        }
                        int var28 = field749 + 180;
                        short var29 = 326;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            method3537(class161.field2551, class161.field2615, class161.field2626);
                            field774 = 5;
                            return;
                        }
                    } else if (field774 == 4) {
                        int var30 = field749 + 180 - 80;
                        short var31 = 321;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            Statics.field1455.trim();
                            if (Statics.field1455.length() != 6) {
                                method3537(class161.field2378, class161.field2411, class161.field2412);
                                return;
                            }
                            Statics.field157 = Integer.parseInt(Statics.field1455);
                            Statics.field1455 = "";
                            field760 = field748 ? class163.field2670 : class163.field2669;
                            method3537(class161.field2603, class161.field2384, class161.field2605);
                            client.method169(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field749 + 180 - 9 && var11 <= field749 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field748 = !field748;
                        }
                        if (var10 == 1 && var11 >= field749 + 180 - 34 && var11 <= field749 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class142.method1595(client.method184("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var32 = field749 + 180 + 80;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            field774 = 0;
                            field758 = "";
                            field759 = "";
                            Statics.field157 = 0;
                            Statics.field1455 = "";
                        }
                        while (class141.method597()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field764.length(); var34++) {
                                if (Statics.field616 == field764.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field2048 == 13) {
                                field774 = 0;
                                field758 = "";
                                field759 = "";
                                Statics.field157 = 0;
                                Statics.field1455 = "";
                            } else {
                                if (Statics.field2048 == 85 && Statics.field1455.length() > 0) {
                                    Statics.field1455 = Statics.field1455.substring(0, Statics.field1455.length() - 1);
                                }
                                if (Statics.field2048 == 84) {
                                    Statics.field1455.trim();
                                    if (Statics.field1455.length() != 6) {
                                        method3537(class161.field2378, class161.field2411, class161.field2412);
                                        return;
                                    }
                                    Statics.field157 = Integer.parseInt(Statics.field1455);
                                    Statics.field1455 = "";
                                    field760 = field748 ? class163.field2670 : class163.field2669;
                                    method3537(class161.field2603, class161.field2384, class161.field2605);
                                    client.method169(20);
                                    return;
                                }
                                if (var33 && Statics.field1455.length() < 6) {
                                    Statics.field1455 = Statics.field1455 + Statics.field616;
                                }
                            }
                        }
                    } else if (field774 == 5) {
                        int var35 = field749 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            Statics.method2347();
                            return;
                        }
                        int var37 = field749 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field755 = class161.field2585;
                            field747 = class161.field2586;
                            field769 = class161.field2587;
                            field774 = 2;
                            field762 = 0;
                            field759 = "";
                        }
                        while (class141.method597()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field763.length(); var39++) {
                                if (Statics.field616 == field763.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field2048 == 13) {
                                field755 = class161.field2585;
                                field747 = class161.field2586;
                                field769 = class161.field2587;
                                field774 = 2;
                                field762 = 0;
                                field759 = "";
                            } else {
                                if (Statics.field2048 == 85 && field758.length() > 0) {
                                    field758 = field758.substring(0, field758.length() - 1);
                                }
                                if (Statics.field2048 == 84) {
                                    Statics.method2347();
                                    return;
                                }
                                if (var38 && field758.length() < 320) {
                                    field758 = field758 + Statics.field616;
                                }
                            }
                        }
                    } else if (field774 == 6) {
                        while (true) {
                            do {
                                if (!class141.method597()) {
                                    short var40 = 321;
                                    if (var10 == 1 && var12 >= var40 - 20 && var12 <= var40 + 20) {
                                        field755 = class161.field2585;
                                        field747 = class161.field2586;
                                        field769 = class161.field2587;
                                        field774 = 2;
                                        field762 = 0;
                                        field759 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2048 != 84 && Statics.field2048 != 13);
                            field755 = class161.field2585;
                            field747 = class161.field2586;
                            field769 = class161.field2587;
                            field774 = 2;
                            field762 = 0;
                            field759 = "";
                        }
                    }
                }
            }
        } else if (class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4) {
            int var1 = field737 + 280;
            if (class144.field2224 >= var1 && class144.field2224 <= var1 + 14 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                class28.method176(0, 0);
            } else if (class144.field2224 >= var1 + 15 && class144.field2224 <= var1 + 80 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                class28.method176(0, 1);
            } else {
                int var2 = field737 + 390;
                if (class144.field2224 >= var2 && class144.field2224 <= var2 + 14 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                    class28.method176(1, 0);
                } else if (class144.field2224 >= var2 + 15 && class144.field2224 <= var2 + 80 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                    class28.method176(1, 1);
                } else {
                    int var3 = field737 + 500;
                    if (class144.field2224 >= var3 && class144.field2224 <= var3 + 14 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                        class28.method176(2, 0);
                    } else if (class144.field2224 >= var3 + 15 && class144.field2224 <= var3 + 80 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                        class28.method176(2, 1);
                    } else {
                        int var4 = field737 + 610;
                        if (class144.field2224 >= var4 && class144.field2224 <= var4 + 14 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                            class28.method176(3, 0);
                        } else if (class144.field2224 >= var4 + 15 && class144.field2224 <= var4 + 80 && class144.field2227 >= 4 && class144.field2227 <= 18) {
                            class28.method176(3, 1);
                        } else if (class144.field2224 >= field737 + 708 && class144.field2227 >= 4 && class144.field2224 <= field737 + 708 + 50 && class144.field2227 <= 20) {
                            field761 = false;
                            Statics.field2125.method1710(field737, 0);
                            Statics.field2154.method1710(field737 + 382, 0);
                            Statics.field740.method1803(field737 + 382 - Statics.field740.field1498 / 2, 18);
                        } else if (field766 != -1) {
                            class28 var5 = Statics.field675[field766];
                            method2278(var5);
                            field761 = false;
                            Statics.field2125.method1710(field737, 0);
                            Statics.field2154.method1710(field737 + 382, 0);
                            Statics.field740.method1803(field737 + 382 - Statics.field740.field1498 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.z(Lhy;Lhy;Lhy;ZI)V")
    public static void method676(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field737 = (Statics.field2375 - client.field347 * 765) / 2;
            field749 = field737 + 202;
        }
        if (field761) {
            if (Statics.field1070 == null) {
                Statics.field1070 = class80.method600(Statics.field1231, "sl_back", "");
            }
            if (Statics.field567 == null) {
                Statics.field567 = class80.method2341(Statics.field1231, "sl_flags", "");
            }
            if (Statics.field1467 == null) {
                Statics.field1467 = class80.method2341(Statics.field1231, "sl_arrows", "");
            }
            if (Statics.field28 == null) {
                Statics.field28 = class80.method2341(Statics.field1231, "sl_stars", "");
            }
            class83.method1786(field737, 23, 765, 480, 0);
            class83.method1736(field737, 0, 125, 23, 12425273, 9135624);
            class83.method1736(field737 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3843(class161.field2645, field737 + 62, 15, 0, -1);
            if (Statics.field28 != null) {
                Statics.field28[1].method1803(field737 + 140, 1);
                arg1.method3920(class161.field2646, field737 + 152, 10, 16777215, -1);
                Statics.field28[0].method1803(field737 + 140, 12);
                arg1.method3920(class161.field2610, field737 + 152, 21, 16777215, -1);
            }
            if (Statics.field1467 != null) {
                int var4 = field737 + 280;
                if (class28.field661[0] == 0 && class28.field662[0] == 0) {
                    Statics.field1467[2].method1803(var4, 4);
                } else {
                    Statics.field1467[0].method1803(var4, 4);
                }
                if (class28.field661[0] == 0 && class28.field662[0] == 1) {
                    Statics.field1467[3].method1803(var4 + 15, 4);
                } else {
                    Statics.field1467[1].method1803(var4 + 15, 4);
                }
                arg0.method3920(class161.field2393, var4 + 32, 17, 16777215, -1);
                int var5 = field737 + 390;
                if (class28.field661[0] == 1 && class28.field662[0] == 0) {
                    Statics.field1467[2].method1803(var5, 4);
                } else {
                    Statics.field1467[0].method1803(var5, 4);
                }
                if (class28.field661[0] == 1 && class28.field662[0] == 1) {
                    Statics.field1467[3].method1803(var5 + 15, 4);
                } else {
                    Statics.field1467[1].method1803(var5 + 15, 4);
                }
                arg0.method3920(class161.field2530, var5 + 32, 17, 16777215, -1);
                int var6 = field737 + 500;
                if (class28.field661[0] == 2 && class28.field662[0] == 0) {
                    Statics.field1467[2].method1803(var6, 4);
                } else {
                    Statics.field1467[0].method1803(var6, 4);
                }
                if (class28.field661[0] == 2 && class28.field662[0] == 1) {
                    Statics.field1467[3].method1803(var6 + 15, 4);
                } else {
                    Statics.field1467[1].method1803(var6 + 15, 4);
                }
                arg0.method3920(class161.field2593, var6 + 32, 17, 16777215, -1);
                int var7 = field737 + 610;
                if (class28.field661[0] == 3 && class28.field662[0] == 0) {
                    Statics.field1467[2].method1803(var7, 4);
                } else {
                    Statics.field1467[0].method1803(var7, 4);
                }
                if (class28.field661[0] == 3 && class28.field662[0] == 1) {
                    Statics.field1467[3].method1803(var7 + 15, 4);
                } else {
                    Statics.field1467[1].method1803(var7 + 15, 4);
                }
                arg0.method3920(class161.field2651, var7 + 32, 17, 16777215, -1);
            }
            class83.method1786(field737 + 708, 4, 50, 16, 0);
            arg1.method3843(class161.field2613, field737 + 708 + 25, 16, 16777215, -1);
            field766 = -1;
            if (Statics.field1070 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class28.field660) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class28.field660) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class28.field660) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field737 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class28.field660; var22++) {
                    class28 var23 = Statics.field675[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field666);
                    if (var23.field666 == -1) {
                        var25 = class161.field2652;
                        var24 = false;
                    } else if (var23.field666 > 1980) {
                        var25 = class161.field2653;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method619()) {
                        if (var23.method614()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method618()) {
                        var26 = 16711680;
                        if (var23.method614()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method638()) {
                        if (var23.method614()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method614()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class144.field2226 >= var19 && class144.field2223 * 672137893 >= var18 && class144.field2226 < var8 + var19 && class144.field2223 * 672137893 < var9 + var18 && var24) {
                        field766 = var22;
                        Statics.field1070[var27].method1656(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1070[var27].method1710(var19, var18);
                    }
                    if (Statics.field567 != null) {
                        Statics.field567[(var23.method614() ? 8 : 0) + var23.field663].method1803(var19 + 29, var18);
                    }
                    arg0.method3843(Integer.toString(var23.field664), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3843(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3828(Statics.field675[field766].field668) + 6;
                    int var29 = arg1.field3238 + 8;
                    class83.method1786(class144.field2226 - var28 / 2, class144.field2223 * 672137893 + 20 + 5, var28, var29, 16777120);
                    class83.method1737(class144.field2226 - var28 / 2, class144.field2223 * 672137893 + 20 + 5, var28, var29, 0);
                    arg1.method3843(Statics.field675[field766].field668, class144.field2226, class144.field2223 * 672137893 + 20 + 5 + arg1.field3238 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field1458.getGraphics();
                Statics.field2074.method1558(var30, 0, 0);
            } catch (Exception var79) {
                Statics.field1458.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2125.method1710(field737, 0);
            Statics.field2154.method1710(field737 + 382, 0);
            Statics.field740.method1803(field737 + 382 - Statics.field740.field1498 / 2, 18);
        }
        if (client.field289 == 0 || client.field289 == 5) {
            byte var32 = 20;
            arg0.method3843(class161.field2472, field749 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class83.method1737(field749 + 180 - 152, var33, 304, 34, 9179409);
            class83.method1737(field749 + 180 - 151, var33 + 1, 302, 32, 0);
            class83.method1786(field749 + 180 - 150, var33 + 2, field751 * 3, 30, 9179409);
            class83.method1786(field751 * 3 + (field749 + 180 - 150), var33 + 2, 300 - field751 * 3, 30, 0);
            arg0.method3843(field752, field749 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field289 == 20) {
            Statics.field738.method1803(field749 + 180 - Statics.field738.field1498 / 2, 271 - Statics.field738.field1496 / 2);
            short var34 = 211;
            arg0.method3843(field755, field749 + 180, var34, 16776960, 0);
            int var81 = var34 + 15;
            arg0.method3843(field747, field749 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            arg0.method3843(field769, field749 + 180, var82, 16776960, 0);
            int var83 = var82 + 15;
            int var84 = var83 + 10;
            if (field774 != 4) {
                arg0.method3920(class161.field2595, field749 + 180 - 110, var84, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field758; arg0.method3828(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3920(class227.method3832(var36), field749 + 180 - 70, var84, 16777215, 0);
                var81 = var84 + 15;
                arg0.method3920(class161.field2607 + class167.method945(field759), field749 + 180 - 108, var81, 16777215, 0);
                var81 += 15;
            }
        }
        if (client.field289 == 10 || client.field289 == 11) {
            Statics.field738.method1803(field749, 171);
            if (field774 == 0) {
                short var37 = 251;
                arg0.method3843(class161.field2609, field749 + 180, var37, 16776960, 0);
                int var85 = var37 + 30;
                int var38 = field749 + 180 - 80;
                short var39 = 291;
                Statics.field2318.method1803(var38 - 73, var39 - 20);
                arg0.method3836(class161.field2624, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field749 + 180 + 80;
                Statics.field2318.method1803(var40 - 73, var39 - 20);
                arg0.method3836(class161.field2611, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field774 == 1) {
                arg0.method3843(field768, field749 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3843(field755, field749 + 180, var41, 16777215, 0);
                int var86 = var41 + 15;
                arg0.method3843(field747, field749 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3843(field769, field749 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                int var42 = field749 + 180 - 80;
                short var43 = 321;
                Statics.field2318.method1803(var42 - 73, var43 - 20);
                arg0.method3843(class161.field2382, var42, var43 + 5, 16777215, 0);
                int var44 = field749 + 180 + 80;
                Statics.field2318.method1803(var44 - 73, var43 - 20);
                arg0.method3843(class161.field2613, var44, var43 + 5, 16777215, 0);
            } else if (field774 == 2) {
                short var45 = 211;
                arg0.method3843(field755, field749 + 180, var45, 16776960, 0);
                int var89 = var45 + 15;
                arg0.method3843(field747, field749 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3843(field769, field749 + 180, var90, 16776960, 0);
                int var91 = var90 + 15;
                int var92 = var91 + 10;
                arg0.method3920(class161.field2595, field749 + 180 - 110, var92, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field758; arg0.method3828(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3920(class227.method3832(var47) + (field762 == 0 & client.field565 % 40 < 20 ? class2.method3003(16776960) + class2.field27 : ""), field749 + 180 - 70, var92, 16777215, 0);
                var89 = var92 + 15;
                arg0.method3920(class161.field2607 + class167.method945(field759) + (field762 == 1 & client.field565 % 40 < 20 ? class2.method3003(16776960) + class2.field27 : ""), field749 + 180 - 108, var89, 16777215, 0);
                var89 += 15;
                int var48 = field749 + 180 - 80;
                short var49 = 321;
                Statics.field2318.method1803(var48 - 73, var49 - 20);
                arg0.method3843(class161.field2612, var48, var49 + 5, 16777215, 0);
                int var50 = field749 + 180 + 80;
                Statics.field2318.method1803(var50 - 73, var49 - 20);
                arg0.method3843(class161.field2613, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3843(class161.field2619, field749 + 180, var51, 16776960, 0);
            } else if (field774 == 3) {
                short var52 = 201;
                arg0.method3843(class161.field2614, field749 + 180, var52, 16776960, 0);
                int var93 = var52 + 20;
                arg1.method3843(class161.field2525, field749 + 180, var93, 16776960, 0);
                int var94 = var93 + 15;
                arg1.method3843(class161.field2616, field749 + 180, var94, 16776960, 0);
                int var95 = var94 + 15;
                int var53 = field749 + 180;
                short var54 = 276;
                Statics.field2318.method1803(var53 - 73, var54 - 20);
                arg2.method3843(class161.field2617, var53, var54 + 5, 16777215, 0);
                int var55 = field749 + 180;
                short var56 = 326;
                Statics.field2318.method1803(var55 - 73, var56 - 20);
                arg2.method3843(class161.field2618, var55, var56 + 5, 16777215, 0);
            } else if (field774 == 4) {
                arg0.method3843(class161.field2601, field749 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3843(field755, field749 + 180, var57, 16777215, 0);
                int var96 = var57 + 15;
                arg0.method3843(field747, field749 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3843(field769, field749 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                arg0.method3920(class161.field2608 + class167.method945(Statics.field1455) + (client.field565 % 40 < 20 ? class2.method3003(16776960) + class2.field27 : ""), field749 + 180 - 108, var98, 16777215, 0);
                int var99 = var98 - 8;
                arg0.method3920(class161.field2493, field749 + 180 - 9, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3920(class161.field2385, field749 + 180 - 9, var100, 16776960, 0);
                int var58 = field749 + 180 - 9 + arg0.method3828(class161.field2385) + 15;
                int var59 = var100 - arg0.field3238;
                class84 var60;
                if (field748) {
                    var60 = Statics.field1652;
                } else {
                    var60 = Statics.field742;
                }
                var60.method1803(var58, var59);
                var96 = var100 + 15;
                int var61 = field749 + 180 - 80;
                short var62 = 321;
                Statics.field2318.method1803(var61 - 73, var62 - 20);
                arg0.method3843(class161.field2382, var61, var62 + 5, 16777215, 0);
                int var63 = field749 + 180 + 80;
                Statics.field2318.method1803(var63 - 73, var62 - 20);
                arg0.method3843(class161.field2613, var63, var62 + 5, 16777215, 0);
                arg1.method3843(class161.field2602, field749 + 180, var62 + 36, 255, 0);
            } else if (field774 == 5) {
                arg0.method3843(class161.field2620, field749 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3843(field755, field749 + 180, var64, 16776960, 0);
                int var101 = var64 + 15;
                arg2.method3843(field747, field749 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg2.method3843(field769, field749 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 14;
                arg0.method3920(class161.field2625, field749 + 180 - 145, var104, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field758; arg0.method3828(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3920(class227.method3832(var66) + (client.field565 % 40 < 20 ? class2.method3003(16776960) + class2.field27 : ""), field749 + 180 - 34, var104, 16777215, 0);
                var101 = var104 + 15;
                int var67 = field749 + 180 - 80;
                short var68 = 321;
                Statics.field2318.method1803(var67 - 73, var68 - 20);
                arg0.method3843(class161.field2569, var67, var68 + 5, 16777215, 0);
                int var69 = field749 + 180 + 80;
                Statics.field2318.method1803(var69 - 73, var68 - 20);
                arg0.method3843(class161.field2623, var69, var68 + 5, 16777215, 0);
            } else if (field774 == 6) {
                short var70 = 211;
                arg0.method3843(field755, field749 + 180, var70, 16776960, 0);
                int var105 = var70 + 15;
                arg0.method3843(field747, field749 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3843(field769, field749 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var71 = field749 + 180;
                short var72 = 321;
                Statics.field2318.method1803(var71 - 73, var72 - 20);
                arg0.method3843(class161.field2623, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field746 > 0) {
            method2003(field746);
            field746 = 0;
        }
        method2318();
        Statics.field2766[Statics.field2040.field134 ? 1 : 0].method1803(field737 + 765 - 40, 463);
        if (client.field289 > 5 && client.field490 == 0) {
            if (Statics.field2357 == null) {
                Statics.field2357 = class80.method2335(Statics.field1231, "sl_button", "");
            } else {
                int var73 = field737 + 5;
                short var74 = 463;
                byte var75 = 100;
                byte var76 = 35;
                Statics.field2357.method1803(var73, var74);
                arg0.method3843(class161.field2539 + " " + client.field280, var75 / 2 + var73, var76 / 2 + var74 - 2, 16777215, 0);
                if (Statics.field2135 == null) {
                    arg1.method3843(class161.field2655, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                } else {
                    arg1.method3843(class161.field2654, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var77 = Statics.field1458.getGraphics();
            Statics.field2074.method1558(var77, 0, 0);
        } catch (Exception var80) {
            Statics.field1458.repaint();
        }
    }

    @ObfuscatedName("gj.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3537(String arg0, String arg1, String arg2) {
        field755 = arg0;
        field747 = arg1;
        field769 = arg2;
    }

    @ObfuscatedName("v.n(Lcq;I)V")
    public static final void method14(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field21.length; var2++) {
            Statics.field21[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field21[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2120[var8] = (Statics.field21[var8 - 1] + Statics.field21[var8 + 1] + Statics.field21[var8 - 128] + Statics.field21[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field21;
            Statics.field21 = Statics.field2120;
            Statics.field2120 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1496; var11++) {
            for (int var12 = 0; var12 < arg0.field1498; var12++) {
                if (arg0.field1500[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1501;
                    int var14 = var11 + 16 + arg0.field1503;
                    int var15 = (var14 << 7) + var13;
                    Statics.field21[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cc.i(II)V")
    public static final void method2003(int arg0) {
        short var1 = 256;
        field739 += arg0 * 128;
        if (field739 > Statics.field21.length) {
            field739 -= Statics.field21.length;
            int var2 = (int) (Math.random() * 12.0D);
            method14(Statics.field754[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field150[var3 + var4] - Statics.field21[field739 + var3 & Statics.field21.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field150[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field150[var9 + var10] = 255;
                } else {
                    Statics.field150[var9 + var10] = 0;
                }
            }
        }
        if (field745 > 0) {
            field745 -= arg0 * 4;
        }
        if (field770 > 0) {
            field770 -= arg0 * 4;
        }
        if (field745 == 0 && field770 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field745 = 1024;
            }
            if (var12 == 1) {
                field770 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field743[var13] = field743[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field743[var14] = (int) (Math.sin((double) field736 / 14.0D) * 16.0D + Math.sin((double) field736 / 15.0D) * 14.0D + Math.sin((double) field736 / 16.0D) * 12.0D);
            field736++;
        }
        field750 += arg0 * -1251006895;
        int var15 = ((client.field565 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field750 * 990154020; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field150[(var18 << 7) + var17] = 192;
        }
        field750 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field150[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field150[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2160[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2160[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2160[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field150[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("fi.g(IIIB)I")
    public static final int method3217(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dx.m(I)V")
    public static final void method2318() {
        short var0 = 256;
        if (field745 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field745 > 768) {
                    Statics.field2146[var1] = method3217(Statics.field744[var1], Statics.field274[var1], 1024 - field745);
                } else if (field745 > 256) {
                    Statics.field2146[var1] = Statics.field274[var1];
                } else {
                    Statics.field2146[var1] = method3217(Statics.field274[var1], Statics.field744[var1], 256 - field745);
                }
            }
        } else if (field770 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field770 > 768) {
                    Statics.field2146[var2] = method3217(Statics.field744[var2], Statics.field26[var2], 1024 - field770);
                } else if (field770 > 256) {
                    Statics.field2146[var2] = Statics.field26[var2];
                } else {
                    Statics.field2146[var2] = method3217(Statics.field26[var2], Statics.field744[var2], 256 - field770);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2146[var3] = Statics.field744[var3];
            }
        }
        class83.method1733(field737, 9, field737 + 128, var0 + 7);
        Statics.field2125.method1710(field737, 0);
        class83.method1725();
        int var4 = 0;
        int var5 = field737 + Statics.field2074.field1469 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field743[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field150[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2146[var10];
                    int var14 = Statics.field2074.field1473[var5];
                    Statics.field2074.field1473[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field2074.field1469 + var8 - 128;
        }
        class83.method1733(field737 + 765 - 128, 9, field737 + 765, var0 + 7);
        Statics.field2154.method1710(field737 + 382, 0);
        class83.method1725();
        int var15 = 0;
        int var16 = field737 + Statics.field2074.field1469 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field743[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field150[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2146[var22];
                    int var26 = Statics.field2074.field1473[var20];
                    Statics.field2074.field1473[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2074.field1469 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("dw.k(Las;I)V")
    public static void method2278(class28 arg0) {
        if (arg0.method614() != client.field486) {
            client.field486 = arg0.method614();
            boolean var1 = arg0.method614();
            if (Statics.field1181 != var1) {
                class56.field1182.method3552();
                class56.field1183.method3552();
                class56.field1184.method3552();
                Statics.field1181 = var1;
            }
        }
        Statics.field1290 = arg0.field667;
        client.field280 = arg0.field664;
        client.field281 = arg0.field655;
        Statics.field584 = client.field282 == 0 ? 43594 : arg0.field664 + 40000;
        Statics.field585 = client.field282 == 0 ? 443 : arg0.field664 + 50000;
        Statics.field1116 = Statics.field584;
    }
}

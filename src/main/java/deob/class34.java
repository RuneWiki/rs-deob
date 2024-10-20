package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ag")
public class class34 {

    @ObfuscatedName("ag.h")
    public static int field756 = 0;

    @ObfuscatedName("ag.c")
    public static int field748 = field756 + 202;

    @ObfuscatedName("ag.x")
    public static int[] field769 = new int[256];

    @ObfuscatedName("ag.f")
    public static int field751 = 0;

    @ObfuscatedName("ag.b")
    public static int field752 = 0;

    @ObfuscatedName("ag.ad")
    public static int field758 = 0;

    @ObfuscatedName("ag.af")
    public static int field754 = 0;

    @ObfuscatedName("ag.ak")
    public static int field749 = 0;

    @ObfuscatedName("ag.aq")
    public static int field760 = 0;

    @ObfuscatedName("ag.an")
    public static int field757 = 10;

    @ObfuscatedName("ag.ag")
    public static String field770 = "";

    @ObfuscatedName("ag.al")
    public static int field747 = 0;

    @ObfuscatedName("ag.au")
    public static String field753 = "";

    @ObfuscatedName("ag.ar")
    public static String field761 = "";

    @ObfuscatedName("ag.aw")
    public static String field762 = "";

    @ObfuscatedName("ag.ah")
    public static String field763 = "";

    @ObfuscatedName("ag.ao")
    public static String field764 = "";

    @ObfuscatedName("ag.ax")
    public static String field765 = "";

    @ObfuscatedName("ag.ac")
    public static class163 field766 = class163.field2647;

    @ObfuscatedName("ag.aa")
    public static boolean field767 = true;

    @ObfuscatedName("ag.ay")
    public static int field768 = 0;

    @ObfuscatedName("ag.ab")
    public static String field743 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ag.aj")
    public static String field742 = "1234567890";

    @ObfuscatedName("ag.av")
    public static boolean field750 = false;

    @ObfuscatedName("ag.by")
    public static int field772 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.i(I)I")
    public static int method518() {
        return 9;
    }

    @ObfuscatedName("i.h(Ljava/awt/Component;Lfu;Lfu;ZII)V")
    public static void method4(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field759) {
            field747 = arg4;
            class83.method1737();
            byte[] var5 = arg1.method3100("title.jpg", "");
            Statics.field746 = new class82(var5, arg0);
            Statics.field2695 = Statics.field746.method1693();
            if ((client.field308 & 0x20000000) == 0) {
                Statics.field584 = class80.method645(arg2, "logo", "");
            } else {
                Statics.field584 = class80.method645(arg2, "logo_deadman_mode", "");
            }
            Statics.field2959 = class80.method645(arg2, "titlebox", "");
            Statics.field744 = class80.method645(arg2, "titlebutton", "");
            Statics.field745 = class80.method1038(arg2, "runes", "");
            Statics.field771 = class80.method1038(arg2, "title_mute", "");
            Statics.field237 = class80.method645(arg2, "options_radio_buttons,0", "");
            Statics.field224 = class80.method645(arg2, "options_radio_buttons,2", "");
            Statics.field1926 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1926[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1926[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1926[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1926[var9 + 192] = 16777215;
            }
            Statics.field2309 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2309[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2309[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2309[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2309[var13 + 192] = 16777215;
            }
            Statics.field755 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field755[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field755[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field755[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field755[var17 + 192] = 16777215;
            }
            Statics.field1140 = new int[256];
            Statics.field1435 = new int[32768];
            Statics.field1443 = new int[32768];
            method766((class84) null);
            Statics.field1833 = new int[32768];
            Statics.field1728 = new int[32768];
            if (arg3) {
                field764 = "";
                field765 = "";
            }
            Statics.field2337 = 0;
            Statics.field2332 = "";
            field767 = true;
            field750 = false;
            if (Statics.field43.field158) {
                class187.field3011 = 1;
                Statics.field801 = null;
                Statics.field1824 = -1;
                Statics.field3016 = -1;
                Statics.field3017 = 0;
                Statics.field3018 = false;
                Statics.field1155 = 2;
            } else {
                class172 var18 = Statics.field477;
                int var19 = var18.method3098("scape main");
                int var20 = var18.method3099(var19, "");
                class187.field3011 = 1;
                Statics.field801 = var18;
                Statics.field1824 = var19;
                Statics.field3016 = var20;
                Statics.field3017 = 255;
                Statics.field3018 = false;
                Statics.field1155 = 2;
            }
            class175.method524(false);
            Statics.field759 = true;
            field756 = (Statics.field1268 - client.field516) / 2;
            field748 = field756 + 202;
            Statics.field746.method1650(field756, 0);
            Statics.field2695.method1650(field756 + 382, 0);
            Statics.field584.method1807(field756 + 382 - Statics.field584.field1475 / 2, 18);
        } else if (arg4 == 4) {
            field747 = 4;
        }
    }

    @ObfuscatedName("q.e(I)V")
    public static void method525() {
        if (!Statics.field759) {
            return;
        }
        Statics.field2959 = null;
        Statics.field744 = null;
        Statics.field745 = null;
        Statics.field746 = null;
        Statics.field2695 = null;
        Statics.field584 = null;
        Statics.field771 = null;
        Statics.field237 = null;
        Statics.field224 = null;
        Statics.field201 = null;
        Statics.field255 = null;
        Statics.field135 = null;
        Statics.field1672 = null;
        Statics.field2104 = null;
        Statics.field1926 = null;
        Statics.field2309 = null;
        Statics.field755 = null;
        Statics.field1140 = null;
        Statics.field1435 = null;
        Statics.field1443 = null;
        Statics.field1833 = null;
        Statics.field1728 = null;
        class187.field3011 = 1;
        Statics.field801 = null;
        Statics.field1824 = -1;
        Statics.field3016 = -1;
        Statics.field3017 = 0;
        Statics.field3018 = false;
        Statics.field1155 = 2;
        class175.method524(true);
        Statics.field759 = false;
    }

    @ObfuscatedName("ba.g(Lem;B)V")
    public static void method1230(class148 arg0) {
        if (!field750) {
            if ((class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4) && class144.field2212 >= field756 + 765 - 50 && class144.field2213 >= 453) {
                Statics.field43.field158 = !Statics.field43.field158;
                class9.method2679();
                if (Statics.field43.field158) {
                    class187.method646();
                } else {
                    class172 var6 = Statics.field477;
                    int var7 = var6.method3098("scape main");
                    int var8 = var6.method3099(var7, "");
                    class187.method2091(var6, var7, var8, 255, false);
                }
            }
            if (client.field386 != 5) {
                field749++;
                if (client.field386 == 10 || client.field386 == 11) {
                    if (client.field311 == 0) {
                        if (class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4) {
                            int var9 = field756 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class144.field2212 >= var9 && class144.field2212 <= var9 + var11 && class144.field2213 >= var10 && class144.field2213 <= var10 + var12) {
                                method2768();
                                return;
                            }
                        }
                        if (Statics.field679 != null) {
                            method2768();
                        }
                    }
                    int var13 = class144.field2211;
                    int var14 = class144.field2212;
                    int var15 = class144.field2213;
                    if (!Statics.field82 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field747 == 0) {
                        int var16 = field748 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class142.method2324(client.method2345("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field748 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field308 & 0x2000000) != 0) {
                                field753 = "";
                                field761 = class161.field2577;
                                field762 = class161.field2578;
                                field763 = class161.field2579;
                                field747 = 1;
                                field768 = 0;
                            } else if ((client.field308 & 0x4) != 0) {
                                if ((client.field308 & 0x400) == 0) {
                                    field761 = class161.field2545;
                                    field762 = class161.field2576;
                                    field763 = class161.field2377;
                                } else {
                                    field761 = class161.field2594;
                                    field762 = class161.field2592;
                                    field763 = class161.field2369;
                                }
                                field753 = class161.field2531;
                                field747 = 1;
                                field768 = 0;
                            } else if ((client.field308 & 0x400) == 0) {
                                field761 = class161.field2494;
                                field762 = class161.field2565;
                                field763 = class161.field2392;
                                field747 = 2;
                                field768 = 0;
                            } else {
                                field761 = class161.field2571;
                                field762 = class161.field2572;
                                field763 = class161.field2573;
                                field753 = class161.field2531;
                                field747 = 1;
                                field768 = 0;
                            }
                        }
                    } else if (field747 == 1) {
                        while (class141.method730()) {
                            if (Statics.field598 == 84) {
                                field761 = class161.field2494;
                                field762 = class161.field2565;
                                field763 = class161.field2392;
                                field747 = 2;
                                field768 = 0;
                            } else if (Statics.field598 == 13) {
                                field747 = 0;
                            }
                        }
                        int var19 = field748 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field761 = class161.field2494;
                            field762 = class161.field2565;
                            field763 = class161.field2392;
                            field747 = 2;
                            field768 = 0;
                        }
                        int var21 = field748 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field747 = 0;
                        }
                    } else if (field747 == 2) {
                        short var22 = 231;
                        int var44 = var22 + 30;
                        if (var13 == 1 && var15 >= var44 - 15 && var15 < var44) {
                            field768 = 0;
                        }
                        var44 += 15;
                        if (var13 == 1 && var15 >= var44 - 15 && var15 < var44) {
                            field768 = 1;
                        }
                        var44 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method89(class161.field2603, class161.field2429, class161.field2605);
                            field747 = 5;
                            return;
                        }
                        int var24 = field748 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field764 = field764.trim();
                            if (field764.length() == 0) {
                                method89(class161.field2470, class161.field2382, class161.field2567);
                                return;
                            }
                            if (field765.length() == 0) {
                                method89(class161.field2473, class161.field2365, class161.field2475);
                                return;
                            }
                            method89(class161.field2493, class161.field2583, class161.field2584);
                            field766 = Statics.field43.field156.containsKey(class167.method3053(field764)) ? class163.field2649 : class163.field2647;
                            client.method2342(20);
                            return;
                        }
                        int var26 = field748 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field747 = 0;
                            field764 = "";
                            field765 = "";
                            Statics.field2337 = 0;
                            Statics.field2332 = "";
                            field767 = true;
                        }
                        while (true) {
                            while (class141.method730()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field743.length(); var28++) {
                                    if (Statics.field2094 == field743.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field598 == 13) {
                                    field747 = 0;
                                    field764 = "";
                                    field765 = "";
                                    Statics.field2337 = 0;
                                    Statics.field2332 = "";
                                    field767 = true;
                                } else if (field768 == 0) {
                                    if (Statics.field598 == 85 && field764.length() > 0) {
                                        field764 = field764.substring(0, field764.length() - 1);
                                    }
                                    if (Statics.field598 == 84 || Statics.field598 == 80) {
                                        field768 = 1;
                                    }
                                    if (var27 && field764.length() < 320) {
                                        field764 = field764 + Statics.field2094;
                                    }
                                } else if (field768 == 1) {
                                    if (Statics.field598 == 85 && field765.length() > 0) {
                                        field765 = field765.substring(0, field765.length() - 1);
                                    }
                                    if (Statics.field598 == 84 || Statics.field598 == 80) {
                                        field768 = 0;
                                    }
                                    if (Statics.field598 == 84) {
                                        field764 = field764.trim();
                                        if (field764.length() == 0) {
                                            method89(class161.field2470, class161.field2382, class161.field2567);
                                            return;
                                        }
                                        if (field765.length() == 0) {
                                            method89(class161.field2473, class161.field2365, class161.field2475);
                                            return;
                                        }
                                        method89(class161.field2493, class161.field2583, class161.field2584);
                                        field766 = Statics.field43.field156.containsKey(class167.method3053(field764)) ? class163.field2649 : class163.field2647;
                                        client.method2342(20);
                                        return;
                                    }
                                    if (var27 && field765.length() < 20) {
                                        field765 = field765 + Statics.field2094;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field747 == 3) {
                        int var29 = field748 + 180;
                        short var30 = 276;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field761 = class161.field2494;
                            field762 = class161.field2565;
                            field763 = class161.field2392;
                            field747 = 2;
                            field768 = 0;
                        }
                        int var31 = field748 + 180;
                        short var32 = 326;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            method89(class161.field2603, class161.field2429, class161.field2605);
                            field747 = 5;
                            return;
                        }
                    } else if (field747 == 4) {
                        int var33 = field748 + 180 - 80;
                        short var34 = 321;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            Statics.field2332.trim();
                            if (Statics.field2332.length() != 6) {
                                method89(class161.field2389, class161.field2390, class161.field2391);
                                return;
                            }
                            Statics.field2337 = Integer.parseInt(Statics.field2332);
                            Statics.field2332 = "";
                            field766 = field767 ? class163.field2646 : class163.field2645;
                            method89(class161.field2493, class161.field2583, class161.field2584);
                            client.method2342(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field748 + 180 - 9 && var14 <= field748 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field767 = !field767;
                        }
                        if (var13 == 1 && var14 >= field748 + 180 - 34 && var14 <= field748 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class142.method2324(client.method2345("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var35 = field748 + 180 + 80;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            field747 = 0;
                            field764 = "";
                            field765 = "";
                            Statics.field2337 = 0;
                            Statics.field2332 = "";
                        }
                        while (class141.method730()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field742.length(); var37++) {
                                if (Statics.field2094 == field742.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field598 == 13) {
                                field747 = 0;
                                field764 = "";
                                field765 = "";
                                Statics.field2337 = 0;
                                Statics.field2332 = "";
                            } else {
                                if (Statics.field598 == 85 && Statics.field2332.length() > 0) {
                                    Statics.field2332 = Statics.field2332.substring(0, Statics.field2332.length() - 1);
                                }
                                if (Statics.field598 == 84) {
                                    Statics.field2332.trim();
                                    if (Statics.field2332.length() != 6) {
                                        method89(class161.field2389, class161.field2390, class161.field2391);
                                        return;
                                    }
                                    Statics.field2337 = Integer.parseInt(Statics.field2332);
                                    Statics.field2332 = "";
                                    field766 = field767 ? class163.field2646 : class163.field2645;
                                    method89(class161.field2493, class161.field2583, class161.field2584);
                                    client.method2342(20);
                                    return;
                                }
                                if (var36 && Statics.field2332.length() < 6) {
                                    Statics.field2332 = Statics.field2332 + Statics.field2094;
                                }
                            }
                        }
                    } else if (field747 == 5) {
                        int var38 = field748 + 180 - 80;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            method1133();
                            return;
                        }
                        int var40 = field748 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field761 = class161.field2494;
                            field762 = class161.field2565;
                            field763 = class161.field2392;
                            field747 = 2;
                            field768 = 0;
                            field765 = "";
                        }
                        while (class141.method730()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field743.length(); var42++) {
                                if (Statics.field2094 == field743.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field598 == 13) {
                                field761 = class161.field2494;
                                field762 = class161.field2565;
                                field763 = class161.field2392;
                                field747 = 2;
                                field768 = 0;
                                field765 = "";
                            } else {
                                if (Statics.field598 == 85 && field764.length() > 0) {
                                    field764 = field764.substring(0, field764.length() - 1);
                                }
                                if (Statics.field598 == 84) {
                                    method1133();
                                    return;
                                }
                                if (var41 && field764.length() < 320) {
                                    field764 = field764 + Statics.field2094;
                                }
                            }
                        }
                    } else if (field747 == 6) {
                        while (true) {
                            do {
                                if (!class141.method730()) {
                                    short var43 = 321;
                                    if (var13 == 1 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                                        field761 = class161.field2494;
                                        field762 = class161.field2565;
                                        field763 = class161.field2392;
                                        field747 = 2;
                                        field768 = 0;
                                        field765 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field598 != 84 && Statics.field598 != 13);
                            field761 = class161.field2494;
                            field762 = class161.field2565;
                            field763 = class161.field2392;
                            field747 = 2;
                            field768 = 0;
                            field765 = "";
                        }
                    }
                }
            }
        } else if (class144.field2211 == 1 || !Statics.field82 && class144.field2211 == 4) {
            int var1 = field756 + 280;
            if (class144.field2212 >= var1 && class144.field2212 <= var1 + 14 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                class28.method803(0, 0);
            } else if (class144.field2212 >= var1 + 15 && class144.field2212 <= var1 + 80 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                class28.method803(0, 1);
            } else {
                int var2 = field756 + 390;
                if (class144.field2212 >= var2 && class144.field2212 <= var2 + 14 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                    class28.method803(1, 0);
                } else if (class144.field2212 >= var2 + 15 && class144.field2212 <= var2 + 80 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                    class28.method803(1, 1);
                } else {
                    int var3 = field756 + 500;
                    if (class144.field2212 >= var3 && class144.field2212 <= var3 + 14 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                        class28.method803(2, 0);
                    } else if (class144.field2212 >= var3 + 15 && class144.field2212 <= var3 + 80 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                        class28.method803(2, 1);
                    } else {
                        int var4 = field756 + 610;
                        if (class144.field2212 >= var4 && class144.field2212 <= var4 + 14 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                            class28.method803(3, 0);
                        } else if (class144.field2212 >= var4 + 15 && class144.field2212 <= var4 + 80 && class144.field2213 >= 4 && class144.field2213 <= 18) {
                            class28.method803(3, 1);
                        } else if (class144.field2212 >= field756 + 708 && class144.field2213 >= 4 && class144.field2212 <= field756 + 708 + 50 && class144.field2213 <= 20) {
                            field750 = false;
                            Statics.field746.method1650(field756, 0);
                            Statics.field2695.method1650(field756 + 382, 0);
                            Statics.field584.method1807(field756 + 382 - Statics.field584.field1475 / 2, 18);
                        } else if (field772 != -1) {
                            class28 var5 = Statics.field1687[field772];
                            method185(var5);
                            field750 = false;
                            Statics.field746.method1650(field756, 0);
                            Statics.field2695.method1650(field756 + 382, 0);
                            Statics.field584.method1807(field756 + 382 - Statics.field584.field1475 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.n(B)V")
    public static void method1133() {
        field764 = field764.trim();
        if (field764.length() == 0) {
            method89(class161.field2603, class161.field2429, class161.field2605);
            return;
        }
        long var0 = class10.method1026();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method637(var0, field764);
        }
        switch(var2) {
            case 2:
                method89(class161.field2606, class161.field2468, class161.field2608);
                field747 = 6;
                break;
            case 3:
                method89(class161.field2609, class161.field2610, class161.field2611);
                break;
            case 4:
                method89(class161.field2612, class161.field2613, class161.field2560);
                break;
            case 5:
                method89(class161.field2615, class161.field2616, class161.field2617);
                break;
            case 6:
                method89(class161.field2618, class161.field2619, class161.field2620);
                break;
            case 7:
                method89(class161.field2471, class161.field2614, class161.field2623);
        }
    }

    @ObfuscatedName("dl.u(Lhe;Lhe;Lhe;ZB)V")
    public static void method2693(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field756 = (Statics.field1268 - client.field516) / 2;
            field748 = field756 + 202;
        }
        if (field750) {
            method3707(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field746.method1650(field756, 0);
            Statics.field2695.method1650(field756 + 382, 0);
            Statics.field584.method1807(field756 + 382 - Statics.field584.field1475 / 2, 18);
        }
        if (client.field386 == 0 || client.field386 == 5) {
            byte var4 = 20;
            arg0.method3822(class161.field2563, field748 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class83.method1758(field748 + 180 - 152, var5, 304, 34, 9179409);
            class83.method1758(field748 + 180 - 151, var5 + 1, 302, 32, 0);
            class83.method1755(field748 + 180 - 150, var5 + 2, field757 * 3, 30, 9179409);
            class83.method1755(field757 * 3 + (field748 + 180 - 150), var5 + 2, 300 - field757 * 3, 30, 0);
            arg0.method3822(field770, field748 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field386 == 20) {
            Statics.field2959.method1807(field748 + 180 - Statics.field2959.field1475 / 2, 271 - Statics.field2959.field1476 / 2);
            short var6 = 211;
            arg0.method3822(field761, field748 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3822(field762, field748 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3822(field763, field748 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field747 != 4) {
                arg0.method3876(class161.field2585, field748 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field764; arg0.method3814(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3876(class227.method3818(var8), field748 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3876(class161.field2492 + class167.method738(field765), field748 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field386 == 10 || client.field386 == 11) {
            Statics.field2959.method1807(field748, 171);
            if (field747 == 0) {
                short var9 = 251;
                arg0.method3822(class161.field2588, field748 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field748 + 180 - 80;
                short var11 = 291;
                Statics.field744.method1807(var10 - 73, var11 - 20);
                arg0.method3823(class161.field2589, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field748 + 180 + 80;
                Statics.field744.method1807(var12 - 73, var11 - 20);
                arg0.method3823(class161.field2590, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field747 == 1) {
                arg0.method3822(field753, field748 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3822(field761, field748 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3822(field762, field748 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3822(field763, field748 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field748 + 180 - 80;
                short var15 = 321;
                Statics.field744.method1807(var14 - 73, var15 - 20);
                arg0.method3822(class161.field2362, var14, var15 + 5, 16777215, 0);
                int var16 = field748 + 180 + 80;
                Statics.field744.method1807(var16 - 73, var15 - 20);
                arg0.method3822(class161.field2480, var16, var15 + 5, 16777215, 0);
            } else if (field747 == 2) {
                short var17 = 211;
                arg0.method3822(field761, field748 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3822(field762, field748 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3822(field763, field748 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3876(class161.field2585, field748 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field764; arg0.method3814(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3876(class227.method3818(var19) + (field768 == 0 & client.field333 % 40 < 20 ? class2.method2762(16776960) + class2.field31 : ""), field748 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3876(class161.field2492 + class167.method738(field765) + (field768 == 1 & client.field333 % 40 < 20 ? class2.method2762(16776960) + class2.field31 : ""), field748 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field748 + 180 - 80;
                short var21 = 321;
                Statics.field744.method1807(var20 - 73, var21 - 20);
                arg0.method3822(class161.field2479, var20, var21 + 5, 16777215, 0);
                int var22 = field748 + 180 + 80;
                Statics.field744.method1807(var22 - 73, var21 - 20);
                arg0.method3822(class161.field2480, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3822(class161.field2598, field748 + 180, var23, 16776960, 0);
            } else if (field747 == 3) {
                short var24 = 201;
                arg0.method3822(class161.field2549, field748 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3822(class161.field2396, field748 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3822(class161.field2595, field748 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field748 + 180;
                short var26 = 276;
                Statics.field744.method1807(var25 - 73, var26 - 20);
                arg2.method3822(class161.field2477, var25, var26 + 5, 16777215, 0);
                int var27 = field748 + 180;
                short var28 = 326;
                Statics.field744.method1807(var27 - 73, var28 - 20);
                arg2.method3822(class161.field2597, var27, var28 + 5, 16777215, 0);
            } else if (field747 == 4) {
                arg0.method3822(class161.field2580, field748 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3822(field761, field748 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3822(field762, field748 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3822(field763, field748 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3876(class161.field2587 + class167.method738(Statics.field2332) + (client.field333 % 40 < 20 ? class2.method2762(16776960) + class2.field31 : ""), field748 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3876(class161.field2363, field748 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3876(class161.field2599, field748 + 180 - 9, var98, 16776960, 0);
                int var30 = field748 + 180 - 9 + arg0.method3814(class161.field2599) + 15;
                int var31 = var98 - arg0.field3244;
                class84 var32;
                if (field767) {
                    var32 = Statics.field224;
                } else {
                    var32 = Statics.field237;
                }
                var32.method1807(var30, var31);
                var94 = var98 + 15;
                int var33 = field748 + 180 - 80;
                short var34 = 321;
                Statics.field744.method1807(var33 - 73, var34 - 20);
                arg0.method3822(class161.field2362, var33, var34 + 5, 16777215, 0);
                int var35 = field748 + 180 + 80;
                Statics.field744.method1807(var35 - 73, var34 - 20);
                arg0.method3822(class161.field2480, var35, var34 + 5, 16777215, 0);
                arg1.method3822(class161.field2581, field748 + 180, var34 + 36, 255, 0);
            } else if (field747 == 5) {
                arg0.method3822(class161.field2574, field748 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3822(field761, field748 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3822(field762, field748 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3822(field763, field748 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3876(class161.field2600, field748 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field764; arg0.method3814(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3876(class227.method3818(var38) + (client.field333 % 40 < 20 ? class2.method2762(16776960) + class2.field31 : ""), field748 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field748 + 180 - 80;
                short var40 = 321;
                Statics.field744.method1807(var39 - 73, var40 - 20);
                arg0.method3822(class161.field2575, var39, var40 + 5, 16777215, 0);
                int var41 = field748 + 180 + 80;
                Statics.field744.method1807(var41 - 73, var40 - 20);
                arg0.method3822(class161.field2602, var41, var40 + 5, 16777215, 0);
            } else if (field747 == 6) {
                short var42 = 211;
                arg0.method3822(field761, field748 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3822(field762, field748 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3822(field763, field748 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field748 + 180;
                short var44 = 321;
                Statics.field744.method1807(var43 - 73, var44 - 20);
                arg0.method3822(class161.field2602, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field749 > 0) {
            method717(field749);
            field749 = 0;
        }
        short var45 = 256;
        if (field751 > 0) {
            for (int var46 = 0; var46 < 256; var46++) {
                if (field751 > 768) {
                    Statics.field1140[var46] = method708(Statics.field1926[var46], Statics.field2309[var46], 1024 - field751);
                } else if (field751 > 256) {
                    Statics.field1140[var46] = Statics.field2309[var46];
                } else {
                    Statics.field1140[var46] = method708(Statics.field2309[var46], Statics.field1926[var46], 256 - field751);
                }
            }
        } else if (field752 > 0) {
            for (int var47 = 0; var47 < 256; var47++) {
                if (field752 > 768) {
                    Statics.field1140[var47] = method708(Statics.field1926[var47], Statics.field755[var47], 1024 - field752);
                } else if (field752 > 256) {
                    Statics.field1140[var47] = Statics.field755[var47];
                } else {
                    Statics.field1140[var47] = method708(Statics.field755[var47], Statics.field1926[var47], 256 - field752);
                }
            }
        } else {
            for (int var48 = 0; var48 < 256; var48++) {
                Statics.field1140[var48] = Statics.field1926[var48];
            }
        }
        class83.method1733(field756, 9, field756 + 128, var45 + 7);
        Statics.field746.method1650(field756, 0);
        class83.method1732();
        int var49 = 0;
        int var50 = field756 + Statics.field3217.field1452 * 9;
        for (int var51 = 1; var51 < var45 - 1; var51++) {
            int var52 = (var45 - var51) * field769[var51] / var45;
            int var53 = var52 + 22;
            if (var53 < 0) {
                var53 = 0;
            }
            var49 += var53;
            for (int var54 = var53; var54 < 128; var54++) {
                int var55 = Statics.field1833[var49++];
                if (var55 == 0) {
                    var50++;
                } else {
                    int var57 = 256 - var55;
                    int var58 = Statics.field1140[var55];
                    int var59 = Statics.field3217.field1445[var50];
                    Statics.field3217.field1445[var50++] = ((var58 & 0xFF00) * var55 + (var59 & 0xFF00) * var57 & 0xFF0000) + ((var58 & 0xFF00FF) * var55 + (var59 & 0xFF00FF) * var57 & 0xFF00FF00) >> 8;
                }
            }
            var50 += Statics.field3217.field1452 + var53 - 128;
        }
        class83.method1733(field756 + 765 - 128, 9, field756 + 765, var45 + 7);
        Statics.field2695.method1650(field756 + 382, 0);
        class83.method1732();
        int var60 = 0;
        int var61 = field756 + Statics.field3217.field1452 * 9 + 24 + 637;
        for (int var62 = 1; var62 < var45 - 1; var62++) {
            int var63 = (var45 - var62) * field769[var62] / var45;
            int var64 = 103 - var63;
            int var65 = var61 + var63;
            for (int var66 = 0; var66 < var64; var66++) {
                int var67 = Statics.field1833[var60++];
                if (var67 == 0) {
                    var65++;
                } else {
                    int var69 = 256 - var67;
                    int var70 = Statics.field1140[var67];
                    int var71 = Statics.field3217.field1445[var65];
                    Statics.field3217.field1445[var65++] = ((var70 & 0xFF00) * var67 + (var71 & 0xFF00) * var69 & 0xFF0000) + ((var70 & 0xFF00FF) * var67 + (var71 & 0xFF00FF) * var69 & 0xFF00FF00) >> 8;
                }
            }
            var60 += 128 - var64;
            var61 = Statics.field3217.field1452 - var64 - var63 + var65;
        }
        Statics.field771[Statics.field43.field158 ? 1 : 0].method1807(field756 + 765 - 40, 463);
        if (client.field386 > 5 && client.field311 == 0) {
            if (Statics.field2104 == null) {
                Statics.field2104 = class80.method645(Statics.field1200, "sl_button", "");
            } else {
                int var72 = field756 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field2104.method1807(var72, var73);
                arg0.method3822(class161.field2536 + " " + client.field300, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field679 == null) {
                    arg1.method3822(class161.field2542, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3822(class161.field2357, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field2694.getGraphics();
            Statics.field3217.method1553(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field2694.repaint();
        }
    }

    @ObfuscatedName("u.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method89(String arg0, String arg1, String arg2) {
        field761 = arg0;
        field762 = arg1;
        field763 = arg2;
    }

    @ObfuscatedName("ao.l(Lcs;B)V")
    public static final void method766(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1435.length; var2++) {
            Statics.field1435[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1435[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1443[var8] = (Statics.field1435[var8 - 1] + Statics.field1435[var8 + 1] + Statics.field1435[var8 - 128] + Statics.field1435[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1435;
            Statics.field1435 = Statics.field1443;
            Statics.field1443 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1476; var11++) {
            for (int var12 = 0; var12 < arg0.field1475; var12++) {
                if (arg0.field1479[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1478;
                    int var14 = var11 + 16 + arg0.field1477;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1435[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("al.m(II)V")
    public static final void method717(int arg0) {
        short var1 = 256;
        field758 += arg0 * 128;
        if (field758 > Statics.field1435.length) {
            field758 -= Statics.field1435.length;
            int var2 = (int) (Math.random() * 12.0D);
            method766(Statics.field745[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1833[var3 + var4] - Statics.field1435[field758 + var3 & Statics.field1435.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1833[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1833[var9 + var10] = 255;
                } else {
                    Statics.field1833[var9 + var10] = 0;
                }
            }
        }
        if (field751 > 0) {
            field751 -= arg0 * 4;
        }
        if (field752 > 0) {
            field752 -= arg0 * 4;
        }
        if (field751 == 0 && field752 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field751 = 1024;
            }
            if (var12 == 1) {
                field752 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field769[var13] = field769[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field769[var14] = (int) (Math.sin((double) field760 / 14.0D) * 16.0D + Math.sin((double) field760 / 15.0D) * 14.0D + Math.sin((double) field760 / 16.0D) * 12.0D);
            field760++;
        }
        field754 += arg0 * -1652460019;
        int var15 = ((client.field333 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field754 * 1485204724; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1833[(var18 << 7) + var17] = 192;
        }
        field754 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1833[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1833[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1728[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1728[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1728[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1833[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("al.j(IIII)I")
    public static final int method708(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("hg.y(Lhe;Lhe;B)V")
    public static void method3707(class228 arg0, class228 arg1) {
        if (Statics.field201 == null) {
            Statics.field201 = class80.method728(Statics.field1200, "sl_back", "");
        }
        if (Statics.field255 == null) {
            Statics.field255 = class80.method1038(Statics.field1200, "sl_flags", "");
        }
        if (Statics.field135 == null) {
            Statics.field135 = class80.method1038(Statics.field1200, "sl_arrows", "");
        }
        if (Statics.field1672 == null) {
            Statics.field1672 = class80.method1038(Statics.field1200, "sl_stars", "");
        }
        class83.method1755(field756, 23, 765, 480, 0);
        class83.method1744(field756, 0, 125, 23, 12425273, 9135624);
        class83.method1744(field756 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3822(class161.field2450, field756 + 62, 15, 0, -1);
        if (Statics.field1672 != null) {
            Statics.field1672[1].method1807(field756 + 140, 1);
            arg1.method3876(class161.field2489, field756 + 152, 10, 16777215, -1);
            Statics.field1672[0].method1807(field756 + 140, 12);
            arg1.method3876(class161.field2550, field756 + 152, 21, 16777215, -1);
        }
        if (Statics.field135 != null) {
            int var2 = field756 + 280;
            if (class28.field682[0] == 0 && class28.field672[0] == 0) {
                Statics.field135[2].method1807(var2, 4);
            } else {
                Statics.field135[0].method1807(var2, 4);
            }
            if (class28.field682[0] == 0 && class28.field672[0] == 1) {
                Statics.field135[3].method1807(var2 + 15, 4);
            } else {
                Statics.field135[1].method1807(var2 + 15, 4);
            }
            arg0.method3876(class161.field2627, var2 + 32, 17, 16777215, -1);
            int var3 = field756 + 390;
            if (class28.field682[0] == 1 && class28.field672[0] == 0) {
                Statics.field135[2].method1807(var3, 4);
            } else {
                Statics.field135[0].method1807(var3, 4);
            }
            if (class28.field682[0] == 1 && class28.field672[0] == 1) {
                Statics.field135[3].method1807(var3 + 15, 4);
            } else {
                Statics.field135[1].method1807(var3 + 15, 4);
            }
            arg0.method3876(class161.field2628, var3 + 32, 17, 16777215, -1);
            int var4 = field756 + 500;
            if (class28.field682[0] == 2 && class28.field672[0] == 0) {
                Statics.field135[2].method1807(var4, 4);
            } else {
                Statics.field135[0].method1807(var4, 4);
            }
            if (class28.field682[0] == 2 && class28.field672[0] == 1) {
                Statics.field135[3].method1807(var4 + 15, 4);
            } else {
                Statics.field135[1].method1807(var4 + 15, 4);
            }
            arg0.method3876(class161.field2422, var4 + 32, 17, 16777215, -1);
            int var5 = field756 + 610;
            if (class28.field682[0] == 3 && class28.field672[0] == 0) {
                Statics.field135[2].method1807(var5, 4);
            } else {
                Statics.field135[0].method1807(var5, 4);
            }
            if (class28.field682[0] == 3 && class28.field672[0] == 1) {
                Statics.field135[3].method1807(var5 + 15, 4);
            } else {
                Statics.field135[1].method1807(var5 + 15, 4);
            }
            arg0.method3876(class161.field2630, var5 + 32, 17, 16777215, -1);
        }
        class83.method1755(field756 + 708, 4, 50, 16, 0);
        arg1.method3822(class161.field2480, field756 + 708 + 25, 16, 16777215, -1);
        field772 = -1;
        if (Statics.field201 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field686) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field686) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field686) {
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
            int var17 = field756 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field686; var20++) {
                class28 var21 = Statics.field1687[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field677);
                if (var21.field677 == -1) {
                    var23 = class161.field2409;
                    var22 = false;
                } else if (var21.field677 > 1980) {
                    var23 = class161.field2632;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method589()) {
                    if (var21.method584()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method588()) {
                    var24 = 16711680;
                    if (var21.method584()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method613()) {
                    if (var21.method584()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method584()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class144.field2205 >= var17 && class144.field2207 * 900883817 >= var16 && class144.field2205 < var6 + var17 && class144.field2207 * 900883817 < var7 + var16 && var22) {
                    field772 = var20;
                    Statics.field201[var25].method1656(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field201[var25].method1650(var17, var16);
                }
                if (Statics.field255 != null) {
                    Statics.field255[(var21.method584() ? 8 : 0) + var21.field680].method1807(var17 + 29, var16);
                }
                arg0.method3822(Integer.toString(var21.field675), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3822(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3814(Statics.field1687[field772].field670) + 6;
                int var27 = arg1.field3244 + 8;
                class83.method1755(class144.field2205 - var26 / 2, class144.field2207 * 900883817 + 20 + 5, var26, var27, 16777120);
                class83.method1758(class144.field2205 - var26 / 2, class144.field2207 * 900883817 + 20 + 5, var26, var27, 0);
                arg1.method3822(Statics.field1687[field772].field670, class144.field2205, class144.field2207 * 900883817 + 20 + 5 + arg1.field3244 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field2694.getGraphics();
            Statics.field3217.method1553(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field2694.repaint();
        }
    }

    @ObfuscatedName("x.s(Las;I)V")
    public static void method185(class28 arg0) {
        if (arg0.method584() != client.field304) {
            client.field304 = arg0.method584();
            boolean var1 = arg0.method584();
            if (Statics.field3265 != var1) {
                class56.field1168.method3533();
                class56.field1164.method3533();
                class56.field1170.method3533();
                Statics.field3265 = var1;
            }
        }
        Statics.field1079 = arg0.field678;
        client.field300 = arg0.field675;
        client.field308 = arg0.field671;
        Statics.field1127 = client.field515 == 0 ? 43594 : arg0.field675 + 40000;
        Statics.field1732 = client.field515 == 0 ? 443 : arg0.field675 + 50000;
        Statics.field1409 = Statics.field1127;
    }

    @ObfuscatedName("ek.p(B)V")
    public static void method2768() {
        if (class28.method2188()) {
            field750 = true;
        }
    }
}

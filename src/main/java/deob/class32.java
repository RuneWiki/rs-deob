package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("am")
public class class32 {

    @ObfuscatedName("am.j")
    public static int field749 = 0;

    @ObfuscatedName("am.e")
    public static int field721 = field749 + 202;

    @ObfuscatedName("am.z")
    public static int[] field722 = new int[256];

    @ObfuscatedName("am.f")
    public static int field725 = 0;

    @ObfuscatedName("am.q")
    public static int field736 = 0;

    @ObfuscatedName("am.an")
    public static int field727 = 0;

    @ObfuscatedName("am.au")
    public static int field728 = 0;

    @ObfuscatedName("am.ap")
    public static int field729 = 0;

    @ObfuscatedName("am.am")
    public static int field717 = 0;

    @ObfuscatedName("am.ae")
    public static int field731 = 10;

    @ObfuscatedName("am.ao")
    public static String field732 = "";

    @ObfuscatedName("am.as")
    public static int field733 = 0;

    @ObfuscatedName("am.ai")
    public static String field734 = "";

    @ObfuscatedName("am.ah")
    public static String field735 = "";

    @ObfuscatedName("am.ax")
    public static String field726 = "";

    @ObfuscatedName("am.aa")
    public static String field739 = "";

    @ObfuscatedName("am.aq")
    public static String field738 = "";

    @ObfuscatedName("am.ay")
    public static String field741 = "";

    @ObfuscatedName("am.aj")
    public static class160 field720 = class160.field2609;

    @ObfuscatedName("am.at")
    public static boolean field740 = true;

    @ObfuscatedName("am.af")
    public static int field730 = 0;

    @ObfuscatedName("am.al")
    public static String field724 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("am.ag")
    public static String field744 = "1234567890";

    @ObfuscatedName("am.ak")
    public static boolean field745 = false;

    @ObfuscatedName("am.bj")
    public static int field748 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.s(B)I")
    public static int method36() {
        return 9;
    }

    @ObfuscatedName("dd.j(Ljava/awt/Component;Lfa;Lfa;ZII)V")
    public static void method2622(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field737) {
            field733 = arg4;
            class80.method1665();
            byte[] var5 = arg1.method3030("title.jpg", "");
            Statics.field570 = new class79(var5, arg0);
            Statics.field2017 = Statics.field570.method1558();
            if ((client.field280 & 0x20000000) == 0) {
                Statics.field719 = class77.method2752(arg2, "logo", "");
            } else {
                Statics.field719 = class77.method2752(arg2, "logo_deadman_mode", "");
            }
            Statics.field3129 = class77.method2752(arg2, "titlebox", "");
            Statics.field718 = class77.method2752(arg2, "titlebutton", "");
            Statics.field682 = class77.method165(arg2, "runes", "");
            Statics.field2264 = class77.method165(arg2, "title_mute", "");
            Statics.field679 = class77.method2752(arg2, "options_radio_buttons,0", "");
            Statics.field709 = class77.method2752(arg2, "options_radio_buttons,2", "");
            Statics.field27 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field27[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field27[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field27[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field27[var9 + 192] = 16777215;
            }
            Statics.field170 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field170[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field170[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field170[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field170[var13 + 192] = 16777215;
            }
            Statics.field742 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field742[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field742[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field742[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field742[var17 + 192] = 16777215;
            }
            Statics.field723 = new int[256];
            Statics.field671 = new int[32768];
            Statics.field2933 = new int[32768];
            method2268((class81) null);
            Statics.field666 = new int[32768];
            Statics.field1019 = new int[32768];
            if (arg3) {
                field738 = "";
                field741 = "";
            }
            Statics.field1541 = 0;
            Statics.field1036 = "";
            field740 = true;
            field745 = false;
            if (Statics.field1389.field144) {
                Statics.method128(2);
            } else {
                class184.method2941(2, Statics.field1777, "scape main", "", 255, false);
            }
            class172.method2285(false);
            Statics.field737 = true;
            field749 = (Statics.field215 - client.field493 * 765) / 2;
            field721 = field749 + 202;
            Statics.field570.method1568(field749, 0);
            Statics.field2017.method1568(field749 + 382, 0);
            Statics.field719.method1735(field749 + 382 - Statics.field719.field1428 / 2, 18);
        } else if (arg4 == 4) {
            field733 = 4;
        }
    }

    @ObfuscatedName("m.p(I)V")
    public static void method168() {
        if (!Statics.field737) {
            return;
        }
        Statics.field3129 = null;
        Statics.field718 = null;
        Statics.field682 = null;
        Statics.field570 = null;
        Statics.field2017 = null;
        Statics.field719 = null;
        Statics.field2264 = null;
        Statics.field679 = null;
        Statics.field709 = null;
        Statics.field746 = null;
        Statics.field1404 = null;
        Statics.field2605 = null;
        Statics.field747 = null;
        Statics.field1105 = null;
        Statics.field27 = null;
        Statics.field170 = null;
        Statics.field742 = null;
        Statics.field723 = null;
        Statics.field671 = null;
        Statics.field2933 = null;
        Statics.field666 = null;
        Statics.field1019 = null;
        Statics.method128(2);
        class172.method2285(true);
        Statics.field737 = false;
    }

    @ObfuscatedName("bl.x(Ler;I)V")
    public static void method1522(class145 arg0) {
        if (!field745) {
            if ((class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4) && class141.field2170 >= field749 + 765 - 50 && class141.field2171 >= 453) {
                Statics.field1389.field144 = !Statics.field1389.field144;
                class9.method99();
                if (Statics.field1389.field144) {
                    class184.method2225();
                } else {
                    class184.method613(Statics.field1777, "scape main", "", 255, false);
                }
            }
            if (client.field287 != 5) {
                field729++;
                if (client.field287 == 10 || client.field287 == 11) {
                    if (client.field286 == 0) {
                        if (class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4) {
                            int var6 = field749 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class141.field2170 >= var6 && class141.field2170 <= var6 + var8 && class141.field2171 >= var7 && class141.field2171 <= var7 + var9) {
                                if (class26.method714()) {
                                    field745 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1538 != null && class26.method714()) {
                            field745 = true;
                        }
                    }
                    int var10 = class141.field2160;
                    int var11 = class141.field2170;
                    int var12 = class141.field2171;
                    if (!Statics.field1564 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field733 == 0) {
                        int var13 = field721 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            String var15 = client.method2604("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class139.method2134(var15, true, "openjs", false);
                        }
                        int var16 = field721 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field280 & 0x2000000) != 0) {
                                field734 = "";
                                field735 = class158.field2395;
                                field726 = class158.field2542;
                                field739 = class158.field2391;
                                field733 = 1;
                                field730 = 0;
                            } else if ((client.field280 & 0x4) != 0) {
                                if ((client.field280 & 0x400) == 0) {
                                    field735 = class158.field2532;
                                    field726 = class158.field2533;
                                    field739 = class158.field2534;
                                } else {
                                    field735 = class158.field2578;
                                    field726 = class158.field2539;
                                    field739 = class158.field2540;
                                }
                                field734 = class158.field2416;
                                field733 = 1;
                                field730 = 0;
                            } else if ((client.field280 & 0x400) == 0) {
                                field735 = class158.field2528;
                                field726 = class158.field2529;
                                field739 = class158.field2530;
                                field733 = 2;
                                field730 = 0;
                            } else {
                                field735 = class158.field2572;
                                field726 = class158.field2536;
                                field739 = class158.field2459;
                                field734 = class158.field2416;
                                field733 = 1;
                                field730 = 0;
                            }
                        }
                    } else if (field733 == 1) {
                        while (class138.method546()) {
                            if (Statics.field2134 == 84) {
                                field735 = class158.field2528;
                                field726 = class158.field2529;
                                field739 = class158.field2530;
                                field733 = 2;
                                field730 = 0;
                            } else if (Statics.field2134 == 13) {
                                field733 = 0;
                            }
                        }
                        int var17 = field721 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field735 = class158.field2528;
                            field726 = class158.field2529;
                            field739 = class158.field2530;
                            field733 = 2;
                            field730 = 0;
                        }
                        int var19 = field721 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field733 = 0;
                        }
                    } else if (field733 == 2) {
                        short var20 = 231;
                        int var43 = var20 + 30;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field730 = 0;
                        }
                        var43 += 15;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field730 = 1;
                        }
                        var43 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method105(class158.field2567, class158.field2406, class158.field2586);
                            field733 = 5;
                            return;
                        }
                        int var22 = field721 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field738 = field738.trim();
                            if (field738.length() == 0) {
                                method105(class158.field2335, class158.field2435, class158.field2485);
                                return;
                            }
                            if (field741.length() == 0) {
                                method105(class158.field2476, class158.field2372, class158.field2439);
                                return;
                            }
                            method105(class158.field2546, class158.field2427, class158.field2548);
                            field720 = Statics.field1389.field147.containsKey(class164.method698(field738)) ? class160.field2611 : class160.field2609;
                            client.method183(20);
                            return;
                        }
                        int var24 = field721 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field733 = 0;
                            field738 = "";
                            field741 = "";
                            Statics.field1541 = 0;
                            Statics.field1036 = "";
                            field740 = true;
                        }
                        while (true) {
                            while (class138.method546()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field724.length(); var26++) {
                                    if (Statics.field1918 == field724.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2134 == 13) {
                                    field733 = 0;
                                    field738 = "";
                                    field741 = "";
                                    Statics.field1541 = 0;
                                    Statics.field1036 = "";
                                    field740 = true;
                                } else if (field730 == 0) {
                                    if (Statics.field2134 == 85 && field738.length() > 0) {
                                        field738 = field738.substring(0, field738.length() - 1);
                                    }
                                    if (Statics.field2134 == 84 || Statics.field2134 == 80) {
                                        field730 = 1;
                                    }
                                    if (var25 && field738.length() < 320) {
                                        field738 = field738 + Statics.field1918;
                                    }
                                } else if (field730 == 1) {
                                    if (Statics.field2134 == 85 && field741.length() > 0) {
                                        field741 = field741.substring(0, field741.length() - 1);
                                    }
                                    if (Statics.field2134 == 84 || Statics.field2134 == 80) {
                                        field730 = 0;
                                    }
                                    if (Statics.field2134 == 84) {
                                        field738 = field738.trim();
                                        if (field738.length() == 0) {
                                            method105(class158.field2335, class158.field2435, class158.field2485);
                                            return;
                                        }
                                        if (field741.length() == 0) {
                                            method105(class158.field2476, class158.field2372, class158.field2439);
                                            return;
                                        }
                                        method105(class158.field2546, class158.field2427, class158.field2548);
                                        field720 = Statics.field1389.field147.containsKey(class164.method698(field738)) ? class160.field2611 : class160.field2609;
                                        client.method183(20);
                                        return;
                                    }
                                    if (var25 && field741.length() < 20) {
                                        field741 = field741 + Statics.field1918;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field733 == 3) {
                        int var27 = field721 + 180;
                        short var28 = 276;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field735 = class158.field2528;
                            field726 = class158.field2529;
                            field739 = class158.field2530;
                            field733 = 2;
                            field730 = 0;
                        }
                        int var29 = field721 + 180;
                        short var30 = 326;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var30 - 20 && var12 <= var30 + 20) {
                            method105(class158.field2567, class158.field2406, class158.field2586);
                            field733 = 5;
                            return;
                        }
                    } else if (field733 == 4) {
                        int var31 = field721 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.field1036.trim();
                            if (Statics.field1036.length() != 6) {
                                method105(class158.field2487, class158.field2354, class158.field2355);
                                return;
                            }
                            Statics.field1541 = Integer.parseInt(Statics.field1036);
                            Statics.field1036 = "";
                            field720 = field740 ? class160.field2608 : class160.field2615;
                            method105(class158.field2546, class158.field2427, class158.field2548);
                            client.method183(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field721 + 180 - 9 && var11 <= field721 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field740 = !field740;
                        }
                        if (var10 == 1 && var11 >= field721 + 180 - 34 && var11 <= field721 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            String var33 = client.method2604("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class139.method2134(var33, true, "openjs", false);
                        }
                        int var34 = field721 + 180 + 80;
                        if (var10 == 1 && var11 >= var34 - 75 && var11 <= var34 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field733 = 0;
                            field738 = "";
                            field741 = "";
                            Statics.field1541 = 0;
                            Statics.field1036 = "";
                        }
                        while (class138.method546()) {
                            boolean var35 = false;
                            for (int var36 = 0; var36 < field744.length(); var36++) {
                                if (Statics.field1918 == field744.charAt(var36)) {
                                    var35 = true;
                                    break;
                                }
                            }
                            if (Statics.field2134 == 13) {
                                field733 = 0;
                                field738 = "";
                                field741 = "";
                                Statics.field1541 = 0;
                                Statics.field1036 = "";
                            } else {
                                if (Statics.field2134 == 85 && Statics.field1036.length() > 0) {
                                    Statics.field1036 = Statics.field1036.substring(0, Statics.field1036.length() - 1);
                                }
                                if (Statics.field2134 == 84) {
                                    Statics.field1036.trim();
                                    if (Statics.field1036.length() != 6) {
                                        method105(class158.field2487, class158.field2354, class158.field2355);
                                        return;
                                    }
                                    Statics.field1541 = Integer.parseInt(Statics.field1036);
                                    Statics.field1036 = "";
                                    field720 = field740 ? class160.field2608 : class160.field2615;
                                    method105(class158.field2546, class158.field2427, class158.field2548);
                                    client.method183(20);
                                    return;
                                }
                                if (var35 && Statics.field1036.length() < 6) {
                                    Statics.field1036 = Statics.field1036 + Statics.field1918;
                                }
                            }
                        }
                    } else if (field733 == 5) {
                        int var37 = field721 + 180 - 80;
                        short var38 = 321;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                            method3135();
                            return;
                        }
                        int var39 = field721 + 180 + 80;
                        if (var10 == 1 && var11 >= var39 - 75 && var11 <= var39 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                            field735 = class158.field2528;
                            field726 = class158.field2529;
                            field739 = class158.field2530;
                            field733 = 2;
                            field730 = 0;
                            field741 = "";
                        }
                        while (class138.method546()) {
                            boolean var40 = false;
                            for (int var41 = 0; var41 < field724.length(); var41++) {
                                if (Statics.field1918 == field724.charAt(var41)) {
                                    var40 = true;
                                    break;
                                }
                            }
                            if (Statics.field2134 == 13) {
                                field735 = class158.field2528;
                                field726 = class158.field2529;
                                field739 = class158.field2530;
                                field733 = 2;
                                field730 = 0;
                                field741 = "";
                            } else {
                                if (Statics.field2134 == 85 && field738.length() > 0) {
                                    field738 = field738.substring(0, field738.length() - 1);
                                }
                                if (Statics.field2134 == 84) {
                                    method3135();
                                    return;
                                }
                                if (var40 && field738.length() < 320) {
                                    field738 = field738 + Statics.field1918;
                                }
                            }
                        }
                    } else if (field733 == 6) {
                        while (true) {
                            do {
                                if (!class138.method546()) {
                                    short var42 = 321;
                                    if (var10 == 1 && var12 >= var42 - 20 && var12 <= var42 + 20) {
                                        field735 = class158.field2528;
                                        field726 = class158.field2529;
                                        field739 = class158.field2530;
                                        field733 = 2;
                                        field730 = 0;
                                        field741 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2134 != 84 && Statics.field2134 != 13);
                            field735 = class158.field2528;
                            field726 = class158.field2529;
                            field739 = class158.field2530;
                            field733 = 2;
                            field730 = 0;
                            field741 = "";
                        }
                    }
                }
            }
        } else if (class141.field2160 == 1 || !Statics.field1564 && class141.field2160 == 4) {
            int var1 = field749 + 280;
            if (class141.field2170 >= var1 && class141.field2170 <= var1 + 14 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                class26.method28(0, 0);
            } else if (class141.field2170 >= var1 + 15 && class141.field2170 <= var1 + 80 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                class26.method28(0, 1);
            } else {
                int var2 = field749 + 390;
                if (class141.field2170 >= var2 && class141.field2170 <= var2 + 14 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                    class26.method28(1, 0);
                } else if (class141.field2170 >= var2 + 15 && class141.field2170 <= var2 + 80 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                    class26.method28(1, 1);
                } else {
                    int var3 = field749 + 500;
                    if (class141.field2170 >= var3 && class141.field2170 <= var3 + 14 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                        class26.method28(2, 0);
                    } else if (class141.field2170 >= var3 + 15 && class141.field2170 <= var3 + 80 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                        class26.method28(2, 1);
                    } else {
                        int var4 = field749 + 610;
                        if (class141.field2170 >= var4 && class141.field2170 <= var4 + 14 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                            class26.method28(3, 0);
                        } else if (class141.field2170 >= var4 + 15 && class141.field2170 <= var4 + 80 && class141.field2171 >= 4 && class141.field2171 <= 18) {
                            class26.method28(3, 1);
                        } else if (class141.field2170 >= field749 + 708 && class141.field2171 >= 4 && class141.field2170 <= field749 + 708 + 50 && class141.field2171 <= 20) {
                            field745 = false;
                            Statics.field570.method1568(field749, 0);
                            Statics.field2017.method1568(field749 + 382, 0);
                            Statics.field719.method1735(field749 + 382 - Statics.field719.field1428 / 2, 18);
                        } else if (field748 != -1) {
                            class26 var5 = Statics.field637[field748];
                            method1943(var5);
                            field745 = false;
                            Statics.field570.method1568(field749, 0);
                            Statics.field2017.method1568(field749 + 382, 0);
                            Statics.field719.method1735(field749 + 382 - Statics.field719.field1428 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.d(I)V")
    public static void method3135() {
        field738 = field738.trim();
        if (field738.length() == 0) {
            method105(class158.field2567, class158.field2406, class158.field2586);
            return;
        }
        long var0 = class10.method2283();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method945(var0, field738);
        }
        switch(var2) {
            case 2:
                method105(class158.field2403, class158.field2571, class158.field2412);
                field733 = 6;
                break;
            case 3:
                method105(class158.field2573, class158.field2574, class158.field2575);
                break;
            case 4:
                method105(class158.field2576, class158.field2569, class158.field2475);
                break;
            case 5:
                method105(class158.field2349, class158.field2580, class158.field2581);
                break;
            case 6:
                method105(class158.field2582, class158.field2583, class158.field2564);
                break;
            case 7:
                method105(class158.field2585, class158.field2568, class158.field2579);
        }
    }

    @ObfuscatedName("ch.u(Lhs;Lhs;Lhs;ZB)V")
    public static void method2037(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field749 = (Statics.field215 - client.field493 * 765) / 2;
            field721 = field749 + 202;
        }
        if (field745) {
            method2675(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field570.method1568(field749, 0);
            Statics.field2017.method1568(field749 + 382, 0);
            Statics.field719.method1735(field749 + 382 - Statics.field719.field1428 / 2, 18);
        }
        if (client.field287 == 0 || client.field287 == 5) {
            byte var4 = 20;
            arg0.method3745(class158.field2525, field721 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1673(field721 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1673(field721 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1702(field721 + 180 - 150, var5 + 2, field731 * 3, 30, 9179409);
            class80.method1702(field731 * 3 + (field721 + 180 - 150), var5 + 2, 300 - field731 * 3, 30, 0);
            arg0.method3745(field732, field721 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field287 == 20) {
            Statics.field3129.method1735(field721 + 180 - Statics.field3129.field1428 / 2, 271 - Statics.field3129.field1430 / 2);
            short var6 = 211;
            arg0.method3745(field735, field721 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3745(field726, field721 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3745(field739, field721 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field733 != 4) {
                arg0.method3743(class158.field2549, field721 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field738; arg0.method3738(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3743(class224.method3742(var8), field721 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3743(class158.field2374 + class164.method2653(field741), field721 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field287 == 10 || client.field287 == 11) {
            Statics.field3129.method1735(field721, 171);
            if (field733 == 0) {
                short var9 = 251;
                arg0.method3745(class158.field2492, field721 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field721 + 180 - 80;
                short var11 = 291;
                Statics.field718.method1735(var10 - 73, var11 - 20);
                arg0.method3746(class158.field2553, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field721 + 180 + 80;
                Statics.field718.method1735(var12 - 73, var11 - 20);
                arg0.method3746(class158.field2554, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field733 == 1) {
                arg0.method3745(field734, field721 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3745(field735, field721 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3745(field726, field721 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3745(field739, field721 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field721 + 180 - 80;
                short var15 = 321;
                Statics.field718.method1735(var14 - 73, var15 - 20);
                arg0.method3745(class158.field2325, var14, var15 + 5, 16777215, 0);
                int var16 = field721 + 180 + 80;
                Statics.field718.method1735(var16 - 73, var15 - 20);
                arg0.method3745(class158.field2556, var16, var15 + 5, 16777215, 0);
            } else if (field733 == 2) {
                short var17 = 211;
                arg0.method3745(field735, field721 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3745(field726, field721 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3745(field739, field721 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3743(class158.field2549, field721 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field738; arg0.method3738(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3743(class224.method3742(var19) + (field730 == 0 & client.field336 % 40 < 20 ? class2.method158(16776960) + class2.field19 : ""), field721 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3743(class158.field2374 + class164.method2653(field741) + (field730 == 1 & client.field336 % 40 < 20 ? class2.method158(16776960) + class2.field19 : ""), field721 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field721 + 180 - 80;
                short var21 = 321;
                Statics.field718.method1735(var20 - 73, var21 - 20);
                arg0.method3745(class158.field2555, var20, var21 + 5, 16777215, 0);
                int var22 = field721 + 180 + 80;
                Statics.field718.method1735(var22 - 73, var21 - 20);
                arg0.method3745(class158.field2556, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3745(class158.field2562, field721 + 180, var23, 16776960, 0);
            } else if (field733 == 3) {
                short var24 = 201;
                arg0.method3745(class158.field2446, field721 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3745(class158.field2558, field721 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3745(class158.field2557, field721 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field721 + 180;
                short var26 = 276;
                Statics.field718.method1735(var25 - 73, var26 - 20);
                arg2.method3745(class158.field2560, var25, var26 + 5, 16777215, 0);
                int var27 = field721 + 180;
                short var28 = 326;
                Statics.field718.method1735(var27 - 73, var28 - 20);
                arg2.method3745(class158.field2561, var27, var28 + 5, 16777215, 0);
            } else if (field733 == 4) {
                arg0.method3745(class158.field2544, field721 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3745(field735, field721 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3745(field726, field721 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3745(field739, field721 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3743(class158.field2551 + class164.method2653(Statics.field1036) + (client.field336 % 40 < 20 ? class2.method158(16776960) + class2.field19 : ""), field721 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3743(class158.field2327, field721 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3743(class158.field2328, field721 + 180 - 9, var98, 16776960, 0);
                int var30 = field721 + 180 - 9 + arg0.method3738(class158.field2328) + 15;
                int var31 = var98 - arg0.field3190;
                class81 var32;
                if (field740) {
                    var32 = Statics.field709;
                } else {
                    var32 = Statics.field679;
                }
                var32.method1735(var30, var31);
                var94 = var98 + 15;
                int var33 = field721 + 180 - 80;
                short var34 = 321;
                Statics.field718.method1735(var33 - 73, var34 - 20);
                arg0.method3745(class158.field2325, var33, var34 + 5, 16777215, 0);
                int var35 = field721 + 180 + 80;
                Statics.field718.method1735(var35 - 73, var34 - 20);
                arg0.method3745(class158.field2556, var35, var34 + 5, 16777215, 0);
                arg1.method3745(class158.field2545, field721 + 180, var34 + 36, 255, 0);
            } else if (field733 == 5) {
                arg0.method3745(class158.field2563, field721 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3745(field735, field721 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3745(field726, field721 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3745(field739, field721 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3743(class158.field2509, field721 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field738; arg0.method3738(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3743(class224.method3742(var38) + (client.field336 % 40 < 20 ? class2.method158(16776960) + class2.field19 : ""), field721 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field721 + 180 - 80;
                short var40 = 321;
                Statics.field718.method1735(var39 - 73, var40 - 20);
                arg0.method3745(class158.field2358, var39, var40 + 5, 16777215, 0);
                int var41 = field721 + 180 + 80;
                Statics.field718.method1735(var41 - 73, var40 - 20);
                arg0.method3745(class158.field2566, var41, var40 + 5, 16777215, 0);
            } else if (field733 == 6) {
                short var42 = 211;
                arg0.method3745(field735, field721 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3745(field726, field721 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3745(field739, field721 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field721 + 180;
                short var44 = 321;
                Statics.field718.method1735(var43 - 73, var44 - 20);
                arg0.method3745(class158.field2566, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field729 > 0) {
            int var45 = field729;
            short var46 = 256;
            field727 += var45 * 128;
            if (field727 > Statics.field671.length) {
                field727 -= Statics.field671.length;
                int var47 = (int) (Math.random() * 12.0D);
                method2268(Statics.field682[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field666[var48 + var49] - Statics.field671[field727 + var48 & Statics.field671.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field666[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field666[var54 + var55] = 255;
                    } else {
                        Statics.field666[var54 + var55] = 0;
                    }
                }
            }
            if (field725 > 0) {
                field725 -= var45 * 4;
            }
            if (field736 > 0) {
                field736 -= var45 * 4;
            }
            if (field725 == 0 && field736 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field725 = 1024;
                }
                if (var57 == 1) {
                    field736 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field722[var58] = field722[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field722[var59] = (int) (Math.sin((double) field717 / 14.0D) * 16.0D + Math.sin((double) field717 / 15.0D) * 14.0D + Math.sin((double) field717 / 16.0D) * 12.0D);
                field717++;
            }
            field728 += var45 * 1808650701;
            int var60 = ((client.field336 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field728 * -1296093708; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field666[(var63 << 7) + var62] = 192;
                }
                field728 = 0;
                int var64 = 0;
                label226: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label226;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field1019[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field1019[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field666[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field666[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field666[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field1019[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field729 = 0;
        }
        method2124();
        Statics.field2264[Statics.field1389.field144 ? 1 : 0].method1735(field749 + 765 - 40, 463);
        if (client.field287 > 5 && client.field286 == 0) {
            if (Statics.field1105 == null) {
                Statics.field1105 = class77.method2752(Statics.field2059, "sl_button", "");
            } else {
                int var72 = field749 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field1105.method1735(var72, var73);
                arg0.method3745(class158.field2499 + " " + client.field552, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field1538 == null) {
                    arg1.method3745(class158.field2385, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3745(class158.field2597, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field2025.getGraphics();
            Statics.field2095.method1493(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field2025.repaint();
        }
    }

    @ObfuscatedName("k.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method105(String arg0, String arg1, String arg2) {
        field735 = arg0;
        field726 = arg1;
        field739 = arg2;
    }

    @ObfuscatedName("dr.b(Lcj;I)V")
    public static final void method2268(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field671.length; var2++) {
            Statics.field671[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field671[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2933[var8] = (Statics.field671[var8 - 1] + Statics.field671[var8 + 1] + Statics.field671[var8 - 128] + Statics.field671[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field671;
            Statics.field671 = Statics.field2933;
            Statics.field2933 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1430; var11++) {
            for (int var12 = 0; var12 < arg0.field1428; var12++) {
                if (arg0.field1431[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1429;
                    int var14 = var11 + 16 + arg0.field1432;
                    int var15 = (var14 << 7) + var13;
                    Statics.field671[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ay.k(IIII)I")
    public static final int method789(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cd.c(I)V")
    public static final void method2124() {
        short var0 = 256;
        if (field725 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field725 > 768) {
                    Statics.field723[var1] = method789(Statics.field27[var1], Statics.field170[var1], 1024 - field725);
                } else if (field725 > 256) {
                    Statics.field723[var1] = Statics.field170[var1];
                } else {
                    Statics.field723[var1] = method789(Statics.field170[var1], Statics.field27[var1], 256 - field725);
                }
            }
        } else if (field736 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field736 > 768) {
                    Statics.field723[var2] = method789(Statics.field27[var2], Statics.field742[var2], 1024 - field736);
                } else if (field736 > 256) {
                    Statics.field723[var2] = Statics.field742[var2];
                } else {
                    Statics.field723[var2] = method789(Statics.field742[var2], Statics.field27[var2], 256 - field736);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field723[var3] = Statics.field27[var3];
            }
        }
        class80.method1661(field749, 9, field749 + 128, var0 + 7);
        Statics.field570.method1568(field749, 0);
        class80.method1660();
        int var4 = 0;
        int var5 = field749 + Statics.field2095.field1398 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field722[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field666[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field723[var10];
                    int var14 = Statics.field2095.field1402[var5];
                    Statics.field2095.field1402[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field2095.field1398 + var8 - 128;
        }
        class80.method1661(field749 + 765 - 128, 9, field749 + 765, var0 + 7);
        Statics.field2017.method1568(field749 + 382, 0);
        class80.method1660();
        int var15 = 0;
        int var16 = field749 + Statics.field2095.field1398 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field722[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field666[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field723[var22];
                    int var26 = Statics.field2095.field1402[var20];
                    Statics.field2095.field1402[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field2095.field1398 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ez.l(Lhs;Lhs;I)V")
    public static void method2675(class225 arg0, class225 arg1) {
        if (Statics.field746 == null) {
            Statics.field746 = class77.method150(Statics.field2059, "sl_back", "");
        }
        if (Statics.field1404 == null) {
            Statics.field1404 = class77.method165(Statics.field2059, "sl_flags", "");
        }
        if (Statics.field2605 == null) {
            Statics.field2605 = class77.method165(Statics.field2059, "sl_arrows", "");
        }
        if (Statics.field747 == null) {
            Statics.field747 = class77.method165(Statics.field2059, "sl_stars", "");
        }
        class80.method1702(field749, 23, 765, 480, 0);
        class80.method1721(field749, 0, 125, 23, 12425273, 9135624);
        class80.method1721(field749 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3745(class158.field2588, field749 + 62, 15, 0, -1);
        if (Statics.field747 != null) {
            Statics.field747[1].method1735(field749 + 140, 1);
            arg1.method3743(class158.field2589, field749 + 152, 10, 16777215, -1);
            Statics.field747[0].method1735(field749 + 140, 12);
            arg1.method3743(class158.field2590, field749 + 152, 21, 16777215, -1);
        }
        if (Statics.field2605 != null) {
            int var2 = field749 + 280;
            if (class26.field632[0] == 0 && class26.field628[0] == 0) {
                Statics.field2605[2].method1735(var2, 4);
            } else {
                Statics.field2605[0].method1735(var2, 4);
            }
            if (class26.field632[0] == 0 && class26.field628[0] == 1) {
                Statics.field2605[3].method1735(var2 + 15, 4);
            } else {
                Statics.field2605[1].method1735(var2 + 15, 4);
            }
            arg0.method3743(class158.field2591, var2 + 32, 17, 16777215, -1);
            int var3 = field749 + 390;
            if (class26.field632[0] == 1 && class26.field628[0] == 0) {
                Statics.field2605[2].method1735(var3, 4);
            } else {
                Statics.field2605[0].method1735(var3, 4);
            }
            if (class26.field632[0] == 1 && class26.field628[0] == 1) {
                Statics.field2605[3].method1735(var3 + 15, 4);
            } else {
                Statics.field2605[1].method1735(var3 + 15, 4);
            }
            arg0.method3743(class158.field2404, var3 + 32, 17, 16777215, -1);
            int var4 = field749 + 500;
            if (class26.field632[0] == 2 && class26.field628[0] == 0) {
                Statics.field2605[2].method1735(var4, 4);
            } else {
                Statics.field2605[0].method1735(var4, 4);
            }
            if (class26.field632[0] == 2 && class26.field628[0] == 1) {
                Statics.field2605[3].method1735(var4 + 15, 4);
            } else {
                Statics.field2605[1].method1735(var4 + 15, 4);
            }
            arg0.method3743(class158.field2593, var4 + 32, 17, 16777215, -1);
            int var5 = field749 + 610;
            if (class26.field632[0] == 3 && class26.field628[0] == 0) {
                Statics.field2605[2].method1735(var5, 4);
            } else {
                Statics.field2605[0].method1735(var5, 4);
            }
            if (class26.field632[0] == 3 && class26.field628[0] == 1) {
                Statics.field2605[3].method1735(var5 + 15, 4);
            } else {
                Statics.field2605[1].method1735(var5 + 15, 4);
            }
            arg0.method3743(class158.field2594, var5 + 32, 17, 16777215, -1);
        }
        class80.method1702(field749 + 708, 4, 50, 16, 0);
        arg1.method3745(class158.field2556, field749 + 708 + 25, 16, 16777215, -1);
        field748 = -1;
        if (Statics.field746 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field629) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field629) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field629) {
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
            int var17 = field749 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field629; var20++) {
                class26 var21 = Statics.field637[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field635);
                if (var21.field635 == -1) {
                    var23 = class158.field2531;
                    var22 = false;
                } else if (var21.field635 > 1980) {
                    var23 = class158.field2453;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method580()) {
                    if (var21.method575()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method579()) {
                    var24 = 16711680;
                    if (var21.method575()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method577()) {
                    if (var21.method575()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method575()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class141.field2163 >= var17 && class141.field2164 >= var16 && class141.field2163 < var6 + var17 && class141.field2164 < var7 + var16 && var22) {
                    field748 = var20;
                    Statics.field746[var25].method1619(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field746[var25].method1568(var17, var16);
                }
                if (Statics.field1404 != null) {
                    Statics.field1404[(var21.method575() ? 8 : 0) + var21.field638].method1735(var17 + 29, var16);
                }
                arg0.method3745(Integer.toString(var21.field633), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3745(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3738(Statics.field637[field748].field642) + 6;
                int var27 = arg1.field3190 + 8;
                class80.method1702(class141.field2163 - var26 / 2, class141.field2164 + 20 + 5, var26, var27, 16777120);
                class80.method1673(class141.field2163 - var26 / 2, class141.field2164 + 20 + 5, var26, var27, 0);
                arg1.method3745(Statics.field637[field748].field642, class141.field2163, class141.field2164 + 20 + 5 + arg1.field3190 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field2025.getGraphics();
            Statics.field2095.method1493(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field2025.repaint();
        }
    }

    @ObfuscatedName("cr.t(Lv;I)V")
    public static void method1943(class26 arg0) {
        if (arg0.method575() != client.field448) {
            client.field448 = arg0.method575();
            class52.method2(arg0.method575());
        }
        Statics.field2060 = arg0.field636;
        client.field552 = arg0.field633;
        client.field280 = arg0.field634;
        Statics.field1224 = client.field282 == 0 ? 43594 : arg0.field633 + 40000;
        Statics.field2923 = client.field282 == 0 ? 443 : arg0.field633 + 50000;
        Statics.field1171 = Statics.field1224;
    }
}

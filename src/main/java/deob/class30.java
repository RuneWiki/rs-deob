package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class30 {

    @ObfuscatedName("az.k")
    public static int field691 = 0;

    @ObfuscatedName("az.r")
    public static int field697 = field691 + 202;

    @ObfuscatedName("az.i")
    public static int[] field698 = new int[256];

    @ObfuscatedName("az.j")
    public static int field699 = 0;

    @ObfuscatedName("az.z")
    public static int field704 = 0;

    @ObfuscatedName("az.aa")
    public static int field701 = 0;

    @ObfuscatedName("az.az")
    public static int field702 = 0;

    @ObfuscatedName("az.aq")
    public static int field703 = 0;

    @ObfuscatedName("az.ak")
    public static int field700 = 0;

    @ObfuscatedName("az.ar")
    public static int field709 = 10;

    @ObfuscatedName("az.al")
    public static String field706 = "";

    @ObfuscatedName("az.au")
    public static int field723 = 0;

    @ObfuscatedName("az.ao")
    public static String field708 = "";

    @ObfuscatedName("az.af")
    public static String field712 = "";

    @ObfuscatedName("az.ai")
    public static String field710 = "";

    @ObfuscatedName("az.aj")
    public static String field711 = "";

    @ObfuscatedName("az.aw")
    public static String field707 = "";

    @ObfuscatedName("az.ab")
    public static class150 field692 = class150.field2498;

    @ObfuscatedName("az.ay")
    public static boolean field714 = true;

    @ObfuscatedName("az.ap")
    public static int field715 = 0;

    @ObfuscatedName("az.av")
    public static String field716 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("az.ah")
    public static String field721 = "1234567890";

    @ObfuscatedName("az.an")
    public static boolean field690 = false;

    @ObfuscatedName("az.bn")
    public static int field720 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.p(Lff;Lff;I)I")
    public static int method3113(class158 arg0, class158 arg1) {
        int var2 = 0;
        if (arg0.method2914("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2914("logo", "")) {
            var2++;
        }
        if (arg1.method2914("titlebox", "")) {
            var2++;
        }
        if (arg1.method2914("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2914("runes", "")) {
            var2++;
        }
        if (arg1.method2914("title_mute", "")) {
            var2++;
        }
        if (arg1.method2915("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2915("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2914("sl_back", "");
        arg1.method2914("sl_flags", "");
        arg1.method2914("sl_arrows", "");
        arg1.method2914("sl_stars", "");
        arg1.method2914("sl_button", "");
        return var2;
    }

    @ObfuscatedName("o.k(Ljava/awt/Component;Lff;Lff;ZIB)V")
    public static void method161(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field717) {
            field723 = arg4;
            class75.method1547();
            byte[] var5 = arg1.method2945("title.jpg", "");
            Statics.field1981 = new class74(var5, arg0);
            Statics.field695 = Statics.field1981.method1445();
            Statics.field696 = class72.method494(arg2, "logo", "");
            Statics.field713 = class72.method494(arg2, "titlebox", "");
            Statics.field693 = class72.method494(arg2, "titlebutton", "");
            Statics.field694 = class72.method582(arg2, "runes", "");
            Statics.field155 = class72.method582(arg2, "title_mute", "");
            Statics.field2789 = class72.method494(arg2, "options_radio_buttons,0", "");
            Statics.field1291 = class72.method494(arg2, "options_radio_buttons,2", "");
            Statics.field689 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field689[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field689[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field689[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field689[var9 + 192] = 16777215;
            }
            Statics.field164 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field164[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field164[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field164[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field164[var13 + 192] = 16777215;
            }
            Statics.field171 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field171[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field171[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field171[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field171[var17 + 192] = 16777215;
            }
            Statics.field649 = new int[256];
            Statics.field1305 = new int[32768];
            Statics.field2039 = new int[32768];
            method2018((class76) null);
            Statics.field74 = new int[32768];
            Statics.field186 = new int[32768];
            if (arg3) {
                field711 = "";
                field707 = "";
            }
            Statics.field156 = 0;
            Statics.field64 = "";
            field714 = true;
            field690 = false;
            if (Statics.field71.field132) {
                class174.field2858 = 1;
                Statics.field1852 = null;
                Statics.field2823 = -1;
                Statics.field2544 = -1;
                Statics.field1851 = 0;
                Statics.field187 = false;
                Statics.field1486 = 2;
            } else {
                class159 var18 = Statics.field536;
                int var19 = var18.method2965("scape main");
                int var20 = var18.method2974(var19, "");
                class174.method2516(2, var18, var19, var20, 255, false);
            }
            class162.method2497(false);
            Statics.field717 = true;
            field691 = (Statics.field594 - client.field399 * 765) / 2;
            field697 = field691 + 202;
            Statics.field1981.method1453(field691, 0);
            Statics.field695.method1453(field691 + 382, 0);
            Statics.field696.method1598(field691 + 382 - Statics.field696.field1359 / 2, 18);
        } else if (arg4 == 4) {
            field723 = 4;
        }
    }

    @ObfuscatedName("w.e(Les;I)V")
    public static void method34(class136 arg0) {
        if (!field690) {
            if ((class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4) && class132.field2057 >= field691 + 765 - 50 && class132.field2058 >= 453) {
                Statics.field71.field132 = !Statics.field71.field132;
                class9.method2816();
                if (Statics.field71.field132) {
                    class174.method481();
                } else {
                    class174.method1434(Statics.field536, "scape main", "", 255, false);
                }
            }
            if (client.field460 != 5) {
                field703++;
                if (client.field460 == 10 || client.field460 == 11) {
                    if (client.field264 == 0) {
                        if (class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4) {
                            int var6 = field691 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class132.field2057 >= var6 && class132.field2057 <= var6 + var8 && class132.field2058 >= var7 && class132.field2058 <= var7 + var9) {
                                if (class24.method36()) {
                                    field690 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field163 != null && class24.method36()) {
                            field690 = true;
                        }
                    }
                    int var10 = class132.field2056;
                    int var11 = class132.field2057;
                    int var12 = class132.field2058;
                    if (!Statics.field2048 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field723 == 0) {
                        int var13 = field697 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class130.method841(client.method103("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field697 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field338 & 0x4) != 0) {
                                if ((client.field338 & 0x400) == 0) {
                                    field708 = class148.field2407;
                                    field712 = class148.field2429;
                                    field710 = class148.field2430;
                                } else {
                                    field708 = class148.field2289;
                                    field712 = class148.field2435;
                                    field710 = class148.field2436;
                                }
                                field723 = 1;
                                field715 = 0;
                            } else if ((client.field338 & 0x400) == 0) {
                                field708 = class148.field2421;
                                field712 = class148.field2425;
                                field710 = class148.field2302;
                                field723 = 2;
                                field715 = 0;
                            } else {
                                field708 = class148.field2351;
                                field712 = class148.field2432;
                                field710 = class148.field2433;
                                field723 = 1;
                                field715 = 0;
                            }
                        }
                    } else if (field723 == 1) {
                        while (class129.method2973()) {
                            if (Statics.field651 == 84) {
                                field708 = class148.field2421;
                                field712 = class148.field2425;
                                field710 = class148.field2302;
                                field723 = 2;
                                field715 = 0;
                            } else if (Statics.field651 == 13) {
                                field723 = 0;
                            }
                        }
                        int var16 = field697 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field708 = class148.field2421;
                            field712 = class148.field2425;
                            field710 = class148.field2302;
                            field723 = 2;
                            field715 = 0;
                        }
                        int var18 = field697 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field723 = 0;
                        }
                    } else if (field723 == 2) {
                        short var19 = 231;
                        int var37 = var19 + 30;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field715 = 0;
                        }
                        var37 += 15;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field715 = 1;
                        }
                        var37 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method132(class148.field2455, class148.field2456, class148.field2457);
                            field723 = 5;
                            return;
                        }
                        int var21 = field697 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field711 = field711.trim();
                            if (field711.length() == 0) {
                                method132(class148.field2330, class148.field2331, class148.field2332);
                                return;
                            }
                            if (field707.length() == 0) {
                                method132(class148.field2333, class148.field2334, class148.field2450);
                                return;
                            }
                            method132(class148.field2439, class148.field2440, class148.field2441);
                            field692 = Statics.field71.field137.containsKey(class154.method2014(field711)) ? class150.field2497 : class150.field2498;
                            client.method521(20);
                            return;
                        }
                        int var23 = field697 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field723 = 0;
                            field711 = "";
                            field707 = "";
                            Statics.field156 = 0;
                            Statics.field64 = "";
                            field714 = true;
                        }
                        while (true) {
                            while (class129.method2973()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field716.length(); var25++) {
                                    if (Statics.field3017 == field716.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field651 == 13) {
                                    field723 = 0;
                                    field711 = "";
                                    field707 = "";
                                    Statics.field156 = 0;
                                    Statics.field64 = "";
                                    field714 = true;
                                } else if (field715 == 0) {
                                    if (Statics.field651 == 85 && field711.length() > 0) {
                                        field711 = field711.substring(0, field711.length() - 1);
                                    }
                                    if (Statics.field651 == 84 || Statics.field651 == 80) {
                                        field715 = 1;
                                    }
                                    if (var24 && field711.length() < 320) {
                                        field711 = field711 + Statics.field3017;
                                    }
                                } else if (field715 == 1) {
                                    if (Statics.field651 == 85 && field707.length() > 0) {
                                        field707 = field707.substring(0, field707.length() - 1);
                                    }
                                    if (Statics.field651 == 84 || Statics.field651 == 80) {
                                        field715 = 0;
                                    }
                                    if (Statics.field651 == 84) {
                                        field711 = field711.trim();
                                        if (field711.length() == 0) {
                                            method132(class148.field2330, class148.field2331, class148.field2332);
                                            return;
                                        }
                                        if (field707.length() == 0) {
                                            method132(class148.field2333, class148.field2334, class148.field2450);
                                            return;
                                        }
                                        method132(class148.field2439, class148.field2440, class148.field2441);
                                        field692 = Statics.field71.field137.containsKey(class154.method2014(field711)) ? class150.field2497 : class150.field2498;
                                        client.method521(20);
                                        return;
                                    }
                                    if (var24 && field707.length() < 20) {
                                        field707 = field707 + Statics.field3017;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field723 == 4) {
                        int var26 = field697 + 180 - 80;
                        short var27 = 321;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            Statics.field64.trim();
                            if (Statics.field64.length() != 6) {
                                method132(class148.field2246, class148.field2372, class148.field2248);
                                return;
                            }
                            Statics.field156 = Integer.parseInt(Statics.field64);
                            Statics.field64 = "";
                            field692 = field714 ? class150.field2499 : class150.field2503;
                            method132(class148.field2439, class148.field2440, class148.field2441);
                            client.method521(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field697 + 180 - 9 && var11 <= field697 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field714 = !field714;
                        }
                        if (var10 == 1 && var11 >= field697 + 180 - 34 && var11 <= field697 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class130.method841(client.method103("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var28 = field697 + 180 + 80;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field723 = 0;
                            field711 = "";
                            field707 = "";
                            Statics.field156 = 0;
                            Statics.field64 = "";
                        }
                        while (class129.method2973()) {
                            boolean var29 = false;
                            for (int var30 = 0; var30 < field721.length(); var30++) {
                                if (Statics.field3017 == field721.charAt(var30)) {
                                    var29 = true;
                                    break;
                                }
                            }
                            if (Statics.field651 == 13) {
                                field723 = 0;
                                field711 = "";
                                field707 = "";
                                Statics.field156 = 0;
                                Statics.field64 = "";
                            } else {
                                if (Statics.field651 == 85 && Statics.field64.length() > 0) {
                                    Statics.field64 = Statics.field64.substring(0, Statics.field64.length() - 1);
                                }
                                if (Statics.field651 == 84) {
                                    Statics.field64.trim();
                                    if (Statics.field64.length() != 6) {
                                        method132(class148.field2246, class148.field2372, class148.field2248);
                                        return;
                                    }
                                    Statics.field156 = Integer.parseInt(Statics.field64);
                                    Statics.field64 = "";
                                    field692 = field714 ? class150.field2499 : class150.field2503;
                                    method132(class148.field2439, class148.field2440, class148.field2441);
                                    client.method521(20);
                                    return;
                                }
                                if (var29 && Statics.field64.length() < 6) {
                                    Statics.field64 = Statics.field64 + Statics.field3017;
                                }
                            }
                        }
                    } else if (field723 == 5) {
                        int var31 = field697 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            method2116();
                            return;
                        }
                        int var33 = field697 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field708 = class148.field2421;
                            field712 = class148.field2425;
                            field710 = class148.field2302;
                            field723 = 2;
                            field715 = 0;
                            field707 = "";
                        }
                        while (class129.method2973()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field716.length(); var35++) {
                                if (Statics.field3017 == field716.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field651 == 13) {
                                field708 = class148.field2421;
                                field712 = class148.field2425;
                                field710 = class148.field2302;
                                field723 = 2;
                                field715 = 0;
                                field707 = "";
                            } else {
                                if (Statics.field651 == 85 && field711.length() > 0) {
                                    field711 = field711.substring(0, field711.length() - 1);
                                }
                                if (Statics.field651 == 84) {
                                    method2116();
                                    return;
                                }
                                if (var34 && field711.length() < 320) {
                                    field711 = field711 + Statics.field3017;
                                }
                            }
                        }
                    } else if (field723 == 6) {
                        while (true) {
                            do {
                                if (!class129.method2973()) {
                                    short var36 = 321;
                                    if (var10 == 1 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                                        field708 = class148.field2421;
                                        field712 = class148.field2425;
                                        field710 = class148.field2302;
                                        field723 = 2;
                                        field715 = 0;
                                        field707 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field651 != 84 && Statics.field651 != 13);
                            field708 = class148.field2421;
                            field712 = class148.field2425;
                            field710 = class148.field2302;
                            field723 = 2;
                            field715 = 0;
                            field707 = "";
                        }
                    }
                }
            }
        } else if (class132.field2056 == 1 || !Statics.field2048 && class132.field2056 == 4) {
            int var1 = field691 + 280;
            if (class132.field2057 >= var1 && class132.field2057 <= var1 + 14 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                class24.method518(0, 0);
            } else if (class132.field2057 >= var1 + 15 && class132.field2057 <= var1 + 80 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                class24.method518(0, 1);
            } else {
                int var2 = field691 + 390;
                if (class132.field2057 >= var2 && class132.field2057 <= var2 + 14 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                    class24.method518(1, 0);
                } else if (class132.field2057 >= var2 + 15 && class132.field2057 <= var2 + 80 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                    class24.method518(1, 1);
                } else {
                    int var3 = field691 + 500;
                    if (class132.field2057 >= var3 && class132.field2057 <= var3 + 14 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                        class24.method518(2, 0);
                    } else if (class132.field2057 >= var3 + 15 && class132.field2057 <= var3 + 80 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                        class24.method518(2, 1);
                    } else {
                        int var4 = field691 + 610;
                        if (class132.field2057 >= var4 && class132.field2057 <= var4 + 14 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                            class24.method518(3, 0);
                        } else if (class132.field2057 >= var4 + 15 && class132.field2057 <= var4 + 80 && class132.field2058 >= 4 && class132.field2058 <= 18) {
                            class24.method518(3, 1);
                        } else if (class132.field2057 >= field691 + 708 && class132.field2058 >= 4 && class132.field2057 <= field691 + 708 + 50 && class132.field2058 <= 20) {
                            field690 = false;
                            Statics.field1981.method1453(field691, 0);
                            Statics.field695.method1453(field691 + 382, 0);
                            Statics.field696.method1598(field691 + 382 - Statics.field696.field1359 / 2, 18);
                        } else if (field720 != -1) {
                            class24 var5 = Statics.field612[field720];
                            method645(var5);
                            field690 = false;
                            Statics.field1981.method1453(field691, 0);
                            Statics.field695.method1453(field691 + 382, 0);
                            Statics.field696.method1598(field691 + 382 - Statics.field696.field1359 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.f(B)V")
    public static void method2116() {
        field711 = field711.trim();
        if (field711.length() == 0) {
            method132(class148.field2455, class148.field2456, class148.field2457);
            return;
        }
        long var0 = class10.method172();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method653(var0, field711);
        }
        switch(var2) {
            case 2:
                method132(class148.field2481, class148.field2459, class148.field2319);
                field723 = 6;
                break;
            case 3:
                method132(class148.field2315, class148.field2462, class148.field2335);
                break;
            case 4:
                method132(class148.field2353, class148.field2431, class148.field2466);
                break;
            case 5:
                method132(class148.field2467, class148.field2468, class148.field2486);
                break;
            case 6:
                method132(class148.field2445, class148.field2260, class148.field2472);
                break;
            case 7:
                method132(class148.field2325, class148.field2474, class148.field2231);
        }
    }

    @ObfuscatedName("n.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method132(String arg0, String arg1, String arg2) {
        field708 = arg0;
        field712 = arg1;
        field710 = arg2;
    }

    @ObfuscatedName("cw.s(Lbk;I)V")
    public static final void method2018(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1305.length; var2++) {
            Statics.field1305[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1305[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2039[var8] = (Statics.field1305[var8 - 1] + Statics.field1305[var8 + 1] + Statics.field1305[var8 - 128] + Statics.field1305[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1305;
            Statics.field1305 = Statics.field2039;
            Statics.field2039 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1362; var11++) {
            for (int var12 = 0; var12 < arg0.field1359; var12++) {
                if (arg0.field1364[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1361;
                    int var14 = var11 + 16 + arg0.field1357;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1305[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("m.c(IIII)I")
    public static final int method126(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("aw.d(I)V")
    public static final void method754() {
        short var0 = 256;
        if (field699 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field699 > 768) {
                    Statics.field649[var1] = method126(Statics.field689[var1], Statics.field164[var1], 1024 - field699);
                } else if (field699 > 256) {
                    Statics.field649[var1] = Statics.field164[var1];
                } else {
                    Statics.field649[var1] = method126(Statics.field164[var1], Statics.field689[var1], 256 - field699);
                }
            }
        } else if (field704 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field704 > 768) {
                    Statics.field649[var2] = method126(Statics.field689[var2], Statics.field171[var2], 1024 - field704);
                } else if (field704 > 256) {
                    Statics.field649[var2] = Statics.field171[var2];
                } else {
                    Statics.field649[var2] = method126(Statics.field171[var2], Statics.field689[var2], 256 - field704);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field649[var3] = Statics.field689[var3];
            }
        }
        class75.method1534(field691, 9, field691 + 128, var0 + 7);
        Statics.field1981.method1453(field691, 0);
        class75.method1552();
        int var4 = 0;
        int var5 = field691 + Statics.field1489.field1334 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field698[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field74[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field649[var10];
                    int var14 = Statics.field1489.field1335[var5];
                    Statics.field1489.field1335[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1489.field1334 + var8 - 128;
        }
        class75.method1534(field691 + 765 - 128, 9, field691 + 765, var0 + 7);
        Statics.field695.method1453(field691 + 382, 0);
        class75.method1552();
        int var15 = 0;
        int var16 = field691 + Statics.field1489.field1334 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field698[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field74[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field649[var22];
                    int var26 = Statics.field1489.field1335[var20];
                    Statics.field1489.field1335[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1489.field1334 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("au.v(Lz;I)V")
    public static void method645(class24 arg0) {
        if (arg0.method524() != client.field262) {
            client.field262 = arg0.method524();
            boolean var1 = arg0.method524();
            if (Statics.field1050 != var1) {
                class47.method38();
                Statics.field1050 = var1;
            }
        }
        Statics.field546 = arg0.field618;
        client.field256 = arg0.field617;
        client.field338 = arg0.field622;
        Statics.field2489 = client.field259 == 0 ? 43594 : arg0.field617 + 40000;
        Statics.field3021 = client.field259 == 0 ? 443 : arg0.field617 + 50000;
        Statics.field295 = Statics.field2489;
    }
}

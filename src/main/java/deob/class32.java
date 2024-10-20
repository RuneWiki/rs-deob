package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.g")
    public static int field696 = 0;

    @ObfuscatedName("ah.o")
    public static int field712 = field696 + 202;

    @ObfuscatedName("ah.h")
    public static int[] field722 = new int[256];

    @ObfuscatedName("ah.m")
    public static int field726 = 0;

    @ObfuscatedName("ah.s")
    public static int field708 = 0;

    @ObfuscatedName("ah.ag")
    public static int field695 = 0;

    @ObfuscatedName("ah.ae")
    public static int field711 = 0;

    @ObfuscatedName("ah.aj")
    public static int field698 = 0;

    @ObfuscatedName("ah.ah")
    public static int field713 = 0;

    @ObfuscatedName("ah.af")
    public static int field701 = 10;

    @ObfuscatedName("ah.az")
    public static String field710 = "";

    @ObfuscatedName("ah.ax")
    public static int field716 = 0;

    @ObfuscatedName("ah.ac")
    public static String field706 = "";

    @ObfuscatedName("ah.ar")
    public static String field718 = "";

    @ObfuscatedName("ah.aq")
    public static String field719 = "";

    @ObfuscatedName("ah.aa")
    public static String field720 = "";

    @ObfuscatedName("ah.ay")
    public static String field727 = "";

    @ObfuscatedName("ah.as")
    public static String field717 = "";

    @ObfuscatedName("ah.ak")
    public static class160 field723 = class160.field2595;

    @ObfuscatedName("ah.at")
    public static boolean field724 = true;

    @ObfuscatedName("ah.am")
    public static int field725 = 0;

    @ObfuscatedName("ah.ab")
    public static String field699 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.ai")
    public static String field714 = "1234567890";

    @ObfuscatedName("ah.ao")
    public static boolean field728 = false;

    @ObfuscatedName("ah.be")
    public static int field729 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.b(Lfl;Lfl;I)I")
    public static int method88(class168 arg0, class168 arg1) {
        int var2 = 0;
        if (arg0.method3112("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3112("logo", "")) {
            var2++;
        }
        if (arg1.method3112("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3112("titlebox", "")) {
            var2++;
        }
        if (arg1.method3112("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3112("runes", "")) {
            var2++;
        }
        if (arg1.method3112("title_mute", "")) {
            var2++;
        }
        if (arg1.method3056("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3056("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3112("sl_back", "");
        arg1.method3112("sl_flags", "");
        arg1.method3112("sl_arrows", "");
        arg1.method3112("sl_stars", "");
        arg1.method3112("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ee.g(I)I")
    public static int method2786() {
        return 9;
    }

    @ObfuscatedName("aw.j(Ljava/awt/Component;Lfl;Lfl;ZII)V")
    public static void method633(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field702) {
            field716 = arg4;
            class80.method1724();
            byte[] var5 = arg1.method3065("title.jpg", "");
            Statics.field700 = new class79(var5, arg0);
            Statics.field731 = Statics.field700.method1574();
            if ((client.field478 & 0x20000000) == 0) {
                Statics.field697 = class77.method2945(arg2, "logo", "");
            } else {
                Statics.field697 = class77.method2945(arg2, "logo_deadman_mode", "");
            }
            Statics.field709 = class77.method2945(arg2, "titlebox", "");
            Statics.field715 = class77.method2945(arg2, "titlebutton", "");
            Statics.field721 = class77.method551(arg2, "runes", "");
            Statics.field1540 = class77.method551(arg2, "title_mute", "");
            Statics.field856 = class77.method2945(arg2, "options_radio_buttons,0", "");
            Statics.field3118 = class77.method2945(arg2, "options_radio_buttons,2", "");
            Statics.field166 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field166[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field166[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field166[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field166[var9 + 192] = 16777215;
            }
            Statics.field707 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field707[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field707[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field707[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field707[var13 + 192] = 16777215;
            }
            Statics.field2651 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2651[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2651[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2651[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2651[var17 + 192] = 16777215;
            }
            Statics.field185 = new int[256];
            Statics.field674 = new int[32768];
            Statics.field1407 = new int[32768];
            Statics.method2933((class81) null);
            Statics.field789 = new int[32768];
            Statics.field1634 = new int[32768];
            if (arg3) {
                field727 = "";
                field717 = "";
            }
            Statics.field855 = 0;
            Statics.field2706 = "";
            field724 = true;
            field728 = false;
            if (Statics.field2638.field129) {
                class184.field2954 = 1;
                Statics.field1076 = null;
                Statics.field2904 = -1;
                Statics.field2952 = -1;
                Statics.field2930 = 0;
                Statics.field2957 = false;
                Statics.field2956 = 2;
            } else {
                class169 var18 = Statics.field359;
                int var19 = var18.method3052("scape main");
                int var20 = var18.method3053(var19, "");
                class184.method152(2, var18, var19, var20, 255, false);
            }
            class172.method2043(false);
            Statics.field702 = true;
            field696 = (Statics.field1027 - client.field503) / 2;
            field712 = field696 + 202;
            Statics.field700.method1645(field696, 0);
            Statics.field731.method1645(field696 + 382, 0);
            Statics.field697.method1747(field696 + 382 - Statics.field697.field1391 / 2, 18);
        } else if (arg4 == 4) {
            field716 = 4;
        }
    }

    @ObfuscatedName("dn.d(Leq;I)V")
    public static void method2262(class145 arg0) {
        if (field728) {
            method1766(arg0);
            return;
        }
        if ((class141.field2141 == 1 || !Statics.field2632 && class141.field2141 == 4) && class141.field2142 >= field696 + 765 - 50 && class141.field2143 >= 453) {
            Statics.field2638.field129 = !Statics.field2638.field129;
            class9.method95();
            if (Statics.field2638.field129) {
                Statics.field2953.method3378();
                class184.field2954 = 1;
                Statics.field1076 = null;
            } else {
                class184.method3153(Statics.field359, "scape main", "", 255, false);
            }
        }
        if (client.field295 == 5) {
            return;
        }
        field698++;
        if (client.field295 != 10 && client.field295 != 11) {
            return;
        }
        if (client.field293 == 0) {
            if (class141.field2141 == 1 || !Statics.field2632 && class141.field2141 == 4) {
                int var1 = field696 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class141.field2142 >= var1 && class141.field2142 <= var1 + var3 && class141.field2143 >= var2 && class141.field2143 <= var2 + var4) {
                    if (class26.method1779()) {
                        field728 = true;
                    }
                    return;
                }
            }
            if (Statics.field2284 != null && class26.method1779()) {
                field728 = true;
            }
        }
        int var5 = class141.field2141;
        int var6 = class141.field2142;
        int var7 = class141.field2143;
        if (!Statics.field2632 && var5 == 4) {
            var5 = 1;
        }
        if (field716 == 0) {
            int var8 = field712 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method3216("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                Statics.method110(var10, true, "openjs", false);
            }
            int var11 = field712 + 180 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field478 & 0x2000000) != 0) {
                    field706 = "";
                    field718 = class158.field2519;
                    field719 = class158.field2516;
                    field720 = class158.field2457;
                    field716 = 1;
                    field725 = 0;
                } else if ((client.field478 & 0x4) != 0) {
                    if ((client.field478 & 0x400) == 0) {
                        field718 = class158.field2524;
                        field719 = class158.field2466;
                        field720 = class158.field2320;
                    } else {
                        field718 = class158.field2506;
                        field719 = class158.field2517;
                        field720 = class158.field2521;
                    }
                    field706 = class158.field2408;
                    field716 = 1;
                    field725 = 0;
                } else if ((client.field478 & 0x400) == 0) {
                    field718 = class158.field2445;
                    field719 = class158.field2507;
                    field720 = class158.field2508;
                    field716 = 2;
                    field725 = 0;
                } else {
                    field718 = class158.field2513;
                    field719 = class158.field2514;
                    field720 = class158.field2418;
                    field706 = class158.field2408;
                    field716 = 1;
                    field725 = 0;
                }
            }
        } else if (field716 == 1) {
            while (class138.method2037()) {
                if (Statics.field159 == 84) {
                    field718 = class158.field2445;
                    field719 = class158.field2507;
                    field720 = class158.field2508;
                    field716 = 2;
                    field725 = 0;
                } else if (Statics.field159 == 13) {
                    field716 = 0;
                }
            }
            int var12 = field712 + 180 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field718 = class158.field2445;
                field719 = class158.field2507;
                field720 = class158.field2508;
                field716 = 2;
                field725 = 0;
            }
            int var14 = field712 + 180 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field716 = 0;
            }
        } else if (field716 == 2) {
            short var15 = 231;
            int var38 = var15 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field725 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field725 = 1;
            }
            var38 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method150(class158.field2545, class158.field2546, class158.field2547);
                field716 = 5;
                return;
            }
            int var17 = field712 + 180 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field727 = field727.trim();
                if (field727.length() == 0) {
                    method150(class158.field2412, class158.field2349, class158.field2414);
                    return;
                }
                if (field717.length() == 0) {
                    method150(class158.field2415, class158.field2416, class158.field2515);
                    return;
                }
                method150(class158.field2576, class158.field2525, class158.field2413);
                field723 = Statics.field2638.field134.containsKey(class164.method1061(field727)) ? class160.field2592 : class160.field2595;
                client.method900(20);
                return;
            }
            int var19 = field712 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field716 = 0;
                field727 = "";
                field717 = "";
                Statics.field855 = 0;
                Statics.field2706 = "";
                field724 = true;
            }
            while (true) {
                while (class138.method2037()) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field699.length(); var21++) {
                        if (Statics.field645 == field699.charAt(var21)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (Statics.field159 == 13) {
                        field716 = 0;
                        field727 = "";
                        field717 = "";
                        Statics.field855 = 0;
                        Statics.field2706 = "";
                        field724 = true;
                    } else if (field725 == 0) {
                        if (Statics.field159 == 85 && field727.length() > 0) {
                            field727 = field727.substring(0, field727.length() - 1);
                        }
                        if (Statics.field159 == 84 || Statics.field159 == 80) {
                            field725 = 1;
                        }
                        if (var20 && field727.length() < 320) {
                            field727 = field727 + Statics.field645;
                        }
                    } else if (field725 == 1) {
                        if (Statics.field159 == 85 && field717.length() > 0) {
                            field717 = field717.substring(0, field717.length() - 1);
                        }
                        if (Statics.field159 == 84 || Statics.field159 == 80) {
                            field725 = 0;
                        }
                        if (Statics.field159 == 84) {
                            field727 = field727.trim();
                            if (field727.length() == 0) {
                                method150(class158.field2412, class158.field2349, class158.field2414);
                                return;
                            }
                            if (field717.length() == 0) {
                                method150(class158.field2415, class158.field2416, class158.field2515);
                                return;
                            }
                            method150(class158.field2576, class158.field2525, class158.field2413);
                            field723 = Statics.field2638.field134.containsKey(class164.method1061(field727)) ? class160.field2592 : class160.field2595;
                            client.method900(20);
                            return;
                        }
                        if (var20 && field717.length() < 20) {
                            field717 = field717 + Statics.field645;
                        }
                    }
                }
                return;
            }
        } else if (field716 == 3) {
            int var22 = field712 + 180;
            short var23 = 276;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                field718 = class158.field2445;
                field719 = class158.field2507;
                field720 = class158.field2508;
                field716 = 2;
                field725 = 0;
            }
            int var24 = field712 + 180;
            short var25 = 326;
            if (var5 == 1 && var6 >= var24 - 75 && var6 <= var24 + 75 && var7 >= var25 - 20 && var7 <= var25 + 20) {
                method150(class158.field2545, class158.field2546, class158.field2547);
                field716 = 5;
                return;
            }
        } else if (field716 == 4) {
            int var26 = field712 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                Statics.field2706.trim();
                if (Statics.field2706.length() != 6) {
                    method150(class158.field2347, class158.field2332, class158.field2333);
                    return;
                }
                Statics.field855 = Integer.parseInt(Statics.field2706);
                Statics.field2706 = "";
                field723 = field724 ? class160.field2591 : class160.field2593;
                method150(class158.field2576, class158.field2525, class158.field2413);
                client.method900(20);
                return;
            }
            if (var5 == 1 && var6 >= field712 + 180 - 9 && var6 <= field712 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field724 = !field724;
            }
            if (var5 == 1 && var6 >= field712 + 180 - 34 && var6 <= field712 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var28 = client.method3216("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                Statics.method110(var28, true, "openjs", false);
            }
            int var29 = field712 + 180 + 80;
            if (var5 == 1 && var6 >= var29 - 75 && var6 <= var29 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field716 = 0;
                field727 = "";
                field717 = "";
                Statics.field855 = 0;
                Statics.field2706 = "";
            }
            while (class138.method2037()) {
                boolean var30 = false;
                for (int var31 = 0; var31 < field714.length(); var31++) {
                    if (Statics.field645 == field714.charAt(var31)) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field159 == 13) {
                    field716 = 0;
                    field727 = "";
                    field717 = "";
                    Statics.field855 = 0;
                    Statics.field2706 = "";
                } else {
                    if (Statics.field159 == 85 && Statics.field2706.length() > 0) {
                        Statics.field2706 = Statics.field2706.substring(0, Statics.field2706.length() - 1);
                    }
                    if (Statics.field159 == 84) {
                        Statics.field2706.trim();
                        if (Statics.field2706.length() != 6) {
                            method150(class158.field2347, class158.field2332, class158.field2333);
                            return;
                        }
                        Statics.field855 = Integer.parseInt(Statics.field2706);
                        Statics.field2706 = "";
                        field723 = field724 ? class160.field2591 : class160.field2593;
                        method150(class158.field2576, class158.field2525, class158.field2413);
                        client.method900(20);
                        return;
                    }
                    if (var30 && Statics.field2706.length() < 6) {
                        Statics.field2706 = Statics.field2706 + Statics.field645;
                    }
                }
            }
        } else if (field716 == 5) {
            int var32 = field712 + 180 - 80;
            short var33 = 321;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                method590();
                return;
            }
            int var34 = field712 + 180 + 80;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                field718 = class158.field2445;
                field719 = class158.field2507;
                field720 = class158.field2508;
                field716 = 2;
                field725 = 0;
                field717 = "";
            }
            while (class138.method2037()) {
                boolean var35 = false;
                for (int var36 = 0; var36 < field699.length(); var36++) {
                    if (Statics.field645 == field699.charAt(var36)) {
                        var35 = true;
                        break;
                    }
                }
                if (Statics.field159 == 13) {
                    field718 = class158.field2445;
                    field719 = class158.field2507;
                    field720 = class158.field2508;
                    field716 = 2;
                    field725 = 0;
                    field717 = "";
                } else {
                    if (Statics.field159 == 85 && field727.length() > 0) {
                        field727 = field727.substring(0, field727.length() - 1);
                    }
                    if (Statics.field159 == 84) {
                        method590();
                        return;
                    }
                    if (var35 && field727.length() < 320) {
                        field727 = field727 + Statics.field645;
                    }
                }
            }
        } else if (field716 == 6) {
            while (true) {
                do {
                    if (!class138.method2037()) {
                        short var37 = 321;
                        if (var5 == 1 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                            field718 = class158.field2445;
                            field719 = class158.field2507;
                            field720 = class158.field2508;
                            field716 = 2;
                            field725 = 0;
                            field717 = "";
                        }
                        return;
                    }
                } while (Statics.field159 != 84 && Statics.field159 != 13);
                field718 = class158.field2445;
                field719 = class158.field2507;
                field720 = class158.field2508;
                field716 = 2;
                field725 = 0;
                field717 = "";
            }
        }
    }

    @ObfuscatedName("i.x(B)V")
    public static void method590() {
        field727 = field727.trim();
        if (field727.length() == 0) {
            method150(class158.field2545, class158.field2546, class158.field2547);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3216("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class120 var4 = new class120(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1983, var4.field1977, 1000 - var4.field1977);
                if (var5 == -1) {
                    var4.field1977 = 0;
                    long var8 = var4.method2529();
                    var6 = var8;
                    break;
                }
                var4.field1977 += var5;
                if (var4.field1977 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var37) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field727;
            Random var15 = new Random();
            class120 var16 = new class120(128);
            class120 var17 = new class120(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2480(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2332(var15.nextInt());
            }
            var16.method2332(var18[0]);
            var16.method2332(var18[1]);
            var16.method2477(var6);
            var16.method2477(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2332(var15.nextInt());
            }
            var16.method2507(class10.field147, class10.field148);
            var17.method2480(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2332(var15.nextInt());
            }
            var17.method2477(var15.nextLong());
            var17.method2496(var15.nextLong());
            class150.method3214(var17);
            var17.method2477(var15.nextLong());
            var17.method2507(class10.field147, class10.field148);
            int var22 = class120.method42(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class120 var23 = new class120(var22);
            var23.method2335(var14);
            var23.field1977 = var22;
            var23.method2360(var18);
            class120 var24 = new class120(var23.field1977 + var17.field1977 + var16.field1977 + 5);
            var24.method2480(2);
            var24.method2480(var16.field1977);
            var24.method2338(var16.field1983, 0, var16.field1977);
            var24.method2480(var17.field1977);
            var24.method2338(var17.field1983, 0, var17.field1977);
            var24.method2525(var23.field1977);
            var24.method2338(var23.field1983, 0, var23.field1977);
            String var25 = class162.method2247(var24.field1983);
            byte var32;
            try {
                URL var26 = new URL(client.method3216("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class227.method2931(var25) + "&dest=" + class227.method2931("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class120 var30 = new class120(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field1983, var30.field1977, 1000 - var30.field1977);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field1983);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2361(var18);
                            while (var30.field1977 > 0 && var30.field1983[var30.field1977 - 1] == 0) {
                                var30.field1977--;
                            }
                            String var34 = new String(var30.field1983, 0, var30.field1977);
                            if (class10.method1506(var34)) {
                                Statics.method110(var34, true, "openjs", false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field1977 += var31;
                    if (var30.field1977 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var36) {
                var36.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method150(class158.field2548, class158.field2549, class158.field2359);
                field716 = 6;
                break;
            case 3:
                method150(class158.field2551, class158.field2552, class158.field2335);
                break;
            case 4:
                method150(class158.field2512, class158.field2555, class158.field2556);
                break;
            case 5:
                method150(class158.field2557, class158.field2558, class158.field2559);
                break;
            case 6:
                method150(class158.field2560, class158.field2561, class158.field2562);
                break;
            case 7:
                method150(class158.field2313, class158.field2564, class158.field2324);
        }
    }

    @ObfuscatedName("c.y(Lhx;Lhx;Lhx;ZI)V")
    public static void method91(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field696 = (Statics.field1027 - client.field503) / 2;
            field712 = field696 + 202;
        }
        if (field728) {
            method100(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field700.method1645(field696, 0);
            Statics.field731.method1645(field696 + 382, 0);
            Statics.field697.method1747(field696 + 382 - Statics.field697.field1391 / 2, 18);
        }
        if (client.field295 == 0 || client.field295 == 5) {
            byte var4 = 20;
            arg0.method3766(class158.field2553, field712 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1726(field712 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1726(field712 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1739(field712 + 180 - 150, var5 + 2, field701 * 3, 30, 9179409);
            class80.method1739(field701 * 3 + (field712 + 180 - 150), var5 + 2, 300 - field701 * 3, 30, 0);
            arg0.method3766(field710, field712 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field295 == 20) {
            Statics.field709.method1747(field712 + 180 - Statics.field709.field1391 / 2, 271 - Statics.field709.field1392 / 2);
            short var6 = 211;
            arg0.method3766(field718, field712 + 180, var6, 16776960, 0);
            int var103 = var6 + 15;
            arg0.method3766(field719, field712 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            arg0.method3766(field720, field712 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            int var106 = var105 + 10;
            if (field716 != 4) {
                arg0.method3764(class158.field2527, field712 + 180 - 110, var106, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field727; arg0.method3759(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3764(class224.method3763(var8), field712 + 180 - 70, var106, 16777215, 0);
                var103 = var106 + 15;
                String var10 = class158.field2528;
                String var11 = field717;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3764(var10 + var15, field712 + 180 - 108, var103, 16777215, 0);
                var103 += 15;
            }
        }
        if (client.field295 == 10 || client.field295 == 11) {
            Statics.field709.method1747(field712, 171);
            if (field716 == 0) {
                short var17 = 251;
                arg0.method3766(class158.field2530, field712 + 180, var17, 16776960, 0);
                int var107 = var17 + 30;
                int var18 = field712 + 180 - 80;
                short var19 = 291;
                Statics.field715.method1747(var18 - 73, var19 - 20);
                arg0.method3767(class158.field2316, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field712 + 180 + 80;
                Statics.field715.method1747(var20 - 73, var19 - 20);
                arg0.method3767(class158.field2532, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field716 == 1) {
                arg0.method3766(field706, field712 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3766(field718, field712 + 180, var21, 16777215, 0);
                int var108 = var21 + 15;
                arg0.method3766(field719, field712 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method3766(field720, field712 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                int var22 = field712 + 180 - 80;
                short var23 = 321;
                Statics.field715.method1747(var22 - 73, var23 - 20);
                arg0.method3766(class158.field2482, var22, var23 + 5, 16777215, 0);
                int var24 = field712 + 180 + 80;
                Statics.field715.method1747(var24 - 73, var23 - 20);
                arg0.method3766(class158.field2534, var24, var23 + 5, 16777215, 0);
            } else if (field716 == 2) {
                short var25 = 211;
                arg0.method3766(field718, field712 + 180, var25, 16776960, 0);
                int var111 = var25 + 15;
                arg0.method3766(field719, field712 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method3766(field720, field712 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 10;
                arg0.method3764(class158.field2527, field712 + 180 - 110, var114, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field727; arg0.method3759(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3764(class224.method3763(var27) + (field725 == 0 & client.field297 % 40 < 20 ? class2.method2958(16776960) + class2.field19 : ""), field712 + 180 - 70, var114, 16777215, 0);
                var111 = var114 + 15;
                String var29 = class158.field2528;
                String var30 = field717;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3764(var29 + var34 + (field725 == 1 & client.field297 % 40 < 20 ? class2.method2958(16776960) + class2.field19 : ""), field712 + 180 - 108, var111, 16777215, 0);
                var111 += 15;
                int var36 = field712 + 180 - 80;
                short var37 = 321;
                Statics.field715.method1747(var36 - 73, var37 - 20);
                arg0.method3766(class158.field2533, var36, var37 + 5, 16777215, 0);
                int var38 = field712 + 180 + 80;
                Statics.field715.method1747(var38 - 73, var37 - 20);
                arg0.method3766(class158.field2534, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3766(class158.field2540, field712 + 180, var39, 16776960, 0);
            } else if (field716 == 3) {
                short var40 = 201;
                arg0.method3766(class158.field2535, field712 + 180, var40, 16776960, 0);
                int var115 = var40 + 20;
                arg1.method3766(class158.field2328, field712 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg1.method3766(class158.field2537, field712 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var41 = field712 + 180;
                short var42 = 276;
                Statics.field715.method1747(var41 - 73, var42 - 20);
                arg2.method3766(class158.field2538, var41, var42 + 5, 16777215, 0);
                int var43 = field712 + 180;
                short var44 = 326;
                Statics.field715.method1747(var43 - 73, var44 - 20);
                arg2.method3766(class158.field2322, var43, var44 + 5, 16777215, 0);
            } else if (field716 == 4) {
                arg0.method3766(class158.field2522, field712 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3766(field718, field712 + 180, var45, 16777215, 0);
                int var118 = var45 + 15;
                arg0.method3766(field719, field712 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method3766(field720, field712 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                String var47 = class158.field2529;
                String var48 = Statics.field2706;
                int var49 = var48.length();
                char[] var50 = new char[var49];
                for (int var51 = 0; var51 < var49; var51++) {
                    var50[var51] = '*';
                }
                String var52 = new String(var50);
                arg0.method3764(var47 + var52 + (client.field297 % 40 < 20 ? class2.method2958(16776960) + class2.field19 : ""), field712 + 180 - 108, var120, 16777215, 0);
                var118 = var120 - 8;
                arg0.method3764(class158.field2305, field712 + 180 - 9, var118, 16776960, 0);
                var118 += 15;
                arg0.method3764(class158.field2306, field712 + 180 - 9, var118, 16776960, 0);
                int var54 = field712 + 180 - 9 + arg0.method3759(class158.field2306) + 15;
                int var55 = var118 - arg0.field3191;
                class81 var56;
                if (field724) {
                    var56 = Statics.field3118;
                } else {
                    var56 = Statics.field856;
                }
                var56.method1747(var54, var55);
                var118 += 15;
                int var57 = field712 + 180 - 80;
                short var58 = 321;
                Statics.field715.method1747(var57 - 73, var58 - 20);
                arg0.method3766(class158.field2482, var57, var58 + 5, 16777215, 0);
                int var59 = field712 + 180 + 80;
                Statics.field715.method1747(var59 - 73, var58 - 20);
                arg0.method3766(class158.field2534, var59, var58 + 5, 16777215, 0);
                arg1.method3766(class158.field2464, field712 + 180, var58 + 36, 255, 0);
            } else if (field716 == 5) {
                arg0.method3766(class158.field2541, field712 + 180, 201, 16776960, 0);
                short var60 = 221;
                arg2.method3766(field718, field712 + 180, var60, 16776960, 0);
                int var121 = var60 + 15;
                arg2.method3766(field719, field712 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg2.method3766(field720, field712 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 14;
                arg0.method3764(class158.field2542, field712 + 180 - 145, var124, 16777215, 0);
                short var61 = 174;
                String var62;
                for (var62 = field727; arg0.method3759(var62) > var61; var62 = var62.substring(1)) {
                }
                arg0.method3764(class224.method3763(var62) + (client.field297 % 40 < 20 ? class2.method2958(16776960) + class2.field19 : ""), field712 + 180 - 34, var124, 16777215, 0);
                var121 = var124 + 15;
                int var63 = field712 + 180 - 80;
                short var64 = 321;
                Statics.field715.method1747(var63 - 73, var64 - 20);
                arg0.method3766(class158.field2543, var63, var64 + 5, 16777215, 0);
                int var65 = field712 + 180 + 80;
                Statics.field715.method1747(var65 - 73, var64 - 20);
                arg0.method3766(class158.field2544, var65, var64 + 5, 16777215, 0);
            } else if (field716 == 6) {
                short var66 = 211;
                arg0.method3766(field718, field712 + 180, var66, 16776960, 0);
                int var125 = var66 + 15;
                arg0.method3766(field719, field712 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method3766(field720, field712 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var67 = field712 + 180;
                short var68 = 321;
                Statics.field715.method1747(var67 - 73, var68 - 20);
                arg0.method3766(class158.field2544, var67, var68 + 5, 16777215, 0);
            }
        }
        if (field698 > 0) {
            method46(field698);
            field698 = 0;
        }
        short var69 = 256;
        if (field726 > 0) {
            for (int var70 = 0; var70 < 256; var70++) {
                if (field726 > 768) {
                    Statics.field185[var70] = method2675(Statics.field166[var70], Statics.field707[var70], 1024 - field726);
                } else if (field726 > 256) {
                    Statics.field185[var70] = Statics.field707[var70];
                } else {
                    Statics.field185[var70] = method2675(Statics.field707[var70], Statics.field166[var70], 256 - field726);
                }
            }
        } else if (field708 > 0) {
            for (int var71 = 0; var71 < 256; var71++) {
                if (field708 > 768) {
                    Statics.field185[var71] = method2675(Statics.field166[var71], Statics.field2651[var71], 1024 - field708);
                } else if (field708 > 256) {
                    Statics.field185[var71] = Statics.field2651[var71];
                } else {
                    Statics.field185[var71] = method2675(Statics.field2651[var71], Statics.field166[var71], 256 - field708);
                }
            }
        } else {
            for (int var72 = 0; var72 < 256; var72++) {
                Statics.field185[var72] = Statics.field166[var72];
            }
        }
        class80.method1667(field696, 9, field696 + 128, var69 + 7);
        Statics.field700.method1645(field696, 0);
        class80.method1701();
        int var73 = 0;
        int var74 = field696 + Statics.field1050.field1364 * 9;
        for (int var75 = 1; var75 < var69 - 1; var75++) {
            int var76 = (var69 - var75) * field722[var75] / var69;
            int var77 = var76 + 22;
            if (var77 < 0) {
                var77 = 0;
            }
            var73 += var77;
            for (int var78 = var77; var78 < 128; var78++) {
                int var79 = Statics.field789[var73++];
                if (var79 == 0) {
                    var74++;
                } else {
                    int var81 = 256 - var79;
                    int var82 = Statics.field185[var79];
                    int var83 = Statics.field1050.field1369[var74];
                    Statics.field1050.field1369[var74++] = ((var82 & 0xFF00FF) * var79 + (var83 & 0xFF00FF) * var81 & 0xFF00FF00) + ((var82 & 0xFF00) * var79 + (var83 & 0xFF00) * var81 & 0xFF0000) >> 8;
                }
            }
            var74 += Statics.field1050.field1364 + var77 - 128;
        }
        class80.method1667(field696 + 765 - 128, 9, field696 + 765, var69 + 7);
        Statics.field731.method1645(field696 + 382, 0);
        class80.method1701();
        int var84 = 0;
        int var85 = field696 + Statics.field1050.field1364 * 9 + 24 + 637;
        for (int var86 = 1; var86 < var69 - 1; var86++) {
            int var87 = (var69 - var86) * field722[var86] / var69;
            int var88 = 103 - var87;
            int var89 = var85 + var87;
            for (int var90 = 0; var90 < var88; var90++) {
                int var91 = Statics.field789[var84++];
                if (var91 == 0) {
                    var89++;
                } else {
                    int var93 = 256 - var91;
                    int var94 = Statics.field185[var91];
                    int var95 = Statics.field1050.field1369[var89];
                    Statics.field1050.field1369[var89++] = ((var94 & 0xFF00FF) * var91 + (var95 & 0xFF00FF) * var93 & 0xFF00FF00) + ((var94 & 0xFF00) * var91 + (var95 & 0xFF00) * var93 & 0xFF0000) >> 8;
                }
            }
            var84 += 128 - var88;
            var85 = Statics.field1050.field1364 - var88 - var87 + var89;
        }
        Statics.field1540[Statics.field2638.field129 ? 1 : 0].method1747(field696 + 765 - 40, 463);
        if (client.field295 > 5 && client.field293 == 0) {
            if (Statics.field615 == null) {
                Statics.field615 = class77.method2945(Statics.field2039, "sl_button", "");
            } else {
                int var96 = field696 + 5;
                short var97 = 463;
                byte var98 = 100;
                byte var99 = 35;
                Statics.field615.method1747(var96, var97);
                arg0.method3766(class158.field2460 + " " + client.field287, var98 / 2 + var96, var99 / 2 + var97 - 2, 16777215, 0);
                if (Statics.field2284 == null) {
                    arg1.method3766(class158.field2500, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                } else {
                    arg1.method3766(class158.field2565, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var100 = Statics.field1041.getGraphics();
            Statics.field1050.method1516(var100, 0, 0);
        } catch (Exception var102) {
            Statics.field1041.repaint();
        }
    }

    @ObfuscatedName("w.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method150(String arg0, String arg1, String arg2) {
        field718 = arg0;
        field719 = arg1;
        field720 = arg2;
    }

    @ObfuscatedName("y.l(IB)V")
    public static final void method46(int arg0) {
        short var1 = 256;
        field695 += arg0 * 128;
        if (field695 > Statics.field674.length) {
            field695 -= Statics.field674.length;
            int var2 = (int) (Math.random() * 12.0D);
            Statics.method2933(Statics.field721[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field789[var3 + var4] - Statics.field674[field695 + var3 & Statics.field674.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field789[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field789[var9 + var10] = 255;
                } else {
                    Statics.field789[var9 + var10] = 0;
                }
            }
        }
        if (field726 > 0) {
            field726 -= arg0 * 4;
        }
        if (field708 > 0) {
            field708 -= arg0 * 4;
        }
        if (field726 == 0 && field708 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field726 = 1024;
            }
            if (var12 == 1) {
                field708 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field722[var13] = field722[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field722[var14] = (int) (Math.sin((double) field713 / 14.0D) * 16.0D + Math.sin((double) field713 / 15.0D) * 14.0D + Math.sin((double) field713 / 16.0D) * 12.0D);
            field713++;
        }
        field711 += arg0 * -858944365;
        int var15 = ((client.field297 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field711 * 362832012; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field789[(var18 << 7) + var17] = 192;
        }
        field711 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field789[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field789[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1634[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1634[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1634[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field789[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dj.u(IIII)I")
    public static final int method2675(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("l.p(Lhx;Lhx;B)V")
    public static void method100(class225 arg0, class225 arg1) {
        if (Statics.field2016 == null) {
            Statics.field2016 = Statics.method941(Statics.field2039, "sl_back", "");
        }
        if (Statics.field2660 == null) {
            Statics.field2660 = class77.method551(Statics.field2039, "sl_flags", "");
        }
        if (Statics.field1503 == null) {
            Statics.field1503 = class77.method551(Statics.field2039, "sl_arrows", "");
        }
        if (Statics.field1406 == null) {
            Statics.field1406 = class77.method551(Statics.field2039, "sl_stars", "");
        }
        class80.method1739(field696, 23, 765, 480, 0);
        class80.method1678(field696, 0, 125, 23, 12425273, 9135624);
        class80.method1678(field696 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3766(class158.field2465, field696 + 62, 15, 0, -1);
        if (Statics.field1406 != null) {
            Statics.field1406[1].method1747(field696 + 140, 1);
            arg1.method3764(class158.field2567, field696 + 152, 10, 16777215, -1);
            Statics.field1406[0].method1747(field696 + 140, 12);
            arg1.method3764(class158.field2429, field696 + 152, 21, 16777215, -1);
        }
        if (Statics.field1503 != null) {
            int var2 = field696 + 280;
            if (class26.field640[0] == 0 && class26.field648[0] == 0) {
                Statics.field1503[2].method1747(var2, 4);
            } else {
                Statics.field1503[0].method1747(var2, 4);
            }
            if (class26.field640[0] == 0 && class26.field648[0] == 1) {
                Statics.field1503[3].method1747(var2 + 15, 4);
            } else {
                Statics.field1503[1].method1747(var2 + 15, 4);
            }
            arg0.method3764(class158.field2526, var2 + 32, 17, 16777215, -1);
            int var3 = field696 + 390;
            if (class26.field640[0] == 1 && class26.field648[0] == 0) {
                Statics.field1503[2].method1747(var3, 4);
            } else {
                Statics.field1503[0].method1747(var3, 4);
            }
            if (class26.field640[0] == 1 && class26.field648[0] == 1) {
                Statics.field1503[3].method1747(var3 + 15, 4);
            } else {
                Statics.field1503[1].method1747(var3 + 15, 4);
            }
            arg0.method3764(class158.field2301, var3 + 32, 17, 16777215, -1);
            int var4 = field696 + 500;
            if (class26.field640[0] == 2 && class26.field648[0] == 0) {
                Statics.field1503[2].method1747(var4, 4);
            } else {
                Statics.field1503[0].method1747(var4, 4);
            }
            if (class26.field640[0] == 2 && class26.field648[0] == 1) {
                Statics.field1503[3].method1747(var4 + 15, 4);
            } else {
                Statics.field1503[1].method1747(var4 + 15, 4);
            }
            arg0.method3764(class158.field2571, var4 + 32, 17, 16777215, -1);
            int var5 = field696 + 610;
            if (class26.field640[0] == 3 && class26.field648[0] == 0) {
                Statics.field1503[2].method1747(var5, 4);
            } else {
                Statics.field1503[0].method1747(var5, 4);
            }
            if (class26.field640[0] == 3 && class26.field648[0] == 1) {
                Statics.field1503[3].method1747(var5 + 15, 4);
            } else {
                Statics.field1503[1].method1747(var5 + 15, 4);
            }
            arg0.method3764(class158.field2572, var5 + 32, 17, 16777215, -1);
        }
        class80.method1739(field696 + 708, 4, 50, 16, 0);
        arg1.method3766(class158.field2534, field696 + 708 + 25, 16, 16777215, -1);
        field729 = -1;
        if (Statics.field2016 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field628) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field628) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field628) {
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
            int var17 = field696 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field628; var20++) {
                class26 var21 = Statics.field636[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field639);
                if (var21.field639 == -1) {
                    var23 = class158.field2573;
                    var22 = false;
                } else if (var21.field639 > 1980) {
                    var23 = class158.field2574;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method597()) {
                    if (var21.method624()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method611()) {
                    var24 = 16711680;
                    if (var21.method624()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method608()) {
                    if (var21.method624()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method624()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class141.field2135 >= var17 && class141.field2136 >= var16 && class141.field2135 < var6 + var17 && class141.field2136 < var7 + var16 && var22) {
                    field729 = var20;
                    Statics.field2016[var25].method1592(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2016[var25].method1645(var17, var16);
                }
                if (Statics.field2660 != null) {
                    Statics.field2660[(var21.method624() ? 8 : 0) + var21.field642].method1747(var17 + 29, var16);
                }
                arg0.method3766(Integer.toString(var21.field637 == 374 ? 666 : var21.field637), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3766(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3759(Statics.field636[field729].field647) + 6;
                int var27 = arg1.field3191 + 8;
                class80.method1739(class141.field2135 - var26 / 2, class141.field2136 + 20 + 5, var26, var27, 16777120);
                class80.method1726(class141.field2135 - var26 / 2, class141.field2136 + 20 + 5, var26, var27, 0);
                arg1.method3766(Statics.field636[field729].field647, class141.field2135, class141.field2136 + 20 + 5 + arg1.field3191 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1041.getGraphics();
            Statics.field1050.method1516(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1041.repaint();
        }
    }

    @ObfuscatedName("cm.n(Leq;B)V")
    public static void method1766(class145 arg0) {
        if (class141.field2141 != 1 && Statics.field2632 || class141.field2141 != 4) {
            return;
        }
        int var1 = field696 + 280;
        if (class141.field2142 >= var1 && class141.field2142 <= var1 + 14 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(0, 0);
            return;
        }
        if (class141.field2142 >= var1 + 15 && class141.field2142 <= var1 + 80 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(0, 1);
            return;
        }
        int var2 = field696 + 390;
        if (class141.field2142 >= var2 && class141.field2142 <= var2 + 14 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(1, 0);
            return;
        }
        if (class141.field2142 >= var2 + 15 && class141.field2142 <= var2 + 80 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(1, 1);
            return;
        }
        int var3 = field696 + 500;
        if (class141.field2142 >= var3 && class141.field2142 <= var3 + 14 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(2, 0);
            return;
        }
        if (class141.field2142 >= var3 + 15 && class141.field2142 <= var3 + 80 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(2, 1);
            return;
        }
        int var4 = field696 + 610;
        if (class141.field2142 >= var4 && class141.field2142 <= var4 + 14 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(3, 0);
            return;
        }
        if (class141.field2142 >= var4 + 15 && class141.field2142 <= var4 + 80 && class141.field2143 >= 4 && class141.field2143 <= 18) {
            class26.method2049(3, 1);
            return;
        }
        if (class141.field2142 >= field696 + 708 && class141.field2143 >= 4 && class141.field2142 <= field696 + 708 + 50 && class141.field2143 <= 20) {
            field728 = false;
            Statics.field700.method1645(field696, 0);
            Statics.field731.method1645(field696 + 382, 0);
            Statics.field697.method1747(field696 + 382 - Statics.field697.field1391 / 2, 18);
            return;
        }
        if (field729 == -1) {
            return;
        }
        class26 var5 = Statics.field636[field729];
        method92(var5);
        field728 = false;
        Statics.field700.method1645(field696, 0);
        Statics.field731.method1645(field696 + 382, 0);
        Statics.field697.method1747(field696 + 382 - Statics.field697.field1391 / 2, 18);
        return;
    }

    @ObfuscatedName("c.w(Le;I)V")
    public static void method92(class26 arg0) {
        if (arg0.method624() != client.field291) {
            client.field291 = arg0.method624();
            class52.method973(arg0.method624());
        }
        Statics.field1003 = arg0.field638;
        client.field287 = arg0.field637;
        client.field478 = arg0.field641;
        Statics.field201 = client.field549 == 0 ? 43594 : arg0.field637 + 40000;
        Statics.field473 = client.field549 == 0 ? 443 : arg0.field637 + 50000;
        Statics.field240 = Statics.field201;
    }
}

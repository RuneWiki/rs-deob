package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("ar")
public class class42 {

    @ObfuscatedName("ar.n")
    public static int field823 = 0;

    @ObfuscatedName("ar.c")
    public static int field829 = field823 + 202;

    @ObfuscatedName("ar.w")
    public static int[] field830 = new int[256];

    @ObfuscatedName("ar.h")
    public static int field832 = 0;

    @ObfuscatedName("ar.d")
    public static int field857 = 0;

    @ObfuscatedName("ar.au")
    public static int field834 = 0;

    @ObfuscatedName("ar.al")
    public static int field858 = 0;

    @ObfuscatedName("ar.ae")
    public static int field835 = 0;

    @ObfuscatedName("ar.ad")
    public static int field837 = 0;

    @ObfuscatedName("ar.aq")
    public static int field854 = 10;

    @ObfuscatedName("ar.aa")
    public static String field856 = "";

    @ObfuscatedName("ar.af")
    public static int field833 = 0;

    @ObfuscatedName("ar.as")
    public static String field841 = "";

    @ObfuscatedName("ar.ao")
    public static String field842 = "";

    @ObfuscatedName("ar.ax")
    public static String field843 = "";

    @ObfuscatedName("ar.an")
    public static String field844 = "";

    @ObfuscatedName("ar.ag")
    public static String field845 = "";

    @ObfuscatedName("ar.aj")
    public static String field846 = "";

    @ObfuscatedName("ar.ar")
    public static class98 field847 = class98.field1638;

    @ObfuscatedName("ar.ap")
    public static boolean field848 = true;

    @ObfuscatedName("ar.aw")
    public static int field849 = 0;

    @ObfuscatedName("ar.ay")
    public static String field850 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ai")
    public static String field851 = "1234567890";

    @ObfuscatedName("ar.ah")
    public static boolean field852 = false;

    @ObfuscatedName("ar.bi")
    public static int field824 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.x(Lgo;Lgo;I)I")
    public static int method2970(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3170("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3170("logo", "")) {
            var2++;
        }
        if (arg1.method3170("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3170("titlebox", "")) {
            var2++;
        }
        if (arg1.method3170("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3170("runes", "")) {
            var2++;
        }
        if (arg1.method3170("title_mute", "")) {
            var2++;
        }
        if (arg1.method3171("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3171("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3170("sl_back", "");
        arg1.method3170("sl_flags", "");
        arg1.method3170("sl_arrows", "");
        arg1.method3170("sl_stars", "");
        arg1.method3170("sl_button", "");
        return var2;
    }

    @ObfuscatedName("s.n(Ljava/awt/Component;Lgo;Lgo;ZII)V")
    public static void method131(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field859) {
            field833 = arg4;
            class220.method3803();
            byte[] var5 = arg1.method3169("title.jpg", "");
            Statics.field825 = new class225(var5, arg0);
            Statics.field826 = Statics.field825.method3977();
            if ((client.field288 & 0x20000000) == 0) {
                Statics.field2192 = class226.method2990(arg2, "logo", "");
            } else {
                Statics.field2192 = class226.method2990(arg2, "logo_deadman_mode", "");
            }
            Statics.field822 = class226.method2990(arg2, "titlebox", "");
            Statics.field827 = class226.method2990(arg2, "titlebutton", "");
            Statics.field96 = class226.method170(arg2, "runes", "");
            Statics.field2790 = class226.method170(arg2, "title_mute", "");
            Statics.field1569 = class226.method2990(arg2, "options_radio_buttons,0", "");
            Statics.field836 = class226.method2990(arg2, "options_radio_buttons,2", "");
            Statics.field831 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field831[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field831[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field831[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field831[var9 + 192] = 16777215;
            }
            Statics.field766 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field766[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field766[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field766[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field766[var13 + 192] = 16777215;
            }
            Statics.field2179 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2179[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2179[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2179[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2179[var17 + 192] = 16777215;
            }
            Statics.field3133 = new int[256];
            Statics.field2769 = new int[32768];
            Statics.field35 = new int[32768];
            method1709((class223) null);
            Statics.field947 = new int[32768];
            Statics.field689 = new int[32768];
            if (arg3) {
                field845 = "";
                field846 = "";
            }
            Statics.field55 = 0;
            Statics.field112 = "";
            field848 = true;
            field852 = false;
            if (Statics.field2945.field692) {
                class139.method1895(2);
            } else {
                class185 var18 = Statics.field307;
                int var19 = var18.method3224("scape main");
                int var20 = var18.method3168(var19, "");
                class139.method1893(2, var18, var19, var20, 255, false);
            }
            class186.method3135(false);
            Statics.field859 = true;
            field823 = (Statics.field1757 - client.field505 * 765) / 2;
            field829 = field823 + 202;
            Statics.field825.method3935(field823, 0);
            Statics.field826.method3935(field823 + 382, 0);
            Statics.field2192.method3888(field823 + 382 - Statics.field2192.field3217 / 2, 18);
        } else if (arg4 == 4) {
            field833 = 4;
        }
    }

    @ObfuscatedName("fr.g(Ldg;I)V")
    public static void method3149(class114 arg0) {
        if (!field852) {
            if ((class116.field1812 == 1 || !Statics.field292 && class116.field1812 == 4) && class116.field1813 >= field823 + 765 - 50 && class116.field1814 >= 453) {
                Statics.field2945.field692 = !Statics.field2945.field692;
                class31.method2626();
                if (Statics.field2945.field692) {
                    Statics.field1920.method2507();
                    class139.field1922 = 1;
                    Statics.field1925 = null;
                } else {
                    class185 var6 = Statics.field307;
                    int var7 = var6.method3224("scape main");
                    int var8 = var6.method3168(var7, "");
                    class139.method873(var6, var7, var8, 255, false);
                }
            }
            if (client.field294 != 5) {
                field835++;
                if (client.field294 == 10 || client.field294 == 11) {
                    if (client.field429 == 0) {
                        if (class116.field1812 == 1 || !Statics.field292 && class116.field1812 == 4) {
                            int var9 = field823 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1813 >= var9 && class116.field1813 <= var9 + var11 && class116.field1814 >= var10 && class116.field1814 <= var10 + var12) {
                                if (class30.method2989()) {
                                    field852 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field232 != null && class30.method2989()) {
                            field852 = true;
                        }
                    }
                    int var13 = class116.field1812;
                    int var14 = class116.field1813;
                    int var15 = class116.field1814;
                    if (!Statics.field292 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field833 == 0) {
                        boolean var16 = false;
                        while (class106.method197()) {
                            if (Statics.field132 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field829 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            label745: {
                                String var19 = client.method12("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var19));
                                        break label745;
                                    } catch (Exception var50) {
                                    }
                                }
                                if (class115.field1787.startsWith("win")) {
                                    class115.method956(var19, 0, "openjs");
                                } else if (class115.field1787.startsWith("mac")) {
                                    class115.method956(var19, 1, "openjs");
                                } else {
                                    class115.method956(var19, 2, "openjs");
                                }
                            }
                        }
                        int var21 = field829 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field288 & 0x2000000) != 0) {
                                field841 = "";
                                field842 = class174.field2634;
                                field843 = class174.field2601;
                                field844 = class174.field2582;
                                field833 = 1;
                                field849 = 0;
                            } else if ((client.field288 & 0x4) != 0) {
                                if ((client.field288 & 0x400) == 0) {
                                    field842 = class174.field2599;
                                    field843 = class174.field2572;
                                    field844 = class174.field2573;
                                } else {
                                    field842 = class174.field2577;
                                    field843 = class174.field2594;
                                    field844 = class174.field2579;
                                }
                                field841 = class174.field2614;
                                field833 = 1;
                                field849 = 0;
                            } else if ((client.field288 & 0x400) == 0) {
                                field842 = class174.field2567;
                                field843 = class174.field2509;
                                field844 = class174.field2569;
                                field833 = 2;
                                field849 = 0;
                            } else {
                                field842 = class174.field2394;
                                field843 = class174.field2575;
                                field844 = class174.field2576;
                                field841 = class174.field2614;
                                field833 = 1;
                                field849 = 0;
                            }
                        }
                    } else if (field833 == 1) {
                        while (class106.method197()) {
                            if (Statics.field132 == 84) {
                                field842 = class174.field2567;
                                field843 = class174.field2509;
                                field844 = class174.field2569;
                                field833 = 2;
                                field849 = 0;
                            } else if (Statics.field132 == 13) {
                                field833 = 0;
                            }
                        }
                        int var22 = field829 + 180 - 80;
                        short var23 = 321;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field842 = class174.field2567;
                            field843 = class174.field2509;
                            field844 = class174.field2569;
                            field833 = 2;
                            field849 = 0;
                        }
                        int var24 = field829 + 180 + 80;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field833 = 0;
                        }
                    } else if (field833 == 2) {
                        short var25 = 231;
                        int var51 = var25 + 30;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field849 = 0;
                        }
                        var51 += 15;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field849 = 1;
                        }
                        var51 += 15;
                        short var26 = 361;
                        if (var13 == 1 && var15 >= var26 - 15 && var15 < var26) {
                            method851(class174.field2548, class174.field2607, class174.field2608);
                            field833 = 5;
                            return;
                        }
                        int var27 = field829 + 180 - 80;
                        short var28 = 321;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field845 = field845.trim();
                            if (field845.length() == 0) {
                                method851(class174.field2430, class174.field2474, class174.field2568);
                                return;
                            }
                            if (field846.length() == 0) {
                                method851(class174.field2476, class174.field2477, class174.field2478);
                                return;
                            }
                            method851(class174.field2585, class174.field2583, class174.field2464);
                            field847 = Statics.field2945.field693.containsKey(class208.method1562(field845)) ? class98.field1640 : class98.field1638;
                            client.method691(20);
                            return;
                        }
                        int var29 = field829 + 180 + 80;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field833 = 0;
                            field845 = "";
                            field846 = "";
                            Statics.field55 = 0;
                            Statics.field112 = "";
                            field848 = true;
                        }
                        while (true) {
                            while (class106.method197()) {
                                boolean var30 = false;
                                for (int var31 = 0; var31 < field850.length(); var31++) {
                                    if (Statics.field9 == field850.charAt(var31)) {
                                        var30 = true;
                                        break;
                                    }
                                }
                                if (Statics.field132 == 13) {
                                    field833 = 0;
                                    field845 = "";
                                    field846 = "";
                                    Statics.field55 = 0;
                                    Statics.field112 = "";
                                    field848 = true;
                                } else if (field849 == 0) {
                                    if (Statics.field132 == 85 && field845.length() > 0) {
                                        field845 = field845.substring(0, field845.length() - 1);
                                    }
                                    if (Statics.field132 == 84 || Statics.field132 == 80) {
                                        field849 = 1;
                                    }
                                    if (var30 && field845.length() < 320) {
                                        field845 = field845 + Statics.field9;
                                    }
                                } else if (field849 == 1) {
                                    if (Statics.field132 == 85 && field846.length() > 0) {
                                        field846 = field846.substring(0, field846.length() - 1);
                                    }
                                    if (Statics.field132 == 84 || Statics.field132 == 80) {
                                        field849 = 0;
                                    }
                                    if (Statics.field132 == 84) {
                                        field845 = field845.trim();
                                        if (field845.length() == 0) {
                                            method851(class174.field2430, class174.field2474, class174.field2568);
                                            return;
                                        }
                                        if (field846.length() == 0) {
                                            method851(class174.field2476, class174.field2477, class174.field2478);
                                            return;
                                        }
                                        method851(class174.field2585, class174.field2583, class174.field2464);
                                        field847 = Statics.field2945.field693.containsKey(class208.method1562(field845)) ? class98.field1640 : class98.field1638;
                                        client.method691(20);
                                        return;
                                    }
                                    if (var30 && field846.length() < 20) {
                                        field846 = field846 + Statics.field9;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field833 == 3) {
                        int var32 = field829 + 180;
                        short var33 = 276;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            field842 = class174.field2567;
                            field843 = class174.field2509;
                            field844 = class174.field2569;
                            field833 = 2;
                            field849 = 0;
                        }
                        int var34 = field829 + 180;
                        short var35 = 326;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method851(class174.field2548, class174.field2607, class174.field2608);
                            field833 = 5;
                            return;
                        }
                    } else if (field833 == 4) {
                        int var36 = field829 + 180 - 80;
                        short var37 = 321;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            Statics.field112.trim();
                            if (Statics.field112.length() != 6) {
                                method851(class174.field2549, class174.field2393, class174.field2505);
                                return;
                            }
                            Statics.field55 = Integer.parseInt(Statics.field112);
                            Statics.field112 = "";
                            field847 = field848 ? class98.field1636 : class98.field1642;
                            method851(class174.field2585, class174.field2583, class174.field2464);
                            client.method691(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field829 + 180 - 9 && var14 <= field829 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field848 = !field848;
                        }
                        if (var13 == 1 && var14 >= field829 + 180 - 34 && var14 <= field829 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label760: {
                                String var38 = client.method12("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var38));
                                        break label760;
                                    } catch (Exception var49) {
                                    }
                                }
                                if (class115.field1787.startsWith("win")) {
                                    class115.method956(var38, 0, "openjs");
                                } else if (class115.field1787.startsWith("mac")) {
                                    class115.method956(var38, 1, "openjs");
                                } else {
                                    class115.method956(var38, 2, "openjs");
                                }
                            }
                        }
                        int var40 = field829 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            field833 = 0;
                            field845 = "";
                            field846 = "";
                            Statics.field55 = 0;
                            Statics.field112 = "";
                        }
                        while (class106.method197()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field851.length(); var42++) {
                                if (Statics.field9 == field851.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field132 == 13) {
                                field833 = 0;
                                field845 = "";
                                field846 = "";
                                Statics.field55 = 0;
                                Statics.field112 = "";
                            } else {
                                if (Statics.field132 == 85 && Statics.field112.length() > 0) {
                                    Statics.field112 = Statics.field112.substring(0, Statics.field112.length() - 1);
                                }
                                if (Statics.field132 == 84) {
                                    Statics.field112.trim();
                                    if (Statics.field112.length() != 6) {
                                        method851(class174.field2549, class174.field2393, class174.field2505);
                                        return;
                                    }
                                    Statics.field55 = Integer.parseInt(Statics.field112);
                                    Statics.field112 = "";
                                    field847 = field848 ? class98.field1636 : class98.field1642;
                                    method851(class174.field2585, class174.field2583, class174.field2464);
                                    client.method691(20);
                                    return;
                                }
                                if (var41 && Statics.field112.length() < 6) {
                                    Statics.field112 = Statics.field112 + Statics.field9;
                                }
                            }
                        }
                    } else if (field833 == 5) {
                        int var43 = field829 + 180 - 80;
                        short var44 = 321;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            method2233();
                            return;
                        }
                        int var45 = field829 + 180 + 80;
                        if (var13 == 1 && var14 >= var45 - 75 && var14 <= var45 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            field842 = class174.field2567;
                            field843 = class174.field2509;
                            field844 = class174.field2569;
                            field833 = 2;
                            field849 = 0;
                            field846 = "";
                        }
                        while (class106.method197()) {
                            boolean var46 = false;
                            for (int var47 = 0; var47 < field850.length(); var47++) {
                                if (Statics.field9 == field850.charAt(var47)) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (Statics.field132 == 13) {
                                field842 = class174.field2567;
                                field843 = class174.field2509;
                                field844 = class174.field2569;
                                field833 = 2;
                                field849 = 0;
                                field846 = "";
                            } else {
                                if (Statics.field132 == 85 && field845.length() > 0) {
                                    field845 = field845.substring(0, field845.length() - 1);
                                }
                                if (Statics.field132 == 84) {
                                    method2233();
                                    return;
                                }
                                if (var46 && field845.length() < 320) {
                                    field845 = field845 + Statics.field9;
                                }
                            }
                        }
                    } else if (field833 == 6) {
                        while (true) {
                            do {
                                if (!class106.method197()) {
                                    short var48 = 321;
                                    if (var13 == 1 && var15 >= var48 - 20 && var15 <= var48 + 20) {
                                        field842 = class174.field2567;
                                        field843 = class174.field2509;
                                        field844 = class174.field2569;
                                        field833 = 2;
                                        field849 = 0;
                                        field846 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field132 != 84 && Statics.field132 != 13);
                            field842 = class174.field2567;
                            field843 = class174.field2509;
                            field844 = class174.field2569;
                            field833 = 2;
                            field849 = 0;
                            field846 = "";
                        }
                    }
                }
            }
        } else if (class116.field1812 == 1 || !Statics.field292 && class116.field1812 == 4) {
            int var1 = field823 + 280;
            if (class116.field1813 >= var1 && class116.field1813 <= var1 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                class30.method3285(0, 0);
            } else if (class116.field1813 >= var1 + 15 && class116.field1813 <= var1 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                class30.method3285(0, 1);
            } else {
                int var2 = field823 + 390;
                if (class116.field1813 >= var2 && class116.field1813 <= var2 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                    class30.method3285(1, 0);
                } else if (class116.field1813 >= var2 + 15 && class116.field1813 <= var2 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                    class30.method3285(1, 1);
                } else {
                    int var3 = field823 + 500;
                    if (class116.field1813 >= var3 && class116.field1813 <= var3 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                        class30.method3285(2, 0);
                    } else if (class116.field1813 >= var3 + 15 && class116.field1813 <= var3 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                        class30.method3285(2, 1);
                    } else {
                        int var4 = field823 + 610;
                        if (class116.field1813 >= var4 && class116.field1813 <= var4 + 14 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                            class30.method3285(3, 0);
                        } else if (class116.field1813 >= var4 + 15 && class116.field1813 <= var4 + 80 && class116.field1814 >= 4 && class116.field1814 <= 18) {
                            class30.method3285(3, 1);
                        } else if (class116.field1813 >= field823 + 708 && class116.field1814 >= 4 && class116.field1813 <= field823 + 708 + 50 && class116.field1814 <= 20) {
                            field852 = false;
                            Statics.field825.method3935(field823, 0);
                            Statics.field826.method3935(field823 + 382, 0);
                            Statics.field2192.method3888(field823 + 382 - Statics.field2192.field3217 / 2, 18);
                        } else if (field824 != -1) {
                            class30 var5 = Statics.field754[field824];
                            method1907(var5);
                            field852 = false;
                            Statics.field825.method3935(field823, 0);
                            Statics.field826.method3935(field823 + 382, 0);
                            Statics.field2192.method3888(field823 + 382 - Statics.field2192.field3217 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.v(I)V")
    public static void method2233() {
        field845 = field845.trim();
        if (field845.length() == 0) {
            method851(class174.field2548, class174.field2607, class174.field2608);
            return;
        }
        long var0 = class37.method1156();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class37.method181(var0, field845);
        }
        switch(var2) {
            case 2:
                method851(class174.field2494, class174.field2610, class174.field2611);
                field833 = 6;
                break;
            case 3:
                method851(class174.field2587, class174.field2479, class174.field2627);
                break;
            case 4:
                method851(class174.field2457, class174.field2616, class174.field2617);
                break;
            case 5:
                method851(class174.field2618, class174.field2534, class174.field2366);
                break;
            case 6:
                method851(class174.field2621, class174.field2467, class174.field2623);
                break;
            case 7:
                method851(class174.field2624, class174.field2625, class174.field2626);
        }
    }

    @ObfuscatedName("dg.y(Lhi;Lhi;Lhi;ZI)V")
    public static void method2148(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field823 = (Statics.field1757 - client.field505 * 765) / 2;
            field829 = field823 + 202;
        }
        if (field852) {
            method2919(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field825.method3935(field823, 0);
            Statics.field826.method3935(field823 + 382, 0);
            Statics.field2192.method3888(field823 + 382 - Statics.field2192.field3217 / 2, 18);
        }
        if (client.field294 == 0 || client.field294 == 5) {
            byte var4 = 20;
            arg0.method3703(class174.field2602, field829 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3798(field829 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3798(field829 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3842(field829 + 180 - 150, var5 + 2, field854 * 3, 30, 9179409);
            class220.method3842(field854 * 3 + (field829 + 180 - 150), var5 + 2, 300 - field854 * 3, 30, 0);
            arg0.method3703(field856, field829 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field294 == 20) {
            Statics.field822.method3888(field829 + 180 - Statics.field822.field3217 / 2, 271 - Statics.field822.field3213 / 2);
            short var6 = 211;
            arg0.method3703(field842, field829 + 180, var6, 16776960, 0);
            int var79 = var6 + 15;
            arg0.method3703(field843, field829 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            arg0.method3703(field844, field829 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            int var82 = var81 + 10;
            if (field833 != 4) {
                arg0.method3759(class174.field2588, field829 + 180 - 110, var82, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field845; arg0.method3695(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3759(class210.method3735(var8), field829 + 180 - 70, var82, 16777215, 0);
                var79 = var82 + 15;
                arg0.method3759(class174.field2584 + class208.method2935(field846), field829 + 180 - 108, var79, 16777215, 0);
                var79 += 15;
            }
        }
        if (client.field294 == 10 || client.field294 == 11) {
            Statics.field822.method3888(field829, 171);
            if (field833 == 0) {
                short var9 = 251;
                arg0.method3703(class174.field2591, field829 + 180, var9, 16776960, 0);
                int var83 = var9 + 30;
                int var10 = field829 + 180 - 80;
                short var11 = 291;
                Statics.field827.method3888(var10 - 73, var11 - 20);
                arg0.method3704(class174.field2619, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field829 + 180 + 80;
                Statics.field827.method3888(var12 - 73, var11 - 20);
                arg0.method3704(class174.field2593, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field833 == 1) {
                arg0.method3703(field841, field829 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3703(field842, field829 + 180, var13, 16777215, 0);
                int var84 = var13 + 15;
                arg0.method3703(field843, field829 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                arg0.method3703(field844, field829 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                int var14 = field829 + 180 - 80;
                short var15 = 321;
                Statics.field827.method3888(var14 - 73, var15 - 20);
                arg0.method3703(class174.field2364, var14, var15 + 5, 16777215, 0);
                int var16 = field829 + 180 + 80;
                Statics.field827.method3888(var16 - 73, var15 - 20);
                arg0.method3703(class174.field2595, var16, var15 + 5, 16777215, 0);
            } else if (field833 == 2) {
                short var17 = 211;
                arg0.method3703(field842, field829 + 180, var17, 16776960, 0);
                int var87 = var17 + 15;
                arg0.method3703(field843, field829 + 180, var87, 16776960, 0);
                int var88 = var87 + 15;
                arg0.method3703(field844, field829 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                int var90 = var89 + 10;
                arg0.method3759(class174.field2588, field829 + 180 - 110, var90, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field845; arg0.method3695(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3759(class210.method3735(var19) + (field849 == 0 & client.field432 % 40 < 20 ? class38.method800(16776960) + class38.field781 : ""), field829 + 180 - 70, var90, 16777215, 0);
                var87 = var90 + 15;
                arg0.method3759(class174.field2584 + class208.method2935(field846) + (field849 == 1 & client.field432 % 40 < 20 ? class38.method800(16776960) + class38.field781 : ""), field829 + 180 - 108, var87, 16777215, 0);
                var87 += 15;
                int var20 = field829 + 180 - 80;
                short var21 = 321;
                Statics.field827.method3888(var20 - 73, var21 - 20);
                arg0.method3703(class174.field2524, var20, var21 + 5, 16777215, 0);
                int var22 = field829 + 180 + 80;
                Statics.field827.method3888(var22 - 73, var21 - 20);
                arg0.method3703(class174.field2595, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3703(class174.field2456, field829 + 180, var23, 16776960, 0);
            } else if (field833 == 3) {
                short var24 = 201;
                arg0.method3703(class174.field2380, field829 + 180, var24, 16776960, 0);
                int var91 = var24 + 20;
                arg1.method3703(class174.field2500, field829 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method3703(class174.field2387, field829 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var25 = field829 + 180;
                short var26 = 276;
                Statics.field827.method3888(var25 - 73, var26 - 20);
                arg2.method3703(class174.field2565, var25, var26 + 5, 16777215, 0);
                int var27 = field829 + 180;
                short var28 = 326;
                Statics.field827.method3888(var27 - 73, var28 - 20);
                arg2.method3703(class174.field2600, var27, var28 + 5, 16777215, 0);
            } else if (field833 == 4) {
                arg0.method3703(class174.field2367, field829 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3703(field842, field829 + 180, var29, 16777215, 0);
                int var94 = var29 + 15;
                arg0.method3703(field843, field829 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method3703(field844, field829 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method3759(class174.field2440 + class208.method2935(Statics.field112) + (client.field432 % 40 < 20 ? class38.method800(16776960) + class38.field781 : ""), field829 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method3759(class174.field2574, field829 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method3759(class174.field2538, field829 + 180 - 9, var98, 16776960, 0);
                int var30 = field829 + 180 - 9 + arg0.method3695(class174.field2538) + 15;
                int var31 = var98 - arg0.field3113;
                class223 var32;
                if (field848) {
                    var32 = Statics.field836;
                } else {
                    var32 = Statics.field1569;
                }
                var32.method3888(var30, var31);
                var94 = var98 + 15;
                int var33 = field829 + 180 - 80;
                short var34 = 321;
                Statics.field827.method3888(var33 - 73, var34 - 20);
                arg0.method3703(class174.field2364, var33, var34 + 5, 16777215, 0);
                int var35 = field829 + 180 + 80;
                Statics.field827.method3888(var35 - 73, var34 - 20);
                arg0.method3703(class174.field2595, var35, var34 + 5, 16777215, 0);
                arg1.method3703(class174.field2597, field829 + 180, var34 + 36, 255, 0);
            } else if (field833 == 5) {
                arg0.method3703(class174.field2392, field829 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3703(field842, field829 + 180, var36, 16776960, 0);
                int var99 = var36 + 15;
                arg2.method3703(field843, field829 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method3703(field844, field829 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method3759(class174.field2421, field829 + 180 - 145, var102, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field845; arg0.method3695(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3759(class210.method3735(var38) + (client.field432 % 40 < 20 ? class38.method800(16776960) + class38.field781 : ""), field829 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var39 = field829 + 180 - 80;
                short var40 = 321;
                Statics.field827.method3888(var39 - 73, var40 - 20);
                arg0.method3703(class174.field2628, var39, var40 + 5, 16777215, 0);
                int var41 = field829 + 180 + 80;
                Statics.field827.method3888(var41 - 73, var40 - 20);
                arg0.method3703(class174.field2605, var41, var40 + 5, 16777215, 0);
            } else if (field833 == 6) {
                short var42 = 211;
                arg0.method3703(field842, field829 + 180, var42, 16776960, 0);
                int var103 = var42 + 15;
                arg0.method3703(field843, field829 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method3703(field844, field829 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var43 = field829 + 180;
                short var44 = 321;
                Statics.field827.method3888(var43 - 73, var44 - 20);
                arg0.method3703(class174.field2605, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field835 > 0) {
            int var45 = field835;
            short var46 = 256;
            field834 += var45 * 128;
            if (field834 > Statics.field2769.length) {
                field834 -= Statics.field2769.length;
                int var47 = (int) (Math.random() * 12.0D);
                method1709(Statics.field96[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field947[var48 + var49] - Statics.field2769[field834 + var48 & Statics.field2769.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field947[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field947[var54 + var55] = 255;
                    } else {
                        Statics.field947[var54 + var55] = 0;
                    }
                }
            }
            if (field832 > 0) {
                field832 -= var45 * 4;
            }
            if (field857 > 0) {
                field857 -= var45 * 4;
            }
            if (field832 == 0 && field857 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field832 = 1024;
                }
                if (var57 == 1) {
                    field857 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field830[var58] = field830[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field830[var59] = (int) (Math.sin((double) field837 / 14.0D) * 16.0D + Math.sin((double) field837 / 15.0D) * 14.0D + Math.sin((double) field837 / 16.0D) * 12.0D);
                field837++;
            }
            field858 += var45 * -378941975;
            int var60 = ((client.field432 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field858 * 554781380; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field947[(var63 << 7) + var62] = 192;
                }
                field858 = 0;
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
                                    var69 += Statics.field689[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field689[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field947[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field947[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field947[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field689[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field835 = 0;
        }
        method806();
        Statics.field2790[Statics.field2945.field692 ? 1 : 0].method3888(field823 + 765 - 40, 463);
        if (client.field294 > 5 && client.field429 == 0) {
            if (Statics.field853 == null) {
                Statics.field853 = class226.method2990(Statics.field809, "sl_button", "");
            } else {
                int var72 = field823 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field853.method3888(var72, var73);
                arg0.method3703(class174.field2521 + " " + client.field562, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field232 == null) {
                    arg1.method3703(class174.field2637, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3703(class174.field2636, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field1745.getGraphics();
            Statics.field1074.method3795(var76, 0, 0);
        } catch (Exception var78) {
            Statics.field1745.repaint();
        }
    }

    @ObfuscatedName("ar.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method851(String arg0, String arg1, String arg2) {
        field842 = arg0;
        field843 = arg1;
        field844 = arg2;
    }

    @ObfuscatedName("cp.j(Lht;I)V")
    public static final void method1709(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2769.length; var2++) {
            Statics.field2769[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2769[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field35[var8] = (Statics.field2769[var8 - 1] + Statics.field2769[var8 + 1] + Statics.field2769[var8 - 128] + Statics.field2769[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2769;
            Statics.field2769 = Statics.field35;
            Statics.field35 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3213; var11++) {
            for (int var12 = 0; var12 < arg0.field3217; var12++) {
                if (arg0.field3212[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3214;
                    int var14 = var11 + 16 + arg0.field3215;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2769[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("aa.s(IIII)I")
    public static final int method766(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("an.k(B)V")
    public static final void method806() {
        short var0 = 256;
        if (field832 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field832 > 768) {
                    Statics.field3133[var1] = method766(Statics.field831[var1], Statics.field766[var1], 1024 - field832);
                } else if (field832 > 256) {
                    Statics.field3133[var1] = Statics.field766[var1];
                } else {
                    Statics.field3133[var1] = method766(Statics.field766[var1], Statics.field831[var1], 256 - field832);
                }
            }
        } else if (field857 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field857 > 768) {
                    Statics.field3133[var2] = method766(Statics.field831[var2], Statics.field2179[var2], 1024 - field857);
                } else if (field857 > 256) {
                    Statics.field3133[var2] = Statics.field2179[var2];
                } else {
                    Statics.field3133[var2] = method766(Statics.field2179[var2], Statics.field831[var2], 256 - field857);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field3133[var3] = Statics.field831[var3];
            }
        }
        class220.method3877(field823, 9, field823 + 128, var0 + 7);
        Statics.field825.method3935(field823, 0);
        class220.method3804();
        int var4 = 0;
        int var5 = field823 + Statics.field1074.field3199 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field830[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field947[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field3133[var10];
                    int var14 = Statics.field1074.field3202[var5];
                    Statics.field1074.field3202[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1074.field3199 + var8 - 128;
        }
        class220.method3877(field823 + 765 - 128, 9, field823 + 765, var0 + 7);
        Statics.field826.method3935(field823 + 382, 0);
        class220.method3804();
        int var15 = 0;
        int var16 = field823 + Statics.field1074.field3199 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field830[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field947[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field3133[var22];
                    int var26 = Statics.field1074.field3202[var20];
                    Statics.field1074.field3202[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1074.field3199 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ef.f(Lhi;Lhi;B)V")
    public static void method2919(class209 arg0, class209 arg1) {
        if (Statics.field2115 == null) {
            Statics.field2115 = class226.method2664(Statics.field809, "sl_back", "");
        }
        if (Statics.field961 == null) {
            Statics.field961 = class226.method170(Statics.field809, "sl_flags", "");
        }
        if (Statics.field807 == null) {
            Statics.field807 = class226.method170(Statics.field809, "sl_arrows", "");
        }
        if (Statics.field1956 == null) {
            Statics.field1956 = class226.method170(Statics.field809, "sl_stars", "");
        }
        class220.method3842(field823, 23, 765, 480, 0);
        class220.method3829(field823, 0, 125, 23, 12425273, 9135624);
        class220.method3829(field823 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3703(class174.field2586, field823 + 62, 15, 0, -1);
        if (Statics.field1956 != null) {
            Statics.field1956[1].method3888(field823 + 140, 1);
            arg1.method3759(class174.field2360, field823 + 152, 10, 16777215, -1);
            Statics.field1956[0].method3888(field823 + 140, 12);
            arg1.method3759(class174.field2451, field823 + 152, 21, 16777215, -1);
        }
        if (Statics.field807 != null) {
            int var2 = field823 + 280;
            if (class30.field679[0] == 0 && class30.field685[0] == 0) {
                Statics.field807[2].method3888(var2, 4);
            } else {
                Statics.field807[0].method3888(var2, 4);
            }
            if (class30.field679[0] == 0 && class30.field685[0] == 1) {
                Statics.field807[3].method3888(var2 + 15, 4);
            } else {
                Statics.field807[1].method3888(var2 + 15, 4);
            }
            arg0.method3759(class174.field2589, var2 + 32, 17, 16777215, -1);
            int var3 = field823 + 390;
            if (class30.field679[0] == 1 && class30.field685[0] == 0) {
                Statics.field807[2].method3888(var3, 4);
            } else {
                Statics.field807[0].method3888(var3, 4);
            }
            if (class30.field679[0] == 1 && class30.field685[0] == 1) {
                Statics.field807[3].method3888(var3 + 15, 4);
            } else {
                Statics.field807[1].method3888(var3 + 15, 4);
            }
            arg0.method3759(class174.field2631, var3 + 32, 17, 16777215, -1);
            int var4 = field823 + 500;
            if (class30.field679[0] == 2 && class30.field685[0] == 0) {
                Statics.field807[2].method3888(var4, 4);
            } else {
                Statics.field807[0].method3888(var4, 4);
            }
            if (class30.field679[0] == 2 && class30.field685[0] == 1) {
                Statics.field807[3].method3888(var4 + 15, 4);
            } else {
                Statics.field807[1].method3888(var4 + 15, 4);
            }
            arg0.method3759(class174.field2554, var4 + 32, 17, 16777215, -1);
            int var5 = field823 + 610;
            if (class30.field679[0] == 3 && class30.field685[0] == 0) {
                Statics.field807[2].method3888(var5, 4);
            } else {
                Statics.field807[0].method3888(var5, 4);
            }
            if (class30.field679[0] == 3 && class30.field685[0] == 1) {
                Statics.field807[3].method3888(var5 + 15, 4);
            } else {
                Statics.field807[1].method3888(var5 + 15, 4);
            }
            arg0.method3759(class174.field2633, var5 + 32, 17, 16777215, -1);
        }
        class220.method3842(field823 + 708, 4, 50, 16, 0);
        arg1.method3703(class174.field2595, field823 + 708 + 25, 16, 16777215, -1);
        field824 = -1;
        if (Statics.field2115 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field676) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field676) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field676) {
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
            int var17 = field823 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field676; var20++) {
                class30 var21 = Statics.field754[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field682);
                if (var21.field682 == -1) {
                    var23 = class174.field2411;
                    var22 = false;
                } else if (var21.field682 > 1980) {
                    var23 = class174.field2508;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method650()) {
                    if (var21.method655()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method649()) {
                    var24 = 16711680;
                    if (var21.method655()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method647()) {
                    if (var21.method655()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method655()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1806 >= var17 && class116.field1807 >= var16 && class116.field1806 < var6 + var17 && class116.field1807 < var7 + var16 && var22) {
                    field824 = var20;
                    Statics.field2115[var25].method3941(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2115[var25].method3935(var17, var16);
                }
                if (Statics.field961 != null) {
                    Statics.field961[(var21.method655() ? 8 : 0) + var21.field688].method3888(var17 + 29, var16);
                }
                arg0.method3703(Integer.toString(var21.field673), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3703(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3695(Statics.field754[field824].field684) + 6;
                int var27 = arg1.field3113 + 8;
                class220.method3842(class116.field1806 - var26 / 2, class116.field1807 + 20 + 5, var26, var27, 16777120);
                class220.method3798(class116.field1806 - var26 / 2, class116.field1807 + 20 + 5, var26, var27, 0);
                arg1.method3703(Statics.field754[field824].field684, class116.field1806, class116.field1807 + 20 + 5 + arg1.field3113 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1745.getGraphics();
            Statics.field1074.method3795(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1745.repaint();
        }
    }

    @ObfuscatedName("cs.o(Lal;I)V")
    public static void method1907(class30 arg0) {
        if (arg0.method655() != client.field290) {
            client.field290 = arg0.method655();
            boolean var1 = arg0.method655();
            if (Statics.field896 != var1) {
                class199.method1908();
                Statics.field896 = var1;
            }
        }
        Statics.field3200 = arg0.field683;
        client.field562 = arg0.field673;
        client.field288 = arg0.field681;
        Statics.field3146 = client.field310 == 0 ? 43594 : arg0.field673 + 40000;
        Statics.field218 = client.field310 == 0 ? 443 : arg0.field673 + 50000;
        Statics.field326 = Statics.field3146;
    }
}

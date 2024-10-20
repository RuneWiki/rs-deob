package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ad")
public class class42 {

    @ObfuscatedName("ad.d")
    public static int field849 = 0;

    @ObfuscatedName("ad.f")
    public static int field826 = field849 + 202;

    @ObfuscatedName("ad.o")
    public static int[] field818 = new int[256];

    @ObfuscatedName("ad.k")
    public static int field828 = 0;

    @ObfuscatedName("ad.v")
    public static int field829 = 0;

    @ObfuscatedName("ad.ay")
    public static int field848 = 0;

    @ObfuscatedName("ad.as")
    public static int field817 = 0;

    @ObfuscatedName("ad.ai")
    public static int field853 = 0;

    @ObfuscatedName("ad.aq")
    public static int field833 = 0;

    @ObfuscatedName("ad.ac")
    public static int field834 = 10;

    @ObfuscatedName("ad.ae")
    public static String field827 = "";

    @ObfuscatedName("ad.ag")
    public static int field831 = 0;

    @ObfuscatedName("ad.am")
    public static String field837 = "";

    @ObfuscatedName("ad.af")
    public static String field830 = "";

    @ObfuscatedName("ad.ap")
    public static String field839 = "";

    @ObfuscatedName("ad.az")
    public static String field840 = "";

    @ObfuscatedName("ad.ab")
    public static String field841 = "";

    @ObfuscatedName("ad.ax")
    public static String field835 = "";

    @ObfuscatedName("ad.ad")
    public static class98 field843 = class98.field1626;

    @ObfuscatedName("ad.aa")
    public static boolean field844 = true;

    @ObfuscatedName("ad.an")
    public static int field845 = 0;

    @ObfuscatedName("ad.at")
    public static String field846 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ad.au")
    public static String field836 = "1234567890";

    @ObfuscatedName("ad.ar")
    public static boolean field852 = false;

    @ObfuscatedName("ad.bd")
    public static int field850 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gu.n(Lgj;Lgj;I)I")
    public static int method3536(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3135("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3135("logo", "")) {
            var2++;
        }
        if (arg1.method3135("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3135("titlebox", "")) {
            var2++;
        }
        if (arg1.method3135("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3135("runes", "")) {
            var2++;
        }
        if (arg1.method3135("title_mute", "")) {
            var2++;
        }
        if (arg1.method3112("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3112("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3135("sl_back", "");
        arg1.method3135("sl_flags", "");
        arg1.method3135("sl_arrows", "");
        arg1.method3135("sl_stars", "");
        arg1.method3135("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cx.d(Ljava/awt/Component;Lgj;Lgj;ZII)V")
    public static void method1858(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field832) {
            field831 = arg4;
            class220.method3807();
            byte[] var5 = arg1.method3110("title.jpg", "");
            Statics.field822 = new class225(var5, arg0);
            Statics.field823 = Statics.field822.method3927();
            if ((client.field285 & 0x20000000) == 0) {
                Statics.field824 = class226.method3262(arg2, "logo", "");
            } else {
                Statics.field824 = class226.method3262(arg2, "logo_deadman_mode", "");
            }
            Statics.field819 = class226.method3262(arg2, "titlebox", "");
            Statics.field820 = class226.method3262(arg2, "titlebutton", "");
            Statics.field821 = class226.method3183(arg2, "runes", "");
            Statics.field2707 = class226.method3183(arg2, "title_mute", "");
            Statics.field70 = class226.method3262(arg2, "options_radio_buttons,0", "");
            Statics.field57 = class226.method3262(arg2, "options_radio_buttons,2", "");
            Statics.field1910 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1910[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1910[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1910[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1910[var9 + 192] = 16777215;
            }
            Statics.field801 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field801[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field801[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field801[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field801[var13 + 192] = 16777215;
            }
            Statics.field201 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field201[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field201[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field201[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field201[var17 + 192] = 16777215;
            }
            Statics.field1731 = new int[256];
            Statics.field2781 = new int[32768];
            Statics.field1291 = new int[32768];
            method720((class223) null);
            Statics.field73 = new int[32768];
            Statics.field1849 = new int[32768];
            if (arg3) {
                field841 = "";
                field835 = "";
            }
            Statics.field1076 = 0;
            Statics.field243 = "";
            field844 = true;
            field852 = false;
            if (Statics.field1344.field689) {
                class139.field1918 = 1;
                Statics.field13 = null;
                Statics.field1919 = -1;
                Statics.field1567 = -1;
                Statics.field1650 = 0;
                Statics.field743 = false;
                Statics.field1793 = 2;
            } else {
                class139.method756(2, Statics.field747, "scape main", "", 255, false);
            }
            class186.method103(false);
            Statics.field832 = true;
            field849 = (Statics.field170 - client.field501) / 2;
            field826 = field849 + 202;
            Statics.field822.method3912(field849, 0);
            Statics.field823.method3912(field849 + 382, 0);
            Statics.field824.method3877(field849 + 382 - Statics.field824.field3187 / 2, 18);
        } else if (arg4 == 4) {
            field831 = 4;
        }
    }

    @ObfuscatedName("bl.m(Ldp;I)V")
    public static void method1061(class114 arg0) {
        if (!field852) {
            if ((class116.field1809 == 1 || !Statics.field230 && class116.field1809 == 4) && class116.field1810 >= field849 + 765 - 50 && class116.field1807 >= 453) {
                Statics.field1344.field689 = !Statics.field1344.field689;
                class31.method43();
                if (Statics.field1344.field689) {
                    class139.method187();
                } else {
                    class185 var6 = Statics.field747;
                    int var7 = var6.method3114("scape main");
                    int var8 = var6.method3109(var7, "");
                    class139.method2173(var6, var7, var8, 255, false);
                }
            }
            if (client.field293 != 5) {
                field853++;
                if (client.field293 == 10 || client.field293 == 11) {
                    if (client.field290 == 0) {
                        if (class116.field1809 == 1 || !Statics.field230 && class116.field1809 == 4) {
                            int var9 = field849 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1810 >= var9 && class116.field1810 <= var9 + var11 && class116.field1807 >= var10 && class116.field1807 <= var10 + var12) {
                                if (class30.method1481()) {
                                    field852 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field3081 != null && class30.method1481()) {
                            field852 = true;
                        }
                    }
                    int var13 = class116.field1809;
                    int var14 = class116.field1810;
                    int var15 = class116.field1807;
                    if (!Statics.field230 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field831 == 0) {
                        int var16 = field826 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class115.method218(client.method798("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field826 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field285 & 0x2000000) != 0) {
                                field837 = "";
                                field830 = class174.field2591;
                                field839 = class174.field2579;
                                field840 = class174.field2593;
                                field831 = 1;
                                field845 = 0;
                            } else if ((client.field285 & 0x4) != 0) {
                                if ((client.field285 & 0x400) == 0) {
                                    field830 = class174.field2582;
                                    field839 = class174.field2406;
                                    field840 = class174.field2505;
                                } else {
                                    field830 = class174.field2569;
                                    field839 = class174.field2553;
                                    field840 = class174.field2590;
                                }
                                field837 = class174.field2581;
                                field831 = 1;
                                field845 = 0;
                            } else if ((client.field285 & 0x400) == 0) {
                                field830 = class174.field2578;
                                field839 = class174.field2618;
                                field840 = class174.field2580;
                                field831 = 2;
                                field845 = 0;
                            } else {
                                field830 = class174.field2585;
                                field839 = class174.field2511;
                                field840 = class174.field2587;
                                field837 = class174.field2581;
                                field831 = 1;
                                field845 = 0;
                            }
                        }
                    } else if (field831 == 1) {
                        while (class106.method731()) {
                            if (Statics.field26 == 84) {
                                field830 = class174.field2578;
                                field839 = class174.field2618;
                                field840 = class174.field2580;
                                field831 = 2;
                                field845 = 0;
                            } else if (Statics.field26 == 13) {
                                field831 = 0;
                            }
                        }
                        int var19 = field826 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field830 = class174.field2578;
                            field839 = class174.field2618;
                            field840 = class174.field2580;
                            field831 = 2;
                            field845 = 0;
                        }
                        int var21 = field826 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field831 = 0;
                        }
                    } else if (field831 == 2) {
                        short var22 = 231;
                        int var44 = var22 + 30;
                        if (var13 == 1 && var15 >= var44 - 15 && var15 < var44) {
                            field845 = 0;
                        }
                        var44 += 15;
                        if (var13 == 1 && var15 >= var44 - 15 && var15 < var44) {
                            field845 = 1;
                        }
                        var44 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method45(class174.field2448, class174.field2464, class174.field2619);
                            field831 = 5;
                            return;
                        }
                        int var24 = field826 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field841 = field841.trim();
                            if (field841.length() == 0) {
                                method45(class174.field2592, class174.field2485, class174.field2486);
                                return;
                            }
                            if (field835.length() == 0) {
                                method45(class174.field2495, class174.field2388, class174.field2545);
                                return;
                            }
                            method45(class174.field2418, class174.field2597, class174.field2598);
                            field843 = Statics.field1344.field694.containsKey(class208.method2714(field841)) ? class98.field1628 : class98.field1626;
                            client.method3231(20);
                            return;
                        }
                        int var26 = field826 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field831 = 0;
                            field841 = "";
                            field835 = "";
                            Statics.field1076 = 0;
                            Statics.field243 = "";
                            field844 = true;
                        }
                        while (true) {
                            while (class106.method731()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field846.length(); var28++) {
                                    if (Statics.field2318 == field846.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field26 == 13) {
                                    field831 = 0;
                                    field841 = "";
                                    field835 = "";
                                    Statics.field1076 = 0;
                                    Statics.field243 = "";
                                    field844 = true;
                                } else if (field845 == 0) {
                                    if (Statics.field26 == 85 && field841.length() > 0) {
                                        field841 = field841.substring(0, field841.length() - 1);
                                    }
                                    if (Statics.field26 == 84 || Statics.field26 == 80) {
                                        field845 = 1;
                                    }
                                    if (var27 && field841.length() < 320) {
                                        field841 = field841 + Statics.field2318;
                                    }
                                } else if (field845 == 1) {
                                    if (Statics.field26 == 85 && field835.length() > 0) {
                                        field835 = field835.substring(0, field835.length() - 1);
                                    }
                                    if (Statics.field26 == 84 || Statics.field26 == 80) {
                                        field845 = 0;
                                    }
                                    if (Statics.field26 == 84) {
                                        field841 = field841.trim();
                                        if (field841.length() == 0) {
                                            method45(class174.field2592, class174.field2485, class174.field2486);
                                            return;
                                        }
                                        if (field835.length() == 0) {
                                            method45(class174.field2495, class174.field2388, class174.field2545);
                                            return;
                                        }
                                        method45(class174.field2418, class174.field2597, class174.field2598);
                                        field843 = Statics.field1344.field694.containsKey(class208.method2714(field841)) ? class98.field1628 : class98.field1626;
                                        client.method3231(20);
                                        return;
                                    }
                                    if (var27 && field835.length() < 20) {
                                        field835 = field835 + Statics.field2318;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field831 == 3) {
                        int var29 = field826 + 180;
                        short var30 = 276;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field830 = class174.field2578;
                            field839 = class174.field2618;
                            field840 = class174.field2580;
                            field831 = 2;
                            field845 = 0;
                        }
                        int var31 = field826 + 180;
                        short var32 = 326;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            method45(class174.field2448, class174.field2464, class174.field2619);
                            field831 = 5;
                            return;
                        }
                    } else if (field831 == 4) {
                        int var33 = field826 + 180 - 80;
                        short var34 = 321;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            Statics.field243.trim();
                            if (Statics.field243.length() != 6) {
                                method45(class174.field2403, class174.field2404, class174.field2405);
                                return;
                            }
                            Statics.field1076 = Integer.parseInt(Statics.field243);
                            Statics.field243 = "";
                            field843 = field844 ? class98.field1625 : class98.field1627;
                            method45(class174.field2418, class174.field2597, class174.field2598);
                            client.method3231(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field826 + 180 - 9 && var14 <= field826 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field844 = !field844;
                        }
                        if (var13 == 1 && var14 >= field826 + 180 - 34 && var14 <= field826 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class115.method218(client.method798("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var35 = field826 + 180 + 80;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            field831 = 0;
                            field841 = "";
                            field835 = "";
                            Statics.field1076 = 0;
                            Statics.field243 = "";
                        }
                        while (class106.method731()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field836.length(); var37++) {
                                if (Statics.field2318 == field836.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field26 == 13) {
                                field831 = 0;
                                field841 = "";
                                field835 = "";
                                Statics.field1076 = 0;
                                Statics.field243 = "";
                            } else {
                                if (Statics.field26 == 85 && Statics.field243.length() > 0) {
                                    Statics.field243 = Statics.field243.substring(0, Statics.field243.length() - 1);
                                }
                                if (Statics.field26 == 84) {
                                    Statics.field243.trim();
                                    if (Statics.field243.length() != 6) {
                                        method45(class174.field2403, class174.field2404, class174.field2405);
                                        return;
                                    }
                                    Statics.field1076 = Integer.parseInt(Statics.field243);
                                    Statics.field243 = "";
                                    field843 = field844 ? class98.field1625 : class98.field1627;
                                    method45(class174.field2418, class174.field2597, class174.field2598);
                                    client.method3231(20);
                                    return;
                                }
                                if (var36 && Statics.field243.length() < 6) {
                                    Statics.field243 = Statics.field243 + Statics.field2318;
                                }
                            }
                        }
                    } else if (field831 == 5) {
                        int var38 = field826 + 180 - 80;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            method683();
                            return;
                        }
                        int var40 = field826 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field830 = class174.field2578;
                            field839 = class174.field2618;
                            field840 = class174.field2580;
                            field831 = 2;
                            field845 = 0;
                            field835 = "";
                        }
                        while (class106.method731()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field846.length(); var42++) {
                                if (Statics.field2318 == field846.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field26 == 13) {
                                field830 = class174.field2578;
                                field839 = class174.field2618;
                                field840 = class174.field2580;
                                field831 = 2;
                                field845 = 0;
                                field835 = "";
                            } else {
                                if (Statics.field26 == 85 && field841.length() > 0) {
                                    field841 = field841.substring(0, field841.length() - 1);
                                }
                                if (Statics.field26 == 84) {
                                    method683();
                                    return;
                                }
                                if (var41 && field841.length() < 320) {
                                    field841 = field841 + Statics.field2318;
                                }
                            }
                        }
                    } else if (field831 == 6) {
                        while (true) {
                            do {
                                if (!class106.method731()) {
                                    short var43 = 321;
                                    if (var13 == 1 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                                        field830 = class174.field2578;
                                        field839 = class174.field2618;
                                        field840 = class174.field2580;
                                        field831 = 2;
                                        field845 = 0;
                                        field835 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field26 != 84 && Statics.field26 != 13);
                            field830 = class174.field2578;
                            field839 = class174.field2618;
                            field840 = class174.field2580;
                            field831 = 2;
                            field845 = 0;
                            field835 = "";
                        }
                    }
                }
            }
        } else if (class116.field1809 == 1 || !Statics.field230 && class116.field1809 == 4) {
            int var1 = field849 + 280;
            if (class116.field1810 >= var1 && class116.field1810 <= var1 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                class30.method208(0, 0);
            } else if (class116.field1810 >= var1 + 15 && class116.field1810 <= var1 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                class30.method208(0, 1);
            } else {
                int var2 = field849 + 390;
                if (class116.field1810 >= var2 && class116.field1810 <= var2 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                    class30.method208(1, 0);
                } else if (class116.field1810 >= var2 + 15 && class116.field1810 <= var2 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                    class30.method208(1, 1);
                } else {
                    int var3 = field849 + 500;
                    if (class116.field1810 >= var3 && class116.field1810 <= var3 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                        class30.method208(2, 0);
                    } else if (class116.field1810 >= var3 + 15 && class116.field1810 <= var3 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                        class30.method208(2, 1);
                    } else {
                        int var4 = field849 + 610;
                        if (class116.field1810 >= var4 && class116.field1810 <= var4 + 14 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                            class30.method208(3, 0);
                        } else if (class116.field1810 >= var4 + 15 && class116.field1810 <= var4 + 80 && class116.field1807 >= 4 && class116.field1807 <= 18) {
                            class30.method208(3, 1);
                        } else if (class116.field1810 >= field849 + 708 && class116.field1807 >= 4 && class116.field1810 <= field849 + 708 + 50 && class116.field1807 <= 20) {
                            field852 = false;
                            Statics.field822.method3912(field849, 0);
                            Statics.field823.method3912(field849 + 382, 0);
                            Statics.field824.method3877(field849 + 382 - Statics.field824.field3187 / 2, 18);
                        } else if (field850 != -1) {
                            class30 var5 = Statics.field681[field850];
                            method795(var5);
                            field852 = false;
                            Statics.field822.method3912(field849, 0);
                            Statics.field823.method3912(field849 + 382, 0);
                            Statics.field824.method3877(field849 + 382 - Statics.field824.field3187 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.h(I)V")
    public static void method683() {
        field841 = field841.trim();
        if (field841.length() == 0) {
            method45(class174.field2448, class174.field2464, class174.field2619);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method798("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class161 var4 = new class161(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2291, var4.field2285, 1000 - var4.field2285);
                if (var5 == -1) {
                    var4.field2285 = 0;
                    long var8 = var4.method2908();
                    var6 = var8;
                    break;
                }
                var4.field2285 += var5;
                if (var4.field2285 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var40) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field841;
            Random var15 = new Random();
            class161 var16 = new class161(128);
            class161 var17 = new class161(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2765(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2768(var15.nextInt());
            }
            var16.method2768(var18[0]);
            var16.method2768(var18[1]);
            var16.method2770(var6);
            var16.method2770(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2768(var15.nextInt());
            }
            var16.method2846(class37.field764, class37.field763);
            var17.method2765(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2768(var15.nextInt());
            }
            var17.method2770(var15.nextLong());
            var17.method2954(var15.nextLong());
            class105.method735(var17);
            var17.method2770(var15.nextLong());
            var17.method2846(class37.field764, class37.field763);
            int var22 = class161.method1995(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class161 var23 = new class161(var22);
            var23.method2771(var14);
            var23.field2285 = var22;
            var23.method2797(var18);
            class161 var24 = new class161(var23.field2285 + var17.field2285 + var16.field2285 + 5);
            var24.method2765(2);
            var24.method2765(var16.field2285);
            var24.method2774(var16.field2291, 0, var16.field2285);
            var24.method2765(var17.field2285);
            var24.method2774(var17.field2291, 0, var17.field2285);
            var24.method2766(var23.field2285);
            var24.method2774(var23.field2291, 0, var23.field2285);
            String var25 = class207.method1831(var24.field2291);
            byte var32;
            try {
                URL var26 = new URL(client.method798("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class232.method3768(var25) + "&dest=" + class232.method3768("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class161 var30 = new class161(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2291, var30.field2285, 1000 - var30.field2285);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2291);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2798(var18);
                            while (var30.field2285 > 0 && var30.field2291[var30.field2285 - 1] == 0) {
                                var30.field2285--;
                            }
                            String var34 = new String(var30.field2291, 0, var30.field2285);
                            boolean var35;
                            if (var34 == null) {
                                var35 = false;
                            } else {
                                label100: {
                                    try {
                                        new URL(var34);
                                    } catch (MalformedURLException var38) {
                                        var35 = false;
                                        break label100;
                                    }
                                    var35 = true;
                                }
                            }
                            if (var35) {
                                class115.method218(var34, true, false);
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2285 += var31;
                    if (var30.field2285 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var39) {
                var39.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method45(class174.field2620, class174.field2621, class174.field2622);
                field831 = 6;
                break;
            case 3:
                method45(class174.field2411, class174.field2616, class174.field2456);
                break;
            case 4:
                method45(class174.field2626, class174.field2627, class174.field2628);
                break;
            case 5:
                method45(class174.field2491, class174.field2612, class174.field2631);
                break;
            case 6:
                method45(class174.field2387, class174.field2586, class174.field2634);
                break;
            case 7:
                method45(class174.field2635, class174.field2636, class174.field2637);
        }
    }

    @ObfuscatedName("eu.w(Lhe;Lhe;Lhe;ZB)V")
    public static void method2684(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field849 = (Statics.field170 - client.field501) / 2;
            field826 = field849 + 202;
        }
        if (field852) {
            method704(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field822.method3912(field849, 0);
            Statics.field823.method3912(field849 + 382, 0);
            Statics.field824.method3877(field849 + 382 - Statics.field824.field3187 / 2, 18);
        }
        if (client.field293 == 0 || client.field293 == 5) {
            byte var4 = 20;
            arg0.method3663(class174.field2577, field826 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class220.method3799(field826 + 180 - 152, var5, 304, 34, 9179409);
            class220.method3799(field826 + 180 - 151, var5 + 1, 302, 32, 0);
            class220.method3817(field826 + 180 - 150, var5 + 2, field834 * 3, 30, 9179409);
            class220.method3817(field834 * 3 + (field826 + 180 - 150), var5 + 2, 300 - field834 * 3, 30, 0);
            arg0.method3663(field827, field826 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field293 == 20) {
            Statics.field819.method3877(field826 + 180 - Statics.field819.field3187 / 2, 271 - Statics.field819.field3185 / 2);
            short var6 = 211;
            arg0.method3663(field830, field826 + 180, var6, 16776960, 0);
            int var106 = var6 + 15;
            arg0.method3663(field839, field826 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            arg0.method3663(field840, field826 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            int var109 = var108 + 10;
            if (field831 != 4) {
                arg0.method3675(class174.field2599, field826 + 180 - 110, var109, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field841; arg0.method3668(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3675(class210.method3726(var8), field826 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                arg0.method3675(class174.field2600 + class208.method1088(field835), field826 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
            }
        }
        if (client.field293 == 10 || client.field293 == 11) {
            Statics.field819.method3877(field826, 171);
            if (field831 == 0) {
                short var9 = 251;
                arg0.method3663(class174.field2602, field826 + 180, var9, 16776960, 0);
                int var110 = var9 + 30;
                int var10 = field826 + 180 - 80;
                short var11 = 291;
                Statics.field820.method3877(var10 - 73, var11 - 20);
                arg0.method3676(class174.field2603, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field826 + 180 + 80;
                Statics.field820.method3877(var12 - 73, var11 - 20);
                arg0.method3676(class174.field2371, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field831 == 1) {
                arg0.method3663(field837, field826 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3663(field830, field826 + 180, var13, 16777215, 0);
                int var111 = var13 + 15;
                arg0.method3663(field839, field826 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                arg0.method3663(field840, field826 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                int var14 = field826 + 180 - 80;
                short var15 = 321;
                Statics.field820.method3877(var14 - 73, var15 - 20);
                arg0.method3663(class174.field2375, var14, var15 + 5, 16777215, 0);
                int var16 = field826 + 180 + 80;
                Statics.field820.method3877(var16 - 73, var15 - 20);
                arg0.method3663(class174.field2606, var16, var15 + 5, 16777215, 0);
            } else if (field831 == 2) {
                short var17 = 211;
                arg0.method3663(field830, field826 + 180, var17, 16776960, 0);
                int var114 = var17 + 15;
                arg0.method3663(field839, field826 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg0.method3663(field840, field826 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var117 = var116 + 10;
                arg0.method3675(class174.field2599, field826 + 180 - 110, var117, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field841; arg0.method3668(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3675(class210.method3726(var19) + (field845 == 0 & client.field295 % 40 < 20 ? class38.method183(16776960) + class38.field776 : ""), field826 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                arg0.method3675(class174.field2600 + class208.method1088(field835) + (field845 == 1 & client.field295 % 40 < 20 ? class38.method183(16776960) + class38.field776 : ""), field826 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
                int var20 = field826 + 180 - 80;
                short var21 = 321;
                Statics.field820.method3877(var20 - 73, var21 - 20);
                arg0.method3663(class174.field2605, var20, var21 + 5, 16777215, 0);
                int var22 = field826 + 180 + 80;
                Statics.field820.method3877(var22 - 73, var21 - 20);
                arg0.method3663(class174.field2606, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3663(class174.field2608, field826 + 180, var23, 16776960, 0);
            } else if (field831 == 3) {
                short var24 = 201;
                arg0.method3663(class174.field2481, field826 + 180, var24, 16776960, 0);
                int var118 = var24 + 20;
                arg1.method3663(class174.field2474, field826 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg1.method3663(class174.field2519, field826 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var25 = field826 + 180;
                short var26 = 276;
                Statics.field820.method3877(var25 - 73, var26 - 20);
                arg2.method3663(class174.field2610, var25, var26 + 5, 16777215, 0);
                int var27 = field826 + 180;
                short var28 = 326;
                Statics.field820.method3877(var27 - 73, var28 - 20);
                arg2.method3663(class174.field2611, var27, var28 + 5, 16777215, 0);
            } else if (field831 == 4) {
                arg0.method3663(class174.field2594, field826 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3663(field830, field826 + 180, var29, 16777215, 0);
                int var121 = var29 + 15;
                arg0.method3663(field839, field826 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method3663(field840, field826 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3675(class174.field2642 + class208.method1088(Statics.field243) + (client.field295 % 40 < 20 ? class38.method183(16776960) + class38.field776 : ""), field826 + 180 - 108, var123, 16777215, 0);
                int var124 = var123 - 8;
                arg0.method3675(class174.field2377, field826 + 180 - 9, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg0.method3675(class174.field2523, field826 + 180 - 9, var125, 16776960, 0);
                int var30 = field826 + 180 - 9 + arg0.method3668(class174.field2523) + 15;
                int var31 = var125 - arg0.field3092;
                class223 var32;
                if (field844) {
                    var32 = Statics.field57;
                } else {
                    var32 = Statics.field70;
                }
                var32.method3877(var30, var31);
                var121 = var125 + 15;
                int var33 = field826 + 180 - 80;
                short var34 = 321;
                Statics.field820.method3877(var33 - 73, var34 - 20);
                arg0.method3663(class174.field2375, var33, var34 + 5, 16777215, 0);
                int var35 = field826 + 180 + 80;
                Statics.field820.method3877(var35 - 73, var34 - 20);
                arg0.method3663(class174.field2606, var35, var34 + 5, 16777215, 0);
                arg1.method3663(class174.field2595, field826 + 180, var34 + 36, 255, 0);
            } else if (field831 == 5) {
                arg0.method3663(class174.field2613, field826 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method3663(field830, field826 + 180, var36, 16776960, 0);
                int var126 = var36 + 15;
                arg2.method3663(field839, field826 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg2.method3663(field840, field826 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var129 = var128 + 14;
                arg0.method3675(class174.field2462, field826 + 180 - 145, var129, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field841; arg0.method3668(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method3675(class210.method3726(var38) + (client.field295 % 40 < 20 ? class38.method183(16776960) + class38.field776 : ""), field826 + 180 - 34, var129, 16777215, 0);
                var126 = var129 + 15;
                int var39 = field826 + 180 - 80;
                short var40 = 321;
                Statics.field820.method3877(var39 - 73, var40 - 20);
                arg0.method3663(class174.field2615, var39, var40 + 5, 16777215, 0);
                int var41 = field826 + 180 + 80;
                Statics.field820.method3877(var41 - 73, var40 - 20);
                arg0.method3663(class174.field2567, var41, var40 + 5, 16777215, 0);
            } else if (field831 == 6) {
                short var42 = 211;
                arg0.method3663(field830, field826 + 180, var42, 16776960, 0);
                int var130 = var42 + 15;
                arg0.method3663(field839, field826 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method3663(field840, field826 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var43 = field826 + 180;
                short var44 = 321;
                Statics.field820.method3877(var43 - 73, var44 - 20);
                arg0.method3663(class174.field2567, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field853 > 0) {
            int var45 = field853;
            short var46 = 256;
            field848 += var45 * 128;
            if (field848 > Statics.field2781.length) {
                field848 -= Statics.field2781.length;
                int var47 = (int) (Math.random() * 12.0D);
                method720(Statics.field821[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field73[var48 + var49] - Statics.field2781[field848 + var48 & Statics.field2781.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field73[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field73[var54 + var55] = 255;
                    } else {
                        Statics.field73[var54 + var55] = 0;
                    }
                }
            }
            if (field828 > 0) {
                field828 -= var45 * 4;
            }
            if (field829 > 0) {
                field829 -= var45 * 4;
            }
            if (field828 == 0 && field829 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field828 = 1024;
                }
                if (var57 == 1) {
                    field829 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field818[var58] = field818[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field818[var59] = (int) (Math.sin((double) field833 / 14.0D) * 16.0D + Math.sin((double) field833 / 15.0D) * 14.0D + Math.sin((double) field833 / 16.0D) * 12.0D);
                field833++;
            }
            field817 += var45 * 466452853;
            int var60 = ((client.field295 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field817 * 566537812; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field73[(var63 << 7) + var62] = 192;
                }
                field817 = 0;
                int var64 = 0;
                label319: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label319;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field1849[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field1849[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field73[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field73[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field73[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field1849[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field853 = 0;
        }
        short var72 = 256;
        if (field828 > 0) {
            for (int var73 = 0; var73 < 256; var73++) {
                if (field828 > 768) {
                    Statics.field1731[var73] = method2579(Statics.field1910[var73], Statics.field801[var73], 1024 - field828);
                } else if (field828 > 256) {
                    Statics.field1731[var73] = Statics.field801[var73];
                } else {
                    Statics.field1731[var73] = method2579(Statics.field801[var73], Statics.field1910[var73], 256 - field828);
                }
            }
        } else if (field829 > 0) {
            for (int var74 = 0; var74 < 256; var74++) {
                if (field829 > 768) {
                    Statics.field1731[var74] = method2579(Statics.field1910[var74], Statics.field201[var74], 1024 - field829);
                } else if (field829 > 256) {
                    Statics.field1731[var74] = Statics.field201[var74];
                } else {
                    Statics.field1731[var74] = method2579(Statics.field201[var74], Statics.field1910[var74], 256 - field829);
                }
            }
        } else {
            for (int var75 = 0; var75 < 256; var75++) {
                Statics.field1731[var75] = Statics.field1910[var75];
            }
        }
        class220.method3787(field849, 9, field849 + 128, var72 + 7);
        Statics.field822.method3912(field849, 0);
        class220.method3786();
        int var76 = 0;
        int var77 = field849 + Statics.field744.field3176 * 9;
        for (int var78 = 1; var78 < var72 - 1; var78++) {
            int var79 = (var72 - var78) * field818[var78] / var72;
            int var80 = var79 + 22;
            if (var80 < 0) {
                var80 = 0;
            }
            var76 += var80;
            for (int var81 = var80; var81 < 128; var81++) {
                int var82 = Statics.field73[var76++];
                if (var82 == 0) {
                    var77++;
                } else {
                    int var84 = 256 - var82;
                    int var85 = Statics.field1731[var82];
                    int var86 = Statics.field744.field3174[var77];
                    Statics.field744.field3174[var77++] = ((var85 & 0xFF00FF) * var82 + (var86 & 0xFF00FF) * var84 & 0xFF00FF00) + ((var85 & 0xFF00) * var82 + (var86 & 0xFF00) * var84 & 0xFF0000) >> 8;
                }
            }
            var77 += Statics.field744.field3176 + var80 - 128;
        }
        class220.method3787(field849 + 765 - 128, 9, field849 + 765, var72 + 7);
        Statics.field823.method3912(field849 + 382, 0);
        class220.method3786();
        int var87 = 0;
        int var88 = field849 + Statics.field744.field3176 * 9 + 24 + 637;
        for (int var89 = 1; var89 < var72 - 1; var89++) {
            int var90 = (var72 - var89) * field818[var89] / var72;
            int var91 = 103 - var90;
            int var92 = var88 + var90;
            for (int var93 = 0; var93 < var91; var93++) {
                int var94 = Statics.field73[var87++];
                if (var94 == 0) {
                    var92++;
                } else {
                    int var96 = 256 - var94;
                    int var97 = Statics.field1731[var94];
                    int var98 = Statics.field744.field3174[var92];
                    Statics.field744.field3174[var92++] = ((var97 & 0xFF00FF) * var94 + (var98 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var97 & 0xFF00) * var94 + (var98 & 0xFF00) * var96 & 0xFF0000) >> 8;
                }
            }
            var87 += 128 - var91;
            var88 = Statics.field744.field3176 - var91 - var90 + var92;
        }
        Statics.field2707[Statics.field1344.field689 ? 1 : 0].method3877(field849 + 765 - 40, 463);
        if (client.field293 > 5 && client.field290 == 0) {
            if (Statics.field842 == null) {
                Statics.field842 = class226.method3262(Statics.field2241, "sl_button", "");
            } else {
                int var99 = field849 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                Statics.field842.method3877(var99, var100);
                arg0.method3663(class174.field2532 + " " + client.field284, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (Statics.field3081 == null) {
                    arg1.method3663(class174.field2607, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3663(class174.field2647, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = Statics.field1726.getGraphics();
            Statics.field744.method3777(var103, 0, 0);
        } catch (Exception var105) {
            Statics.field1726.repaint();
        }
    }

    @ObfuscatedName("h.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method45(String arg0, String arg1, String arg2) {
        field830 = arg0;
        field839 = arg1;
        field840 = arg2;
    }

    @ObfuscatedName("ag.c(Lhc;B)V")
    public static final void method720(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2781.length; var2++) {
            Statics.field2781[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2781[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1291[var8] = (Statics.field2781[var8 - 1] + Statics.field2781[var8 + 1] + Statics.field2781[var8 - 128] + Statics.field2781[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2781;
            Statics.field2781 = Statics.field1291;
            Statics.field1291 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3185; var11++) {
            for (int var12 = 0; var12 < arg0.field3187; var12++) {
                if (arg0.field3189[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3190;
                    int var14 = var11 + 16 + arg0.field3188;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2781[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ew.z(IIIS)I")
    public static final int method2579(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ae.q(Lhe;Lhe;B)V")
    public static void method704(class209 arg0, class209 arg1) {
        if (Statics.field151 == null) {
            Statics.field151 = class226.method2372(Statics.field2241, "sl_back", "");
        }
        if (Statics.field1912 == null) {
            Statics.field1912 = class226.method3183(Statics.field2241, "sl_flags", "");
        }
        if (Statics.field1925 == null) {
            Statics.field1925 = class226.method3183(Statics.field2241, "sl_arrows", "");
        }
        if (Statics.field2359 == null) {
            Statics.field2359 = class226.method3183(Statics.field2241, "sl_stars", "");
        }
        class220.method3817(field849, 23, 765, 480, 0);
        class220.method3838(field849, 0, 125, 23, 12425273, 9135624);
        class220.method3838(field849 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3663(class174.field2638, field849 + 62, 15, 0, -1);
        if (Statics.field2359 != null) {
            Statics.field2359[1].method3877(field849 + 140, 1);
            arg1.method3675(class174.field2639, field849 + 152, 10, 16777215, -1);
            Statics.field2359[0].method3877(field849 + 140, 12);
            arg1.method3675(class174.field2640, field849 + 152, 21, 16777215, -1);
        }
        if (Statics.field1925 != null) {
            int var2 = field849 + 280;
            if (class30.field687[0] == 0 && class30.field675[0] == 0) {
                Statics.field1925[2].method3877(var2, 4);
            } else {
                Statics.field1925[0].method3877(var2, 4);
            }
            if (class30.field687[0] == 0 && class30.field675[0] == 1) {
                Statics.field1925[3].method3877(var2 + 15, 4);
            } else {
                Statics.field1925[1].method3877(var2 + 15, 4);
            }
            arg0.method3675(class174.field2641, var2 + 32, 17, 16777215, -1);
            int var3 = field849 + 390;
            if (class30.field687[0] == 1 && class30.field675[0] == 0) {
                Statics.field1925[2].method3877(var3, 4);
            } else {
                Statics.field1925[0].method3877(var3, 4);
            }
            if (class30.field687[0] == 1 && class30.field675[0] == 1) {
                Statics.field1925[3].method3877(var3 + 15, 4);
            } else {
                Statics.field1925[1].method3877(var3 + 15, 4);
            }
            arg0.method3675(class174.field2502, var3 + 32, 17, 16777215, -1);
            int var4 = field849 + 500;
            if (class30.field687[0] == 2 && class30.field675[0] == 0) {
                Statics.field1925[2].method3877(var4, 4);
            } else {
                Statics.field1925[0].method3877(var4, 4);
            }
            if (class30.field687[0] == 2 && class30.field675[0] == 1) {
                Statics.field1925[3].method3877(var4 + 15, 4);
            } else {
                Statics.field1925[1].method3877(var4 + 15, 4);
            }
            arg0.method3675(class174.field2643, var4 + 32, 17, 16777215, -1);
            int var5 = field849 + 610;
            if (class30.field687[0] == 3 && class30.field675[0] == 0) {
                Statics.field1925[2].method3877(var5, 4);
            } else {
                Statics.field1925[0].method3877(var5, 4);
            }
            if (class30.field687[0] == 3 && class30.field675[0] == 1) {
                Statics.field1925[3].method3877(var5 + 15, 4);
            } else {
                Statics.field1925[1].method3877(var5 + 15, 4);
            }
            arg0.method3675(class174.field2644, var5 + 32, 17, 16777215, -1);
        }
        class220.method3817(field849 + 708, 4, 50, 16, 0);
        arg1.method3663(class174.field2606, field849 + 708 + 25, 16, 16777215, -1);
        field850 = -1;
        if (Statics.field151 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class30.field673) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class30.field673) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class30.field673) {
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
            int var17 = field849 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class30.field673; var20++) {
                class30 var21 = Statics.field681[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field679);
                if (var21.field679 == -1) {
                    var23 = class174.field2645;
                    var22 = false;
                } else if (var21.field679 > 1980) {
                    var23 = class174.field2496;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method664()) {
                    if (var21.method634()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method639()) {
                    var24 = 16711680;
                    if (var21.method634()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method636()) {
                    if (var21.method634()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method634()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class116.field1812 >= var17 && class116.field1811 * 853340747 >= var16 && class116.field1812 < var6 + var17 && class116.field1811 * 853340747 < var7 + var16 && var22) {
                    field850 = var20;
                    Statics.field151[var25].method3916(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field151[var25].method3912(var17, var16);
                }
                if (Statics.field1912 != null) {
                    Statics.field1912[(var21.method634() ? 8 : 0) + var21.field672].method3877(var17 + 29, var16);
                }
                arg0.method3663(Integer.toString(var21.field677), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3663(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3668(Statics.field681[field850].field668) + 6;
                int var27 = arg1.field3092 + 8;
                class220.method3817(class116.field1812 - var26 / 2, class116.field1811 * 853340747 + 20 + 5, var26, var27, 16777120);
                class220.method3799(class116.field1812 - var26 / 2, class116.field1811 * 853340747 + 20 + 5, var26, var27, 0);
                arg1.method3663(Statics.field681[field850].field668, class116.field1812, class116.field1811 * 853340747 + 20 + 5 + arg1.field3092 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1726.getGraphics();
            Statics.field744.method3777(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1726.repaint();
        }
    }

    @ObfuscatedName("ah.l(Las;B)V")
    public static void method795(class30 arg0) {
        if (arg0.method634() != client.field440) {
            client.field440 = arg0.method634();
            boolean var1 = arg0.method634();
            if (Statics.field2944 != var1) {
                class199.field2946.method2220();
                class199.field2952.method2220();
                class199.field2947.method2220();
                Statics.field2944 = var1;
            }
        }
        Statics.field196 = arg0.field680;
        client.field284 = arg0.field677;
        client.field285 = arg0.field678;
        Statics.field220 = client.field444 == 0 ? 43594 : arg0.field677 + 40000;
        Statics.field771 = client.field444 == 0 ? 443 : arg0.field677 + 50000;
        Statics.field56 = Statics.field220;
    }
}

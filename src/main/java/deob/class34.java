package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ax")
public class class34 {

    @ObfuscatedName("ax.w")
    public static int field731 = 0;

    @ObfuscatedName("ax.s")
    public static int field734 = field731 + 202;

    @ObfuscatedName("ax.i")
    public static int[] field758 = new int[256];

    @ObfuscatedName("ax.n")
    public static int field738 = 0;

    @ObfuscatedName("ax.q")
    public static int field753 = 0;

    @ObfuscatedName("ax.ap")
    public static int field742 = 0;

    @ObfuscatedName("ax.ar")
    public static int field743 = 0;

    @ObfuscatedName("ax.ab")
    public static int field751 = 0;

    @ObfuscatedName("ax.ai")
    public static int field745 = 0;

    @ObfuscatedName("ax.aa")
    public static int field748 = 10;

    @ObfuscatedName("ax.ax")
    public static String field747 = "";

    @ObfuscatedName("ax.ad")
    public static int field760 = 0;

    @ObfuscatedName("ax.av")
    public static String field749 = "";

    @ObfuscatedName("ax.aq")
    public static String field730 = "";

    @ObfuscatedName("ax.af")
    public static String field739 = "";

    @ObfuscatedName("ax.at")
    public static String field752 = "";

    @ObfuscatedName("ax.aw")
    public static String field759 = "";

    @ObfuscatedName("ax.ay")
    public static String field736 = "";

    @ObfuscatedName("ax.ah")
    public static class163 field754 = class163.field2659;

    @ObfuscatedName("ax.ac")
    public static boolean field750 = true;

    @ObfuscatedName("ax.ao")
    public static int field755 = 0;

    @ObfuscatedName("ax.au")
    public static String field762 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ax.am")
    public static String field744 = "1234567890";

    @ObfuscatedName("ax.az")
    public static boolean field729 = false;

    @ObfuscatedName("ax.bs")
    public static int field735 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.m(B)I")
    public static int method739() {
        return 9;
    }

    @ObfuscatedName("client.w(Ljava/awt/Component;Lfa;Lfa;ZII)V")
    public static void method352(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field757) {
            field760 = arg4;
            class83.method1815();
            byte[] var5 = arg1.method3116("title.jpg", "");
            Statics.field3055 = new class82(var5, arg0);
            Statics.field2200 = Statics.field3055.method1680();
            if ((client.field481 & 0x20000000) == 0) {
                Statics.field699 = class80.method1849(arg2, "logo", "");
            } else {
                Statics.field699 = class80.method1849(arg2, "logo_deadman_mode", "");
            }
            Statics.field746 = class80.method1849(arg2, "titlebox", "");
            Statics.field732 = class80.method1849(arg2, "titlebutton", "");
            Statics.field1422 = class80.method117(arg2, "runes", "");
            Statics.field685 = class80.method117(arg2, "title_mute", "");
            Statics.field733 = class80.method1849(arg2, "options_radio_buttons,0", "");
            Statics.field697 = class80.method1849(arg2, "options_radio_buttons,2", "");
            Statics.field756 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field756[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field756[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field756[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field756[var9 + 192] = 16777215;
            }
            Statics.field737 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field737[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field737[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field737[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field737[var13 + 192] = 16777215;
            }
            Statics.field1695 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1695[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1695[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1695[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1695[var17 + 192] = 16777215;
            }
            Statics.field2105 = new int[256];
            Statics.field740 = new int[32768];
            Statics.field1673 = new int[32768];
            method2758((class84) null);
            Statics.field1065 = new int[32768];
            Statics.field741 = new int[32768];
            if (arg3) {
                field759 = "";
                field736 = "";
            }
            Statics.field233 = 0;
            Statics.field761 = "";
            field750 = true;
            field729 = false;
            if (Statics.field163.field133) {
                class187.field3005 = 1;
                Statics.field2090 = null;
                Statics.field1835 = -1;
                Statics.field3010 = -1;
                Statics.field904 = 0;
                Statics.field2112 = false;
                Statics.field3011 = 2;
            } else {
                class187.method1675(2, Statics.field815, "scape main", "", 255, false);
            }
            class175.method147(false);
            Statics.field757 = true;
            field731 = (Statics.field175 - client.field486) / 2;
            field734 = field731 + 202;
            Statics.field3055.method1690(field731, 0);
            Statics.field2200.method1690(field731 + 382, 0);
            Statics.field699.method1838(field731 + 382 - Statics.field699.field1501 / 2, 18);
        } else if (arg4 == 4) {
            field760 = 4;
        }
    }

    @ObfuscatedName("c.e(I)V")
    public static void method547() {
        if (!Statics.field757) {
            return;
        }
        Statics.field746 = null;
        Statics.field732 = null;
        Statics.field1422 = null;
        Statics.field3055 = null;
        Statics.field2200 = null;
        Statics.field699 = null;
        Statics.field685 = null;
        Statics.field733 = null;
        Statics.field697 = null;
        Statics.field1700 = null;
        Statics.field2272 = null;
        Statics.field1611 = null;
        Statics.field70 = null;
        Statics.field640 = null;
        Statics.field756 = null;
        Statics.field737 = null;
        Statics.field1695 = null;
        Statics.field2105 = null;
        Statics.field740 = null;
        Statics.field1673 = null;
        Statics.field1065 = null;
        Statics.field741 = null;
        class187.field3005 = 1;
        Statics.field2090 = null;
        Statics.field1835 = -1;
        Statics.field3010 = -1;
        Statics.field904 = 0;
        Statics.field2112 = false;
        Statics.field3011 = 2;
        class175.method147(true);
        Statics.field757 = false;
    }

    @ObfuscatedName("br.o(Lez;B)V")
    public static void method1077(class148 arg0) {
        if (field729) {
            method723(arg0);
            return;
        }
        if ((class144.field2225 == 1 || !Statics.field236 && class144.field2225 == 4) && class144.field2221 >= field731 + 765 - 50 && class144.field2223 >= 453) {
            Statics.field163.field133 = !Statics.field163.field133;
            class9.method660();
            if (Statics.field163.field133) {
                class187.method935();
            } else {
                Statics.method3217(Statics.field815, "scape main", "", 255, false);
            }
        }
        if (client.field281 == 5) {
            return;
        }
        field751++;
        if (client.field281 != 10 && client.field281 != 11) {
            return;
        }
        if (client.field534 == 0) {
            if (class144.field2225 == 1 || !Statics.field236 && class144.field2225 == 4) {
                int var1 = field731 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class144.field2221 >= var1 && class144.field2221 <= var1 + var3 && class144.field2223 >= var2 && class144.field2223 <= var2 + var4) {
                    if (class28.method177()) {
                        field729 = true;
                    }
                    return;
                }
            }
            if (Statics.field3229 != null && class28.method177()) {
                field729 = true;
            }
        }
        int var5 = class144.field2225;
        int var6 = class144.field2221;
        int var7 = class144.field2223;
        if (!Statics.field236 && var5 == 4) {
            var5 = 1;
        }
        if (field760 == 0) {
            int var8 = field734 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method3271("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class142.method2997(var10, true, "openjs", false);
            }
            int var11 = field734 + 180 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field481 & 0x2000000) != 0) {
                    field749 = "";
                    field730 = class161.field2591;
                    field739 = class161.field2592;
                    field752 = class161.field2611;
                    field760 = 1;
                    field755 = 0;
                } else if ((client.field481 & 0x4) != 0) {
                    if ((client.field481 & 0x400) == 0) {
                        field730 = class161.field2518;
                        field739 = class161.field2583;
                        field752 = class161.field2570;
                    } else {
                        field730 = class161.field2588;
                        field739 = class161.field2456;
                        field752 = class161.field2590;
                    }
                    field749 = class161.field2426;
                    field760 = 1;
                    field755 = 0;
                } else if ((client.field481 & 0x400) == 0) {
                    field730 = class161.field2549;
                    field739 = class161.field2510;
                    field752 = class161.field2438;
                    field760 = 2;
                    field755 = 0;
                } else {
                    field730 = class161.field2416;
                    field739 = class161.field2586;
                    field752 = class161.field2587;
                    field749 = class161.field2426;
                    field760 = 1;
                    field755 = 0;
                }
            }
        } else if (field760 == 1) {
            while (class141.method1()) {
                if (Statics.field2153 == 84) {
                    field730 = class161.field2549;
                    field739 = class161.field2510;
                    field752 = class161.field2438;
                    field760 = 2;
                    field755 = 0;
                } else if (Statics.field2153 == 13) {
                    field760 = 0;
                }
            }
            int var12 = field734 + 180 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field730 = class161.field2549;
                field739 = class161.field2510;
                field752 = class161.field2438;
                field760 = 2;
                field755 = 0;
            }
            int var14 = field734 + 180 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field760 = 0;
            }
        } else if (field760 == 2) {
            short var15 = 231;
            int var38 = var15 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field755 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field755 = 1;
            }
            var38 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method2678(class161.field2617, class161.field2618, class161.field2582);
                field760 = 5;
                return;
            }
            int var17 = field734 + 180 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field759 = field759.trim();
                if (field759.length() == 0) {
                    method2678(class161.field2532, class161.field2485, class161.field2486);
                    return;
                }
                if (field736.length() == 0) {
                    method2678(class161.field2581, class161.field2488, class161.field2489);
                    return;
                }
                method2678(class161.field2627, class161.field2597, class161.field2580);
                field754 = Statics.field163.field127.containsKey(class167.method2711(field759)) ? class163.field2666 : class163.field2659;
                client.method3191(20);
                return;
            }
            int var19 = field734 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field760 = 0;
                field759 = "";
                field736 = "";
                Statics.field233 = 0;
                Statics.field761 = "";
                field750 = true;
            }
            while (true) {
                while (class141.method1()) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field762.length(); var21++) {
                        if (Statics.field1080 == field762.charAt(var21)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (Statics.field2153 == 13) {
                        field760 = 0;
                        field759 = "";
                        field736 = "";
                        Statics.field233 = 0;
                        Statics.field761 = "";
                        field750 = true;
                    } else if (field755 == 0) {
                        if (Statics.field2153 == 85 && field759.length() > 0) {
                            field759 = field759.substring(0, field759.length() - 1);
                        }
                        if (Statics.field2153 == 84 || Statics.field2153 == 80) {
                            field755 = 1;
                        }
                        if (var20 && field759.length() < 320) {
                            field759 = field759 + Statics.field1080;
                        }
                    } else if (field755 == 1) {
                        if (Statics.field2153 == 85 && field736.length() > 0) {
                            field736 = field736.substring(0, field736.length() - 1);
                        }
                        if (Statics.field2153 == 84 || Statics.field2153 == 80) {
                            field755 = 0;
                        }
                        if (Statics.field2153 == 84) {
                            field759 = field759.trim();
                            if (field759.length() == 0) {
                                method2678(class161.field2532, class161.field2485, class161.field2486);
                                return;
                            }
                            if (field736.length() == 0) {
                                method2678(class161.field2581, class161.field2488, class161.field2489);
                                return;
                            }
                            method2678(class161.field2627, class161.field2597, class161.field2580);
                            field754 = Statics.field163.field127.containsKey(class167.method2711(field759)) ? class163.field2666 : class163.field2659;
                            client.method3191(20);
                            return;
                        }
                        if (var20 && field736.length() < 20) {
                            field736 = field736 + Statics.field1080;
                        }
                    }
                }
                return;
            }
        } else if (field760 == 3) {
            int var22 = field734 + 180;
            short var23 = 276;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                field730 = class161.field2549;
                field739 = class161.field2510;
                field752 = class161.field2438;
                field760 = 2;
                field755 = 0;
            }
            int var24 = field734 + 180;
            short var25 = 326;
            if (var5 == 1 && var6 >= var24 - 75 && var6 <= var24 + 75 && var7 >= var25 - 20 && var7 <= var25 + 20) {
                method2678(class161.field2617, class161.field2618, class161.field2582);
                field760 = 5;
                return;
            }
        } else if (field760 == 4) {
            int var26 = field734 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                Statics.field761.trim();
                if (Statics.field761.length() != 6) {
                    method2678(class161.field2403, class161.field2404, class161.field2405);
                    return;
                }
                Statics.field233 = Integer.parseInt(Statics.field761);
                Statics.field761 = "";
                field754 = field750 ? class163.field2663 : class163.field2660;
                method2678(class161.field2627, class161.field2597, class161.field2580);
                client.method3191(20);
                return;
            }
            if (var5 == 1 && var6 >= field734 + 180 - 9 && var6 <= field734 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field750 = !field750;
            }
            if (var5 == 1 && var6 >= field734 + 180 - 34 && var6 <= field734 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var28 = client.method3271("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class142.method2997(var28, true, "openjs", false);
            }
            int var29 = field734 + 180 + 80;
            if (var5 == 1 && var6 >= var29 - 75 && var6 <= var29 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field760 = 0;
                field759 = "";
                field736 = "";
                Statics.field233 = 0;
                Statics.field761 = "";
            }
            while (class141.method1()) {
                boolean var30 = false;
                for (int var31 = 0; var31 < field744.length(); var31++) {
                    if (Statics.field1080 == field744.charAt(var31)) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field2153 == 13) {
                    field760 = 0;
                    field759 = "";
                    field736 = "";
                    Statics.field233 = 0;
                    Statics.field761 = "";
                } else {
                    if (Statics.field2153 == 85 && Statics.field761.length() > 0) {
                        Statics.field761 = Statics.field761.substring(0, Statics.field761.length() - 1);
                    }
                    if (Statics.field2153 == 84) {
                        Statics.field761.trim();
                        if (Statics.field761.length() != 6) {
                            method2678(class161.field2403, class161.field2404, class161.field2405);
                            return;
                        }
                        Statics.field233 = Integer.parseInt(Statics.field761);
                        Statics.field761 = "";
                        field754 = field750 ? class163.field2663 : class163.field2660;
                        method2678(class161.field2627, class161.field2597, class161.field2580);
                        client.method3191(20);
                        return;
                    }
                    if (var30 && Statics.field761.length() < 6) {
                        Statics.field761 = Statics.field761 + Statics.field1080;
                    }
                }
            }
        } else if (field760 == 5) {
            int var32 = field734 + 180 - 80;
            short var33 = 321;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                method2677();
                return;
            }
            int var34 = field734 + 180 + 80;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                field730 = class161.field2549;
                field739 = class161.field2510;
                field752 = class161.field2438;
                field760 = 2;
                field755 = 0;
                field736 = "";
            }
            while (class141.method1()) {
                boolean var35 = false;
                for (int var36 = 0; var36 < field762.length(); var36++) {
                    if (Statics.field1080 == field762.charAt(var36)) {
                        var35 = true;
                        break;
                    }
                }
                if (Statics.field2153 == 13) {
                    field730 = class161.field2549;
                    field739 = class161.field2510;
                    field752 = class161.field2438;
                    field760 = 2;
                    field755 = 0;
                    field736 = "";
                } else {
                    if (Statics.field2153 == 85 && field759.length() > 0) {
                        field759 = field759.substring(0, field759.length() - 1);
                    }
                    if (Statics.field2153 == 84) {
                        method2677();
                        return;
                    }
                    if (var35 && field759.length() < 320) {
                        field759 = field759 + Statics.field1080;
                    }
                }
            }
        } else if (field760 == 6) {
            while (true) {
                do {
                    if (!class141.method1()) {
                        short var37 = 321;
                        if (var5 == 1 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                            field730 = class161.field2549;
                            field739 = class161.field2510;
                            field752 = class161.field2438;
                            field760 = 2;
                            field755 = 0;
                            field736 = "";
                        }
                        return;
                    }
                } while (Statics.field2153 != 84 && Statics.field2153 != 13);
                field730 = class161.field2549;
                field739 = class161.field2510;
                field752 = class161.field2438;
                field760 = 2;
                field755 = 0;
                field736 = "";
            }
        }
    }

    @ObfuscatedName("dt.g(I)V")
    public static void method2677() {
        field759 = field759.trim();
        if (field759.length() == 0) {
            method2678(class161.field2617, class161.field2618, class161.field2582);
            return;
        }
        long var0 = class10.method560();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field759;
            Random var4 = new Random();
            class123 var5 = new class123(128);
            class123 var6 = new class123(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2399(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2402(var4.nextInt());
            }
            var5.method2402(var7[0]);
            var5.method2402(var7[1]);
            var5.method2404(var0);
            var5.method2404(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2402(var4.nextInt());
            }
            var5.method2515(class10.field142, class10.field143);
            var6.method2399(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2402(var4.nextInt());
            }
            var6.method2404(var4.nextLong());
            var6.method2403(var4.nextLong());
            class153.method2704(var6);
            var6.method2404(var4.nextLong());
            var6.method2515(class10.field142, class10.field143);
            int var11 = class123.method1584(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class123 var12 = new class123(var11);
            var12.method2405(var3);
            var12.field2046 = var11;
            var12.method2430(var7);
            class123 var13 = new class123(var12.field2046 + var6.field2046 + var5.field2046 + 5);
            var13.method2399(2);
            var13.method2399(var5.field2046);
            var13.method2584(var5.field2048, 0, var5.field2046);
            var13.method2399(var6.field2046);
            var13.method2584(var6.field2048, 0, var6.field2046);
            var13.method2400(var12.field2046);
            var13.method2584(var12.field2048, 0, var12.field2046);
            byte[] var14 = var13.field2048;
            int var15 = var14.length;
            StringBuilder var16 = new StringBuilder();
            for (int var17 = 0; var17 < var15; var17 += 3) {
                int var18 = var14[var17] & 0xFF;
                var16.append(class165.field2703[var18 >>> 2]);
                if (var17 < var15 - 1) {
                    int var19 = var14[var17 + 1] & 0xFF;
                    var16.append(class165.field2703[(var18 & 0x3) << 4 | var19 >>> 4]);
                    if (var17 < var15 - 2) {
                        int var20 = var14[var17 + 2] & 0xFF;
                        var16.append(class165.field2703[(var19 & 0xF) << 2 | var20 >>> 6]).append(class165.field2703[var20 & 0x3F]);
                    } else {
                        var16.append(class165.field2703[(var19 & 0xF) << 2]).append("=");
                    }
                } else {
                    var16.append(class165.field2703[(var18 & 0x3) << 4]).append("==");
                }
            }
            String var21 = var16.toString();
            String var23 = var21;
            byte var30;
            try {
                URL var24 = new URL(client.method3271("services", false) + "m=accountappeal/login.ws");
                URLConnection var25 = var24.openConnection();
                var25.setDoInput(true);
                var25.setDoOutput(true);
                var25.setConnectTimeout(5000);
                OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
                var26.write("data2=" + class230.method2985(var23) + "&dest=" + class230.method2985("passwordchoice.ws"));
                var26.flush();
                InputStream var27 = var25.getInputStream();
                class123 var28 = new class123(new byte[1000]);
                while (true) {
                    int var29 = var27.read(var28.field2048, var28.field2046, 1000 - var28.field2046);
                    if (var29 == -1) {
                        var26.close();
                        var27.close();
                        String var31 = new String(var28.field2048);
                        if (var31.startsWith("OFFLINE")) {
                            var30 = 4;
                        } else if (var31.startsWith("WRONG")) {
                            var30 = 7;
                        } else if (var31.startsWith("RELOAD")) {
                            var30 = 3;
                        } else if (var31.startsWith("Not permitted for social network accounts.")) {
                            var30 = 6;
                        } else {
                            var28.method2512(var7);
                            while (var28.field2046 > 0 && var28.field2048[var28.field2046 - 1] == 0) {
                                var28.field2046--;
                            }
                            String var32 = new String(var28.field2048, 0, var28.field2046);
                            boolean var33;
                            if (var32 == null) {
                                var33 = false;
                            } else {
                                label103: {
                                    try {
                                        new URL(var32);
                                    } catch (MalformedURLException var36) {
                                        var33 = false;
                                        break label103;
                                    }
                                    var33 = true;
                                }
                            }
                            if (var33) {
                                class142.method2997(var32, true, "openjs", false);
                                var30 = 2;
                            } else {
                                var30 = 5;
                            }
                        }
                        break;
                    }
                    var28.field2046 += var29;
                    if (var28.field2046 >= 1000) {
                        var30 = 5;
                        break;
                    }
                }
            } catch (Throwable var37) {
                var37.printStackTrace();
                var30 = 5;
            }
            var2 = var30;
        }
        switch(var2) {
            case 2:
                method2678(class161.field2620, class161.field2621, class161.field2622);
                field760 = 6;
                break;
            case 3:
                method2678(class161.field2440, class161.field2624, class161.field2625);
                break;
            case 4:
                method2678(class161.field2626, class161.field2630, class161.field2540);
                break;
            case 5:
                method2678(class161.field2629, class161.field2644, class161.field2400);
                break;
            case 6:
                method2678(class161.field2632, class161.field2633, class161.field2555);
                break;
            case 7:
                method2678(class161.field2635, class161.field2636, class161.field2637);
        }
    }

    @ObfuscatedName("ew.l(Lhm;Lhm;Lhm;ZI)V")
    public static void method2863(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field731 = (Statics.field175 - client.field486) / 2;
            field734 = field731 + 202;
        }
        if (field729) {
            method649(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3055.method1690(field731, 0);
            Statics.field2200.method1690(field731 + 382, 0);
            Statics.field699.method1838(field731 + 382 - Statics.field699.field1501 / 2, 18);
        }
        if (client.field281 == 0 || client.field281 == 5) {
            byte var4 = 20;
            arg0.method3855(class161.field2577, field734 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class83.method1770(field734 + 180 - 152, var5, 304, 34, 9179409);
            class83.method1770(field734 + 180 - 151, var5 + 1, 302, 32, 0);
            class83.method1772(field734 + 180 - 150, var5 + 2, field748 * 3, 30, 9179409);
            class83.method1772(field748 * 3 + (field734 + 180 - 150), var5 + 2, 300 - field748 * 3, 30, 0);
            arg0.method3855(field747, field734 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field281 == 20) {
            Statics.field746.method1838(field734 + 180 - Statics.field746.field1501 / 2, 271 - Statics.field746.field1498 / 2);
            short var6 = 211;
            arg0.method3855(field730, field734 + 180, var6, 16776960, 0);
            int var130 = var6 + 15;
            arg0.method3855(field739, field734 + 180, var130, 16776960, 0);
            int var131 = var130 + 15;
            arg0.method3855(field752, field734 + 180, var131, 16776960, 0);
            int var132 = var131 + 15;
            int var133 = var132 + 10;
            if (field760 != 4) {
                arg0.method3838(class161.field2599, field734 + 180 - 110, var133, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field759; arg0.method3833(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3838(class227.method3837(var8), field734 + 180 - 70, var133, 16777215, 0);
                var130 = var133 + 15;
                String var10 = class161.field2600;
                String var11 = field736;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3838(var10 + var15, field734 + 180 - 108, var130, 16777215, 0);
                var130 += 15;
            }
        }
        if (client.field281 == 10 || client.field281 == 11) {
            Statics.field746.method1838(field734, 171);
            if (field760 == 0) {
                short var17 = 251;
                arg0.method3855(class161.field2550, field734 + 180, var17, 16776960, 0);
                int var134 = var17 + 30;
                int var18 = field734 + 180 - 80;
                short var19 = 291;
                Statics.field732.method1838(var18 - 73, var19 - 20);
                arg0.method3845(class161.field2424, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field734 + 180 + 80;
                Statics.field732.method1838(var20 - 73, var19 - 20);
                arg0.method3845(class161.field2445, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field760 == 1) {
                arg0.method3855(field749, field734 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3855(field730, field734 + 180, var21, 16777215, 0);
                int var135 = var21 + 15;
                arg0.method3855(field739, field734 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                arg0.method3855(field752, field734 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                int var22 = field734 + 180 - 80;
                short var23 = 321;
                Statics.field732.method1838(var22 - 73, var23 - 20);
                arg0.method3855(class161.field2564, var22, var23 + 5, 16777215, 0);
                int var24 = field734 + 180 + 80;
                Statics.field732.method1838(var24 - 73, var23 - 20);
                arg0.method3855(class161.field2443, var24, var23 + 5, 16777215, 0);
            } else if (field760 == 2) {
                short var25 = 211;
                arg0.method3855(field730, field734 + 180, var25, 16776960, 0);
                int var138 = var25 + 15;
                arg0.method3855(field739, field734 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method3855(field752, field734 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var141 = var140 + 10;
                arg0.method3838(class161.field2599, field734 + 180 - 110, var141, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field759; arg0.method3833(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3838(class227.method3837(var27) + (field755 == 0 & client.field283 % 40 < 20 ? class2.method1062(16776960) + class2.field34 : ""), field734 + 180 - 70, var141, 16777215, 0);
                var138 = var141 + 15;
                String var29 = class161.field2600;
                String var30 = field736;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3838(var29 + var34 + (field755 == 1 & client.field283 % 40 < 20 ? class2.method1062(16776960) + class2.field34 : ""), field734 + 180 - 108, var138, 16777215, 0);
                var138 += 15;
                int var36 = field734 + 180 - 80;
                short var37 = 321;
                Statics.field732.method1838(var36 - 73, var37 - 20);
                arg0.method3855(class161.field2605, var36, var37 + 5, 16777215, 0);
                int var38 = field734 + 180 + 80;
                Statics.field732.method1838(var38 - 73, var37 - 20);
                arg0.method3855(class161.field2443, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3855(class161.field2479, field734 + 180, var39, 16776960, 0);
            } else if (field760 == 3) {
                short var40 = 201;
                arg0.method3855(class161.field2607, field734 + 180, var40, 16776960, 0);
                int var142 = var40 + 20;
                arg1.method3855(class161.field2608, field734 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg1.method3855(class161.field2609, field734 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var41 = field734 + 180;
                short var42 = 276;
                Statics.field732.method1838(var41 - 73, var42 - 20);
                arg2.method3855(class161.field2370, var41, var42 + 5, 16777215, 0);
                int var43 = field734 + 180;
                short var44 = 326;
                Statics.field732.method1838(var43 - 73, var44 - 20);
                arg2.method3855(class161.field2615, var43, var44 + 5, 16777215, 0);
            } else if (field760 == 4) {
                arg0.method3855(class161.field2439, field734 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3855(field730, field734 + 180, var45, 16777215, 0);
                int var145 = var45 + 15;
                arg0.method3855(field739, field734 + 180, var145, 16777215, 0);
                int var146 = var145 + 15;
                arg0.method3855(field752, field734 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                String var47 = class161.field2601;
                String var48 = Statics.field761;
                int var49 = var48.length();
                char[] var50 = new char[var49];
                for (int var51 = 0; var51 < var49; var51++) {
                    var50[var51] = '*';
                }
                String var52 = new String(var50);
                arg0.method3838(var47 + var52 + (client.field283 % 40 < 20 ? class2.method1062(16776960) + class2.field34 : ""), field734 + 180 - 108, var147, 16777215, 0);
                var145 = var147 - 8;
                arg0.method3838(class161.field2487, field734 + 180 - 9, var145, 16776960, 0);
                var145 += 15;
                arg0.method3838(class161.field2378, field734 + 180 - 9, var145, 16776960, 0);
                int var54 = field734 + 180 - 9 + arg0.method3833(class161.field2378) + 15;
                int var55 = var145 - arg0.field3238;
                class84 var56;
                if (field750) {
                    var56 = Statics.field697;
                } else {
                    var56 = Statics.field733;
                }
                var56.method1838(var54, var55);
                var145 += 15;
                int var57 = field734 + 180 - 80;
                short var58 = 321;
                Statics.field732.method1838(var57 - 73, var58 - 20);
                arg0.method3855(class161.field2564, var57, var58 + 5, 16777215, 0);
                int var59 = field734 + 180 + 80;
                Statics.field732.method1838(var59 - 73, var58 - 20);
                arg0.method3855(class161.field2443, var59, var58 + 5, 16777215, 0);
                arg1.method3855(class161.field2377, field734 + 180, var58 + 36, 255, 0);
            } else if (field760 == 5) {
                arg0.method3855(class161.field2613, field734 + 180, 201, 16776960, 0);
                short var60 = 221;
                arg2.method3855(field730, field734 + 180, var60, 16776960, 0);
                int var148 = var60 + 15;
                arg2.method3855(field739, field734 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg2.method3855(field752, field734 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var151 = var150 + 14;
                arg0.method3838(class161.field2503, field734 + 180 - 145, var151, 16777215, 0);
                short var61 = 174;
                String var62;
                for (var62 = field759; arg0.method3833(var62) > var61; var62 = var62.substring(1)) {
                }
                arg0.method3838(class227.method3837(var62) + (client.field283 % 40 < 20 ? class2.method1062(16776960) + class2.field34 : ""), field734 + 180 - 34, var151, 16777215, 0);
                var148 = var151 + 15;
                int var63 = field734 + 180 - 80;
                short var64 = 321;
                Statics.field732.method1838(var63 - 73, var64 - 20);
                arg0.method3855(class161.field2508, var63, var64 + 5, 16777215, 0);
                int var65 = field734 + 180 + 80;
                Statics.field732.method1838(var65 - 73, var64 - 20);
                arg0.method3855(class161.field2478, var65, var64 + 5, 16777215, 0);
            } else if (field760 == 6) {
                short var66 = 211;
                arg0.method3855(field730, field734 + 180, var66, 16776960, 0);
                int var152 = var66 + 15;
                arg0.method3855(field739, field734 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                arg0.method3855(field752, field734 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                int var67 = field734 + 180;
                short var68 = 321;
                Statics.field732.method1838(var67 - 73, var68 - 20);
                arg0.method3855(class161.field2478, var67, var68 + 5, 16777215, 0);
            }
        }
        if (field751 > 0) {
            int var69 = field751;
            short var70 = 256;
            field742 += var69 * 128;
            if (field742 > Statics.field740.length) {
                field742 -= Statics.field740.length;
                int var71 = (int) (Math.random() * 12.0D);
                method2758(Statics.field1422[var71]);
            }
            int var72 = 0;
            int var73 = var69 * 128;
            int var74 = (var70 - var69) * 128;
            for (int var75 = 0; var75 < var74; var75++) {
                int var76 = Statics.field1065[var72 + var73] - Statics.field740[field742 + var72 & Statics.field740.length - 1] * var69 / 6;
                if (var76 < 0) {
                    var76 = 0;
                }
                Statics.field1065[var72++] = var76;
            }
            for (int var77 = var70 - var69; var77 < var70; var77++) {
                int var78 = var77 * 128;
                for (int var79 = 0; var79 < 128; var79++) {
                    int var80 = (int) (Math.random() * 100.0D);
                    if (var80 < 50 && var79 > 10 && var79 < 118) {
                        Statics.field1065[var78 + var79] = 255;
                    } else {
                        Statics.field1065[var78 + var79] = 0;
                    }
                }
            }
            if (field738 > 0) {
                field738 -= var69 * 4;
            }
            if (field753 > 0) {
                field753 -= var69 * 4;
            }
            if (field738 == 0 && field753 == 0) {
                int var81 = (int) (Math.random() * (double) (2000 / var69));
                if (var81 == 0) {
                    field738 = 1024;
                }
                if (var81 == 1) {
                    field753 = 1024;
                }
            }
            for (int var82 = 0; var82 < var70 - var69; var82++) {
                field758[var82] = field758[var69 + var82];
            }
            for (int var83 = var70 - var69; var83 < var70; var83++) {
                field758[var83] = (int) (Math.sin((double) field745 / 14.0D) * 16.0D + Math.sin((double) field745 / 15.0D) * 14.0D + Math.sin((double) field745 / 16.0D) * 12.0D);
                field745++;
            }
            field743 += var69 * -757072297;
            int var84 = ((client.field283 & 0x1) + var69) / 2;
            if (var84 > 0) {
                for (int var85 = 0; var85 < field743 * -1799603140; var85++) {
                    int var86 = (int) (Math.random() * 124.0D) + 2;
                    int var87 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1065[(var87 << 7) + var86] = 192;
                }
                field743 = 0;
                int var88 = 0;
                label328: while (true) {
                    if (var88 >= var70) {
                        int var92 = 0;
                        while (true) {
                            if (var92 >= 128) {
                                break label328;
                            }
                            int var93 = 0;
                            for (int var94 = -var84; var94 < var70; var94++) {
                                int var95 = var94 * 128;
                                if (var84 + var94 < var70) {
                                    var93 += Statics.field741[var84 * 128 + var92 + var95];
                                }
                                if (var94 - (var84 + 1) >= 0) {
                                    var93 -= Statics.field741[var92 + var95 - (var84 + 1) * 128];
                                }
                                if (var94 >= 0) {
                                    Statics.field1065[var92 + var95] = var93 / (var84 * 2 + 1);
                                }
                            }
                            var92++;
                        }
                    }
                    int var89 = 0;
                    int var90 = var88 * 128;
                    for (int var91 = -var84; var91 < 128; var91++) {
                        if (var84 + var91 < 128) {
                            var89 += Statics.field1065[var90 + var91 + var84];
                        }
                        if (var91 - (var84 + 1) >= 0) {
                            var89 -= Statics.field1065[var90 + var91 - (var84 + 1)];
                        }
                        if (var91 >= 0) {
                            Statics.field741[var90 + var91] = var89 / (var84 * 2 + 1);
                        }
                    }
                    var88++;
                }
            }
            field751 = 0;
        }
        short var96 = 256;
        if (field738 > 0) {
            for (int var97 = 0; var97 < 256; var97++) {
                if (field738 > 768) {
                    Statics.field2105[var97] = method2335(Statics.field756[var97], Statics.field737[var97], 1024 - field738);
                } else if (field738 > 256) {
                    Statics.field2105[var97] = Statics.field737[var97];
                } else {
                    Statics.field2105[var97] = method2335(Statics.field737[var97], Statics.field756[var97], 256 - field738);
                }
            }
        } else if (field753 > 0) {
            for (int var98 = 0; var98 < 256; var98++) {
                if (field753 > 768) {
                    Statics.field2105[var98] = method2335(Statics.field756[var98], Statics.field1695[var98], 1024 - field753);
                } else if (field753 > 256) {
                    Statics.field2105[var98] = Statics.field1695[var98];
                } else {
                    Statics.field2105[var98] = method2335(Statics.field1695[var98], Statics.field756[var98], 256 - field753);
                }
            }
        } else {
            for (int var99 = 0; var99 < 256; var99++) {
                Statics.field2105[var99] = Statics.field756[var99];
            }
        }
        class83.method1767(field731, 9, field731 + 128, var96 + 7);
        Statics.field3055.method1690(field731, 0);
        class83.method1766();
        int var100 = 0;
        int var101 = field731 + Statics.field1455.field1469 * 9;
        for (int var102 = 1; var102 < var96 - 1; var102++) {
            int var103 = (var96 - var102) * field758[var102] / var96;
            int var104 = var103 + 22;
            if (var104 < 0) {
                var104 = 0;
            }
            var100 += var104;
            for (int var105 = var104; var105 < 128; var105++) {
                int var106 = Statics.field1065[var100++];
                if (var106 == 0) {
                    var101++;
                } else {
                    int var108 = 256 - var106;
                    int var109 = Statics.field2105[var106];
                    int var110 = Statics.field1455.field1468[var101];
                    Statics.field1455.field1468[var101++] = ((var109 & 0xFF00FF) * var106 + (var110 & 0xFF00FF) * var108 & 0xFF00FF00) + ((var109 & 0xFF00) * var106 + (var110 & 0xFF00) * var108 & 0xFF0000) >> 8;
                }
            }
            var101 += Statics.field1455.field1469 + var104 - 128;
        }
        class83.method1767(field731 + 765 - 128, 9, field731 + 765, var96 + 7);
        Statics.field2200.method1690(field731 + 382, 0);
        class83.method1766();
        int var111 = 0;
        int var112 = field731 + Statics.field1455.field1469 * 9 + 24 + 637;
        for (int var113 = 1; var113 < var96 - 1; var113++) {
            int var114 = (var96 - var113) * field758[var113] / var96;
            int var115 = 103 - var114;
            int var116 = var112 + var114;
            for (int var117 = 0; var117 < var115; var117++) {
                int var118 = Statics.field1065[var111++];
                if (var118 == 0) {
                    var116++;
                } else {
                    int var120 = 256 - var118;
                    int var121 = Statics.field2105[var118];
                    int var122 = Statics.field1455.field1468[var116];
                    Statics.field1455.field1468[var116++] = ((var121 & 0xFF00FF) * var118 + (var122 & 0xFF00FF) * var120 & 0xFF00FF00) + ((var121 & 0xFF00) * var118 + (var122 & 0xFF00) * var120 & 0xFF0000) >> 8;
                }
            }
            var111 += 128 - var115;
            var112 = Statics.field1455.field1469 - var115 - var114 + var116;
        }
        Statics.field685[Statics.field163.field133 ? 1 : 0].method1838(field731 + 765 - 40, 463);
        if (client.field281 > 5 && client.field534 == 0) {
            if (Statics.field640 == null) {
                Statics.field640 = class80.method1849(Statics.field994, "sl_button", "");
            } else {
                int var123 = field731 + 5;
                short var124 = 463;
                byte var125 = 100;
                byte var126 = 35;
                Statics.field640.method1838(var123, var124);
                arg0.method3855(class161.field2634 + " " + client.field273, var125 / 2 + var123, var126 / 2 + var124 - 2, 16777215, 0);
                if (Statics.field3229 == null) {
                    arg1.method3855(class161.field2484, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
                } else {
                    arg1.method3855(class161.field2647, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var127 = Statics.field1966.getGraphics();
            Statics.field1455.method1597(var127, 0, 0);
        } catch (Exception var129) {
            Statics.field1966.repaint();
        }
    }

    @ObfuscatedName("dt.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2678(String arg0, String arg1, String arg2) {
        field730 = arg0;
        field739 = arg1;
        field752 = arg2;
    }

    @ObfuscatedName("ei.r(Lcf;I)V")
    public static final void method2758(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field740.length; var2++) {
            Statics.field740[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field740[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1673[var8] = (Statics.field740[var8 - 1] + Statics.field740[var8 + 1] + Statics.field740[var8 - 128] + Statics.field740[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field740;
            Statics.field740 = Statics.field1673;
            Statics.field1673 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1498; var11++) {
            for (int var12 = 0; var12 < arg0.field1501; var12++) {
                if (arg0.field1495[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1499;
                    int var14 = var11 + 16 + arg0.field1500;
                    int var15 = (var14 << 7) + var13;
                    Statics.field740[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dw.x(IIIB)I")
    public static final int method2335(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ab.k(Lhm;Lhm;B)V")
    public static void method649(class228 arg0, class228 arg1) {
        if (Statics.field1700 == null) {
            Statics.field1700 = class80.method1302(Statics.field994, "sl_back", "");
        }
        if (Statics.field2272 == null) {
            Statics.field2272 = class80.method117(Statics.field994, "sl_flags", "");
        }
        if (Statics.field1611 == null) {
            Statics.field1611 = class80.method117(Statics.field994, "sl_arrows", "");
        }
        if (Statics.field70 == null) {
            Statics.field70 = class80.method117(Statics.field994, "sl_stars", "");
        }
        class83.method1772(field731, 23, 765, 480, 0);
        class83.method1777(field731, 0, 125, 23, 12425273, 9135624);
        class83.method1777(field731 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3855(class161.field2638, field731 + 62, 15, 0, -1);
        if (Statics.field70 != null) {
            Statics.field70[1].method1838(field731 + 140, 1);
            arg1.method3838(class161.field2639, field731 + 152, 10, 16777215, -1);
            Statics.field70[0].method1838(field731 + 140, 12);
            arg1.method3838(class161.field2640, field731 + 152, 21, 16777215, -1);
        }
        if (Statics.field1611 != null) {
            int var2 = field731 + 280;
            if (class28.field650[0] == 0 && class28.field649[0] == 0) {
                Statics.field1611[2].method1838(var2, 4);
            } else {
                Statics.field1611[0].method1838(var2, 4);
            }
            if (class28.field650[0] == 0 && class28.field649[0] == 1) {
                Statics.field1611[3].method1838(var2 + 15, 4);
            } else {
                Statics.field1611[1].method1838(var2 + 15, 4);
            }
            arg0.method3838(class161.field2401, var2 + 32, 17, 16777215, -1);
            int var3 = field731 + 390;
            if (class28.field650[0] == 1 && class28.field649[0] == 0) {
                Statics.field1611[2].method1838(var3, 4);
            } else {
                Statics.field1611[0].method1838(var3, 4);
            }
            if (class28.field650[0] == 1 && class28.field649[0] == 1) {
                Statics.field1611[3].method1838(var3 + 15, 4);
            } else {
                Statics.field1611[1].method1838(var3 + 15, 4);
            }
            arg0.method3838(class161.field2642, var3 + 32, 17, 16777215, -1);
            int var4 = field731 + 500;
            if (class28.field650[0] == 2 && class28.field649[0] == 0) {
                Statics.field1611[2].method1838(var4, 4);
            } else {
                Statics.field1611[0].method1838(var4, 4);
            }
            if (class28.field650[0] == 2 && class28.field649[0] == 1) {
                Statics.field1611[3].method1838(var4 + 15, 4);
            } else {
                Statics.field1611[1].method1838(var4 + 15, 4);
            }
            arg0.method3838(class161.field2561, var4 + 32, 17, 16777215, -1);
            int var5 = field731 + 610;
            if (class28.field650[0] == 3 && class28.field649[0] == 0) {
                Statics.field1611[2].method1838(var5, 4);
            } else {
                Statics.field1611[0].method1838(var5, 4);
            }
            if (class28.field650[0] == 3 && class28.field649[0] == 1) {
                Statics.field1611[3].method1838(var5 + 15, 4);
            } else {
                Statics.field1611[1].method1838(var5 + 15, 4);
            }
            arg0.method3838(class161.field2612, var5 + 32, 17, 16777215, -1);
        }
        class83.method1772(field731 + 708, 4, 50, 16, 0);
        arg1.method3855(class161.field2443, field731 + 708 + 25, 16, 16777215, -1);
        field735 = -1;
        if (Statics.field1700 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field647) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field647) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field647) {
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
            int var17 = field731 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field647; var20++) {
                class28 var21 = Statics.field3211[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field653);
                if (var21.field653 == -1) {
                    var23 = class161.field2645;
                    var22 = false;
                } else if (var21.field653 > 1980) {
                    var23 = class161.field2646;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method621()) {
                    if (var21.method605()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method613()) {
                    var24 = 16711680;
                    if (var21.method605()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method607()) {
                    if (var21.method605()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method605()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class144.field2214 >= var17 && class144.field2215 * 148505657 >= var16 && class144.field2214 < var6 + var17 && class144.field2215 * 148505657 < var7 + var16 && var22) {
                    field735 = var20;
                    Statics.field1700[var25].method1699(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1700[var25].method1690(var17, var16);
                }
                if (Statics.field2272 != null) {
                    Statics.field2272[(var21.method605() ? 8 : 0) + var21.field656].method1838(var17 + 29, var16);
                }
                arg0.method3855(Integer.toString(var21.field651), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3855(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3833(Statics.field3211[field735].field646) + 6;
                int var27 = arg1.field3238 + 8;
                class83.method1772(class144.field2214 - var26 / 2, class144.field2215 * 148505657 + 20 + 5, var26, var27, 16777120);
                class83.method1770(class144.field2214 - var26 / 2, class144.field2215 * 148505657 + 20 + 5, var26, var27, 0);
                arg1.method3855(Statics.field3211[field735].field646, class144.field2214, class144.field2215 * 148505657 + 20 + 5 + arg1.field3238 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1966.getGraphics();
            Statics.field1455.method1597(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1966.repaint();
        }
    }

    @ObfuscatedName("aq.v(Lez;B)V")
    public static void method723(class148 arg0) {
        if (class144.field2225 != 1 && Statics.field236 || class144.field2225 != 4) {
            return;
        }
        int var1 = field731 + 280;
        if (class144.field2221 >= var1 && class144.field2221 <= var1 + 14 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(0, 0);
            return;
        }
        if (class144.field2221 >= var1 + 15 && class144.field2221 <= var1 + 80 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(0, 1);
            return;
        }
        int var2 = field731 + 390;
        if (class144.field2221 >= var2 && class144.field2221 <= var2 + 14 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(1, 0);
            return;
        }
        if (class144.field2221 >= var2 + 15 && class144.field2221 <= var2 + 80 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(1, 1);
            return;
        }
        int var3 = field731 + 500;
        if (class144.field2221 >= var3 && class144.field2221 <= var3 + 14 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(2, 0);
            return;
        }
        if (class144.field2221 >= var3 + 15 && class144.field2221 <= var3 + 80 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(2, 1);
            return;
        }
        int var4 = field731 + 610;
        if (class144.field2221 >= var4 && class144.field2221 <= var4 + 14 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(3, 0);
            return;
        }
        if (class144.field2221 >= var4 + 15 && class144.field2221 <= var4 + 80 && class144.field2223 >= 4 && class144.field2223 <= 18) {
            Statics.method944(3, 1);
            return;
        }
        if (class144.field2221 >= field731 + 708 && class144.field2223 >= 4 && class144.field2221 <= field731 + 708 + 50 && class144.field2223 <= 20) {
            field729 = false;
            Statics.field3055.method1690(field731, 0);
            Statics.field2200.method1690(field731 + 382, 0);
            Statics.field699.method1838(field731 + 382 - Statics.field699.field1501 / 2, 18);
            return;
        }
        if (field735 == -1) {
            return;
        }
        class28 var5 = Statics.field3211[field735];
        method2869(var5);
        field729 = false;
        Statics.field3055.method1690(field731, 0);
        Statics.field2200.method1690(field731 + 382, 0);
        Statics.field699.method1838(field731 + 382 - Statics.field699.field1501 / 2, 18);
        return;
    }

    @ObfuscatedName("ev.h(Lan;I)V")
    public static void method2869(class28 arg0) {
        if (arg0.method605() != client.field277) {
            client.field277 = arg0.method605();
            boolean var1 = arg0.method605();
            if (Statics.field1176 != var1) {
                class56.method142();
                Statics.field1176 = var1;
            }
        }
        Statics.field2061 = arg0.field655;
        client.field273 = arg0.field651;
        client.field481 = arg0.field652;
        Statics.field2020 = client.field276 == 0 ? 43594 : arg0.field651 + 40000;
        Statics.field7 = client.field276 == 0 ? 443 : arg0.field651 + 50000;
        Statics.field992 = Statics.field2020;
    }
}

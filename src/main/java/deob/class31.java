package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("an")
public class class31 {

    @ObfuscatedName("an.y")
    public static int field715 = 0;

    @ObfuscatedName("an.t")
    public static int field726 = field715 + 202;

    @ObfuscatedName("an.s")
    public static int[] field727 = new int[256];

    @ObfuscatedName("an.x")
    public static int field716 = 0;

    @ObfuscatedName("an.q")
    public static int field719 = 0;

    @ObfuscatedName("an.aa")
    public static int field753 = 0;

    @ObfuscatedName("an.ak")
    public static int field733 = 0;

    @ObfuscatedName("an.an")
    public static int field734 = 0;

    @ObfuscatedName("an.ad")
    public static int field748 = 0;

    @ObfuscatedName("an.ap")
    public static int field736 = 10;

    @ObfuscatedName("an.ag")
    public static String field737 = "";

    @ObfuscatedName("an.aj")
    public static int field741 = 0;

    @ObfuscatedName("an.av")
    public static String field739 = "";

    @ObfuscatedName("an.ar")
    public static String field728 = "";

    @ObfuscatedName("an.ab")
    public static String field745 = "";

    @ObfuscatedName("an.ai")
    public static String field742 = "";

    @ObfuscatedName("an.ae")
    public static String field743 = "";

    @ObfuscatedName("an.ax")
    public static class153 field746 = class153.field2511;

    @ObfuscatedName("an.al")
    public static boolean field735 = true;

    @ObfuscatedName("an.az")
    public static int field729 = 0;

    @ObfuscatedName("an.as")
    public static String field747 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.am")
    public static String field730 = "1234567890";

    @ObfuscatedName("an.ao")
    public static boolean field749 = false;

    @ObfuscatedName("an.bd")
    public static int field751 = -1;

    public class31() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.j(B)I")
    public static int method1019() {
        return 8;
    }

    @ObfuscatedName("ac.y(Ljava/awt/Component;Lfh;Lfh;ZIS)V")
    public static void method916(Component arg0, class161 arg1, class161 arg2, boolean arg3, int arg4) {
        if (!Statics.field754) {
            field741 = arg4;
            class78.method1729();
            byte[] var5 = arg1.method2996("title.jpg", "");
            Statics.field738 = new class77(var5, arg0);
            Statics.field720 = Statics.field738.method1629();
            Statics.field721 = class75.method693(arg2, "logo", "");
            Statics.field740 = class75.method693(arg2, "titlebox", "");
            Statics.field717 = class75.method693(arg2, "titlebutton", "");
            Statics.field718 = class75.method172(arg2, "runes", "");
            Statics.field679 = class75.method172(arg2, "title_mute", "");
            Statics.field2208 = class75.method693(arg2, "options_radio_buttons,0", "");
            Statics.field722 = class75.method693(arg2, "options_radio_buttons,2", "");
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
            Statics.field71 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field71[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field71[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field71[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field71[var13 + 192] = 16777215;
            }
            Statics.field1070 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1070[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1070[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1070[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1070[var17 + 192] = 16777215;
            }
            Statics.field1738 = new int[256];
            Statics.field695 = new int[32768];
            Statics.field163 = new int[32768];
            method963((class79) null);
            Statics.field225 = new int[32768];
            Statics.field731 = new int[32768];
            if (arg3) {
                field742 = "";
                field743 = "";
            }
            Statics.field1995 = 0;
            Statics.field80 = "";
            field735 = true;
            field749 = false;
            if (Statics.field1870.field146) {
                class177.method2886(2);
            } else {
                class162 var18 = Statics.field677;
                int var19 = var18.method2994("scape main");
                int var20 = var18.method3011(var19, "");
                class177.method570(2, var18, var19, var20, 255, false);
            }
            class165.method2766(false);
            Statics.field754 = true;
            field715 = (Statics.field2066 - client.field389 * 765) / 2;
            field726 = field715 + 202;
            Statics.field738.method1667(field715, 0);
            Statics.field720.method1667(field715 + 382, 0);
            Statics.field721.method1769(field715 + 382 - Statics.field721.field1391 / 2, 18);
        } else if (arg4 == 4) {
            field741 = 4;
        }
    }

    @ObfuscatedName("dm.z(Leb;B)V")
    public static void method2569(class139 arg0) {
        if (field749) {
            method96(arg0);
            return;
        }
        if ((class135.field2043 == 1 || !Statics.field1352 && class135.field2043 == 4) && class135.field2052 >= field715 + 765 - 50 && class135.field2048 >= 453) {
            Statics.field1870.field146 = !Statics.field1870.field146;
            Statics.method2571();
            if (Statics.field1870.field146) {
                class177.method2070();
            } else {
                class177.method1793(Statics.field677, "scape main", "", 255, false);
            }
        }
        if (client.field310 == 5) {
            return;
        }
        field734++;
        if (client.field310 != 10 && client.field310 != 11) {
            return;
        }
        if (client.field376 == 0) {
            if (class135.field2043 == 1 || !Statics.field1352 && class135.field2043 == 4) {
                int var1 = field715 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class135.field2052 >= var1 && class135.field2052 <= var1 + var3 && class135.field2048 >= var2 && class135.field2048 <= var2 + var4) {
                    if (class25.method3301()) {
                        field749 = true;
                    }
                    return;
                }
            }
            if (Statics.field1072 != null && class25.method3301()) {
                field749 = true;
            }
        }
        int var5 = class135.field2043;
        int var6 = class135.field2052;
        int var7 = class135.field2048;
        if (!Statics.field1352 && var5 == 4) {
            var5 = 1;
        }
        if (field741 == 0) {
            int var8 = field726 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                label585: {
                    String var10 = client.method643("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var10));
                            break label585;
                        } catch (Exception var36) {
                        }
                    }
                    if (class133.field2021.startsWith("win")) {
                        class133.method149(var10, 0, "openjs");
                    } else if (class133.field2021.startsWith("mac")) {
                        class133.method149(var10, 1, "openjs");
                    } else {
                        class133.method149(var10, 2, "openjs");
                    }
                }
            }
            int var12 = field726 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field302 & 0x4) != 0) {
                    if ((client.field302 & 0x400) == 0) {
                        field739 = class151.field2444;
                        field728 = class151.field2445;
                        field745 = class151.field2446;
                    } else {
                        field739 = class151.field2450;
                        field728 = class151.field2249;
                        field745 = class151.field2277;
                    }
                    field741 = 1;
                    field729 = 0;
                } else if ((client.field302 & 0x400) == 0) {
                    field739 = class151.field2440;
                    field728 = class151.field2441;
                    field745 = class151.field2235;
                    field741 = 2;
                    field729 = 0;
                } else {
                    field739 = class151.field2447;
                    field728 = class151.field2283;
                    field745 = class151.field2449;
                    field741 = 1;
                    field729 = 0;
                }
            }
        } else if (field741 == 1) {
            while (class132.method3606()) {
                if (Statics.field626 == 84) {
                    field739 = class151.field2440;
                    field728 = class151.field2441;
                    field745 = class151.field2235;
                    field741 = 2;
                    field729 = 0;
                } else if (Statics.field626 == 13) {
                    field741 = 0;
                }
            }
            int var13 = field726 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field739 = class151.field2440;
                field728 = class151.field2441;
                field745 = class151.field2235;
                field741 = 2;
                field729 = 0;
            }
            int var15 = field726 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field741 = 0;
            }
        } else if (field741 == 2) {
            short var16 = 231;
            int var38 = var16 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field729 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field729 = 1;
            }
            var38 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method894(class151.field2331, class151.field2472, class151.field2473);
                field741 = 5;
                return;
            }
            int var18 = field726 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field742 = field742.trim();
                if (field742.length() == 0) {
                    method894(class151.field2254, class151.field2347, class151.field2348);
                    return;
                }
                if (field743.length() == 0) {
                    method894(class151.field2349, class151.field2350, class151.field2351);
                    return;
                }
                method894(class151.field2455, class151.field2399, class151.field2401);
                field746 = Statics.field1870.field150.containsKey(class157.method144(field742)) ? class153.field2517 : class153.field2511;
                client.method2157(20);
                return;
            }
            int var20 = field726 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field741 = 0;
                field742 = "";
                field743 = "";
                Statics.field1995 = 0;
                Statics.field80 = "";
                field735 = true;
            }
            while (true) {
                while (class132.method3606()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field747.length(); var22++) {
                        if (Statics.field911 == field747.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field626 == 13) {
                        field741 = 0;
                        field742 = "";
                        field743 = "";
                        Statics.field1995 = 0;
                        Statics.field80 = "";
                        field735 = true;
                    } else if (field729 == 0) {
                        if (Statics.field626 == 85 && field742.length() > 0) {
                            field742 = field742.substring(0, field742.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field729 = 1;
                        }
                        if (var21 && field742.length() < 320) {
                            field742 = field742 + Statics.field911;
                        }
                    } else if (field729 == 1) {
                        if (Statics.field626 == 85 && field743.length() > 0) {
                            field743 = field743.substring(0, field743.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field729 = 0;
                        }
                        if (Statics.field626 == 84) {
                            field742 = field742.trim();
                            if (field742.length() == 0) {
                                method894(class151.field2254, class151.field2347, class151.field2348);
                                return;
                            }
                            if (field743.length() == 0) {
                                method894(class151.field2349, class151.field2350, class151.field2351);
                                return;
                            }
                            method894(class151.field2455, class151.field2399, class151.field2401);
                            field746 = Statics.field1870.field150.containsKey(class157.method144(field742)) ? class153.field2517 : class153.field2511;
                            client.method2157(20);
                            return;
                        }
                        if (var21 && field743.length() < 20) {
                            field743 = field743 + Statics.field911;
                        }
                    }
                }
                return;
            }
        } else if (field741 == 4) {
            int var23 = field726 + 180 - 80;
            short var24 = 321;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                Statics.field80.trim();
                if (Statics.field80.length() != 6) {
                    method894(class151.field2428, class151.field2263, class151.field2420);
                    return;
                }
                Statics.field1995 = Integer.parseInt(Statics.field80);
                Statics.field80 = "";
                field746 = field735 ? class153.field2512 : class153.field2522;
                method894(class151.field2455, class151.field2399, class151.field2401);
                client.method2157(20);
                return;
            }
            if (var5 == 1 && var6 >= field726 + 180 - 9 && var6 <= field726 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field735 = !field735;
            }
            if (var5 == 1 && var6 >= field726 + 180 - 34 && var6 <= field726 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                label600: {
                    String var25 = client.method643("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var25));
                            break label600;
                        } catch (Exception var37) {
                        }
                    }
                    if (class133.field2021.startsWith("win")) {
                        class133.method149(var25, 0, "openjs");
                    } else if (class133.field2021.startsWith("mac")) {
                        class133.method149(var25, 1, "openjs");
                    } else {
                        class133.method149(var25, 2, "openjs");
                    }
                }
            }
            int var27 = field726 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field741 = 0;
                field742 = "";
                field743 = "";
                Statics.field1995 = 0;
                Statics.field80 = "";
            }
            while (class132.method3606()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field730.length(); var29++) {
                    if (Statics.field911 == field730.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field626 == 13) {
                    field741 = 0;
                    field742 = "";
                    field743 = "";
                    Statics.field1995 = 0;
                    Statics.field80 = "";
                } else {
                    if (Statics.field626 == 85 && Statics.field80.length() > 0) {
                        Statics.field80 = Statics.field80.substring(0, Statics.field80.length() - 1);
                    }
                    if (Statics.field626 == 84) {
                        Statics.field80.trim();
                        if (Statics.field80.length() != 6) {
                            method894(class151.field2428, class151.field2263, class151.field2420);
                            return;
                        }
                        Statics.field1995 = Integer.parseInt(Statics.field80);
                        Statics.field80 = "";
                        field746 = field735 ? class153.field2512 : class153.field2522;
                        method894(class151.field2455, class151.field2399, class151.field2401);
                        client.method2157(20);
                        return;
                    }
                    if (var28 && Statics.field80.length() < 6) {
                        Statics.field80 = Statics.field80 + Statics.field911;
                    }
                }
            }
        } else if (field741 == 5) {
            int var30 = field726 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method706();
                return;
            }
            int var32 = field726 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field739 = class151.field2440;
                field728 = class151.field2441;
                field745 = class151.field2235;
                field741 = 2;
                field729 = 0;
                field743 = "";
            }
            while (class132.method3606()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field747.length(); var34++) {
                    if (Statics.field911 == field747.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field626 == 13) {
                    field739 = class151.field2440;
                    field728 = class151.field2441;
                    field745 = class151.field2235;
                    field741 = 2;
                    field729 = 0;
                    field743 = "";
                } else {
                    if (Statics.field626 == 85 && field742.length() > 0) {
                        field742 = field742.substring(0, field742.length() - 1);
                    }
                    if (Statics.field626 == 84) {
                        method706();
                        return;
                    }
                    if (var33 && field742.length() < 320) {
                        field742 = field742 + Statics.field911;
                    }
                }
            }
        } else if (field741 == 6) {
            while (true) {
                do {
                    if (!class132.method3606()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field739 = class151.field2440;
                            field728 = class151.field2441;
                            field745 = class151.field2235;
                            field741 = 2;
                            field729 = 0;
                            field743 = "";
                        }
                        return;
                    }
                } while (Statics.field626 != 84 && Statics.field626 != 13);
                field739 = class151.field2440;
                field728 = class151.field2441;
                field745 = class151.field2235;
                field741 = 2;
                field729 = 0;
                field743 = "";
            }
        }
    }

    @ObfuscatedName("aj.l(I)V")
    public static void method706() {
        field742 = field742.trim();
        if (field742.length() == 0) {
            method894(class151.field2331, class151.field2472, class151.field2473);
            return;
        }
        long var0 = class10.method653();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field742;
            Random var4 = new Random();
            class114 var5 = new class114(128);
            class114 var6 = new class114(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2307(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2310(var4.nextInt());
            }
            var5.method2310(var7[0]);
            var5.method2310(var7[1]);
            var5.method2326(var0);
            var5.method2326(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2310(var4.nextInt());
            }
            var5.method2316(class10.field155, class10.field158);
            var6.method2307(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2310(var4.nextInt());
            }
            var6.method2326(var4.nextLong());
            var6.method2311(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class144.field2136.method3772(0L);
                class144.field2136.method3774(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var32) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2334(var11, 0, 24);
            var6.method2326(var4.nextLong());
            var6.method2316(class10.field155, class10.field158);
            int var15 = class114.method2250(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class114 var16 = new class114(var15);
            var16.method2313(var3);
            var16.field1894 = var15;
            var16.method2337(var7);
            class114 var17 = new class114(var16.field1894 + var6.field1894 + var5.field1894 + 5);
            var17.method2307(2);
            var17.method2307(var5.field1894);
            var17.method2334(var5.field1891, 0, var5.field1894);
            var17.method2307(var6.field1894);
            var17.method2334(var6.field1891, 0, var6.field1894);
            var17.method2367(var16.field1894);
            var17.method2334(var16.field1891, 0, var16.field1894);
            String var18 = class155.method2256(var17.field1891);
            byte var25;
            try {
                URL var19 = new URL(client.method643("services", false) + "m=accountappeal/login.ws");
                URLConnection var20 = var19.openConnection();
                var20.setDoInput(true);
                var20.setDoOutput(true);
                var20.setConnectTimeout(5000);
                OutputStreamWriter var21 = new OutputStreamWriter(var20.getOutputStream());
                var21.write("data2=" + class220.method2646(var18) + "&dest=" + class220.method2646("passwordchoice.ws"));
                var21.flush();
                InputStream var22 = var20.getInputStream();
                class114 var23 = new class114(new byte[1000]);
                while (true) {
                    int var24 = var22.read(var23.field1891, var23.field1894, 1000 - var23.field1894);
                    if (var24 == -1) {
                        var21.close();
                        var22.close();
                        String var26 = new String(var23.field1891);
                        if (var26.startsWith("OFFLINE")) {
                            var25 = 4;
                        } else if (var26.startsWith("WRONG")) {
                            var25 = 7;
                        } else if (var26.startsWith("RELOAD")) {
                            var25 = 3;
                        } else if (var26.startsWith("Not permitted for social network accounts.")) {
                            var25 = 6;
                        } else {
                            var23.method2338(var7);
                            while (var23.field1894 > 0 && var23.field1891[var23.field1894 - 1] == 0) {
                                var23.field1894--;
                            }
                            String var27 = new String(var23.field1891, 0, var23.field1894);
                            if (class10.method2612(var27)) {
                                label112: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var27));
                                            break label112;
                                        } catch (Exception var30) {
                                        }
                                    }
                                    if (class133.field2021.startsWith("win")) {
                                        class133.method149(var27, 0, "openjs");
                                    } else if (class133.field2021.startsWith("mac")) {
                                        class133.method149(var27, 1, "openjs");
                                    } else {
                                        class133.method149(var27, 2, "openjs");
                                    }
                                }
                                var25 = 2;
                            } else {
                                var25 = 5;
                            }
                        }
                        break;
                    }
                    var23.field1894 += var24;
                    if (var23.field1894 >= 1000) {
                        var25 = 5;
                        break;
                    }
                }
            } catch (Throwable var31) {
                var31.printStackTrace();
                var25 = 5;
            }
            var2 = var25;
        }
        switch(var2) {
            case 2:
                method894(class151.field2474, class151.field2475, class151.field2476);
                field741 = 6;
                break;
            case 3:
                method894(class151.field2360, class151.field2321, class151.field2479);
                break;
            case 4:
                method894(class151.field2346, class151.field2380, class151.field2482);
                break;
            case 5:
                method894(class151.field2470, class151.field2354, class151.field2485);
                break;
            case 6:
                method894(class151.field2486, class151.field2362, class151.field2488);
                break;
            case 7:
                method894(class151.field2489, class151.field2490, class151.field2483);
        }
    }

    @ObfuscatedName("dp.w(Lhy;Lhy;Lhy;ZI)V")
    public static void method2274(class218 arg0, class218 arg1, class218 arg2, boolean arg3) {
        if (arg3) {
            field715 = (Statics.field2066 - client.field389 * 765) / 2;
            field726 = field715 + 202;
        }
        if (field749) {
            if (Statics.field279 == null) {
                Statics.field279 = class75.method976(Statics.field246, "sl_back", "");
            }
            if (Statics.field750 == null) {
                Statics.field750 = class75.method172(Statics.field246, "sl_flags", "");
            }
            if (Statics.field2090 == null) {
                Statics.field2090 = class75.method172(Statics.field246, "sl_arrows", "");
            }
            if (Statics.field1188 == null) {
                Statics.field1188 = class75.method172(Statics.field246, "sl_stars", "");
            }
            class78.method1717(field715, 23, 765, 480, 0);
            class78.method1746(field715, 0, 125, 23, 12425273, 9135624);
            class78.method1746(field715 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3667(class151.field2481, field715 + 62, 15, 0, -1);
            if (Statics.field1188 != null) {
                Statics.field1188[1].method1769(field715 + 140, 1);
                arg1.method3665(class151.field2319, field715 + 152, 10, 16777215, -1);
                Statics.field1188[0].method1769(field715 + 140, 12);
                arg1.method3665(class151.field2494, field715 + 152, 21, 16777215, -1);
            }
            if (Statics.field2090 != null) {
                int var4 = field715 + 280;
                if (class25.field646[0] == 0 && class25.field654[0] == 0) {
                    Statics.field2090[2].method1769(var4, 4);
                } else {
                    Statics.field2090[0].method1769(var4, 4);
                }
                if (class25.field646[0] == 0 && class25.field654[0] == 1) {
                    Statics.field2090[3].method1769(var4 + 15, 4);
                } else {
                    Statics.field2090[1].method1769(var4 + 15, 4);
                }
                arg0.method3665(class151.field2495, var4 + 32, 17, 16777215, -1);
                int var5 = field715 + 390;
                if (class25.field646[0] == 1 && class25.field654[0] == 0) {
                    Statics.field2090[2].method1769(var5, 4);
                } else {
                    Statics.field2090[0].method1769(var5, 4);
                }
                if (class25.field646[0] == 1 && class25.field654[0] == 1) {
                    Statics.field2090[3].method1769(var5 + 15, 4);
                } else {
                    Statics.field2090[1].method1769(var5 + 15, 4);
                }
                arg0.method3665(class151.field2496, var5 + 32, 17, 16777215, -1);
                int var6 = field715 + 500;
                if (class25.field646[0] == 2 && class25.field654[0] == 0) {
                    Statics.field2090[2].method1769(var6, 4);
                } else {
                    Statics.field2090[0].method1769(var6, 4);
                }
                if (class25.field646[0] == 2 && class25.field654[0] == 1) {
                    Statics.field2090[3].method1769(var6 + 15, 4);
                } else {
                    Statics.field2090[1].method1769(var6 + 15, 4);
                }
                arg0.method3665(class151.field2427, var6 + 32, 17, 16777215, -1);
                int var7 = field715 + 610;
                if (class25.field646[0] == 3 && class25.field654[0] == 0) {
                    Statics.field2090[2].method1769(var7, 4);
                } else {
                    Statics.field2090[0].method1769(var7, 4);
                }
                if (class25.field646[0] == 3 && class25.field654[0] == 1) {
                    Statics.field2090[3].method1769(var7 + 15, 4);
                } else {
                    Statics.field2090[1].method1769(var7 + 15, 4);
                }
                arg0.method3665(class151.field2498, var7 + 32, 17, 16777215, -1);
            }
            class78.method1717(field715 + 708, 4, 50, 16, 0);
            arg1.method3667(class151.field2388, field715 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field302 & var9;
            for (int var11 = 0; var11 < class25.field643; var11++) {
                class25 var12 = Statics.field642[var11];
                if ((var12.field641 & var9) == var10 || (var12.field641 & var9) == 0) {
                    var8++;
                }
            }
            field751 = -1;
            if (Statics.field279 != null) {
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
                int var24 = field715 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class25.field643; var27++) {
                    class25 var28 = Statics.field642[var27];
                    if ((var28.field641 & var9) == var10 || (var28.field641 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field649);
                        if (var28.field649 == -1) {
                            var30 = class151.field2499;
                            var29 = false;
                        } else if (var28.field649 > 1980) {
                            var30 = class151.field2238;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method600()) {
                            if (var28.method598()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method598()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class135.field2045 >= var24 && class135.field2046 * 200873089 >= var23 && class135.field2045 < var13 + var24 && class135.field2046 * 200873089 < var14 + var23 && var29) {
                            field751 = var27;
                            Statics.field279[var31].method1655(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field279[var31].method1667(var24, var23);
                        }
                        if (Statics.field750 != null) {
                            Statics.field750[(var28.method598() ? 8 : 0) + var28.field652].method1769(var24 + 29, var23);
                        }
                        arg0.method3667(Integer.toString(var28.field650), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3667(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3660(Statics.field642[field751].field651) + 6;
                    int var33 = arg1.field3128 + 8;
                    class78.method1717(class135.field2045 - var32 / 2, class135.field2046 * 200873089 + 20 + 5, var32, var33, 16777120);
                    class78.method1719(class135.field2045 - var32 / 2, class135.field2046 * 200873089 + 20 + 5, var32, var33, 0);
                    arg1.method3667(Statics.field642[field751].field651, class135.field2045, class135.field2046 * 200873089 + 20 + 5 + arg1.field3128 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1706.getGraphics();
                Statics.field1877.method1552(var34, 0, 0);
            } catch (Exception var78) {
                Statics.field1706.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field738.method1667(field715, 0);
            Statics.field720.method1667(field715 + 382, 0);
            Statics.field721.method1769(field715 + 382 - Statics.field721.field1391 / 2, 18);
        }
        if (client.field310 == 0 || client.field310 == 5) {
            byte var36 = 20;
            arg0.method3667(class151.field2439, field726 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class78.method1719(field726 + 180 - 152, var37, 304, 34, 9179409);
            class78.method1719(field726 + 180 - 151, var37 + 1, 302, 32, 0);
            class78.method1717(field726 + 180 - 150, var37 + 2, field736 * 3, 30, 9179409);
            class78.method1717(field736 * 3 + (field726 + 180 - 150), var37 + 2, 300 - field736 * 3, 30, 0);
            arg0.method3667(field737, field726 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field310 == 20) {
            Statics.field740.method1769(field726 + 180 - Statics.field740.field1391 / 2, 271 - Statics.field740.field1389 / 2);
            short var38 = 211;
            arg0.method3667(field739, field726 + 180, var38, 16776960, 0);
            int var80 = var38 + 15;
            arg0.method3667(field728, field726 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            arg0.method3667(field745, field726 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            int var83 = var82 + 10;
            if (field741 != 4) {
                arg0.method3665(class151.field2458, field726 + 180 - 110, var83, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field742; arg0.method3660(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3665(class217.method3681(var40), field726 + 180 - 70, var83, 16777215, 0);
                var80 = var83 + 15;
                arg0.method3665(class151.field2459 + class157.method2885(field743), field726 + 180 - 108, var80, 16777215, 0);
                var80 += 15;
            }
        }
        if (client.field310 == 10 || client.field310 == 11) {
            Statics.field740.method1769(field726, 171);
            if (field741 == 0) {
                short var41 = 251;
                arg0.method3667(class151.field2461, field726 + 180, var41, 16776960, 0);
                int var84 = var41 + 30;
                int var42 = field726 + 180 - 80;
                short var43 = 291;
                Statics.field717.method1769(var42 - 73, var43 - 20);
                arg0.method3675(class151.field2462, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field726 + 180 + 80;
                Statics.field717.method1769(var44 - 73, var43 - 20);
                arg0.method3675(class151.field2463, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field741 == 1) {
                arg0.method3667(class151.field2487, field726 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3667(field739, field726 + 180, var45, 16777215, 0);
                int var85 = var45 + 15;
                arg0.method3667(field728, field726 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                arg0.method3667(field745, field726 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                int var46 = field726 + 180 - 80;
                short var47 = 321;
                Statics.field717.method1769(var46 - 73, var47 - 20);
                arg0.method3667(class151.field2234, var46, var47 + 5, 16777215, 0);
                int var48 = field726 + 180 + 80;
                Statics.field717.method1769(var48 - 73, var47 - 20);
                arg0.method3667(class151.field2388, var48, var47 + 5, 16777215, 0);
            } else if (field741 == 2) {
                short var49 = 211;
                arg0.method3667(field739, field726 + 180, var49, 16776960, 0);
                int var88 = var49 + 15;
                arg0.method3667(field728, field726 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg0.method3667(field745, field726 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var91 = var90 + 10;
                arg0.method3665(class151.field2458, field726 + 180 - 110, var91, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field742; arg0.method3660(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3665(class217.method3681(var51) + (field729 == 0 & client.field477 % 40 < 20 ? class2.method3393(16776960) + class2.field22 : ""), field726 + 180 - 70, var91, 16777215, 0);
                var88 = var91 + 15;
                arg0.method3665(class151.field2459 + class157.method2885(field743) + (field729 == 1 & client.field477 % 40 < 20 ? class2.method3393(16776960) + class2.field22 : ""), field726 + 180 - 108, var88, 16777215, 0);
                var88 += 15;
                int var52 = field726 + 180 - 80;
                short var53 = 321;
                Statics.field717.method1769(var52 - 73, var53 - 20);
                arg0.method3667(class151.field2464, var52, var53 + 5, 16777215, 0);
                int var54 = field726 + 180 + 80;
                Statics.field717.method1769(var54 - 73, var53 - 20);
                arg0.method3667(class151.field2388, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3667(class151.field2500, field726 + 180, var55, 16776960, 0);
            } else if (field741 == 4) {
                arg0.method3667(class151.field2453, field726 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3667(field739, field726 + 180, var56, 16777215, 0);
                int var92 = var56 + 15;
                arg0.method3667(field728, field726 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method3667(field745, field726 + 180, var93, 16777215, 0);
                int var94 = var93 + 15;
                arg0.method3665(class151.field2460 + class157.method2885(Statics.field80) + (client.field477 % 40 < 20 ? class2.method3393(16776960) + class2.field22 : ""), field726 + 180 - 108, var94, 16777215, 0);
                int var95 = var94 - 8;
                arg0.method3665(class151.field2236, field726 + 180 - 9, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method3665(class151.field2237, field726 + 180 - 9, var96, 16776960, 0);
                int var57 = field726 + 180 - 9 + arg0.method3660(class151.field2237) + 15;
                int var58 = var96 - arg0.field3128;
                class79 var59;
                if (field735) {
                    var59 = Statics.field722;
                } else {
                    var59 = Statics.field2208;
                }
                var59.method1769(var57, var58);
                var92 = var96 + 15;
                int var60 = field726 + 180 - 80;
                short var61 = 321;
                Statics.field717.method1769(var60 - 73, var61 - 20);
                arg0.method3667(class151.field2234, var60, var61 + 5, 16777215, 0);
                int var62 = field726 + 180 + 80;
                Statics.field717.method1769(var62 - 73, var61 - 20);
                arg0.method3667(class151.field2388, var62, var61 + 5, 16777215, 0);
                arg1.method3667(class151.field2454, field726 + 180, var61 + 36, 255, 0);
            } else if (field741 == 5) {
                arg0.method3667(class151.field2448, field726 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3667(field739, field726 + 180, var63, 16776960, 0);
                int var97 = var63 + 15;
                arg2.method3667(field728, field726 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg2.method3667(field745, field726 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var100 = var99 + 14;
                arg0.method3665(class151.field2468, field726 + 180 - 145, var100, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field742; arg0.method3660(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3665(class217.method3681(var65) + (client.field477 % 40 < 20 ? class2.method3393(16776960) + class2.field22 : ""), field726 + 180 - 34, var100, 16777215, 0);
                var97 = var100 + 15;
                int var66 = field726 + 180 - 80;
                short var67 = 321;
                Statics.field717.method1769(var66 - 73, var67 - 20);
                arg0.method3667(class151.field2469, var66, var67 + 5, 16777215, 0);
                int var68 = field726 + 180 + 80;
                Statics.field717.method1769(var68 - 73, var67 - 20);
                arg0.method3667(class151.field2264, var68, var67 + 5, 16777215, 0);
            } else if (field741 == 6) {
                short var69 = 211;
                arg0.method3667(field739, field726 + 180, var69, 16776960, 0);
                int var101 = var69 + 15;
                arg0.method3667(field728, field726 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3667(field745, field726 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var70 = field726 + 180;
                short var71 = 321;
                Statics.field717.method1769(var70 - 73, var71 - 20);
                arg0.method3667(class151.field2264, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field734 > 0) {
            method884(field734);
            field734 = 0;
        }
        method952();
        Statics.field679[Statics.field1870.field146 ? 1 : 0].method1769(field715 + 765 - 40, 463);
        if (client.field310 > 5 && client.field376 == 0) {
            if (Statics.field2611 == null) {
                Statics.field2611 = class75.method693(Statics.field246, "sl_button", "");
            } else {
                int var72 = field715 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field2611.method1769(var72, var73);
                arg0.method3667(class151.field2394 + " " + client.field397, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field1072 == null) {
                    arg1.method3667(class151.field2502, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3667(class151.field2501, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field1706.getGraphics();
            Statics.field1877.method1552(var76, 0, 0);
        } catch (Exception var79) {
            Statics.field1706.repaint();
        }
    }

    @ObfuscatedName("aw.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method894(String arg0, String arg1, String arg2) {
        field739 = arg0;
        field728 = arg1;
        field745 = arg2;
    }

    @ObfuscatedName("az.f(Lcb;I)V")
    public static final void method963(class79 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field695.length; var2++) {
            Statics.field695[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field695[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field163[var8] = (Statics.field695[var8 - 1] + Statics.field695[var8 + 1] + Statics.field695[var8 - 128] + Statics.field695[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field695;
            Statics.field695 = Statics.field163;
            Statics.field163 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1389; var11++) {
            for (int var12 = 0; var12 < arg0.field1391; var12++) {
                if (arg0.field1393[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1390;
                    int var14 = var11 + 16 + arg0.field1392;
                    int var15 = (var14 << 7) + var13;
                    Statics.field695[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ax.i(IB)V")
    public static final void method884(int arg0) {
        short var1 = 256;
        field753 += arg0 * 128;
        if (field753 > Statics.field695.length) {
            field753 -= Statics.field695.length;
            int var2 = (int) (Math.random() * 12.0D);
            method963(Statics.field718[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field225[var3 + var4] - Statics.field695[field753 + var3 & Statics.field695.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field225[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field225[var9 + var10] = 255;
                } else {
                    Statics.field225[var9 + var10] = 0;
                }
            }
        }
        if (field716 > 0) {
            field716 -= arg0 * 4;
        }
        if (field719 > 0) {
            field719 -= arg0 * 4;
        }
        if (field716 == 0 && field719 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field716 = 1024;
            }
            if (var12 == 1) {
                field719 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field727[var13] = field727[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field727[var14] = (int) (Math.sin((double) field748 / 14.0D) * 16.0D + Math.sin((double) field748 / 15.0D) * 14.0D + Math.sin((double) field748 / 16.0D) * 12.0D);
            field748++;
        }
        field733 += arg0 * -340613863;
        int var15 = ((client.field477 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field733 * -1375581180; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field225[(var18 << 7) + var17] = 192;
        }
        field733 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field225[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field225[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field731[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field731[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field731[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field225[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bd.a(IIIS)I")
    public static final int method1227(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("az.o(I)V")
    public static final void method952() {
        short var0 = 256;
        if (field716 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field716 > 768) {
                    Statics.field1738[var1] = method1227(Statics.field744[var1], Statics.field71[var1], 1024 - field716);
                } else if (field716 > 256) {
                    Statics.field1738[var1] = Statics.field71[var1];
                } else {
                    Statics.field1738[var1] = method1227(Statics.field71[var1], Statics.field744[var1], 256 - field716);
                }
            }
        } else if (field719 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field719 > 768) {
                    Statics.field1738[var2] = method1227(Statics.field744[var2], Statics.field1070[var2], 1024 - field719);
                } else if (field719 > 256) {
                    Statics.field1738[var2] = Statics.field1070[var2];
                } else {
                    Statics.field1738[var2] = method1227(Statics.field1070[var2], Statics.field744[var2], 256 - field719);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1738[var3] = Statics.field744[var3];
            }
        }
        class78.method1711(field715, 9, field715 + 128, var0 + 7);
        Statics.field738.method1667(field715, 0);
        class78.method1710();
        int var4 = 0;
        int var5 = field715 + Statics.field1877.field1358 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field727[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field225[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1738[var10];
                    int var14 = Statics.field1877.field1368[var5];
                    Statics.field1877.field1368[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field1877.field1358 + var8 - 128;
        }
        class78.method1711(field715 + 765 - 128, 9, field715 + 765, var0 + 7);
        Statics.field720.method1667(field715 + 382, 0);
        class78.method1710();
        int var15 = 0;
        int var16 = field715 + Statics.field1877.field1358 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field727[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field225[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1738[var22];
                    int var26 = Statics.field1877.field1368[var20];
                    Statics.field1877.field1368[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1877.field1358 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("f.u(Leb;I)V")
    public static void method96(class139 arg0) {
        if (class135.field2043 != 1 && Statics.field1352 || class135.field2043 != 4) {
            return;
        }
        int var1 = field715 + 280;
        if (class135.field2052 >= var1 && class135.field2052 <= var1 + 14 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(0, 0);
            return;
        }
        if (class135.field2052 >= var1 + 15 && class135.field2052 <= var1 + 80 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(0, 1);
            return;
        }
        int var2 = field715 + 390;
        if (class135.field2052 >= var2 && class135.field2052 <= var2 + 14 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(1, 0);
            return;
        }
        if (class135.field2052 >= var2 + 15 && class135.field2052 <= var2 + 80 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(1, 1);
            return;
        }
        int var3 = field715 + 500;
        if (class135.field2052 >= var3 && class135.field2052 <= var3 + 14 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(2, 0);
            return;
        }
        if (class135.field2052 >= var3 + 15 && class135.field2052 <= var3 + 80 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(2, 1);
            return;
        }
        int var4 = field715 + 610;
        if (class135.field2052 >= var4 && class135.field2052 <= var4 + 14 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(3, 0);
            return;
        }
        if (class135.field2052 >= var4 + 15 && class135.field2052 <= var4 + 80 && class135.field2048 >= 4 && class135.field2048 <= 18) {
            class25.method2928(3, 1);
            return;
        }
        if (class135.field2052 >= field715 + 708 && class135.field2048 >= 4 && class135.field2052 <= field715 + 708 + 50 && class135.field2048 <= 20) {
            field749 = false;
            Statics.field738.method1667(field715, 0);
            Statics.field720.method1667(field715 + 382, 0);
            Statics.field721.method1769(field715 + 382 - Statics.field721.field1391 / 2, 18);
            return;
        }
        if (field751 == -1) {
            return;
        }
        class25 var5 = Statics.field642[field751];
        method1797(var5);
        field749 = false;
        Statics.field738.method1667(field715, 0);
        Statics.field720.method1667(field715 + 382, 0);
        Statics.field721.method1769(field715 + 382 - Statics.field721.field1391 / 2, 18);
        return;
    }

    @ObfuscatedName("cz.m(Lb;B)V")
    public static void method1797(class25 arg0) {
        if (arg0.method598() != client.field306) {
            client.field306 = arg0.method598();
            boolean var1 = arg0.method598();
            if (Statics.field2661 != var1) {
                class50.method2878();
                Statics.field2661 = var1;
            }
        }
        Statics.field1060 = arg0.field638;
        client.field397 = arg0.field650;
        client.field302 = arg0.field641;
        Statics.field338 = client.field398 == 0 ? 43594 : arg0.field650 + 40000;
        Statics.field2547 = client.field398 == 0 ? 443 : arg0.field650 + 50000;
        Statics.field771 = Statics.field338;
    }
}

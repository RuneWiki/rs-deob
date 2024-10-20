package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("az")
public class class30 {

    @ObfuscatedName("az.g")
    public static int field710 = 0;

    @ObfuscatedName("az.o")
    public static int field709 = field710 + 202;

    @ObfuscatedName("az.v")
    public static int[] field724 = new int[256];

    @ObfuscatedName("az.u")
    public static int field723 = 0;

    @ObfuscatedName("az.w")
    public static int field730 = 0;

    @ObfuscatedName("az.al")
    public static int field707 = 0;

    @ObfuscatedName("az.az")
    public static int field714 = 0;

    @ObfuscatedName("az.ah")
    public static int field715 = 0;

    @ObfuscatedName("az.ag")
    public static int field731 = 0;

    @ObfuscatedName("az.ad")
    public static int field717 = 10;

    @ObfuscatedName("az.ao")
    public static String field704 = "";

    @ObfuscatedName("az.am")
    public static int field719 = 0;

    @ObfuscatedName("az.ax")
    public static String field720 = "";

    @ObfuscatedName("az.at")
    public static String field721 = "";

    @ObfuscatedName("az.ar")
    public static String field722 = "";

    @ObfuscatedName("az.ai")
    public static String field727 = "";

    @ObfuscatedName("az.aw")
    public static String field712 = "";

    @ObfuscatedName("az.ak")
    public static class150 field725 = class150.field2488;

    @ObfuscatedName("az.af")
    public static boolean field726 = true;

    @ObfuscatedName("az.ae")
    public static int field735 = 0;

    @ObfuscatedName("az.au")
    public static String field728 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("az.aa")
    public static String field711 = "1234567890";

    @ObfuscatedName("az.ac")
    public static boolean field702 = false;

    @ObfuscatedName("az.by")
    public static int field733 = 0;

    @ObfuscatedName("az.bh")
    public static int[] field716 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("az.bb")
    public static int[] field736 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("az.bd")
    public static int field729 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.n(Ljava/awt/Component;Lfi;Lfi;ZII)V")
    public static void method2443(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field3058) {
            field719 = arg4;
            class75.method1610();
            byte[] var5 = arg1.method2911("title.jpg", "");
            Statics.field701 = new class74(var5, arg0);
            Statics.field705 = Statics.field701.method1505();
            Statics.field706 = class72.method1690(arg2, "logo", "");
            Statics.field718 = class72.method1690(arg2, "titlebox", "");
            Statics.field1935 = class72.method1690(arg2, "titlebutton", "");
            Statics.field703 = Statics.method555(arg2, "runes", "");
            Statics.field2492 = Statics.method555(arg2, "title_mute", "");
            Statics.field1980 = class72.method1690(arg2, "options_radio_buttons,0", "");
            Statics.field1967 = class72.method1690(arg2, "options_radio_buttons,2", "");
            Statics.field3060 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field3060[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field3060[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field3060[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3060[var9 + 192] = 16777215;
            }
            Statics.field1725 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1725[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1725[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1725[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1725[var13 + 192] = 16777215;
            }
            Statics.field695 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field695[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field695[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field695[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field695[var17 + 192] = 16777215;
            }
            Statics.field662 = new int[256];
            Statics.field963 = new int[32768];
            Statics.field1944 = new int[32768];
            method134((class76) null);
            Statics.field258 = new int[32768];
            Statics.field992 = new int[32768];
            if (arg3) {
                field727 = "";
                field712 = "";
            }
            Statics.field1170 = 0;
            Statics.field564 = "";
            field726 = true;
            field702 = false;
            if (Statics.field134.field148) {
                class174.method722(2);
            } else {
                class159 var18 = Statics.field259;
                int var19 = var18.method2924("scape main");
                int var20 = var18.method2935(var19, "");
                class174.method2054(2, var18, var19, var20, 255, false);
            }
            class162.method2147(false);
            Statics.field3058 = true;
            field710 = (Statics.field1408 - client.field468) / 2;
            field709 = field710 + 202;
            Statics.field701.method1599(field710, 0);
            Statics.field705.method1599(field710 + 382, 0);
            Statics.field706.method1663(field710 + 382 - Statics.field706.field1379 / 2, 18);
        } else if (arg4 == 4) {
            field719 = 4;
        }
    }

    @ObfuscatedName("ep.g(I)V")
    public static void method2880() {
        if (!Statics.field3058) {
            return;
        }
        Statics.field718 = null;
        Statics.field1935 = null;
        Statics.field703 = null;
        Statics.field701 = null;
        Statics.field705 = null;
        Statics.field706 = null;
        Statics.field2492 = null;
        Statics.field1980 = null;
        Statics.field1967 = null;
        Statics.field1345 = null;
        Statics.field1563 = null;
        Statics.field1507 = null;
        Statics.field1858 = null;
        Statics.field941 = null;
        Statics.field3060 = null;
        Statics.field1725 = null;
        Statics.field695 = null;
        Statics.field662 = null;
        Statics.field963 = null;
        Statics.field1944 = null;
        Statics.field258 = null;
        Statics.field992 = null;
        class174.method722(2);
        class162.method2147(true);
        Statics.field3058 = false;
    }

    @ObfuscatedName("cu.a(Leh;B)V")
    public static void method1956(class136 arg0) {
        if (field702) {
            method1953(arg0);
            return;
        }
        if ((class132.field2065 == 1 || !Statics.field568 && class132.field2065 == 4) && class132.field2066 >= field710 + 765 - 50 && class132.field2060 >= 453) {
            Statics.field134.field148 = !Statics.field134.field148;
            class9.method156();
            if (Statics.field134.field148) {
                Statics.field2540.method3252();
                class174.field2843 = 1;
                Statics.field2847 = null;
            } else {
                class174.method2133(Statics.field259, "scape main", "", 255, false);
            }
        }
        if (client.field555 == 5) {
            return;
        }
        field715++;
        if (client.field555 != 10 && client.field555 != 11) {
            return;
        }
        if (client.field286 == 0) {
            if (class132.field2065 == 1 || !Statics.field568 && class132.field2065 == 4) {
                int var1 = field710 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class132.field2066 >= var1 && class132.field2066 <= var1 + var3 && class132.field2060 >= var2 && class132.field2060 <= var2 + var4) {
                    method162();
                    return;
                }
            }
            if (Statics.field732 != null) {
                method162();
            }
        }
        int var5 = class132.field2065;
        int var6 = class132.field2066;
        int var7 = class132.field2060;
        if (!Statics.field568 && var5 == 4) {
            var5 = 1;
        }
        if (field719 == 0) {
            int var8 = field709 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                label579: {
                    String var10 = client.method1471("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var10));
                            break label579;
                        } catch (Exception var36) {
                        }
                    }
                    if (class130.field2044.startsWith("win")) {
                        class130.method863(var10, 0, "openjs");
                    } else if (class130.field2044.startsWith("mac")) {
                        class130.method863(var10, 1, "openjs");
                    } else {
                        class130.method863(var10, 2, "openjs");
                    }
                }
            }
            int var12 = field709 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field282 & 0x4) != 0) {
                    if ((client.field282 & 0x400) == 0) {
                        field720 = class148.field2355;
                        field721 = class148.field2418;
                        field722 = class148.field2415;
                    } else {
                        field720 = class148.field2423;
                        field721 = class148.field2259;
                        field722 = class148.field2425;
                    }
                    field719 = 1;
                    field735 = 0;
                } else if ((client.field282 & 0x400) == 0) {
                    field720 = class148.field2384;
                    field721 = class148.field2414;
                    field722 = class148.field2321;
                    field719 = 2;
                    field735 = 0;
                } else {
                    field720 = class148.field2419;
                    field721 = class148.field2421;
                    field722 = class148.field2422;
                    field719 = 1;
                    field735 = 0;
                }
            }
        } else if (field719 == 1) {
            while (class129.method1499()) {
                if (Statics.field1306 == 84) {
                    field720 = class148.field2384;
                    field721 = class148.field2414;
                    field722 = class148.field2321;
                    field719 = 2;
                    field735 = 0;
                } else if (Statics.field1306 == 13) {
                    field719 = 0;
                }
            }
            int var13 = field709 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field720 = class148.field2384;
                field721 = class148.field2414;
                field722 = class148.field2321;
                field719 = 2;
                field735 = 0;
            }
            int var15 = field709 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field719 = 0;
            }
        } else if (field719 == 2) {
            short var16 = 231;
            int var38 = var16 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field735 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field735 = 1;
            }
            var38 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method161(class148.field2444, class148.field2445, class148.field2446);
                field719 = 5;
                return;
            }
            int var18 = field709 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field727 = field727.trim();
                if (field727.length() == 0) {
                    method161(class148.field2319, class148.field2239, class148.field2338);
                    return;
                }
                if (field712.length() == 0) {
                    method161(class148.field2322, class148.field2308, class148.field2400);
                    return;
                }
                method161(class148.field2428, class148.field2429, class148.field2465);
                field725 = Statics.field134.field149.containsKey(class154.method132(field727)) ? class150.field2487 : class150.field2488;
                client.method46(20);
                return;
            }
            int var20 = field709 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field719 = 0;
                field727 = "";
                field712 = "";
                Statics.field1170 = 0;
                Statics.field564 = "";
                field726 = true;
            }
            while (true) {
                while (class129.method1499()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field728.length(); var22++) {
                        if (Statics.field175 == field728.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1306 == 13) {
                        field719 = 0;
                        field727 = "";
                        field712 = "";
                        Statics.field1170 = 0;
                        Statics.field564 = "";
                        field726 = true;
                    } else if (field735 == 0) {
                        if (Statics.field1306 == 85 && field727.length() > 0) {
                            field727 = field727.substring(0, field727.length() - 1);
                        }
                        if (Statics.field1306 == 84 || Statics.field1306 == 80) {
                            field735 = 1;
                        }
                        if (var21 && field727.length() < 320) {
                            field727 = field727 + Statics.field175;
                        }
                    } else if (field735 == 1) {
                        if (Statics.field1306 == 85 && field712.length() > 0) {
                            field712 = field712.substring(0, field712.length() - 1);
                        }
                        if (Statics.field1306 == 84 || Statics.field1306 == 80) {
                            field735 = 0;
                        }
                        if (Statics.field1306 == 84) {
                            field727 = field727.trim();
                            if (field727.length() == 0) {
                                method161(class148.field2319, class148.field2239, class148.field2338);
                                return;
                            }
                            if (field712.length() == 0) {
                                method161(class148.field2322, class148.field2308, class148.field2400);
                                return;
                            }
                            method161(class148.field2428, class148.field2429, class148.field2465);
                            field725 = Statics.field134.field149.containsKey(class154.method132(field727)) ? class150.field2487 : class150.field2488;
                            client.method46(20);
                            return;
                        }
                        if (var21 && field712.length() < 20) {
                            field712 = field712 + Statics.field175;
                        }
                    }
                }
                return;
            }
        } else if (field719 == 4) {
            int var23 = field709 + 180 - 80;
            short var24 = 321;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                Statics.field564.trim();
                if (Statics.field564.length() != 6) {
                    method161(class148.field2443, class148.field2341, class148.field2373);
                    return;
                }
                Statics.field1170 = Integer.parseInt(Statics.field564);
                Statics.field564 = "";
                field725 = field726 ? class150.field2493 : class150.field2489;
                method161(class148.field2428, class148.field2429, class148.field2465);
                client.method46(20);
                return;
            }
            if (var5 == 1 && var6 >= field709 + 180 - 9 && var6 <= field709 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field726 = !field726;
            }
            if (var5 == 1 && var6 >= field709 + 180 - 34 && var6 <= field709 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                label594: {
                    String var25 = client.method1471("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var25));
                            break label594;
                        } catch (Exception var37) {
                        }
                    }
                    if (class130.field2044.startsWith("win")) {
                        class130.method863(var25, 0, "openjs");
                    } else if (class130.field2044.startsWith("mac")) {
                        class130.method863(var25, 1, "openjs");
                    } else {
                        class130.method863(var25, 2, "openjs");
                    }
                }
            }
            int var27 = field709 + 180 + 80;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field719 = 0;
                field727 = "";
                field712 = "";
                Statics.field1170 = 0;
                Statics.field564 = "";
            }
            while (class129.method1499()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field711.length(); var29++) {
                    if (Statics.field175 == field711.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field1306 == 13) {
                    field719 = 0;
                    field727 = "";
                    field712 = "";
                    Statics.field1170 = 0;
                    Statics.field564 = "";
                } else {
                    if (Statics.field1306 == 85 && Statics.field564.length() > 0) {
                        Statics.field564 = Statics.field564.substring(0, Statics.field564.length() - 1);
                    }
                    if (Statics.field1306 == 84) {
                        Statics.field564.trim();
                        if (Statics.field564.length() != 6) {
                            method161(class148.field2443, class148.field2341, class148.field2373);
                            return;
                        }
                        Statics.field1170 = Integer.parseInt(Statics.field564);
                        Statics.field564 = "";
                        field725 = field726 ? class150.field2493 : class150.field2489;
                        method161(class148.field2428, class148.field2429, class148.field2465);
                        client.method46(20);
                        return;
                    }
                    if (var28 && Statics.field564.length() < 6) {
                        Statics.field564 = Statics.field564 + Statics.field175;
                    }
                }
            }
        } else if (field719 == 5) {
            int var30 = field709 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                method152();
                return;
            }
            int var32 = field709 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field720 = class148.field2384;
                field721 = class148.field2414;
                field722 = class148.field2321;
                field719 = 2;
                field735 = 0;
                field712 = "";
            }
            while (class129.method1499()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field728.length(); var34++) {
                    if (Statics.field175 == field728.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field1306 == 13) {
                    field720 = class148.field2384;
                    field721 = class148.field2414;
                    field722 = class148.field2321;
                    field719 = 2;
                    field735 = 0;
                    field712 = "";
                } else {
                    if (Statics.field1306 == 85 && field727.length() > 0) {
                        field727 = field727.substring(0, field727.length() - 1);
                    }
                    if (Statics.field1306 == 84) {
                        method152();
                        return;
                    }
                    if (var33 && field727.length() < 320) {
                        field727 = field727 + Statics.field175;
                    }
                }
            }
        } else if (field719 == 6) {
            while (true) {
                do {
                    if (!class129.method1499()) {
                        short var35 = 321;
                        if (var5 == 1 && var7 >= var35 - 20 && var7 <= var35 + 20) {
                            field720 = class148.field2384;
                            field721 = class148.field2414;
                            field722 = class148.field2321;
                            field719 = 2;
                            field735 = 0;
                            field712 = "";
                        }
                        return;
                    }
                } while (Statics.field1306 != 84 && Statics.field1306 != 13);
                field720 = class148.field2384;
                field721 = class148.field2414;
                field722 = class148.field2321;
                field719 = 2;
                field735 = 0;
                field712 = "";
            }
        }
    }

    @ObfuscatedName("q.m(I)V")
    public static void method152() {
        field727 = field727.trim();
        if (field727.length() == 0) {
            method161(class148.field2444, class148.field2445, class148.field2446);
            return;
        }
        long var0 = class10.method620();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field727;
            Random var4 = new Random();
            class111 var5 = new class111(128);
            class111 var6 = new class111(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2326(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2204(var4.nextInt());
            }
            var5.method2204(var7[0]);
            var5.method2204(var7[1]);
            var5.method2400(var0);
            var5.method2400(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2204(var4.nextInt());
            }
            var5.method2235(class10.field161, class10.field157);
            var6.method2326(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2204(var4.nextInt());
            }
            var6.method2400(var4.nextLong());
            var6.method2205(var4.nextLong());
            byte[] var11 = new byte[24];
            try {
                class141.field2142.method3771(0L);
                class141.field2142.method3773(var11);
                int var12;
                for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                }
                if (var12 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var37) {
                for (int var14 = 0; var14 < 24; var14++) {
                    var11[var14] = -1;
                }
            }
            var6.method2248(var11, 0, 24);
            var6.method2400(var4.nextLong());
            var6.method2235(class10.field161, class10.field157);
            int var15 = class111.method2667(var3);
            if (var15 % 8 != 0) {
                var15 += 8 - var15 % 8;
            }
            class111 var16 = new class111(var15);
            var16.method2362(var3);
            var16.field1896 = var15;
            var16.method2231(var7);
            class111 var17 = new class111(var16.field1896 + var6.field1896 + var5.field1896 + 5);
            var17.method2326(2);
            var17.method2326(var5.field1896);
            var17.method2248(var5.field1904, 0, var5.field1896);
            var17.method2326(var6.field1896);
            var17.method2248(var6.field1904, 0, var6.field1896);
            var17.method2202(var16.field1896);
            var17.method2248(var16.field1904, 0, var16.field1896);
            byte[] var18 = var17.field1904;
            String var19 = class152.method3098(var18, 0, var18.length);
            String var20 = var19;
            byte var27;
            try {
                URL var21 = new URL(client.method1471("services", false) + "m=accountappeal/login.ws");
                URLConnection var22 = var21.openConnection();
                var22.setDoInput(true);
                var22.setDoOutput(true);
                var22.setConnectTimeout(5000);
                OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
                var23.write("data2=" + class217.method2151(var20) + "&dest=" + class217.method2151("passwordchoice.ws"));
                var23.flush();
                InputStream var24 = var22.getInputStream();
                class111 var25 = new class111(new byte[1000]);
                while (true) {
                    int var26 = var24.read(var25.field1904, var25.field1896, 1000 - var25.field1896);
                    if (var26 == -1) {
                        var23.close();
                        var24.close();
                        String var28 = new String(var25.field1904);
                        if (var28.startsWith("OFFLINE")) {
                            var27 = 4;
                        } else if (var28.startsWith("WRONG")) {
                            var27 = 7;
                        } else if (var28.startsWith("RELOAD")) {
                            var27 = 3;
                        } else if (var28.startsWith("Not permitted for social network accounts.")) {
                            var27 = 6;
                        } else {
                            var25.method2347(var7);
                            while (var25.field1896 > 0 && var25.field1904[var25.field1896 - 1] == 0) {
                                var25.field1896--;
                            }
                            String var29 = new String(var25.field1904, 0, var25.field1896);
                            boolean var30;
                            if (var29 == null) {
                                var30 = false;
                            } else {
                                label124: {
                                    try {
                                        new URL(var29);
                                    } catch (MalformedURLException var35) {
                                        var30 = false;
                                        break label124;
                                    }
                                    var30 = true;
                                }
                            }
                            if (var30) {
                                label119: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var29));
                                            break label119;
                                        } catch (Exception var34) {
                                        }
                                    }
                                    if (class130.field2044.startsWith("win")) {
                                        class130.method863(var29, 0, "openjs");
                                    } else if (class130.field2044.startsWith("mac")) {
                                        class130.method863(var29, 1, "openjs");
                                    } else {
                                        class130.method863(var29, 2, "openjs");
                                    }
                                }
                                var27 = 2;
                            } else {
                                var27 = 5;
                            }
                        }
                        break;
                    }
                    var25.field1896 += var26;
                    if (var25.field1896 >= 1000) {
                        var27 = 5;
                        break;
                    }
                }
            } catch (Throwable var36) {
                var36.printStackTrace();
                var27 = 5;
            }
            var2 = var27;
        }
        switch(var2) {
            case 2:
                method161(class148.field2447, class148.field2448, class148.field2413);
                field719 = 6;
                break;
            case 3:
                method161(class148.field2261, class148.field2451, class148.field2313);
                break;
            case 4:
                method161(class148.field2248, class148.field2454, class148.field2455);
                break;
            case 5:
                method161(class148.field2456, class148.field2331, class148.field2458);
                break;
            case 6:
                method161(class148.field2218, class148.field2348, class148.field2452);
                break;
            case 7:
                method161(class148.field2269, class148.field2426, class148.field2464);
        }
    }

    @ObfuscatedName("bl.s(Lhv;Lhv;Lhv;ZI)V")
    public static void method1127(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field710 = (Statics.field1408 - client.field468) / 2;
            field709 = field710 + 202;
        }
        if (field702) {
            if (Statics.field1345 == null) {
                Statics.field1345 = class72.method25(Statics.field115, "sl_back", "");
            }
            if (Statics.field1563 == null) {
                Statics.field1563 = Statics.method555(Statics.field115, "sl_flags", "");
            }
            if (Statics.field1507 == null) {
                Statics.field1507 = Statics.method555(Statics.field115, "sl_arrows", "");
            }
            if (Statics.field1858 == null) {
                Statics.field1858 = Statics.method555(Statics.field115, "sl_stars", "");
            }
            class75.method1637(field710, 23, 765, 480, 0);
            class75.method1613(field710, 0, 125, 23, 12425273, 9135624);
            class75.method1613(field710 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3662(class148.field2463, field710 + 62, 15, 0, -1);
            if (Statics.field1858 != null) {
                Statics.field1858[1].method1663(field710 + 140, 1);
                arg1.method3654(class148.field2466, field710 + 152, 10, 16777215, -1);
                Statics.field1858[0].method1663(field710 + 140, 12);
                arg1.method3654(class148.field2354, field710 + 152, 21, 16777215, -1);
            }
            if (Statics.field1507 != null) {
                int var4 = field710 + 280;
                if (field716[0] == 0 && field736[0] == 0) {
                    Statics.field1507[2].method1663(var4, 4);
                } else {
                    Statics.field1507[0].method1663(var4, 4);
                }
                if (field716[0] == 0 && field736[0] == 1) {
                    Statics.field1507[3].method1663(var4 + 15, 4);
                } else {
                    Statics.field1507[1].method1663(var4 + 15, 4);
                }
                arg0.method3654(class148.field2468, var4 + 32, 17, 16777215, -1);
                int var5 = field710 + 390;
                if (field716[0] == 1 && field736[0] == 0) {
                    Statics.field1507[2].method1663(var5, 4);
                } else {
                    Statics.field1507[0].method1663(var5, 4);
                }
                if (field716[0] == 1 && field736[0] == 1) {
                    Statics.field1507[3].method1663(var5 + 15, 4);
                } else {
                    Statics.field1507[1].method1663(var5 + 15, 4);
                }
                arg0.method3654(class148.field2469, var5 + 32, 17, 16777215, -1);
                int var6 = field710 + 500;
                if (field716[0] == 2 && field736[0] == 0) {
                    Statics.field1507[2].method1663(var6, 4);
                } else {
                    Statics.field1507[0].method1663(var6, 4);
                }
                if (field716[0] == 2 && field736[0] == 1) {
                    Statics.field1507[3].method1663(var6 + 15, 4);
                } else {
                    Statics.field1507[1].method1663(var6 + 15, 4);
                }
                arg0.method3654(class148.field2470, var6 + 32, 17, 16777215, -1);
                int var7 = field710 + 610;
                if (field716[0] == 3 && field736[0] == 0) {
                    Statics.field1507[2].method1663(var7, 4);
                } else {
                    Statics.field1507[0].method1663(var7, 4);
                }
                if (field716[0] == 3 && field736[0] == 1) {
                    Statics.field1507[3].method1663(var7 + 15, 4);
                } else {
                    Statics.field1507[1].method1663(var7 + 15, 4);
                }
                arg0.method3654(class148.field2471, var7 + 32, 17, 16777215, -1);
            }
            class75.method1637(field710 + 708, 4, 50, 16, 0);
            arg1.method3662(class148.field2438, field710 + 708 + 25, 16, 16777215, -1);
            field729 = -1;
            if (Statics.field1345 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= field733) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= field733) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= field733) {
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
                int var19 = field710 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < field733; var22++) {
                    class24 var23 = Statics.field652[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field630);
                    if (var23.field630 == -1) {
                        var25 = class148.field2472;
                        var24 = false;
                    } else if (var23.field630 > 1980) {
                        var25 = class148.field2473;
                        var24 = false;
                    }
                    byte var26;
                    if (var23.method533()) {
                        if (var23.method532()) {
                            var26 = 3;
                        } else {
                            var26 = 2;
                        }
                    } else if (var23.method532()) {
                        var26 = 1;
                    } else {
                        var26 = 0;
                    }
                    if (class132.field2070 >= var19 && class132.field2067 >= var18 && class132.field2070 < var8 + var19 && class132.field2067 < var9 + var18 && var24) {
                        field729 = var22;
                        Statics.field1345[var26].method1546(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1345[var26].method1599(var19, var18);
                    }
                    if (Statics.field1563 != null) {
                        Statics.field1563[(var23.method532() ? 8 : 0) + var23.field633].method1663(var19 + 29, var18);
                    }
                    arg0.method3662(Integer.toString(var23.field632), var19 + 15, var9 / 2 + var18 + 5, 0, -1);
                    arg1.method3662(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var27 = arg1.method3655(Statics.field652[field729].field635) + 6;
                    int var28 = arg1.field3091 + 8;
                    class75.method1637(class132.field2070 - var27 / 2, class132.field2067 + 20 + 5, var27, var28, 16777120);
                    class75.method1614(class132.field2070 - var27 / 2, class132.field2067 + 20 + 5, var27, var28, 0);
                    arg1.method3662(Statics.field652[field729].field635, class132.field2070, class132.field2067 + 20 + 5 + arg1.field3091 + 4, 0, -1);
                }
            }
            try {
                Graphics var29 = Statics.field139.getGraphics();
                Statics.field59.method1454(var29, 0, 0);
            } catch (Exception var112) {
                Statics.field139.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field701.method1599(field710, 0);
            Statics.field705.method1599(field710 + 382, 0);
            Statics.field706.method1663(field710 + 382 - Statics.field706.field1379 / 2, 18);
        }
        if (client.field555 == 0 || client.field555 == 5) {
            byte var31 = 20;
            arg0.method3662(class148.field2412, field709 + 180, 245 - var31, 16777215, -1);
            int var32 = 253 - var31;
            class75.method1614(field709 + 180 - 152, var32, 304, 34, 9179409);
            class75.method1614(field709 + 180 - 151, var32 + 1, 302, 32, 0);
            class75.method1637(field709 + 180 - 150, var32 + 2, field717 * 3, 30, 9179409);
            class75.method1637(field717 * 3 + (field709 + 180 - 150), var32 + 2, 300 - field717 * 3, 30, 0);
            arg0.method3662(field704, field709 + 180, 276 - var31, 16777215, -1);
        }
        if (client.field555 == 20) {
            Statics.field718.method1663(field709 + 180 - Statics.field718.field1379 / 2, 271 - Statics.field718.field1378 / 2);
            short var33 = 211;
            arg0.method3662(field720, field709 + 180, var33, 16776960, 0);
            int var114 = var33 + 15;
            arg0.method3662(field721, field709 + 180, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3662(field722, field709 + 180, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field719 != 4) {
                arg0.method3654(class148.field2431, field709 + 180 - 110, var117, 16777215, 0);
                short var34 = 200;
                String var35;
                for (var35 = field727; arg0.method3655(var35) > var34; var35 = var35.substring(0, var35.length() - 1)) {
                }
                arg0.method3654(class214.method3659(var35), field709 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                String var37 = class148.field2432;
                String var38 = field712;
                String var39 = class154.method139('*', var38.length());
                arg0.method3654(var37 + var39, field709 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field555 == 10 || client.field555 == 11) {
            Statics.field718.method1663(field709, 171);
            if (field719 == 0) {
                short var40 = 251;
                arg0.method3662(class148.field2434, field709 + 180, var40, 16776960, 0);
                int var118 = var40 + 30;
                int var41 = field709 + 180 - 80;
                short var42 = 291;
                Statics.field1935.method1663(var41 - 73, var42 - 20);
                arg0.method3663(class148.field2435, var41 - 73, var42 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var43 = field709 + 180 + 80;
                Statics.field1935.method1663(var43 - 73, var42 - 20);
                arg0.method3663(class148.field2224, var43 - 73, var42 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field719 == 1) {
                arg0.method3662(class148.field2416, field709 + 180, 211, 16776960, 0);
                short var44 = 236;
                arg0.method3662(field720, field709 + 180, var44, 16777215, 0);
                int var119 = var44 + 15;
                arg0.method3662(field721, field709 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3662(field722, field709 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                int var45 = field709 + 180 - 80;
                short var46 = 321;
                Statics.field1935.method1663(var45 - 73, var46 - 20);
                arg0.method3662(class148.field2207, var45, var46 + 5, 16777215, 0);
                int var47 = field709 + 180 + 80;
                Statics.field1935.method1663(var47 - 73, var46 - 20);
                arg0.method3662(class148.field2438, var47, var46 + 5, 16777215, 0);
            } else if (field719 == 2) {
                short var48 = 211;
                arg0.method3662(field720, field709 + 180, var48, 16776960, 0);
                int var122 = var48 + 15;
                arg0.method3662(field721, field709 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3662(field722, field709 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3654(class148.field2431, field709 + 180 - 110, var125, 16777215, 0);
                short var49 = 200;
                String var50;
                for (var50 = field727; arg0.method3655(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method3654(class214.method3659(var50) + (field735 == 0 & client.field289 % 40 < 20 ? class2.method2134(16776960) + class2.field22 : ""), field709 + 180 - 70, var125, 16777215, 0);
                var122 = var125 + 15;
                String var52 = class148.field2432;
                String var53 = field712;
                String var54 = class154.method139('*', var53.length());
                arg0.method3654(var52 + var54 + (field735 == 1 & client.field289 % 40 < 20 ? class2.method2134(16776960) + class2.field22 : ""), field709 + 180 - 108, var122, 16777215, 0);
                var122 += 15;
                int var55 = field709 + 180 - 80;
                short var56 = 321;
                Statics.field1935.method1663(var55 - 73, var56 - 20);
                arg0.method3662(class148.field2460, var55, var56 + 5, 16777215, 0);
                int var57 = field709 + 180 + 80;
                Statics.field1935.method1663(var57 - 73, var56 - 20);
                arg0.method3662(class148.field2438, var57, var56 + 5, 16777215, 0);
                short var58 = 357;
                arg1.method3662(class148.field2474, field709 + 180, var58, 16776960, 0);
            } else if (field719 == 4) {
                arg0.method3662(class148.field2210, field709 + 180, 211, 16776960, 0);
                short var59 = 236;
                arg0.method3662(field720, field709 + 180, var59, 16777215, 0);
                int var126 = var59 + 15;
                arg0.method3662(field721, field709 + 180, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3662(field722, field709 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var61 = class148.field2371;
                String var62 = Statics.field564;
                String var63 = class154.method139('*', var62.length());
                arg0.method3654(var61 + var63 + (client.field289 % 40 < 20 ? class2.method2134(16776960) + class2.field22 : ""), field709 + 180 - 108, var128, 16777215, 0);
                int var129 = var128 - 8;
                arg0.method3654(class148.field2209, field709 + 180 - 9, var129, 16776960, 0);
                int var130 = var129 + 15;
                arg0.method3654(class148.field2253, field709 + 180 - 9, var130, 16776960, 0);
                int var64 = field709 + 180 - 9 + arg0.method3655(class148.field2253) + 15;
                int var65 = var130 - arg0.field3091;
                class76 var66;
                if (field726) {
                    var66 = Statics.field1967;
                } else {
                    var66 = Statics.field1980;
                }
                var66.method1663(var64, var65);
                var126 = var130 + 15;
                int var67 = field709 + 180 - 80;
                short var68 = 321;
                Statics.field1935.method1663(var67 - 73, var68 - 20);
                arg0.method3662(class148.field2207, var67, var68 + 5, 16777215, 0);
                int var69 = field709 + 180 + 80;
                Statics.field1935.method1663(var69 - 73, var68 - 20);
                arg0.method3662(class148.field2438, var69, var68 + 5, 16777215, 0);
                arg1.method3662(class148.field2352, field709 + 180, var68 + 36, 255, 0);
            } else if (field719 == 5) {
                arg0.method3662(class148.field2440, field709 + 180, 201, 16776960, 0);
                short var70 = 221;
                arg2.method3662(field720, field709 + 180, var70, 16776960, 0);
                int var131 = var70 + 15;
                arg2.method3662(field721, field709 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg2.method3662(field722, field709 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var134 = var133 + 14;
                arg0.method3654(class148.field2441, field709 + 180 - 145, var134, 16777215, 0);
                short var71 = 174;
                String var72;
                for (var72 = field727; arg0.method3655(var72) > var71; var72 = var72.substring(1)) {
                }
                arg0.method3654(class214.method3659(var72) + (client.field289 % 40 < 20 ? class2.method2134(16776960) + class2.field22 : ""), field709 + 180 - 34, var134, 16777215, 0);
                var131 = var134 + 15;
                int var73 = field709 + 180 - 80;
                short var74 = 321;
                Statics.field1935.method1663(var73 - 73, var74 - 20);
                arg0.method3662(class148.field2390, var73, var74 + 5, 16777215, 0);
                int var75 = field709 + 180 + 80;
                Statics.field1935.method1663(var75 - 73, var74 - 20);
                arg0.method3662(class148.field2349, var75, var74 + 5, 16777215, 0);
            } else if (field719 == 6) {
                short var76 = 211;
                arg0.method3662(field720, field709 + 180, var76, 16776960, 0);
                int var135 = var76 + 15;
                arg0.method3662(field721, field709 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method3662(field722, field709 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var77 = field709 + 180;
                short var78 = 321;
                Statics.field1935.method1663(var77 - 73, var78 - 20);
                arg0.method3662(class148.field2349, var77, var78 + 5, 16777215, 0);
            }
        }
        if (field715 > 0) {
            method558(field715);
            field715 = 0;
        }
        short var79 = 256;
        if (field723 > 0) {
            for (int var80 = 0; var80 < 256; var80++) {
                if (field723 > 768) {
                    Statics.field662[var80] = method3613(Statics.field3060[var80], Statics.field1725[var80], 1024 - field723);
                } else if (field723 > 256) {
                    Statics.field662[var80] = Statics.field1725[var80];
                } else {
                    Statics.field662[var80] = method3613(Statics.field1725[var80], Statics.field3060[var80], 256 - field723);
                }
            }
        } else if (field730 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field730 > 768) {
                    Statics.field662[var81] = method3613(Statics.field3060[var81], Statics.field695[var81], 1024 - field730);
                } else if (field730 > 256) {
                    Statics.field662[var81] = Statics.field695[var81];
                } else {
                    Statics.field662[var81] = method3613(Statics.field695[var81], Statics.field3060[var81], 256 - field730);
                }
            }
        } else {
            for (int var82 = 0; var82 < 256; var82++) {
                Statics.field662[var82] = Statics.field3060[var82];
            }
        }
        class75.method1606(field710, 9, field710 + 128, var79 + 7);
        Statics.field701.method1599(field710, 0);
        class75.method1605();
        int var83 = 0;
        int var84 = field710 + Statics.field59.field1351 * 9;
        for (int var85 = 1; var85 < var79 - 1; var85++) {
            int var86 = (var79 - var85) * field724[var85] / var79;
            int var87 = var86 + 22;
            if (var87 < 0) {
                var87 = 0;
            }
            var83 += var87;
            for (int var88 = var87; var88 < 128; var88++) {
                int var89 = Statics.field258[var83++];
                if (var89 == 0) {
                    var84++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field662[var89];
                    int var93 = Statics.field59.field1350[var84];
                    Statics.field59.field1350[var84++] = ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) >> 8;
                }
            }
            var84 += Statics.field59.field1351 + var87 - 128;
        }
        class75.method1606(field710 + 765 - 128, 9, field710 + 765, var79 + 7);
        Statics.field705.method1599(field710 + 382, 0);
        class75.method1605();
        int var94 = 0;
        int var95 = field710 + Statics.field59.field1351 * 9 + 24 + 637;
        for (int var96 = 1; var96 < var79 - 1; var96++) {
            int var97 = (var79 - var96) * field724[var96] / var79;
            int var98 = 103 - var97;
            int var99 = var95 + var97;
            for (int var100 = 0; var100 < var98; var100++) {
                int var101 = Statics.field258[var94++];
                if (var101 == 0) {
                    var99++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field662[var101];
                    int var105 = Statics.field59.field1350[var99];
                    Statics.field59.field1350[var99++] = ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) + ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) >> 8;
                }
            }
            var94 += 128 - var98;
            var95 = Statics.field59.field1351 - var98 - var97 + var99;
        }
        Statics.field2492[Statics.field134.field148 ? 1 : 0].method1663(field710 + 765 - 40, 463);
        if (client.field555 > 5 && client.field286 == 0) {
            if (Statics.field941 == null) {
                Statics.field941 = class72.method1690(Statics.field115, "sl_button", "");
            } else {
                int var106 = field710 + 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field941.method1663(var106, var107);
                arg0.method3662(class148.field2367 + " " + client.field281, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field732 == null) {
                    arg1.method3662(class148.field2475, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3662(class148.field2278, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field139.getGraphics();
            Statics.field59.method1454(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field139.repaint();
        }
    }

    @ObfuscatedName("r.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method161(String arg0, String arg1, String arg2) {
        field720 = arg0;
        field721 = arg1;
        field722 = arg2;
    }

    @ObfuscatedName("x.f(Lbj;I)V")
    public static final void method134(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field963.length; var2++) {
            Statics.field963[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field963[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1944[var8] = (Statics.field963[var8 - 1] + Statics.field963[var8 + 1] + Statics.field963[var8 - 128] + Statics.field963[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field963;
            Statics.field963 = Statics.field1944;
            Statics.field1944 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1378; var11++) {
            for (int var12 = 0; var12 < arg0.field1379; var12++) {
                if (arg0.field1375[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1376;
                    int var14 = var11 + 16 + arg0.field1377;
                    int var15 = (var14 << 7) + var13;
                    Statics.field963[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("aj.b(II)V")
    public static final void method558(int arg0) {
        short var1 = 256;
        field707 += arg0 * 128;
        if (field707 > Statics.field963.length) {
            field707 -= Statics.field963.length;
            int var2 = (int) (Math.random() * 12.0D);
            method134(Statics.field703[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field258[var3 + var4] - Statics.field963[field707 + var3 & Statics.field963.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field258[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field258[var9 + var10] = 255;
                } else {
                    Statics.field258[var9 + var10] = 0;
                }
            }
        }
        if (field723 > 0) {
            field723 -= arg0 * 4;
        }
        if (field730 > 0) {
            field730 -= arg0 * 4;
        }
        if (field723 == 0 && field730 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field723 = 1024;
            }
            if (var12 == 1) {
                field730 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field724[var13] = field724[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field724[var14] = (int) (Math.sin((double) field731 / 14.0D) * 16.0D + Math.sin((double) field731 / 15.0D) * 14.0D + Math.sin((double) field731 / 16.0D) * 12.0D);
            field731++;
        }
        field714 += arg0 * 425675471;
        int var15 = ((client.field289 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field714 * 117211740; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field258[(var18 << 7) + var17] = 192;
        }
        field714 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field258[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field258[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field992[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field992[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field992[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field258[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("hu.t(IIII)I")
    public static final int method3613(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cr.i(Leh;I)V")
    public static void method1953(class136 arg0) {
        if (class132.field2065 != 1 && Statics.field568 || class132.field2065 != 4) {
            return;
        }
        int var1 = field710 + 280;
        if (class132.field2066 >= var1 && class132.field2066 <= var1 + 14 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(0, 0);
            return;
        }
        if (class132.field2066 >= var1 + 15 && class132.field2066 <= var1 + 80 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(0, 1);
            return;
        }
        int var2 = field710 + 390;
        if (class132.field2066 >= var2 && class132.field2066 <= var2 + 14 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(1, 0);
            return;
        }
        if (class132.field2066 >= var2 + 15 && class132.field2066 <= var2 + 80 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(1, 1);
            return;
        }
        int var3 = field710 + 500;
        if (class132.field2066 >= var3 && class132.field2066 <= var3 + 14 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(2, 0);
            return;
        }
        if (class132.field2066 >= var3 + 15 && class132.field2066 <= var3 + 80 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(2, 1);
            return;
        }
        int var4 = field710 + 610;
        if (class132.field2066 >= var4 && class132.field2066 <= var4 + 14 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(3, 0);
            return;
        }
        if (class132.field2066 >= var4 + 15 && class132.field2066 <= var4 + 80 && class132.field2060 >= 4 && class132.field2060 <= 18) {
            method516(3, 1);
            return;
        }
        if (class132.field2066 >= field710 + 708 && class132.field2060 >= 4 && class132.field2066 <= field710 + 708 + 50 && class132.field2060 <= 20) {
            field702 = false;
            Statics.field701.method1599(field710, 0);
            Statics.field705.method1599(field710 + 382, 0);
            Statics.field706.method1663(field710 + 382 - Statics.field706.field1379 / 2, 18);
            return;
        }
        if (field729 == -1) {
            return;
        }
        class24 var5 = Statics.field652[field729];
        method2041(var5);
        field702 = false;
        Statics.field701.method1599(field710, 0);
        Statics.field705.method1599(field710 + 382, 0);
        Statics.field706.method1663(field710 + 382 - Statics.field706.field1379 / 2, 18);
        return;
    }

    @ObfuscatedName("cc.c(Lw;B)V")
    public static void method2041(class24 arg0) {
        if (arg0.method532() != client.field284) {
            client.field284 = arg0.method532();
            class47.method2440(arg0.method532());
        }
        Statics.field1574 = arg0.field631;
        client.field281 = arg0.field632;
        client.field282 = arg0.field629;
        Statics.field315 = client.field310 == 0 ? 43594 : arg0.field632 + 40000;
        Statics.field996 = client.field310 == 0 ? 443 : arg0.field632 + 50000;
        Statics.field154 = Statics.field315;
    }

    @ObfuscatedName("v.k(B)V")
    public static void method162() {
        try {
            if (Statics.field732 == null) {
                Statics.field732 = new class18(Statics.field1869, new URL(Statics.field2538));
            } else {
                byte[] var0 = Statics.field732.method166();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field733 = var1.method2395();
                    Statics.field652 = new class24[field733];
                    int var2 = 0;
                    while (var2 < field733) {
                        class24 var3 = Statics.field652[var2] = new class24();
                        var3.field632 = var1.method2395();
                        var3.field629 = var1.method2366();
                        var3.field631 = var1.method2223();
                        var3.field635 = var1.method2223();
                        var3.field633 = var1.method2211();
                        var3.field630 = var1.method2389();
                        var3.field634 = var2++;
                    }
                    method522(Statics.field652, 0, Statics.field652.length - 1, field716, field736);
                    field702 = true;
                    Statics.field732 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field732 = null;
        }
    }

    @ObfuscatedName("z.x(III)V")
    public static void method516(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field716[var5] != arg0) {
                var2[var4] = field716[var5];
                var3[var4] = field736[var5];
                var4++;
            }
        }
        field716 = var2;
        field736 = var3;
        method522(Statics.field652, 0, Statics.field652.length - 1, field716, field736);
    }

    @ObfuscatedName("z.e([Lw;II[I[IB)V")
    public static void method522(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field634;
                        var12 = var8.field634;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field630;
                        var12 = var8.field630;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method532() ? 1 : 0;
                        var12 = var8.method532() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field632;
                        var12 = var8.field632;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field634;
                        var16 = var8.field634;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field630;
                        var16 = var8.field630;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method532() ? 1 : 0;
                        var16 = var8.method532() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field632;
                        var16 = var8.field632;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method522(arg0, arg1, var6, arg3, arg4);
        method522(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

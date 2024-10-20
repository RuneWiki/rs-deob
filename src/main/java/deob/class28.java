package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("al")
public class class28 {

    @ObfuscatedName("al.c")
    public static int[] field658 = new int[256];

    @ObfuscatedName("al.v")
    public static int field660 = 0;

    @ObfuscatedName("al.u")
    public static int field675 = 0;

    @ObfuscatedName("al.aj")
    public static int field663 = 0;

    @ObfuscatedName("al.al")
    public static int field669 = 0;

    @ObfuscatedName("al.af")
    public static int field652 = 0;

    @ObfuscatedName("al.ai")
    public static int field666 = 0;

    @ObfuscatedName("al.ak")
    public static int field667 = 10;

    @ObfuscatedName("al.ae")
    public static String field668 = "";

    @ObfuscatedName("al.ag")
    public static int field684 = 0;

    @ObfuscatedName("al.ar")
    public static String field670 = "";

    @ObfuscatedName("al.an")
    public static String field676 = "";

    @ObfuscatedName("al.av")
    public static String field672 = "";

    @ObfuscatedName("al.aw")
    public static String field680 = "";

    @ObfuscatedName("al.aq")
    public static String field674 = "";

    @ObfuscatedName("al.ad")
    public static class144 field665 = class144.field2413;

    @ObfuscatedName("al.ay")
    public static boolean field677 = true;

    @ObfuscatedName("al.am")
    public static int field678 = 0;

    @ObfuscatedName("al.az")
    public static String field679 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("al.au")
    public static String field689 = "1234567890";

    @ObfuscatedName("al.ab")
    public static boolean field681 = false;

    @ObfuscatedName("al.bd")
    public static int field683 = 0;

    @ObfuscatedName("al.bf")
    public static int[] field664 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("al.bk")
    public static int[] field685 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("al.bs")
    public static int field686 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.j(Leg;Leg;I)I")
    public static int method2693(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2762("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2762("logo", "")) {
            var2++;
        }
        if (arg1.method2762("titlebox", "")) {
            var2++;
        }
        if (arg1.method2762("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2762("runes", "")) {
            var2++;
        }
        if (arg1.method2762("title_mute", "")) {
            var2++;
        }
        if (arg1.method2817("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2817("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2762("sl_back", "");
        arg1.method2762("sl_flags", "");
        arg1.method2762("sl_arrows", "");
        arg1.method2762("sl_stars", "");
        arg1.method2762("sl_button", "");
        return var2;
    }

    @ObfuscatedName("n.z(Ljava/awt/Component;Leg;Leg;ZII)V")
    public static void method108(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field653) {
            field684 = arg4;
            class73.method1522();
            byte[] var5 = arg1.method2756("title.jpg", "");
            Statics.field651 = new class72(var5, arg0);
            Statics.field659 = Statics.field651.method1424();
            Statics.field647 = class70.method496(arg2, "logo", "");
            Statics.field648 = class70.method496(arg2, "titlebox", "");
            Statics.field649 = class70.method496(arg2, "titlebutton", "");
            Statics.field673 = class70.method1972(arg2, "runes", "");
            Statics.field654 = class70.method1972(arg2, "title_mute", "");
            Statics.field655 = class70.method496(arg2, "options_radio_buttons,0", "");
            Statics.field2920 = class70.method496(arg2, "options_radio_buttons,2", "");
            Statics.field11 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field11[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field11[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field11[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field11[var9 + 192] = 16777215;
            }
            Statics.field701 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field701[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field701[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field701[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field701[var13 + 192] = 16777215;
            }
            Statics.field650 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field650[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field650[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field650[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field650[var17 + 192] = 16777215;
            }
            Statics.field559 = new int[256];
            Statics.field1976 = new int[32768];
            Statics.field671 = new int[32768];
            method2718((class74) null);
            Statics.field628 = new int[32768];
            Statics.field2869 = new int[32768];
            if (arg3) {
                field680 = "";
                field674 = "";
            }
            Statics.field1122 = 0;
            Statics.field656 = "";
            field677 = true;
            field681 = false;
            if (Statics.field1921.field147) {
                class161.method2553(2);
            } else {
                class147 var18 = Statics.field940;
                int var19 = var18.method2771("scape main");
                int var20 = var18.method2755(var19, "");
                class161.field2716 = 1;
                Statics.field1004 = var18;
                Statics.field1285 = var19;
                Statics.field979 = var20;
                Statics.field2121 = 255;
                Statics.field1677 = false;
                Statics.field2886 = 2;
            }
            class150.method80(false);
            Statics.field653 = true;
            Statics.field651.method1474(0, 0);
            Statics.field659.method1474(382, 0);
            Statics.field647.method1586(382 - Statics.field647.field1324 / 2, 18);
        } else if (arg4 == 4) {
            field684 = 4;
        }
    }

    @ObfuscatedName("ai.y(I)V")
    public static void method547() {
        if (!Statics.field653) {
            return;
        }
        Statics.field648 = null;
        Statics.field649 = null;
        Statics.field673 = null;
        Statics.field651 = null;
        Statics.field659 = null;
        Statics.field647 = null;
        Statics.field654 = null;
        Statics.field655 = null;
        Statics.field2920 = null;
        Statics.field248 = null;
        Statics.field236 = null;
        Statics.field1851 = null;
        Statics.field2671 = null;
        Statics.field682 = null;
        Statics.field11 = null;
        Statics.field701 = null;
        Statics.field650 = null;
        Statics.field559 = null;
        Statics.field1976 = null;
        Statics.field671 = null;
        Statics.field628 = null;
        Statics.field2869 = null;
        class161.method2553(2);
        class150.method80(true);
        Statics.field653 = false;
    }

    @ObfuscatedName("a.h(Lef;B)V")
    public static void method127(class131 arg0) {
        if (field681) {
            method135(arg0);
            return;
        }
        if ((class127.field2019 == 1 || !Statics.field58 && class127.field2019 == 4) && class127.field2020 >= 715 && class127.field2021 >= 453) {
            Statics.field1921.field147 = !Statics.field1921.field147;
            class9.method552();
            if (Statics.field1921.field147) {
                class161.method2717();
            } else {
                class147 var1 = Statics.field940;
                int var2 = var1.method2771("scape main");
                int var3 = var1.method2755(var2, "");
                class161.method620(var1, var2, var3, 255, false);
            }
        }
        if (client.field268 == 5) {
            return;
        }
        field652++;
        if (client.field268 != 10 && client.field268 != 11) {
            return;
        }
        if (client.field266 == 0) {
            if (class127.field2019 == 1 || !Statics.field58 && class127.field2019 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class127.field2020 >= var4 && class127.field2020 <= var4 + var6 && class127.field2021 >= var5 && class127.field2021 <= var5 + var7) {
                    method91();
                    return;
                }
            }
            if (Statics.field122 != null) {
                method91();
            }
        }
        int var8 = class127.field2019;
        int var9 = class127.field2020;
        int var10 = class127.field2021;
        if (!Statics.field58 && var8 == 4) {
            var8 = 1;
        }
        if (field684 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                label477: {
                    String var13 = client.method1976("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var13));
                            break label477;
                        } catch (Exception var32) {
                        }
                    }
                    if (class125.field1995.startsWith("win")) {
                        class125.method2325(var13, 0);
                    } else if (class125.field1995.startsWith("mac")) {
                        class125.method454(var13, 1, "openjs");
                    } else {
                        class125.method2325(var13, 2);
                    }
                }
            }
            short var15 = 462;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field262 & 0x4) != 0) {
                    if ((client.field262 & 0x400) == 0) {
                        field670 = class142.field2370;
                        field676 = class142.field2332;
                        field672 = class142.field2168;
                    } else {
                        field670 = class142.field2378;
                        field676 = class142.field2377;
                        field672 = class142.field2204;
                    }
                    field684 = 1;
                    field678 = 0;
                } else if ((client.field262 & 0x400) == 0) {
                    field670 = class142.field2366;
                    field676 = class142.field2316;
                    field672 = class142.field2368;
                    field684 = 2;
                    field678 = 0;
                } else {
                    field670 = class142.field2354;
                    field676 = class142.field2398;
                    field672 = class142.field2375;
                    field684 = 1;
                    field678 = 0;
                }
            }
        } else if (field684 == 1) {
            while (class124.method299()) {
                if (Statics.field530 == 84) {
                    field670 = class142.field2366;
                    field676 = class142.field2316;
                    field672 = class142.field2368;
                    field684 = 2;
                    field678 = 0;
                } else if (Statics.field530 == 13) {
                    field684 = 0;
                }
            }
            short var16 = 302;
            short var17 = 321;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var17 - 20 && var10 <= var17 + 20) {
                field670 = class142.field2366;
                field676 = class142.field2316;
                field672 = class142.field2368;
                field684 = 2;
                field678 = 0;
            }
            short var18 = 462;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var17 - 20 && var10 <= var17 + 20) {
                field684 = 0;
            }
        } else if (field684 == 2) {
            short var19 = 231;
            int var34 = var19 + 30;
            if (var8 == 1 && var10 >= var34 - 15 && var10 < var34) {
                field678 = 0;
            }
            var34 += 15;
            if (var8 == 1 && var10 >= var34 - 15 && var10 < var34) {
                field678 = 1;
            }
            var34 += 15;
            short var20 = 302;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field680 = field680.trim();
                if (field680.length() == 0) {
                    method1312(class142.field2272, class142.field2251, class142.field2274);
                    return;
                }
                if (field674.length() == 0) {
                    method1312(class142.field2275, class142.field2228, class142.field2277);
                    return;
                }
                method1312(class142.field2381, class142.field2315, class142.field2184);
                field665 = Statics.field1921.field139.containsKey(class197.method1982(field680)) ? class144.field2417 : class144.field2413;
                client.method1978(20);
                return;
            }
            short var22 = 462;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field684 = 0;
                field680 = "";
                field674 = "";
                Statics.field1122 = 0;
                Statics.field656 = "";
                field677 = true;
            }
            while (true) {
                while (class124.method299()) {
                    boolean var23 = false;
                    for (int var24 = 0; var24 < field679.length(); var24++) {
                        if (Statics.field198 == field679.charAt(var24)) {
                            var23 = true;
                            break;
                        }
                    }
                    if (Statics.field530 == 13) {
                        field684 = 0;
                        field680 = "";
                        field674 = "";
                        Statics.field1122 = 0;
                        Statics.field656 = "";
                        field677 = true;
                    } else if (field678 == 0) {
                        if (Statics.field530 == 85 && field680.length() > 0) {
                            field680 = field680.substring(0, field680.length() - 1);
                        }
                        if (Statics.field530 == 84 || Statics.field530 == 80) {
                            field678 = 1;
                        }
                        if (var23 && field680.length() < 320) {
                            field680 = field680 + Statics.field198;
                        }
                    } else if (field678 == 1) {
                        if (Statics.field530 == 85 && field674.length() > 0) {
                            field674 = field674.substring(0, field674.length() - 1);
                        }
                        if (Statics.field530 == 84 || Statics.field530 == 80) {
                            field678 = 0;
                        }
                        if (Statics.field530 == 84) {
                            field680 = field680.trim();
                            if (field680.length() == 0) {
                                method1312(class142.field2272, class142.field2251, class142.field2274);
                                return;
                            }
                            if (field674.length() == 0) {
                                method1312(class142.field2275, class142.field2228, class142.field2277);
                                return;
                            }
                            method1312(class142.field2381, class142.field2315, class142.field2184);
                            field665 = Statics.field1921.field139.containsKey(class197.method1982(field680)) ? class144.field2417 : class144.field2413;
                            client.method1978(20);
                            return;
                        }
                        if (var23 && field674.length() < 20) {
                            field674 = field674 + Statics.field198;
                        }
                    }
                }
                return;
            }
        } else if (field684 == 4) {
            short var25 = 302;
            short var26 = 321;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                Statics.field656.trim();
                if (Statics.field656.length() != 6) {
                    method1312(class142.field2188, class142.field2189, class142.field2190);
                    return;
                }
                Statics.field1122 = Integer.parseInt(Statics.field656);
                Statics.field656 = "";
                field665 = field677 ? class144.field2412 : class144.field2418;
                method1312(class142.field2381, class142.field2315, class142.field2184);
                client.method1978(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field677 = !field677;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                label492: {
                    String var27 = client.method1976("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var27));
                            break label492;
                        } catch (Exception var33) {
                        }
                    }
                    if (class125.field1995.startsWith("win")) {
                        class125.method2325(var27, 0);
                    } else if (class125.field1995.startsWith("mac")) {
                        class125.method454(var27, 1, "openjs");
                    } else {
                        class125.method2325(var27, 2);
                    }
                }
            }
            short var29 = 462;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var26 - 20 && var10 <= var26 + 20) {
                field684 = 0;
                field680 = "";
                field674 = "";
                Statics.field1122 = 0;
                Statics.field656 = "";
            }
            while (class124.method299()) {
                boolean var30 = false;
                for (int var31 = 0; var31 < field689.length(); var31++) {
                    if (Statics.field198 == field689.charAt(var31)) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field530 == 13) {
                    field684 = 0;
                    field680 = "";
                    field674 = "";
                    Statics.field1122 = 0;
                    Statics.field656 = "";
                } else {
                    if (Statics.field530 == 85 && Statics.field656.length() > 0) {
                        Statics.field656 = Statics.field656.substring(0, Statics.field656.length() - 1);
                    }
                    if (Statics.field530 == 84) {
                        Statics.field656.trim();
                        if (Statics.field656.length() != 6) {
                            method1312(class142.field2188, class142.field2189, class142.field2190);
                            return;
                        }
                        Statics.field1122 = Integer.parseInt(Statics.field656);
                        Statics.field656 = "";
                        field665 = field677 ? class144.field2412 : class144.field2418;
                        method1312(class142.field2381, class142.field2315, class142.field2184);
                        client.method1978(20);
                        return;
                    }
                    if (var30 && Statics.field656.length() < 6) {
                        Statics.field656 = Statics.field656 + Statics.field198;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.r(Lgq;Lgq;I)V")
    public static void method1979(class191 arg0, class191 arg1) {
        if (field681) {
            method664(arg0, arg1);
            return;
        }
        if (client.field268 == 0 || client.field268 == 5) {
            byte var2 = 20;
            arg0.method3346(class142.field2365, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1539(230, var3, 304, 34, 9179409);
            class73.method1539(231, var3 + 1, 302, 32, 0);
            class73.method1524(232, var3 + 2, field667 * 3, 30, 9179409);
            class73.method1524(field667 * 3 + 232, var3 + 2, 300 - field667 * 3, 30, 0);
            arg0.method3346(field668, 382, 276 - var2, 16777215, -1);
        }
        if (client.field268 == 20) {
            Statics.field648.method1586(382 - Statics.field648.field1324 / 2, 271 - Statics.field648.field1328 / 2);
            short var4 = 211;
            arg0.method3346(field670, 382, var4, 16776960, 0);
            int var78 = var4 + 15;
            arg0.method3346(field676, 382, var78, 16776960, 0);
            int var79 = var78 + 15;
            arg0.method3346(field672, 382, var79, 16776960, 0);
            int var80 = var79 + 15;
            int var81 = var80 + 10;
            if (field684 != 4) {
                arg0.method3344(class142.field2384, 272, var81, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field680; arg0.method3339(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3344(class190.method3343(var6), 312, var81, 16777215, 0);
                var78 = var81 + 15;
                arg0.method3344(class142.field2385 + class197.method2366(field674), 274, var78, 16777215, 0);
                var78 += 15;
            }
        }
        if (client.field268 == 10 || client.field268 == 11) {
            Statics.field648.method1586(202, 171);
            if (field684 == 0) {
                short var7 = 251;
                arg0.method3346(class142.field2218, 382, var7, 16776960, 0);
                int var82 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field649.method1586(var8 - 73, var9 - 20);
                arg0.method3347(class142.field2249, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field649.method1586(var10 - 73, var9 - 20);
                arg0.method3347(class142.field2389, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field684 == 1) {
                arg0.method3346(class142.field2288, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3346(field670, 382, var11, 16777215, 0);
                int var83 = var11 + 15;
                arg0.method3346(field676, 382, var83, 16777215, 0);
                int var84 = var83 + 15;
                arg0.method3346(field672, 382, var84, 16777215, 0);
                int var85 = var84 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field649.method1586(var12 - 73, var13 - 20);
                arg0.method3346(class142.field2161, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field649.method1586(var14 - 73, var13 - 20);
                arg0.method3346(class142.field2276, var14, var13 + 5, 16777215, 0);
            } else if (field684 == 2) {
                short var15 = 211;
                arg0.method3346(field670, 382, var15, 16776960, 0);
                int var86 = var15 + 15;
                arg0.method3346(field676, 382, var86, 16776960, 0);
                int var87 = var86 + 15;
                arg0.method3346(field672, 382, var87, 16776960, 0);
                int var88 = var87 + 15;
                int var89 = var88 + 10;
                arg0.method3344(class142.field2384, 272, var89, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field680; arg0.method3339(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3344(class190.method3343(var17) + (field678 == 0 & client.field280 % 40 < 20 ? class2.method2720(16776960) + class2.field16 : ""), 312, var89, 16777215, 0);
                var86 = var89 + 15;
                String var19 = class142.field2385;
                String var20 = field674;
                int var21 = var20.length();
                char[] var22 = new char[var21];
                for (int var23 = 0; var23 < var21; var23++) {
                    var22[var23] = '*';
                }
                String var24 = new String(var22);
                arg0.method3344(var19 + var24 + (field678 == 1 & client.field280 % 40 < 20 ? class2.method2720(16776960) + class2.field16 : ""), 274, var86, 16777215, 0);
                var86 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field649.method1586(var26 - 73, var27 - 20);
                arg0.method3346(class142.field2283, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field649.method1586(var28 - 73, var27 - 20);
                arg0.method3346(class142.field2276, var28, var27 + 5, 16777215, 0);
            } else if (field684 == 4) {
                arg0.method3346(class142.field2379, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3346(field670, 382, var29, 16777215, 0);
                int var90 = var29 + 15;
                arg0.method3346(field676, 382, var90, 16777215, 0);
                int var91 = var90 + 15;
                arg0.method3346(field672, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                String var31 = class142.field2386;
                String var32 = Statics.field656;
                int var33 = var32.length();
                char[] var34 = new char[var33];
                for (int var35 = 0; var35 < var33; var35++) {
                    var34[var35] = '*';
                }
                String var36 = new String(var34);
                arg0.method3344(var31 + var36 + (client.field280 % 40 < 20 ? class2.method2720(16776960) + class2.field16 : ""), 274, var92, 16777215, 0);
                var90 = var92 - 8;
                arg0.method3344(class142.field2343, 373, var90, 16776960, 0);
                var90 += 15;
                arg0.method3344(class142.field2367, 373, var90, 16776960, 0);
                int var38 = 373 + arg0.method3339(class142.field2367) + 15;
                int var39 = var90 - arg0.field2896;
                class74 var40;
                if (field677) {
                    var40 = Statics.field2920;
                } else {
                    var40 = Statics.field655;
                }
                var40.method1586(var38, var39);
                var90 += 15;
                short var41 = 302;
                short var42 = 321;
                Statics.field649.method1586(var41 - 73, var42 - 20);
                arg0.method3346(class142.field2161, var41, var42 + 5, 16777215, 0);
                short var43 = 462;
                Statics.field649.method1586(var43 - 73, var42 - 20);
                arg0.method3346(class142.field2276, var43, var42 + 5, 16777215, 0);
                arg1.method3346(class142.field2380, 382, var42 + 36, 255, 0);
            }
        }
        if (field652 > 0) {
            int var44 = field652;
            short var45 = 256;
            field663 += var44 * 128;
            if (field663 > Statics.field1976.length) {
                field663 -= Statics.field1976.length;
                int var46 = (int) (Math.random() * 12.0D);
                method2718(Statics.field673[var46]);
            }
            int var47 = 0;
            int var48 = var44 * 128;
            int var49 = (var45 - var44) * 128;
            for (int var50 = 0; var50 < var49; var50++) {
                int var51 = Statics.field628[var47 + var48] - Statics.field1976[field663 + var47 & Statics.field1976.length - 1] * var44 / 6;
                if (var51 < 0) {
                    var51 = 0;
                }
                Statics.field628[var47++] = var51;
            }
            for (int var52 = var45 - var44; var52 < var45; var52++) {
                int var53 = var52 * 128;
                for (int var54 = 0; var54 < 128; var54++) {
                    int var55 = (int) (Math.random() * 100.0D);
                    if (var55 < 50 && var54 > 10 && var54 < 118) {
                        Statics.field628[var53 + var54] = 255;
                    } else {
                        Statics.field628[var53 + var54] = 0;
                    }
                }
            }
            if (field660 > 0) {
                field660 -= var44 * 4;
            }
            if (field675 > 0) {
                field675 -= var44 * 4;
            }
            if (field660 == 0 && field675 == 0) {
                int var56 = (int) (Math.random() * (double) (2000 / var44));
                if (var56 == 0) {
                    field660 = 1024;
                }
                if (var56 == 1) {
                    field675 = 1024;
                }
            }
            for (int var57 = 0; var57 < var45 - var44; var57++) {
                field658[var57] = field658[var44 + var57];
            }
            for (int var58 = var45 - var44; var58 < var45; var58++) {
                field658[var58] = (int) (Math.sin((double) field666 / 14.0D) * 16.0D + Math.sin((double) field666 / 15.0D) * 14.0D + Math.sin((double) field666 / 16.0D) * 12.0D);
                field666++;
            }
            field669 += var44 * -1400921707;
            int var59 = ((client.field280 & 0x1) + var44) / 2;
            if (var59 > 0) {
                for (int var60 = 0; var60 < field669 * 1334521300; var60++) {
                    int var61 = (int) (Math.random() * 124.0D) + 2;
                    int var62 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field628[(var62 << 7) + var61] = 192;
                }
                field669 = 0;
                int var63 = 0;
                label212: while (true) {
                    if (var63 >= var45) {
                        int var67 = 0;
                        while (true) {
                            if (var67 >= 128) {
                                break label212;
                            }
                            int var68 = 0;
                            for (int var69 = -var59; var69 < var45; var69++) {
                                int var70 = var69 * 128;
                                if (var59 + var69 < var45) {
                                    var68 += Statics.field2869[var59 * 128 + var67 + var70];
                                }
                                if (var69 - (var59 + 1) >= 0) {
                                    var68 -= Statics.field2869[var67 + var70 - (var59 + 1) * 128];
                                }
                                if (var69 >= 0) {
                                    Statics.field628[var67 + var70] = var68 / (var59 * 2 + 1);
                                }
                            }
                            var67++;
                        }
                    }
                    int var64 = 0;
                    int var65 = var63 * 128;
                    for (int var66 = -var59; var66 < 128; var66++) {
                        if (var59 + var66 < 128) {
                            var64 += Statics.field628[var65 + var66 + var59];
                        }
                        if (var66 - (var59 + 1) >= 0) {
                            var64 -= Statics.field628[var65 + var66 - (var59 + 1)];
                        }
                        if (var66 >= 0) {
                            Statics.field2869[var65 + var66] = var64 / (var59 * 2 + 1);
                        }
                    }
                    var63++;
                }
            }
            field652 = 0;
        }
        method549();
        Statics.field654[Statics.field1921.field147 ? 1 : 0].method1586(725, 463);
        if (client.field268 > 5 && client.field266 == 0) {
            if (Statics.field682 == null) {
                Statics.field682 = class70.method496(Statics.field1827, "sl_button", "");
            } else {
                byte var71 = 5;
                short var72 = 463;
                byte var73 = 100;
                byte var74 = 35;
                Statics.field682.method1586(var71, var72);
                arg0.method3346(class142.field2357 + " " + client.field350, var73 / 2 + var71, var74 / 2 + var72 - 2, 16777215, 0);
                if (Statics.field122 == null) {
                    arg1.method3346(class142.field2402, var73 / 2 + var71, var74 / 2 + var72 + 12, 16777215, 0);
                } else {
                    arg1.method3346(class142.field2395, var73 / 2 + var71, var74 / 2 + var72 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var75 = Statics.field1521.getGraphics();
            Statics.field200.method1338(var75, 0, 0);
        } catch (Exception var77) {
            Statics.field1521.repaint();
        }
    }

    @ObfuscatedName("bb.e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1312(String arg0, String arg1, String arg2) {
        field670 = arg0;
        field676 = arg1;
        field672 = arg2;
    }

    @ObfuscatedName("ex.k(Lby;I)V")
    public static final void method2718(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1976.length; var2++) {
            Statics.field1976[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1976[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field671[var8] = (Statics.field1976[var8 - 1] + Statics.field1976[var8 + 1] + Statics.field1976[var8 - 128] + Statics.field1976[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1976;
            Statics.field1976 = Statics.field671;
            Statics.field671 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1328; var11++) {
            for (int var12 = 0; var12 < arg0.field1324; var12++) {
                if (arg0.field1325[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1326;
                    int var14 = var11 + 16 + arg0.field1327;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1976[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("o.b(IIII)I")
    public static final int method152(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ai.n(B)V")
    public static final void method549() {
        short var0 = 256;
        if (field660 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field660 > 768) {
                    Statics.field559[var1] = method152(Statics.field11[var1], Statics.field701[var1], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field559[var1] = Statics.field701[var1];
                } else {
                    Statics.field559[var1] = method152(Statics.field701[var1], Statics.field11[var1], 256 - field660);
                }
            }
        } else if (field675 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field675 > 768) {
                    Statics.field559[var2] = method152(Statics.field11[var2], Statics.field650[var2], 1024 - field675);
                } else if (field675 > 256) {
                    Statics.field559[var2] = Statics.field650[var2];
                } else {
                    Statics.field559[var2] = method152(Statics.field650[var2], Statics.field11[var2], 256 - field675);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field559[var3] = Statics.field11[var3];
            }
        }
        class73.method1518(0, 9, 128, var0 + 7);
        Statics.field651.method1474(0, 0);
        class73.method1544();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field658[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field628[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field559[var10];
                    int var14 = Statics.field200.field1299[var5];
                    Statics.field200.field1299[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1518(637, 9, 765, var0 + 7);
        Statics.field659.method1474(382, 0);
        class73.method1544();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field658[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field628[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field559[var22];
                    int var26 = Statics.field200.field1299[var20];
                    Statics.field200.field1299[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("av.a(Lgq;Lgq;I)V")
    public static void method664(class191 arg0, class191 arg1) {
        if (Statics.field248 == null) {
            Statics.field248 = class70.method442(Statics.field1827, "sl_back", "");
        }
        if (Statics.field236 == null) {
            Statics.field236 = class70.method1972(Statics.field1827, "sl_flags", "");
        }
        if (Statics.field1851 == null) {
            Statics.field1851 = class70.method1972(Statics.field1827, "sl_arrows", "");
        }
        if (Statics.field2671 == null) {
            Statics.field2671 = class70.method1972(Statics.field1827, "sl_stars", "");
        }
        class73.method1524(0, 23, 765, 480, 0);
        class73.method1552(0, 0, 125, 23, 12425273, 9135624);
        class73.method1552(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3346(class142.field2392, 62, 15, 0, -1);
        if (Statics.field2671 != null) {
            Statics.field2671[1].method1586(140, 1);
            arg1.method3344(class142.field2393, 152, 10, 16777215, -1);
            Statics.field2671[0].method1586(140, 12);
            arg1.method3344(class142.field2212, 152, 21, 16777215, -1);
        }
        if (Statics.field1851 != null) {
            short var2 = 280;
            if (field664[0] == 0 && field685[0] == 0) {
                Statics.field1851[2].method1586(var2, 4);
            } else {
                Statics.field1851[0].method1586(var2, 4);
            }
            if (field664[0] == 0 && field685[0] == 1) {
                Statics.field1851[3].method1586(var2 + 15, 4);
            } else {
                Statics.field1851[1].method1586(var2 + 15, 4);
            }
            arg0.method3344(class142.field2268, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field664[0] == 1 && field685[0] == 0) {
                Statics.field1851[2].method1586(var3, 4);
            } else {
                Statics.field1851[0].method1586(var3, 4);
            }
            if (field664[0] == 1 && field685[0] == 1) {
                Statics.field1851[3].method1586(var3 + 15, 4);
            } else {
                Statics.field1851[1].method1586(var3 + 15, 4);
            }
            arg0.method3344(class142.field2396, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field664[0] == 2 && field685[0] == 0) {
                Statics.field1851[2].method1586(var4, 4);
            } else {
                Statics.field1851[0].method1586(var4, 4);
            }
            if (field664[0] == 2 && field685[0] == 1) {
                Statics.field1851[3].method1586(var4 + 15, 4);
            } else {
                Statics.field1851[1].method1586(var4 + 15, 4);
            }
            arg0.method3344(class142.field2328, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field664[0] == 3 && field685[0] == 0) {
                Statics.field1851[2].method1586(var5, 4);
            } else {
                Statics.field1851[0].method1586(var5, 4);
            }
            if (field664[0] == 3 && field685[0] == 1) {
                Statics.field1851[3].method1586(var5 + 15, 4);
            } else {
                Statics.field1851[1].method1586(var5 + 15, 4);
            }
            arg0.method3344(class142.field2351, var5 + 32, 17, 16777215, -1);
        }
        class73.method1524(708, 4, 50, 16, 0);
        arg1.method3346(class142.field2276, 733, 16, 16777215, -1);
        field686 = -1;
        if (Statics.field248 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field683) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field683) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field683) {
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
            int var17 = var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < field683; var20++) {
                class22 var21 = Statics.field728[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field583);
                if (var21.field583 == -1) {
                    var23 = class142.field2294;
                    var22 = false;
                } else if (var21.field583 > 1980) {
                    var23 = class142.field2400;
                    var22 = false;
                }
                byte var24;
                if (var21.method459()) {
                    if (var21.method458()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method458()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field2016 >= var17 && class127.field2011 * 1253894097 >= var16 && class127.field2016 < var6 + var17 && class127.field2011 * 1253894097 < var7 + var16 && var22) {
                    field686 = var20;
                    Statics.field248[var24].method1438(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field248[var24].method1474(var17, var16);
                }
                if (Statics.field236 != null) {
                    Statics.field236[(var21.method458() ? 8 : 0) + var21.field581].method1586(var17 + 29, var16);
                }
                arg0.method3346(Integer.toString(var21.field594), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3346(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3339(Statics.field728[field686].field585) + 6;
                int var26 = arg1.field2896 + 8;
                class73.method1524(class127.field2016 - var25 / 2, class127.field2011 * 1253894097 + 20 + 5, var25, var26, 16777120);
                class73.method1539(class127.field2016 - var25 / 2, class127.field2011 * 1253894097 + 20 + 5, var25, var26, 0);
                arg1.method3346(Statics.field728[field686].field585, class127.field2016, class127.field2011 * 1253894097 + 20 + 5 + arg1.field2896 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1521.getGraphics();
            Statics.field200.method1338(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1521.repaint();
        }
    }

    @ObfuscatedName("i.q(Lef;I)V")
    public static void method135(class131 arg0) {
        if (class127.field2019 != 1 && Statics.field58 || class127.field2019 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2020 >= var1 && class127.field2020 <= var1 + 14 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(0, 0);
            return;
        }
        if (class127.field2020 >= var1 + 15 && class127.field2020 <= var1 + 80 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2020 >= var2 && class127.field2020 <= var2 + 14 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(1, 0);
            return;
        }
        if (class127.field2020 >= var2 + 15 && class127.field2020 <= var2 + 80 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2020 >= var3 && class127.field2020 <= var3 + 14 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(2, 0);
            return;
        }
        if (class127.field2020 >= var3 + 15 && class127.field2020 <= var3 + 80 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2020 >= var4 && class127.field2020 <= var4 + 14 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(3, 0);
            return;
        }
        if (class127.field2020 >= var4 + 15 && class127.field2020 <= var4 + 80 && class127.field2021 >= 4 && class127.field2021 <= 18) {
            method2475(3, 1);
            return;
        }
        if (class127.field2020 >= 708 && class127.field2021 >= 4 && class127.field2020 <= 758 && class127.field2021 <= 20) {
            field681 = false;
            Statics.field651.method1474(0, 0);
            Statics.field659.method1474(382, 0);
            Statics.field647.method1586(382 - Statics.field647.field1324 / 2, 18);
            return;
        }
        if (field686 == -1) {
            return;
        }
        class22 var5 = Statics.field728[field686];
        method485(var5);
        field681 = false;
        Statics.field651.method1474(0, 0);
        Statics.field659.method1474(382, 0);
        Statics.field647.method1586(382 - Statics.field647.field1324 / 2, 18);
        return;
    }

    @ObfuscatedName("l.i(Lu;B)V")
    public static void method485(class22 arg0) {
        if (arg0.method458() != client.field264) {
            client.field264 = arg0.method458();
            class45.method2391(arg0.method458());
        }
        Statics.field220 = arg0.field584;
        client.field350 = arg0.field594;
        client.field262 = arg0.field582;
        Statics.field1862 = client.field317 == 0 ? 43594 : arg0.field594 + 40000;
        Statics.field1001 = client.field317 == 0 ? 443 : arg0.field594 + 50000;
        Statics.field627 = Statics.field1862;
    }

    @ObfuscatedName("k.f(B)V")
    public static void method91() {
        try {
            if (Statics.field122 == null) {
                Statics.field122 = new class17(Statics.field1884, new URL(Statics.field267));
            } else {
                byte[] var0 = Statics.field122.method157();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field683 = var1.method2132();
                    Statics.field728 = new class22[field683];
                    int var2 = 0;
                    while (var2 < field683) {
                        class22 var3 = Statics.field728[var2] = new class22();
                        var3.field594 = var1.method2132();
                        var3.field582 = var1.method2135();
                        var3.field584 = var1.method2138();
                        var3.field585 = var1.method2138();
                        var3.field581 = var1.method2130();
                        var3.field583 = var1.method2133();
                        var3.field587 = var2++;
                    }
                    method2469(Statics.field728, 0, Statics.field728.length - 1, field664, field685);
                    field681 = true;
                    Statics.field122 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field122 = null;
        }
    }

    @ObfuscatedName("dv.o(III)V")
    public static void method2475(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field664[var5] != arg0) {
                var2[var4] = field664[var5];
                var3[var4] = field685[var5];
                var4++;
            }
        }
        field664 = var2;
        field685 = var3;
        method2469(Statics.field728, 0, Statics.field728.length - 1, field664, field685);
    }

    @ObfuscatedName("dm.t([Lu;II[I[IB)V")
    public static void method2469(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
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
                        var11 = arg0[var6].field587;
                        var12 = var8.field587;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field583;
                        var12 = var8.field583;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method458() ? 1 : 0;
                        var12 = var8.method458() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field594;
                        var12 = var8.field594;
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
                        var15 = arg0[var5].field587;
                        var16 = var8.field587;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field583;
                        var16 = var8.field583;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method458() ? 1 : 0;
                        var16 = var8.method458() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field594;
                        var16 = var8.field594;
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
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2469(arg0, arg1, var6, arg3, arg4);
        method2469(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

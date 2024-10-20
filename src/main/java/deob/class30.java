package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ar")
public class class30 {

    @ObfuscatedName("ar.e")
    public static int field658 = 0;

    @ObfuscatedName("ar.s")
    public static int field665 = field658 + 202;

    @ObfuscatedName("ar.t")
    public static int[] field672 = new int[256];

    @ObfuscatedName("ar.y")
    public static int field667 = 0;

    @ObfuscatedName("ar.j")
    public static int field668 = 0;

    @ObfuscatedName("ar.ai")
    public static int field670 = 0;

    @ObfuscatedName("ar.ar")
    public static int field675 = 0;

    @ObfuscatedName("ar.aw")
    public static int field662 = 0;

    @ObfuscatedName("ar.ac")
    public static int field673 = 0;

    @ObfuscatedName("ar.ap")
    public static int field674 = 10;

    @ObfuscatedName("ar.al")
    public static String field693 = "";

    @ObfuscatedName("ar.ak")
    public static int field676 = 0;

    @ObfuscatedName("ar.at")
    public static String field677 = "";

    @ObfuscatedName("ar.au")
    public static String field678 = "";

    @ObfuscatedName("ar.am")
    public static String field679 = "";

    @ObfuscatedName("ar.aa")
    public static String field680 = "";

    @ObfuscatedName("ar.az")
    public static String field691 = "";

    @ObfuscatedName("ar.ae")
    public static class150 field682 = class150.field2485;

    @ObfuscatedName("ar.aq")
    public static boolean field683 = true;

    @ObfuscatedName("ar.as")
    public static int field684 = 0;

    @ObfuscatedName("ar.ay")
    public static String field685 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ad")
    public static String field686 = "1234567890";

    @ObfuscatedName("ar.ab")
    public static boolean field664 = false;

    @ObfuscatedName("ar.bi")
    public static int field671 = 0;

    @ObfuscatedName("ar.bk")
    public static int[] field689 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ar.bs")
    public static int[] field690 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ar.bo")
    public static int field687 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.b(Lfj;Lfj;B)I")
    public static int method871(class158 arg0, class158 arg1) {
        int var2 = 0;
        if (arg0.method2840("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2840("logo", "")) {
            var2++;
        }
        if (arg1.method2840("titlebox", "")) {
            var2++;
        }
        if (arg1.method2840("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2840("runes", "")) {
            var2++;
        }
        if (arg1.method2840("title_mute", "")) {
            var2++;
        }
        if (arg1.method2876("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2876("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2840("sl_back", "");
        arg1.method2840("sl_flags", "");
        arg1.method2840("sl_arrows", "");
        arg1.method2840("sl_stars", "");
        arg1.method2840("sl_button", "");
        return var2;
    }

    @ObfuscatedName("i.e(Ljava/awt/Component;Lfj;Lfj;ZII)V")
    public static void method168(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field688) {
            field676 = arg4;
            class75.method1530();
            byte[] var5 = arg1.method2856("title.jpg", "");
            Statics.field657 = new class74(var5, arg0);
            Statics.field661 = Statics.field657.method1404();
            Statics.field1860 = class72.method2584(arg2, "logo", "");
            Statics.field681 = class72.method2584(arg2, "titlebox", "");
            Statics.field660 = class72.method2584(arg2, "titlebutton", "");
            Statics.field1381 = class72.method614(arg2, "runes", "");
            Statics.field1984 = class72.method614(arg2, "title_mute", "");
            Statics.field3070 = class72.method2584(arg2, "options_radio_buttons,0", "");
            Statics.field2542 = class72.method2584(arg2, "options_radio_buttons,2", "");
            Statics.field17 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field17[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field17[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field17[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field17[var9 + 192] = 16777215;
            }
            Statics.field2961 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2961[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2961[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2961[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2961[var13 + 192] = 16777215;
            }
            Statics.field1017 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1017[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1017[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1017[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1017[var17 + 192] = 16777215;
            }
            Statics.field1487 = new int[256];
            Statics.field669 = new int[32768];
            Statics.field1953 = new int[32768];
            method2729((class76) null);
            Statics.field1929 = new int[32768];
            Statics.field3055 = new int[32768];
            if (arg3) {
                field680 = "";
                field691 = "";
            }
            Statics.field951 = 0;
            Statics.field1475 = "";
            field683 = true;
            field664 = false;
            if (Statics.field1015.field127) {
                class174.field2838 = 1;
                Statics.field2842 = null;
                Statics.field3059 = -1;
                Statics.field2787 = -1;
                Statics.field3136 = 0;
                Statics.field2840 = false;
                Statics.field2505 = 2;
            } else {
                class159 var18 = Statics.field2034;
                int var19 = var18.method2833("scape main");
                int var20 = var18.method2834(var19, "");
                class174.field2838 = 1;
                Statics.field2842 = var18;
                Statics.field3059 = var19;
                Statics.field2787 = var20;
                Statics.field3136 = 255;
                Statics.field2840 = false;
                Statics.field2505 = 2;
            }
            class162.method2595(false);
            Statics.field688 = true;
            field658 = (Statics.field56 - client.field396 * 765) / 2;
            field665 = field658 + 202;
            Statics.field657.method1482(field658, 0);
            Statics.field661.method1482(field658 + 382, 0);
            Statics.field1860.method1561(field658 + 382 - Statics.field1860.field1352 / 2, 18);
        } else if (arg4 == 4) {
            field676 = 4;
        }
    }

    @ObfuscatedName("w.a(Leb;I)V")
    public static void method502(class136 arg0) {
        if (!field664) {
            if ((class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4) && class132.field2060 >= field658 + 765 - 50 && class132.field2048 >= 453) {
                Statics.field1015.field127 = !Statics.field1015.field127;
                Statics.method537();
                if (Statics.field1015.field127) {
                    class174.method2739();
                } else {
                    class159 var6 = Statics.field2034;
                    int var7 = var6.method2833("scape main");
                    int var8 = var6.method2834(var7, "");
                    class174.method3006(var6, var7, var8, 255, false);
                }
            }
            if (client.field257 != 5) {
                field662++;
                if (client.field257 == 10 || client.field257 == 11) {
                    if (client.field255 == 0) {
                        if (class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4) {
                            int var9 = field658 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class132.field2060 >= var9 && class132.field2060 <= var9 + var11 && class132.field2048 >= var10 && class132.field2048 <= var10 + var12) {
                                method523();
                                return;
                            }
                        }
                        if (Statics.field2788 != null) {
                            method523();
                        }
                    }
                    int var13 = class132.field2059;
                    int var14 = class132.field2060;
                    int var15 = class132.field2048;
                    if (!Statics.field134 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field676 == 0) {
                        int var16 = field665 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class130.method805(client.method98("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field665 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field248 & 0x4) != 0) {
                                if ((client.field248 & 0x400) == 0) {
                                    field677 = class148.field2416;
                                    field678 = class148.field2417;
                                    field679 = class148.field2297;
                                } else {
                                    field677 = class148.field2422;
                                    field678 = class148.field2423;
                                    field679 = class148.field2256;
                                }
                                field676 = 1;
                                field684 = 0;
                            } else if ((client.field248 & 0x400) == 0) {
                                field677 = class148.field2412;
                                field678 = class148.field2413;
                                field679 = class148.field2414;
                                field676 = 2;
                                field684 = 0;
                            } else {
                                field677 = class148.field2419;
                                field678 = class148.field2348;
                                field679 = class148.field2296;
                                field676 = 1;
                                field684 = 0;
                            }
                        }
                    } else if (field676 == 1) {
                        while (class129.method149()) {
                            if (Statics.field1932 == 84) {
                                field677 = class148.field2412;
                                field678 = class148.field2413;
                                field679 = class148.field2414;
                                field676 = 2;
                                field684 = 0;
                            } else if (Statics.field1932 == 13) {
                                field676 = 0;
                            }
                        }
                        int var19 = field665 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field677 = class148.field2412;
                            field678 = class148.field2413;
                            field679 = class148.field2414;
                            field676 = 2;
                            field684 = 0;
                        }
                        int var21 = field665 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field676 = 0;
                        }
                    } else if (field676 == 2) {
                        short var22 = 231;
                        int var41 = var22 + 30;
                        if (var13 == 1 && var15 >= var41 - 15 && var15 < var41) {
                            field684 = 0;
                        }
                        var41 += 15;
                        if (var13 == 1 && var15 >= var41 - 15 && var15 < var41) {
                            field684 = 1;
                        }
                        var41 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method529(class148.field2291, class148.field2444, class148.field2445);
                            field676 = 5;
                            return;
                        }
                        int var24 = field665 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field680 = field680.trim();
                            if (field680.length() == 0) {
                                method529(class148.field2424, class148.field2319, class148.field2205);
                                return;
                            }
                            if (field691.length() == 0) {
                                method529(class148.field2326, class148.field2322, class148.field2323);
                                return;
                            }
                            method529(class148.field2427, class148.field2428, class148.field2429);
                            field682 = Statics.field1015.field129.containsKey(class154.method2718(field680)) ? class150.field2490 : class150.field2485;
                            client.method565(20);
                            return;
                        }
                        int var26 = field665 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field676 = 0;
                            field680 = "";
                            field691 = "";
                            Statics.field951 = 0;
                            Statics.field1475 = "";
                            field683 = true;
                        }
                        while (true) {
                            while (class129.method149()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field685.length(); var28++) {
                                    if (Statics.field198 == field685.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1932 == 13) {
                                    field676 = 0;
                                    field680 = "";
                                    field691 = "";
                                    Statics.field951 = 0;
                                    Statics.field1475 = "";
                                    field683 = true;
                                } else if (field684 == 0) {
                                    if (Statics.field1932 == 85 && field680.length() > 0) {
                                        field680 = field680.substring(0, field680.length() - 1);
                                    }
                                    if (Statics.field1932 == 84 || Statics.field1932 == 80) {
                                        field684 = 1;
                                    }
                                    if (var27 && field680.length() < 320) {
                                        field680 = field680 + Statics.field198;
                                    }
                                } else if (field684 == 1) {
                                    if (Statics.field1932 == 85 && field691.length() > 0) {
                                        field691 = field691.substring(0, field691.length() - 1);
                                    }
                                    if (Statics.field1932 == 84 || Statics.field1932 == 80) {
                                        field684 = 0;
                                    }
                                    if (Statics.field1932 == 84) {
                                        field680 = field680.trim();
                                        if (field680.length() == 0) {
                                            method529(class148.field2424, class148.field2319, class148.field2205);
                                            return;
                                        }
                                        if (field691.length() == 0) {
                                            method529(class148.field2326, class148.field2322, class148.field2323);
                                            return;
                                        }
                                        method529(class148.field2427, class148.field2428, class148.field2429);
                                        field682 = Statics.field1015.field129.containsKey(class154.method2718(field680)) ? class150.field2490 : class150.field2485;
                                        client.method565(20);
                                        return;
                                    }
                                    if (var27 && field691.length() < 20) {
                                        field691 = field691 + Statics.field198;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field676 == 4) {
                        int var29 = field665 + 180 - 80;
                        short var30 = 321;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            Statics.field1475.trim();
                            if (Statics.field1475.length() != 6) {
                                method529(class148.field2234, class148.field2235, class148.field2236);
                                return;
                            }
                            Statics.field951 = Integer.parseInt(Statics.field1475);
                            Statics.field1475 = "";
                            field682 = field683 ? class150.field2491 : class150.field2488;
                            method529(class148.field2427, class148.field2428, class148.field2429);
                            client.method565(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field665 + 180 - 9 && var14 <= field665 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field683 = !field683;
                        }
                        if (var13 == 1 && var14 >= field665 + 180 - 34 && var14 <= field665 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var31 = client.method98("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class130.method1860(var31, true, "openjs", false);
                        }
                        int var32 = field665 + 180 + 80;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field676 = 0;
                            field680 = "";
                            field691 = "";
                            Statics.field951 = 0;
                            Statics.field1475 = "";
                        }
                        while (class129.method149()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field686.length(); var34++) {
                                if (Statics.field198 == field686.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field1932 == 13) {
                                field676 = 0;
                                field680 = "";
                                field691 = "";
                                Statics.field951 = 0;
                                Statics.field1475 = "";
                            } else {
                                if (Statics.field1932 == 85 && Statics.field1475.length() > 0) {
                                    Statics.field1475 = Statics.field1475.substring(0, Statics.field1475.length() - 1);
                                }
                                if (Statics.field1932 == 84) {
                                    Statics.field1475.trim();
                                    if (Statics.field1475.length() != 6) {
                                        method529(class148.field2234, class148.field2235, class148.field2236);
                                        return;
                                    }
                                    Statics.field951 = Integer.parseInt(Statics.field1475);
                                    Statics.field1475 = "";
                                    field682 = field683 ? class150.field2491 : class150.field2488;
                                    method529(class148.field2427, class148.field2428, class148.field2429);
                                    client.method565(20);
                                    return;
                                }
                                if (var33 && Statics.field1475.length() < 6) {
                                    Statics.field1475 = Statics.field1475 + Statics.field198;
                                }
                            }
                        }
                    } else if (field676 == 5) {
                        int var35 = field665 + 180 - 80;
                        short var36 = 321;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            method2720();
                            return;
                        }
                        int var37 = field665 + 180 + 80;
                        if (var13 == 1 && var14 >= var37 - 75 && var14 <= var37 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            field677 = class148.field2412;
                            field678 = class148.field2413;
                            field679 = class148.field2414;
                            field676 = 2;
                            field684 = 0;
                            field691 = "";
                        }
                        while (class129.method149()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field685.length(); var39++) {
                                if (Statics.field198 == field685.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field1932 == 13) {
                                field677 = class148.field2412;
                                field678 = class148.field2413;
                                field679 = class148.field2414;
                                field676 = 2;
                                field684 = 0;
                                field691 = "";
                            } else {
                                if (Statics.field1932 == 85 && field680.length() > 0) {
                                    field680 = field680.substring(0, field680.length() - 1);
                                }
                                if (Statics.field1932 == 84) {
                                    method2720();
                                    return;
                                }
                                if (var38 && field680.length() < 320) {
                                    field680 = field680 + Statics.field198;
                                }
                            }
                        }
                    } else if (field676 == 6) {
                        while (true) {
                            do {
                                if (!class129.method149()) {
                                    short var40 = 321;
                                    if (var13 == 1 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                                        field677 = class148.field2412;
                                        field678 = class148.field2413;
                                        field679 = class148.field2414;
                                        field676 = 2;
                                        field684 = 0;
                                        field691 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1932 != 84 && Statics.field1932 != 13);
                            field677 = class148.field2412;
                            field678 = class148.field2413;
                            field679 = class148.field2414;
                            field676 = 2;
                            field684 = 0;
                            field691 = "";
                        }
                    }
                }
            }
        } else if (class132.field2059 == 1 || !Statics.field134 && class132.field2059 == 4) {
            int var1 = field658 + 280;
            if (class132.field2060 >= var1 && class132.field2060 <= var1 + 14 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                method2585(0, 0);
            } else if (class132.field2060 >= var1 + 15 && class132.field2060 <= var1 + 80 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                method2585(0, 1);
            } else {
                int var2 = field658 + 390;
                if (class132.field2060 >= var2 && class132.field2060 <= var2 + 14 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                    method2585(1, 0);
                } else if (class132.field2060 >= var2 + 15 && class132.field2060 <= var2 + 80 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                    method2585(1, 1);
                } else {
                    int var3 = field658 + 500;
                    if (class132.field2060 >= var3 && class132.field2060 <= var3 + 14 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                        method2585(2, 0);
                    } else if (class132.field2060 >= var3 + 15 && class132.field2060 <= var3 + 80 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                        method2585(2, 1);
                    } else {
                        int var4 = field658 + 610;
                        if (class132.field2060 >= var4 && class132.field2060 <= var4 + 14 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                            method2585(3, 0);
                        } else if (class132.field2060 >= var4 + 15 && class132.field2060 <= var4 + 80 && class132.field2048 >= 4 && class132.field2048 <= 18) {
                            method2585(3, 1);
                        } else if (class132.field2060 >= field658 + 708 && class132.field2048 >= 4 && class132.field2060 <= field658 + 708 + 50 && class132.field2048 <= 20) {
                            field664 = false;
                            Statics.field657.method1482(field658, 0);
                            Statics.field661.method1482(field658 + 382, 0);
                            Statics.field1860.method1561(field658 + 382 - Statics.field1860.field1352 / 2, 18);
                        } else if (field687 != -1) {
                            class24 var5 = Statics.field113[field687];
                            method31(var5);
                            field664 = false;
                            Statics.field657.method1482(field658, 0);
                            Statics.field661.method1482(field658 + 382, 0);
                            Statics.field1860.method1561(field658 + 382 - Statics.field1860.field1352 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.k(B)V")
    public static void method2720() {
        field680 = field680.trim();
        if (field680.length() == 0) {
            method529(class148.field2291, class148.field2444, class148.field2445);
            return;
        }
        long var0 = class10.method153();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method2937(var0, field680);
        }
        switch(var2) {
            case 2:
                method529(class148.field2446, class148.field2447, class148.field2401);
                field676 = 6;
                break;
            case 3:
                method529(class148.field2449, class148.field2450, class148.field2451);
                break;
            case 4:
                method529(class148.field2459, class148.field2261, class148.field2454);
                break;
            case 5:
                method529(class148.field2321, class148.field2220, class148.field2300);
                break;
            case 6:
                method529(class148.field2458, class148.field2251, class148.field2460);
                break;
            case 7:
                method529(class148.field2393, class148.field2462, class148.field2463);
        }
    }

    @ObfuscatedName("aq.p(Lhq;Lhq;Lhq;ZB)V")
    public static void method840(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field658 = (Statics.field56 - client.field396 * 765) / 2;
            field665 = field658 + 202;
        }
        if (field664) {
            method933(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field657.method1482(field658, 0);
            Statics.field661.method1482(field658 + 382, 0);
            Statics.field1860.method1561(field658 + 382 - Statics.field1860.field1352 / 2, 18);
        }
        if (client.field257 == 0 || client.field257 == 5) {
            byte var4 = 20;
            arg0.method3568(class148.field2453, field665 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class75.method1502(field665 + 180 - 152, var5, 304, 34, 9179409);
            class75.method1502(field665 + 180 - 151, var5 + 1, 302, 32, 0);
            class75.method1533(field665 + 180 - 150, var5 + 2, field674 * 3, 30, 9179409);
            class75.method1533(field674 * 3 + (field665 + 180 - 150), var5 + 2, 300 - field674 * 3, 30, 0);
            arg0.method3568(field693, field665 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field257 == 20) {
            Statics.field681.method1561(field665 + 180 - Statics.field681.field1352 / 2, 271 - Statics.field681.field1353 / 2);
            short var6 = 211;
            arg0.method3568(field677, field665 + 180, var6, 16776960, 0);
            int var101 = var6 + 15;
            arg0.method3568(field678, field665 + 180, var101, 16776960, 0);
            int var102 = var101 + 15;
            arg0.method3568(field679, field665 + 180, var102, 16776960, 0);
            int var103 = var102 + 15;
            int var104 = var103 + 10;
            if (field676 != 4) {
                arg0.method3588(class148.field2442, field665 + 180 - 110, var104, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field680; arg0.method3536(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3588(class214.method3616(var8), field665 + 180 - 70, var104, 16777215, 0);
                var101 = var104 + 15;
                arg0.method3588(class148.field2431 + class154.method601(field691), field665 + 180 - 108, var101, 16777215, 0);
                var101 += 15;
            }
        }
        if (client.field257 == 10 || client.field257 == 11) {
            Statics.field681.method1561(field665, 171);
            if (field676 == 0) {
                short var9 = 251;
                arg0.method3568(class148.field2433, field665 + 180, var9, 16776960, 0);
                int var105 = var9 + 30;
                int var10 = field665 + 180 - 80;
                short var11 = 291;
                Statics.field660.method1561(var10 - 73, var11 - 20);
                arg0.method3544(class148.field2434, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field665 + 180 + 80;
                Statics.field660.method1561(var12 - 73, var11 - 20);
                arg0.method3544(class148.field2435, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field676 == 1) {
                arg0.method3568(class148.field2415, field665 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method3568(field677, field665 + 180, var13, 16777215, 0);
                int var106 = var13 + 15;
                arg0.method3568(field678, field665 + 180, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3568(field679, field665 + 180, var107, 16777215, 0);
                int var108 = var107 + 15;
                int var14 = field665 + 180 - 80;
                short var15 = 321;
                Statics.field660.method1561(var14 - 73, var15 - 20);
                arg0.method3568(class148.field2351, var14, var15 + 5, 16777215, 0);
                int var16 = field665 + 180 + 80;
                Statics.field660.method1561(var16 - 73, var15 - 20);
                arg0.method3568(class148.field2358, var16, var15 + 5, 16777215, 0);
            } else if (field676 == 2) {
                short var17 = 211;
                arg0.method3568(field677, field665 + 180, var17, 16776960, 0);
                int var109 = var17 + 15;
                arg0.method3568(field678, field665 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3568(field679, field665 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var112 = var111 + 10;
                arg0.method3588(class148.field2442, field665 + 180 - 110, var112, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field680; arg0.method3536(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method3588(class214.method3616(var19) + (field684 == 0 & client.field259 % 40 < 20 ? class2.method2079(16776960) + class2.field24 : ""), field665 + 180 - 70, var112, 16777215, 0);
                var109 = var112 + 15;
                arg0.method3588(class148.field2431 + class154.method601(field691) + (field684 == 1 & client.field259 % 40 < 20 ? class2.method2079(16776960) + class2.field24 : ""), field665 + 180 - 108, var109, 16777215, 0);
                var109 += 15;
                int var20 = field665 + 180 - 80;
                short var21 = 321;
                Statics.field660.method1561(var20 - 73, var21 - 20);
                arg0.method3568(class148.field2436, var20, var21 + 5, 16777215, 0);
                int var22 = field665 + 180 + 80;
                Statics.field660.method1561(var22 - 73, var21 - 20);
                arg0.method3568(class148.field2358, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method3568(class148.field2216, field665 + 180, var23, 16776960, 0);
            } else if (field676 == 4) {
                arg0.method3568(class148.field2341, field665 + 180, 211, 16776960, 0);
                short var24 = 236;
                arg0.method3568(field677, field665 + 180, var24, 16777215, 0);
                int var113 = var24 + 15;
                arg0.method3568(field678, field665 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3568(field679, field665 + 180, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3588(class148.field2383 + class154.method601(Statics.field1475) + (client.field259 % 40 < 20 ? class2.method2079(16776960) + class2.field24 : ""), field665 + 180 - 108, var115, 16777215, 0);
                int var116 = var115 - 8;
                arg0.method3588(class148.field2208, field665 + 180 - 9, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3588(class148.field2209, field665 + 180 - 9, var117, 16776960, 0);
                int var25 = field665 + 180 - 9 + arg0.method3536(class148.field2209) + 15;
                int var26 = var117 - arg0.field3088;
                class76 var27;
                if (field683) {
                    var27 = Statics.field2542;
                } else {
                    var27 = Statics.field3070;
                }
                var27.method1561(var25, var26);
                var113 = var117 + 15;
                int var28 = field665 + 180 - 80;
                short var29 = 321;
                Statics.field660.method1561(var28 - 73, var29 - 20);
                arg0.method3568(class148.field2351, var28, var29 + 5, 16777215, 0);
                int var30 = field665 + 180 + 80;
                Statics.field660.method1561(var30 - 73, var29 - 20);
                arg0.method3568(class148.field2358, var30, var29 + 5, 16777215, 0);
                arg1.method3568(class148.field2426, field665 + 180, var29 + 36, 255, 0);
            } else if (field676 == 5) {
                arg0.method3568(class148.field2336, field665 + 180, 201, 16776960, 0);
                short var31 = 221;
                arg2.method3568(field677, field665 + 180, var31, 16776960, 0);
                int var118 = var31 + 15;
                arg2.method3568(field678, field665 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg2.method3568(field679, field665 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var121 = var120 + 14;
                arg0.method3588(class148.field2440, field665 + 180 - 145, var121, 16777215, 0);
                short var32 = 174;
                String var33;
                for (var33 = field680; arg0.method3536(var33) > var32; var33 = var33.substring(1)) {
                }
                arg0.method3588(class214.method3616(var33) + (client.field259 % 40 < 20 ? class2.method2079(16776960) + class2.field24 : ""), field665 + 180 - 34, var121, 16777215, 0);
                var118 = var121 + 15;
                int var34 = field665 + 180 - 80;
                short var35 = 321;
                Statics.field660.method1561(var34 - 73, var35 - 20);
                arg0.method3568(class148.field2466, var34, var35 + 5, 16777215, 0);
                int var36 = field665 + 180 + 80;
                Statics.field660.method1561(var36 - 73, var35 - 20);
                arg0.method3568(class148.field2267, var36, var35 + 5, 16777215, 0);
            } else if (field676 == 6) {
                short var37 = 211;
                arg0.method3568(field677, field665 + 180, var37, 16776960, 0);
                int var122 = var37 + 15;
                arg0.method3568(field678, field665 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3568(field679, field665 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var38 = field665 + 180;
                short var39 = 321;
                Statics.field660.method1561(var38 - 73, var39 - 20);
                arg0.method3568(class148.field2267, var38, var39 + 5, 16777215, 0);
            }
        }
        if (field662 > 0) {
            int var40 = field662;
            short var41 = 256;
            field670 += var40 * 128;
            if (field670 > Statics.field669.length) {
                field670 -= Statics.field669.length;
                int var42 = (int) (Math.random() * 12.0D);
                method2729(Statics.field1381[var42]);
            }
            int var43 = 0;
            int var44 = var40 * 128;
            int var45 = (var41 - var40) * 128;
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = Statics.field1929[var43 + var44] - Statics.field669[field670 + var43 & Statics.field669.length - 1] * var40 / 6;
                if (var47 < 0) {
                    var47 = 0;
                }
                Statics.field1929[var43++] = var47;
            }
            for (int var48 = var41 - var40; var48 < var41; var48++) {
                int var49 = var48 * 128;
                for (int var50 = 0; var50 < 128; var50++) {
                    int var51 = (int) (Math.random() * 100.0D);
                    if (var51 < 50 && var50 > 10 && var50 < 118) {
                        Statics.field1929[var49 + var50] = 255;
                    } else {
                        Statics.field1929[var49 + var50] = 0;
                    }
                }
            }
            if (field667 > 0) {
                field667 -= var40 * 4;
            }
            if (field668 > 0) {
                field668 -= var40 * 4;
            }
            if (field667 == 0 && field668 == 0) {
                int var52 = (int) (Math.random() * (double) (2000 / var40));
                if (var52 == 0) {
                    field667 = 1024;
                }
                if (var52 == 1) {
                    field668 = 1024;
                }
            }
            for (int var53 = 0; var53 < var41 - var40; var53++) {
                field672[var53] = field672[var40 + var53];
            }
            for (int var54 = var41 - var40; var54 < var41; var54++) {
                field672[var54] = (int) (Math.sin((double) field673 / 14.0D) * 16.0D + Math.sin((double) field673 / 15.0D) * 14.0D + Math.sin((double) field673 / 16.0D) * 12.0D);
                field673++;
            }
            field675 += var40 * -1464067479;
            int var55 = ((client.field259 & 0x1) + var40) / 2;
            if (var55 > 0) {
                for (int var56 = 0; var56 < field675 * -1949005628; var56++) {
                    int var57 = (int) (Math.random() * 124.0D) + 2;
                    int var58 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1929[(var58 << 7) + var57] = 192;
                }
                field675 = 0;
                int var59 = 0;
                label317: while (true) {
                    if (var59 >= var41) {
                        int var63 = 0;
                        while (true) {
                            if (var63 >= 128) {
                                break label317;
                            }
                            int var64 = 0;
                            for (int var65 = -var55; var65 < var41; var65++) {
                                int var66 = var65 * 128;
                                if (var55 + var65 < var41) {
                                    var64 += Statics.field3055[var55 * 128 + var63 + var66];
                                }
                                if (var65 - (var55 + 1) >= 0) {
                                    var64 -= Statics.field3055[var63 + var66 - (var55 + 1) * 128];
                                }
                                if (var65 >= 0) {
                                    Statics.field1929[var63 + var66] = var64 / (var55 * 2 + 1);
                                }
                            }
                            var63++;
                        }
                    }
                    int var60 = 0;
                    int var61 = var59 * 128;
                    for (int var62 = -var55; var62 < 128; var62++) {
                        if (var55 + var62 < 128) {
                            var60 += Statics.field1929[var61 + var62 + var55];
                        }
                        if (var62 - (var55 + 1) >= 0) {
                            var60 -= Statics.field1929[var61 + var62 - (var55 + 1)];
                        }
                        if (var62 >= 0) {
                            Statics.field3055[var61 + var62] = var60 / (var55 * 2 + 1);
                        }
                    }
                    var59++;
                }
            }
            field662 = 0;
        }
        short var67 = 256;
        if (field667 > 0) {
            for (int var68 = 0; var68 < 256; var68++) {
                if (field667 > 768) {
                    Statics.field1487[var68] = method171(Statics.field17[var68], Statics.field2961[var68], 1024 - field667);
                } else if (field667 > 256) {
                    Statics.field1487[var68] = Statics.field2961[var68];
                } else {
                    Statics.field1487[var68] = method171(Statics.field2961[var68], Statics.field17[var68], 256 - field667);
                }
            }
        } else if (field668 > 0) {
            for (int var69 = 0; var69 < 256; var69++) {
                if (field668 > 768) {
                    Statics.field1487[var69] = method171(Statics.field17[var69], Statics.field1017[var69], 1024 - field668);
                } else if (field668 > 256) {
                    Statics.field1487[var69] = Statics.field1017[var69];
                } else {
                    Statics.field1487[var69] = method171(Statics.field1017[var69], Statics.field17[var69], 256 - field668);
                }
            }
        } else {
            for (int var70 = 0; var70 < 256; var70++) {
                Statics.field1487[var70] = Statics.field17[var70];
            }
        }
        class75.method1499(field658, 9, field658 + 128, var67 + 7);
        Statics.field657.method1482(field658, 0);
        class75.method1498();
        int var71 = 0;
        int var72 = field658 + Statics.field797.field1324 * 9;
        for (int var73 = 1; var73 < var67 - 1; var73++) {
            int var74 = (var67 - var73) * field672[var73] / var67;
            int var75 = var74 + 22;
            if (var75 < 0) {
                var75 = 0;
            }
            var71 += var75;
            for (int var76 = var75; var76 < 128; var76++) {
                int var77 = Statics.field1929[var71++];
                if (var77 == 0) {
                    var72++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field1487[var77];
                    int var81 = Statics.field797.field1327[var72];
                    Statics.field797.field1327[var72++] = ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) >> 8;
                }
            }
            var72 += Statics.field797.field1324 + var75 - 128;
        }
        class75.method1499(field658 + 765 - 128, 9, field658 + 765, var67 + 7);
        Statics.field661.method1482(field658 + 382, 0);
        class75.method1498();
        int var82 = 0;
        int var83 = field658 + Statics.field797.field1324 * 9 + 24 + 637;
        for (int var84 = 1; var84 < var67 - 1; var84++) {
            int var85 = (var67 - var84) * field672[var84] / var67;
            int var86 = 103 - var85;
            int var87 = var83 + var85;
            for (int var88 = 0; var88 < var86; var88++) {
                int var89 = Statics.field1929[var82++];
                if (var89 == 0) {
                    var87++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field1487[var89];
                    int var93 = Statics.field797.field1327[var87];
                    Statics.field797.field1327[var87++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var82 += 128 - var86;
            var83 = Statics.field797.field1324 - var86 - var85 + var87;
        }
        Statics.field1984[Statics.field1015.field127 ? 1 : 0].method1561(field658 + 765 - 40, 463);
        if (client.field257 > 5 && client.field255 == 0) {
            if (Statics.field1288 == null) {
                Statics.field1288 = class72.method2584(Statics.field238, "sl_button", "");
            } else {
                int var94 = field658 + 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field1288.method1561(var94, var95);
                arg0.method3568(class148.field2366 + " " + client.field478, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field2788 == null) {
                    arg1.method3568(class148.field2474, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3568(class148.field2473, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field1328.getGraphics();
            Statics.field797.method1346(var98, 0, 0);
        } catch (Exception var100) {
            Statics.field1328.repaint();
        }
    }

    @ObfuscatedName("j.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method529(String arg0, String arg1, String arg2) {
        field677 = arg0;
        field678 = arg1;
        field679 = arg2;
    }

    @ObfuscatedName("ec.u(Lbd;I)V")
    public static final void method2729(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field669.length; var2++) {
            Statics.field669[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field669[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1953[var8] = (Statics.field669[var8 - 1] + Statics.field669[var8 + 1] + Statics.field669[var8 - 128] + Statics.field669[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field669;
            Statics.field669 = Statics.field1953;
            Statics.field1953 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1353; var11++) {
            for (int var12 = 0; var12 < arg0.field1352; var12++) {
                if (arg0.field1350[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1351;
                    int var14 = var11 + 16 + arg0.field1357;
                    int var15 = (var14 << 7) + var13;
                    Statics.field669[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("s.o(IIII)I")
    public static final int method171(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("af.m(Lhq;Lhq;I)V")
    public static void method933(class215 arg0, class215 arg1) {
        if (Statics.field120 == null) {
            Statics.field120 = class72.method528(Statics.field238, "sl_back", "");
        }
        if (Statics.field1951 == null) {
            Statics.field1951 = class72.method614(Statics.field238, "sl_flags", "");
        }
        if (Statics.field185 == null) {
            Statics.field185 = class72.method614(Statics.field238, "sl_arrows", "");
        }
        if (Statics.field2007 == null) {
            Statics.field2007 = class72.method614(Statics.field238, "sl_stars", "");
        }
        class75.method1533(field658, 23, 765, 480, 0);
        class75.method1506(field658, 0, 125, 23, 12425273, 9135624);
        class75.method1506(field658 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3568(class148.field2464, field658 + 62, 15, 0, -1);
        if (Statics.field2007 != null) {
            Statics.field2007[1].method1561(field658 + 140, 1);
            arg1.method3588(class148.field2432, field658 + 152, 10, 16777215, -1);
            Statics.field2007[0].method1561(field658 + 140, 12);
            arg1.method3588(class148.field2253, field658 + 152, 21, 16777215, -1);
        }
        if (Statics.field185 != null) {
            int var2 = field658 + 280;
            if (field689[0] == 0 && field690[0] == 0) {
                Statics.field185[2].method1561(var2, 4);
            } else {
                Statics.field185[0].method1561(var2, 4);
            }
            if (field689[0] == 0 && field690[0] == 1) {
                Statics.field185[3].method1561(var2 + 15, 4);
            } else {
                Statics.field185[1].method1561(var2 + 15, 4);
            }
            arg0.method3588(class148.field2325, var2 + 32, 17, 16777215, -1);
            int var3 = field658 + 390;
            if (field689[0] == 1 && field690[0] == 0) {
                Statics.field185[2].method1561(var3, 4);
            } else {
                Statics.field185[0].method1561(var3, 4);
            }
            if (field689[0] == 1 && field690[0] == 1) {
                Statics.field185[3].method1561(var3 + 15, 4);
            } else {
                Statics.field185[1].method1561(var3 + 15, 4);
            }
            arg0.method3588(class148.field2263, var3 + 32, 17, 16777215, -1);
            int var4 = field658 + 500;
            if (field689[0] == 2 && field690[0] == 0) {
                Statics.field185[2].method1561(var4, 4);
            } else {
                Statics.field185[0].method1561(var4, 4);
            }
            if (field689[0] == 2 && field690[0] == 1) {
                Statics.field185[3].method1561(var4 + 15, 4);
            } else {
                Statics.field185[1].method1561(var4 + 15, 4);
            }
            arg0.method3588(class148.field2469, var4 + 32, 17, 16777215, -1);
            int var5 = field658 + 610;
            if (field689[0] == 3 && field690[0] == 0) {
                Statics.field185[2].method1561(var5, 4);
            } else {
                Statics.field185[0].method1561(var5, 4);
            }
            if (field689[0] == 3 && field690[0] == 1) {
                Statics.field185[3].method1561(var5 + 15, 4);
            } else {
                Statics.field185[1].method1561(var5 + 15, 4);
            }
            arg0.method3588(class148.field2228, var5 + 32, 17, 16777215, -1);
        }
        class75.method1533(field658 + 708, 4, 50, 16, 0);
        arg1.method3568(class148.field2358, field658 + 708 + 25, 16, 16777215, -1);
        field687 = -1;
        if (Statics.field120 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field671) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field671) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field671) {
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
            int var17 = field658 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < field671; var20++) {
                class24 var21 = Statics.field113[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field590);
                if (var21.field590 == -1) {
                    var23 = class148.field2471;
                    var22 = false;
                } else if (var21.field590 > 1980) {
                    var23 = class148.field2472;
                    var22 = false;
                }
                byte var24;
                if (var21.method531()) {
                    if (var21.method530()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method530()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class132.field2053 >= var17 && class132.field2054 >= var16 && class132.field2053 < var6 + var17 && class132.field2054 < var7 + var16 && var22) {
                    field687 = var20;
                    Statics.field120[var24].method1418(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field120[var24].method1482(var17, var16);
                }
                if (Statics.field1951 != null) {
                    Statics.field1951[(var21.method530() ? 8 : 0) + var21.field595].method1561(var17 + 29, var16);
                }
                arg0.method3568(Integer.toString(var21.field594), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3568(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3536(Statics.field113[field687].field598) + 6;
                int var26 = arg1.field3088 + 8;
                class75.method1533(class132.field2053 - var25 / 2, class132.field2054 + 20 + 5, var25, var26, 16777120);
                class75.method1502(class132.field2053 - var25 / 2, class132.field2054 + 20 + 5, var25, var26, 0);
                arg1.method3568(Statics.field113[field687].field598, class132.field2053, class132.field2054 + 20 + 5 + arg1.field3088 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1328.getGraphics();
            Statics.field797.method1346(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1328.repaint();
        }
    }

    @ObfuscatedName("a.q(Lj;B)V")
    public static void method31(class24 arg0) {
        if (arg0.method530() != client.field253) {
            client.field253 = arg0.method530();
            boolean var1 = arg0.method530();
            if (Statics.field1032 != var1) {
                class47.field1034.method3258();
                class47.field1086.method3258();
                class47.field1036.method3258();
                Statics.field1032 = var1;
            }
        }
        Statics.field1706 = arg0.field593;
        client.field478 = arg0.field594;
        client.field248 = arg0.field591;
        Statics.field52 = client.field250 == 0 ? 43594 : arg0.field594 + 40000;
        Statics.field287 = client.field250 == 0 ? 443 : arg0.field594 + 50000;
        Statics.field288 = Statics.field52;
    }

    @ObfuscatedName("f.v(I)V")
    public static void method523() {
        try {
            if (Statics.field2788 == null) {
                Statics.field2788 = new class18(Statics.field808, new URL(Statics.field207));
            } else {
                byte[] var0 = Statics.field2788.method178();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field671 = var1.method2129();
                    Statics.field113 = new class24[field671];
                    int var2 = 0;
                    while (var2 < field671) {
                        class24 var3 = Statics.field113[var2] = new class24();
                        var3.field594 = var1.method2129();
                        var3.field591 = var1.method2194();
                        var3.field593 = var1.method2166();
                        var3.field598 = var1.method2166();
                        var3.field595 = var1.method2127();
                        var3.field590 = var1.method2130();
                        var3.field592 = var2++;
                    }
                    method554(Statics.field113, 0, Statics.field113.length - 1, field689, field690);
                    field664 = true;
                    Statics.field2788 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2788 = null;
        }
    }

    @ObfuscatedName("ey.n(IIS)V")
    public static void method2585(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field689[var5] != arg0) {
                var2[var4] = field689[var5];
                var3[var4] = field690[var5];
                var4++;
            }
        }
        field689 = var2;
        field690 = var3;
        method554(Statics.field113, 0, Statics.field113.length - 1, field689, field690);
    }

    @ObfuscatedName("d.z([Lj;II[I[II)V")
    public static void method554(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field592;
                        var12 = var8.field592;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field590;
                        var12 = var8.field590;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method530() ? 1 : 0;
                        var12 = var8.method530() ? 1 : 0;
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
                        var15 = arg0[var5].field592;
                        var16 = var8.field592;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field590;
                        var16 = var8.field590;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method530() ? 1 : 0;
                        var16 = var8.method530() ? 1 : 0;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method554(arg0, arg1, var6, arg3, arg4);
        method554(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

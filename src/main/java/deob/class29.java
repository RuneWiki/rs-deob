package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("af")
public class class29 {

    @ObfuscatedName("af.e")
    public static int[] field642 = new int[256];

    @ObfuscatedName("af.x")
    public static int field639 = 0;

    @ObfuscatedName("af.n")
    public static int field640 = 0;

    @ObfuscatedName("af.aw")
    public static int field643 = 0;

    @ObfuscatedName("af.ar")
    public static int field657 = 0;

    @ObfuscatedName("af.af")
    public static int field645 = 0;

    @ObfuscatedName("af.am")
    public static int field646 = 0;

    @ObfuscatedName("af.ax")
    public static int field638 = 10;

    @ObfuscatedName("af.av")
    public static String field647 = "";

    @ObfuscatedName("af.al")
    public static int field649 = 0;

    @ObfuscatedName("af.ab")
    public static String field650 = "";

    @ObfuscatedName("af.ac")
    public static String field658 = "";

    @ObfuscatedName("af.aq")
    public static String field652 = "";

    @ObfuscatedName("af.az")
    public static String field637 = "";

    @ObfuscatedName("af.ah")
    public static String field654 = "";

    @ObfuscatedName("af.at")
    public static class149 field655 = class149.field2423;

    @ObfuscatedName("af.au")
    public static boolean field653 = true;

    @ObfuscatedName("af.ag")
    public static int field659 = 0;

    @ObfuscatedName("af.an")
    public static String field656 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("af.ad")
    public static String field630 = "1234567890";

    @ObfuscatedName("af.ak")
    public static boolean field660 = false;

    @ObfuscatedName("af.bi")
    public static int field661 = 0;

    @ObfuscatedName("af.bp")
    public static int[] field662 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("af.bw")
    public static int[] field663 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("af.bu")
    public static int field636 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.p(Ljava/awt/Component;Len;Len;ZIB)V")
    public static void method2708(Component arg0, class151 arg1, class151 arg2, boolean arg3, int arg4) {
        if (!Statics.field648) {
            field649 = arg4;
            class74.method1538();
            byte[] var5 = arg1.method2764("title.jpg", "");
            Statics.field633 = new class73(var5, arg0);
            Statics.field634 = Statics.field633.method1452();
            Statics.field3043 = class71.method2424(arg2, "logo", "");
            Statics.field631 = class71.method2424(arg2, "titlebox", "");
            Statics.field632 = class71.method2424(arg2, "titlebutton", "");
            Statics.field982 = Statics.method124(arg2, "runes", "");
            Statics.field2678 = Statics.method124(arg2, "title_mute", "");
            Statics.field2109 = class71.method2424(arg2, "options_radio_buttons,0", "");
            Statics.field635 = class71.method2424(arg2, "options_radio_buttons,2", "");
            Statics.field1939 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1939[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1939[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1939[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1939[var9 + 192] = 16777215;
            }
            Statics.field150 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field150[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field150[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field150[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field150[var13 + 192] = 16777215;
            }
            Statics.field2503 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2503[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2503[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2503[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2503[var17 + 192] = 16777215;
            }
            Statics.field2701 = new int[256];
            Statics.field641 = new int[32768];
            Statics.field520 = new int[32768];
            method141((class75) null);
            Statics.field1425 = new int[32768];
            Statics.field664 = new int[32768];
            if (arg3) {
                field637 = "";
                field654 = "";
            }
            Statics.field2950 = 0;
            Statics.field137 = "";
            field653 = true;
            field660 = false;
            if (Statics.field1993.field127) {
                class166.method2725(2);
            } else {
                class152 var18 = Statics.field1928;
                int var19 = var18.method2762("scape main");
                int var20 = var18.method2763(var19, "");
                class166.method1890(2, var18, var19, var20, 255, false);
            }
            class155.method1876(false);
            Statics.field648 = true;
            Statics.field633.method1461(0, 0);
            Statics.field634.method1461(382, 0);
            Statics.field3043.method1601(382 - Statics.field3043.field1315 / 2, 18);
        } else if (arg4 == 4) {
            field649 = 4;
        }
    }

    @ObfuscatedName("el.y(I)V")
    public static void method2732() {
        if (!Statics.field648) {
            return;
        }
        Statics.field631 = null;
        Statics.field632 = null;
        Statics.field982 = null;
        Statics.field633 = null;
        Statics.field634 = null;
        Statics.field3043 = null;
        Statics.field2678 = null;
        Statics.field2109 = null;
        Statics.field635 = null;
        Statics.field1423 = null;
        Statics.field2518 = null;
        Statics.field1666 = null;
        Statics.field554 = null;
        Statics.field1798 = null;
        Statics.field1939 = null;
        Statics.field150 = null;
        Statics.field2503 = null;
        Statics.field2701 = null;
        Statics.field641 = null;
        Statics.field520 = null;
        Statics.field1425 = null;
        Statics.field664 = null;
        class166.method2725(2);
        class155.method1876(true);
        Statics.field648 = false;
    }

    @ObfuscatedName("cw.d(Lee;I)V")
    public static void method1988(class135 arg0) {
        if (field660) {
            method154(arg0);
            return;
        }
        if ((class131.field2017 == 1 || !Statics.field1271 && class131.field2017 == 4) && class131.field2016 >= 715 && class131.field2020 >= 453) {
            Statics.field1993.field127 = !Statics.field1993.field127;
            class9.method3364();
            if (Statics.field1993.field127) {
                class166.method503();
            } else {
                class166.method667(Statics.field1928, "scape main", "", 255, false);
            }
        }
        if (client.field241 == 5) {
            return;
        }
        field645++;
        if (client.field241 != 10 && client.field241 != 11) {
            return;
        }
        if (client.field240 == 0) {
            if (class131.field2017 == 1 || !Statics.field1271 && class131.field2017 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class131.field2016 >= var1 && class131.field2016 <= var1 + var3 && class131.field2020 >= var2 && class131.field2020 <= var2 + var4) {
                    method594();
                    return;
                }
            }
            if (Statics.field226 != null) {
                method594();
            }
        }
        int var5 = class131.field2017;
        int var6 = class131.field2016;
        int var7 = class131.field2020;
        if (!Statics.field1271 && var5 == 4) {
            var5 = 1;
        }
        if (field649 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class129.method2743(client.method2055("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field233 & 0x4) != 0) {
                    if ((client.field233 & 0x400) == 0) {
                        field650 = class147.field2379;
                        field658 = class147.field2380;
                        field652 = class147.field2381;
                    } else {
                        field650 = class147.field2385;
                        field658 = class147.field2386;
                        field652 = class147.field2383;
                    }
                    field649 = 1;
                    field659 = 0;
                } else if ((client.field233 & 0x400) == 0) {
                    field650 = class147.field2375;
                    field658 = class147.field2376;
                    field652 = class147.field2377;
                    field649 = 2;
                    field659 = 0;
                } else {
                    field650 = class147.field2382;
                    field658 = class147.field2223;
                    field652 = class147.field2246;
                    field649 = 1;
                    field659 = 0;
                }
            }
        } else if (field649 == 1) {
            while (class128.method2205()) {
                if (Statics.field1812 == 84) {
                    field650 = class147.field2375;
                    field658 = class147.field2376;
                    field652 = class147.field2377;
                    field649 = 2;
                    field659 = 0;
                } else if (Statics.field1812 == 13) {
                    field649 = 0;
                }
            }
            short var11 = 302;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field650 = class147.field2375;
                field658 = class147.field2376;
                field652 = class147.field2377;
                field649 = 2;
                field659 = 0;
            }
            short var13 = 462;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field649 = 0;
            }
        } else if (field649 == 2) {
            short var14 = 231;
            int var25 = var14 + 30;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field659 = 0;
            }
            var25 += 15;
            if (var5 == 1 && var7 >= var25 - 15 && var7 < var25) {
                field659 = 1;
            }
            var25 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field637 = field637.trim();
                if (field637.length() == 0) {
                    method668(class147.field2281, class147.field2282, class147.field2283);
                    return;
                }
                if (field654.length() == 0) {
                    method668(class147.field2284, class147.field2285, class147.field2296);
                    return;
                }
                method668(class147.field2390, class147.field2369, class147.field2392);
                field655 = Statics.field1993.field128.containsKey(class213.method2058(field637)) ? class149.field2421 : class149.field2423;
                client.method871(20);
                return;
            }
            short var17 = 462;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var16 - 20 && var7 <= var16 + 20) {
                field649 = 0;
                field637 = "";
                field654 = "";
                Statics.field2950 = 0;
                Statics.field137 = "";
                field653 = true;
            }
            while (true) {
                while (class128.method2205()) {
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field656.length(); var19++) {
                        if (Statics.field129 == field656.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (Statics.field1812 == 13) {
                        field649 = 0;
                        field637 = "";
                        field654 = "";
                        Statics.field2950 = 0;
                        Statics.field137 = "";
                        field653 = true;
                    } else if (field659 == 0) {
                        if (Statics.field1812 == 85 && field637.length() > 0) {
                            field637 = field637.substring(0, field637.length() - 1);
                        }
                        if (Statics.field1812 == 84 || Statics.field1812 == 80) {
                            field659 = 1;
                        }
                        if (var18 && field637.length() < 320) {
                            field637 = field637 + Statics.field129;
                        }
                    } else if (field659 == 1) {
                        if (Statics.field1812 == 85 && field654.length() > 0) {
                            field654 = field654.substring(0, field654.length() - 1);
                        }
                        if (Statics.field1812 == 84 || Statics.field1812 == 80) {
                            field659 = 0;
                        }
                        if (Statics.field1812 == 84) {
                            field637 = field637.trim();
                            if (field637.length() == 0) {
                                method668(class147.field2281, class147.field2282, class147.field2283);
                                return;
                            }
                            if (field654.length() == 0) {
                                method668(class147.field2284, class147.field2285, class147.field2296);
                                return;
                            }
                            method668(class147.field2390, class147.field2369, class147.field2392);
                            field655 = Statics.field1993.field128.containsKey(class213.method2058(field637)) ? class149.field2421 : class149.field2423;
                            client.method871(20);
                            return;
                        }
                        if (var18 && field654.length() < 20) {
                            field654 = field654 + Statics.field129;
                        }
                    }
                }
                return;
            }
        } else if (field649 == 4) {
            short var20 = 302;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                Statics.field137.trim();
                if (Statics.field137.length() != 6) {
                    method668(class147.field2196, class147.field2331, class147.field2199);
                    return;
                }
                Statics.field2950 = Integer.parseInt(Statics.field137);
                Statics.field137 = "";
                field655 = field653 ? class149.field2422 : class149.field2420;
                method668(class147.field2390, class147.field2369, class147.field2392);
                client.method871(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field653 = !field653;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                class129.method2743(client.method2055("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var22 = 462;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field649 = 0;
                field637 = "";
                field654 = "";
                Statics.field2950 = 0;
                Statics.field137 = "";
            }
            while (class128.method2205()) {
                boolean var23 = false;
                for (int var24 = 0; var24 < field630.length(); var24++) {
                    if (Statics.field129 == field630.charAt(var24)) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field1812 == 13) {
                    field649 = 0;
                    field637 = "";
                    field654 = "";
                    Statics.field2950 = 0;
                    Statics.field137 = "";
                } else {
                    if (Statics.field1812 == 85 && Statics.field137.length() > 0) {
                        Statics.field137 = Statics.field137.substring(0, Statics.field137.length() - 1);
                    }
                    if (Statics.field1812 == 84) {
                        Statics.field137.trim();
                        if (Statics.field137.length() != 6) {
                            method668(class147.field2196, class147.field2331, class147.field2199);
                            return;
                        }
                        Statics.field2950 = Integer.parseInt(Statics.field137);
                        Statics.field137 = "";
                        field655 = field653 ? class149.field2422 : class149.field2420;
                        method668(class147.field2390, class147.field2369, class147.field2392);
                        client.method871(20);
                        return;
                    }
                    if (var23 && Statics.field137.length() < 6) {
                        Statics.field137 = Statics.field137 + Statics.field129;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.c(Lgy;Lgy;B)V")
    public static void method2874(class207 arg0, class207 arg1) {
        if (field660) {
            if (Statics.field1423 == null) {
                Statics.field1423 = class71.method778(Statics.field1509, "sl_back", "");
            }
            if (Statics.field2518 == null) {
                Statics.field2518 = Statics.method124(Statics.field1509, "sl_flags", "");
            }
            if (Statics.field1666 == null) {
                Statics.field1666 = Statics.method124(Statics.field1509, "sl_arrows", "");
            }
            if (Statics.field554 == null) {
                Statics.field554 = Statics.method124(Statics.field1509, "sl_stars", "");
            }
            class74.method1540(0, 23, 765, 480, 0);
            class74.method1541(0, 0, 125, 23, 12425273, 9135624);
            class74.method1541(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3471(class147.field2401, 62, 15, 0, -1);
            if (Statics.field554 != null) {
                Statics.field554[1].method1601(140, 1);
                arg1.method3534(class147.field2324, 152, 10, 16777215, -1);
                Statics.field554[0].method1601(140, 12);
                arg1.method3534(class147.field2178, 152, 21, 16777215, -1);
            }
            if (Statics.field1666 != null) {
                short var2 = 280;
                if (field662[0] == 0 && field663[0] == 0) {
                    Statics.field1666[2].method1601(var2, 4);
                } else {
                    Statics.field1666[0].method1601(var2, 4);
                }
                if (field662[0] == 0 && field663[0] == 1) {
                    Statics.field1666[3].method1601(var2 + 15, 4);
                } else {
                    Statics.field1666[1].method1601(var2 + 15, 4);
                }
                arg0.method3534(class147.field2267, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field662[0] == 1 && field663[0] == 0) {
                    Statics.field1666[2].method1601(var3, 4);
                } else {
                    Statics.field1666[0].method1601(var3, 4);
                }
                if (field662[0] == 1 && field663[0] == 1) {
                    Statics.field1666[3].method1601(var3 + 15, 4);
                } else {
                    Statics.field1666[1].method1601(var3 + 15, 4);
                }
                arg0.method3534(class147.field2405, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field662[0] == 2 && field663[0] == 0) {
                    Statics.field1666[2].method1601(var4, 4);
                } else {
                    Statics.field1666[0].method1601(var4, 4);
                }
                if (field662[0] == 2 && field663[0] == 1) {
                    Statics.field1666[3].method1601(var4 + 15, 4);
                } else {
                    Statics.field1666[1].method1601(var4 + 15, 4);
                }
                arg0.method3534(class147.field2344, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field662[0] == 3 && field663[0] == 0) {
                    Statics.field1666[2].method1601(var5, 4);
                } else {
                    Statics.field1666[0].method1601(var5, 4);
                }
                if (field662[0] == 3 && field663[0] == 1) {
                    Statics.field1666[3].method1601(var5 + 15, 4);
                } else {
                    Statics.field1666[1].method1601(var5 + 15, 4);
                }
                arg0.method3534(class147.field2407, var5 + 32, 17, 16777215, -1);
            }
            class74.method1540(708, 4, 50, 16, 0);
            arg1.method3471(class147.field2400, 733, 16, 16777215, -1);
            field636 = -1;
            if (Statics.field1423 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field661) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field661) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field661) {
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
                for (int var20 = 0; var20 < field661; var20++) {
                    class23 var21 = Statics.field1446[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field561);
                    if (var21.field561 == -1) {
                        var23 = class147.field2408;
                        var22 = false;
                    } else if (var21.field561 > 1980) {
                        var23 = class147.field2409;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method529()) {
                        if (var21.method523()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method523()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class131.field2009 >= var17 && class131.field2010 >= var16 && class131.field2009 < var6 + var17 && class131.field2010 < var7 + var16 && var22) {
                        field636 = var20;
                        Statics.field1423[var24].method1518(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1423[var24].method1461(var17, var16);
                    }
                    if (Statics.field2518 != null) {
                        Statics.field2518[(var21.method523() ? 8 : 0) + var21.field564].method1601(var17 + 29, var16);
                    }
                    arg0.method3471(Integer.toString(var21.field562), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3471(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3464(Statics.field1446[field636].field566) + 6;
                    int var26 = arg1.field2981 + 8;
                    class74.method1540(class131.field2009 - var25 / 2, class131.field2010 + 20 + 5, var25, var26, 16777120);
                    class74.method1539(class131.field2009 - var25 / 2, class131.field2010 + 20 + 5, var25, var26, 0);
                    arg1.method3471(Statics.field1446[field636].field566, class131.field2009, class131.field2010 + 20 + 5 + arg1.field2981 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field877.getGraphics();
                Statics.field1994.method1384(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field877.repaint();
            }
            return;
        }
        if (client.field241 == 0 || client.field241 == 5) {
            byte var29 = 20;
            arg0.method3471(class147.field2197, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class74.method1539(230, var30, 304, 34, 9179409);
            class74.method1539(231, var30 + 1, 302, 32, 0);
            class74.method1540(232, var30 + 2, field638 * 3, 30, 9179409);
            class74.method1540(field638 * 3 + 232, var30 + 2, 300 - field638 * 3, 30, 0);
            arg0.method3471(field647, 382, 276 - var29, 16777215, -1);
        }
        if (client.field241 == 20) {
            Statics.field631.method1601(382 - Statics.field631.field1315 / 2, 271 - Statics.field631.field1313 / 2);
            short var31 = 211;
            arg0.method3471(field650, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3471(field658, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3471(field652, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field649 != 4) {
                arg0.method3534(class147.field2393, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field637; arg0.method3464(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3534(class206.method3468(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class147.field2394;
                String var36 = field654;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3534(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field241 == 10 || client.field241 == 11) {
            Statics.field631.method1601(202, 171);
            if (field649 == 0) {
                short var42 = 251;
                arg0.method3471(class147.field2396, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field632.method1601(var43 - 73, var44 - 20);
                arg0.method3489(class147.field2399, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field632.method1601(var45 - 73, var44 - 20);
                arg0.method3489(class147.field2398, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field649 == 1) {
                arg0.method3471(class147.field2378, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3471(field650, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3471(field658, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3471(field652, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field632.method1601(var47 - 73, var48 - 20);
                arg0.method3471(class147.field2169, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field632.method1601(var49 - 73, var48 - 20);
                arg0.method3471(class147.field2400, var49, var48 + 5, 16777215, 0);
            } else if (field649 == 2) {
                short var50 = 211;
                arg0.method3471(field650, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3471(field658, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3471(field652, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3534(class147.field2393, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field637; arg0.method3464(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3534(class206.method3468(var52) + (field659 == 0 & client.field243 % 40 < 20 ? class2.method82(16776960) + class2.field16 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class147.field2394;
                String var55 = field654;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3534(var54 + var59 + (field659 == 1 & client.field243 % 40 < 20 ? class2.method82(16776960) + class2.field16 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field632.method1601(var61 - 73, var62 - 20);
                arg0.method3471(class147.field2356, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field632.method1601(var63 - 73, var62 - 20);
                arg0.method3471(class147.field2400, var63, var62 + 5, 16777215, 0);
            } else if (field649 == 4) {
                arg0.method3471(class147.field2388, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3471(field650, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3471(field658, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3471(field652, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class147.field2234;
                String var67 = Statics.field137;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3534(var66 + var71 + (client.field243 % 40 < 20 ? class2.method82(16776960) + class2.field16 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3534(class147.field2171, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3534(class147.field2172, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3464(class147.field2172) + 15;
                int var74 = var126 - arg0.field2981;
                class75 var75;
                if (field653) {
                    var75 = Statics.field635;
                } else {
                    var75 = Statics.field2109;
                }
                var75.method1601(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field632.method1601(var76 - 73, var77 - 20);
                arg0.method3471(class147.field2169, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field632.method1601(var78 - 73, var77 - 20);
                arg0.method3471(class147.field2400, var78, var77 + 5, 16777215, 0);
                arg1.method3471(class147.field2239, 382, var77 + 36, 255, 0);
            }
        }
        if (field645 > 0) {
            int var79 = field645;
            short var80 = 256;
            field643 += var79 * 128;
            if (field643 > Statics.field641.length) {
                field643 -= Statics.field641.length;
                int var81 = (int) (Math.random() * 12.0D);
                method141(Statics.field982[var81]);
            }
            int var82 = 0;
            int var83 = var79 * 128;
            int var84 = (var80 - var79) * 128;
            for (int var85 = 0; var85 < var84; var85++) {
                int var86 = Statics.field1425[var82 + var83] - Statics.field641[field643 + var82 & Statics.field641.length - 1] * var79 / 6;
                if (var86 < 0) {
                    var86 = 0;
                }
                Statics.field1425[var82++] = var86;
            }
            for (int var87 = var80 - var79; var87 < var80; var87++) {
                int var88 = var87 * 128;
                for (int var89 = 0; var89 < 128; var89++) {
                    int var90 = (int) (Math.random() * 100.0D);
                    if (var90 < 50 && var89 > 10 && var89 < 118) {
                        Statics.field1425[var88 + var89] = 255;
                    } else {
                        Statics.field1425[var88 + var89] = 0;
                    }
                }
            }
            if (field639 > 0) {
                field639 -= var79 * 4;
            }
            if (field640 > 0) {
                field640 -= var79 * 4;
            }
            if (field639 == 0 && field640 == 0) {
                int var91 = (int) (Math.random() * (double) (2000 / var79));
                if (var91 == 0) {
                    field639 = 1024;
                }
                if (var91 == 1) {
                    field640 = 1024;
                }
            }
            for (int var92 = 0; var92 < var80 - var79; var92++) {
                field642[var92] = field642[var79 + var92];
            }
            for (int var93 = var80 - var79; var93 < var80; var93++) {
                field642[var93] = (int) (Math.sin((double) field646 / 14.0D) * 16.0D + Math.sin((double) field646 / 15.0D) * 14.0D + Math.sin((double) field646 / 16.0D) * 12.0D);
                field646++;
            }
            field657 += var79 * 443026311;
            int var94 = ((client.field243 & 0x1) + var79) / 2;
            if (var94 > 0) {
                for (int var95 = 0; var95 < field657 * -1248133764; var95++) {
                    int var96 = (int) (Math.random() * 124.0D) + 2;
                    int var97 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1425[(var97 << 7) + var96] = 192;
                }
                field657 = 0;
                int var98 = 0;
                label409: while (true) {
                    if (var98 >= var80) {
                        int var102 = 0;
                        while (true) {
                            if (var102 >= 128) {
                                break label409;
                            }
                            int var103 = 0;
                            for (int var104 = -var94; var104 < var80; var104++) {
                                int var105 = var104 * 128;
                                if (var94 + var104 < var80) {
                                    var103 += Statics.field664[var94 * 128 + var102 + var105];
                                }
                                if (var104 - (var94 + 1) >= 0) {
                                    var103 -= Statics.field664[var102 + var105 - (var94 + 1) * 128];
                                }
                                if (var104 >= 0) {
                                    Statics.field1425[var102 + var105] = var103 / (var94 * 2 + 1);
                                }
                            }
                            var102++;
                        }
                    }
                    int var99 = 0;
                    int var100 = var98 * 128;
                    for (int var101 = -var94; var101 < 128; var101++) {
                        if (var94 + var101 < 128) {
                            var99 += Statics.field1425[var100 + var101 + var94];
                        }
                        if (var101 - (var94 + 1) >= 0) {
                            var99 -= Statics.field1425[var100 + var101 - (var94 + 1)];
                        }
                        if (var101 >= 0) {
                            Statics.field664[var100 + var101] = var99 / (var94 * 2 + 1);
                        }
                    }
                    var98++;
                }
            }
            field645 = 0;
        }
        method52();
        Statics.field2678[Statics.field1993.field127 ? 1 : 0].method1601(725, 463);
        if (client.field241 > 5 && client.field240 == 0) {
            if (Statics.field1798 == null) {
                Statics.field1798 = class71.method2424(Statics.field1509, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field1798.method1601(var106, var107);
                arg0.method3471(class147.field2329 + " " + client.field269, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field226 == null) {
                    arg1.method3471(class147.field2411, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3471(class147.field2410, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field877.getGraphics();
            Statics.field1994.method1384(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field877.repaint();
        }
    }

    @ObfuscatedName("aq.r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method668(String arg0, String arg1, String arg2) {
        field650 = arg0;
        field658 = arg1;
        field652 = arg2;
    }

    @ObfuscatedName("m.f(Lbf;B)V")
    public static final void method141(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field641.length; var2++) {
            Statics.field641[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field641[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field520[var8] = (Statics.field641[var8 - 1] + Statics.field641[var8 + 1] + Statics.field641[var8 - 128] + Statics.field641[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field641;
            Statics.field641 = Statics.field520;
            Statics.field520 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1313; var11++) {
            for (int var12 = 0; var12 < arg0.field1315; var12++) {
                if (arg0.field1316[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1317;
                    int var14 = var11 + 16 + arg0.field1319;
                    int var15 = (var14 << 7) + var13;
                    Statics.field641[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dt.z(IIII)I")
    public static final int method2548(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("f.o(I)V")
    public static final void method52() {
        short var0 = 256;
        if (field639 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field639 > 768) {
                    Statics.field2701[var1] = method2548(Statics.field1939[var1], Statics.field150[var1], 1024 - field639);
                } else if (field639 > 256) {
                    Statics.field2701[var1] = Statics.field150[var1];
                } else {
                    Statics.field2701[var1] = method2548(Statics.field150[var1], Statics.field1939[var1], 256 - field639);
                }
            }
        } else if (field640 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field640 > 768) {
                    Statics.field2701[var2] = method2548(Statics.field1939[var2], Statics.field2503[var2], 1024 - field640);
                } else if (field640 > 256) {
                    Statics.field2701[var2] = Statics.field2503[var2];
                } else {
                    Statics.field2701[var2] = method2548(Statics.field2503[var2], Statics.field1939[var2], 256 - field640);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2701[var3] = Statics.field1939[var3];
            }
        }
        class74.method1534(0, 9, 128, var0 + 7);
        Statics.field633.method1461(0, 0);
        class74.method1533();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field642[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1425[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2701[var10];
                    int var14 = Statics.field1994.field1289[var5];
                    Statics.field1994.field1289[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class74.method1534(637, 9, 765, var0 + 7);
        Statics.field634.method1461(382, 0);
        class74.method1533();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field642[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1425[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2701[var22];
                    int var26 = Statics.field1994.field1289[var20];
                    Statics.field1994.field1289[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("q.k(Lee;B)V")
    public static void method154(class135 arg0) {
        if (class131.field2017 != 1 && Statics.field1271 || class131.field2017 != 4) {
            return;
        }
        short var1 = 280;
        if (class131.field2016 >= var1 && class131.field2016 <= var1 + 14 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(0, 0);
            return;
        }
        if (class131.field2016 >= var1 + 15 && class131.field2016 <= var1 + 80 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(0, 1);
            return;
        }
        short var2 = 390;
        if (class131.field2016 >= var2 && class131.field2016 <= var2 + 14 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(1, 0);
            return;
        }
        if (class131.field2016 >= var2 + 15 && class131.field2016 <= var2 + 80 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(1, 1);
            return;
        }
        short var3 = 500;
        if (class131.field2016 >= var3 && class131.field2016 <= var3 + 14 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(2, 0);
            return;
        }
        if (class131.field2016 >= var3 + 15 && class131.field2016 <= var3 + 80 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(2, 1);
            return;
        }
        short var4 = 610;
        if (class131.field2016 >= var4 && class131.field2016 <= var4 + 14 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(3, 0);
            return;
        }
        if (class131.field2016 >= var4 + 15 && class131.field2016 <= var4 + 80 && class131.field2020 >= 4 && class131.field2020 <= 18) {
            method719(3, 1);
            return;
        }
        if (class131.field2016 >= 708 && class131.field2020 >= 4 && class131.field2016 <= 758 && class131.field2020 <= 20) {
            field660 = false;
            Statics.field633.method1461(0, 0);
            Statics.field634.method1461(382, 0);
            Statics.field3043.method1601(382 - Statics.field3043.field1315 / 2, 18);
            return;
        }
        if (field636 == -1) {
            return;
        }
        class23 var5 = Statics.field1446[field636];
        method546(var5);
        field660 = false;
        Statics.field633.method1461(0, 0);
        Statics.field634.method1461(382, 0);
        Statics.field3043.method1601(382 - Statics.field3043.field1315 / 2, 18);
        return;
    }

    @ObfuscatedName("t.s(Lv;S)V")
    public static void method546(class23 arg0) {
        if (arg0.method523() != client.field250) {
            client.field250 = arg0.method523();
            boolean var1 = arg0.method523();
            if (Statics.field992 != var1) {
                class46.field993.method3190();
                class46.field994.method3190();
                class46.field1015.method3190();
                Statics.field992 = var1;
            }
        }
        Statics.field1447 = arg0.field560;
        client.field269 = arg0.field562;
        client.field233 = arg0.field563;
        Statics.field81 = client.field235 == 0 ? 43594 : arg0.field562 + 40000;
        Statics.field2515 = client.field235 == 0 ? 443 : arg0.field562 + 50000;
        Statics.field2429 = Statics.field81;
    }

    @ObfuscatedName("af.h(I)V")
    public static void method594() {
        try {
            if (Statics.field226 == null) {
                Statics.field226 = new class17(Statics.field1115, new URL(Statics.field525));
            } else {
                byte[] var0 = Statics.field226.method171();
                if (var0 != null) {
                    class110 var1 = new class110(var0);
                    field661 = var1.method2243();
                    Statics.field1446 = new class23[field661];
                    int var2 = 0;
                    while (var2 < field661) {
                        class23 var3 = Statics.field1446[var2] = new class23();
                        var3.field562 = var1.method2243();
                        var3.field563 = var1.method2164();
                        var3.field560 = var1.method2132();
                        var3.field566 = var1.method2132();
                        var3.field564 = var1.method2309();
                        var3.field561 = var1.method2127();
                        var3.field559 = var2++;
                    }
                    method2066(Statics.field1446, 0, Statics.field1446.length - 1, field662, field663);
                    field660 = true;
                    Statics.field226 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field226 = null;
        }
    }

    @ObfuscatedName("ah.m(III)V")
    public static void method719(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field662[var5] != arg0) {
                var2[var4] = field662[var5];
                var3[var4] = field663[var5];
                var4++;
            }
        }
        field662 = var2;
        field663 = var3;
        method2066(Statics.field1446, 0, Statics.field1446.length - 1, field662, field663);
    }

    @ObfuscatedName("cv.w([Lv;II[I[IB)V")
    public static void method2066(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field559;
                        var12 = var8.field559;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field561;
                        var12 = var8.field561;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method523() ? 1 : 0;
                        var12 = var8.method523() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field562;
                        var12 = var8.field562;
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
                        var15 = arg0[var5].field559;
                        var16 = var8.field559;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field561;
                        var16 = var8.field561;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method523() ? 1 : 0;
                        var16 = var8.method523() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field562;
                        var16 = var8.field562;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2066(arg0, arg1, var6, arg3, arg4);
        method2066(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

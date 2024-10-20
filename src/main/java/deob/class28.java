package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;

@ObfuscatedName("ab")
public class class28 {

    @ObfuscatedName("ab.c")
    public static int[] field660 = new int[256];

    @ObfuscatedName("ab.w")
    public static int field647 = 0;

    @ObfuscatedName("ab.z")
    public static int field652 = 0;

    @ObfuscatedName("ab.al")
    public static int field667 = 0;

    @ObfuscatedName("ab.ab")
    public static int field640 = 0;

    @ObfuscatedName("ab.au")
    public static int field654 = 0;

    @ObfuscatedName("ab.az")
    public static int field655 = 0;

    @ObfuscatedName("ab.ai")
    public static int field651 = 10;

    @ObfuscatedName("ab.ay")
    public static String field657 = "";

    @ObfuscatedName("ab.ar")
    public static int field658 = 0;

    @ObfuscatedName("ab.af")
    public static String field659 = "";

    @ObfuscatedName("ab.as")
    public static String field668 = "";

    @ObfuscatedName("ab.ap")
    public static String field646 = "";

    @ObfuscatedName("ab.aj")
    public static String field662 = "";

    @ObfuscatedName("ab.ac")
    public static String field663 = "";

    @ObfuscatedName("ab.aa")
    public static class144 field653 = class144.field2405;

    @ObfuscatedName("ab.ak")
    public static boolean field665 = true;

    @ObfuscatedName("ab.aw")
    public static int field664 = 0;

    @ObfuscatedName("ab.ao")
    public static String field666 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ab.aq")
    public static String field638 = "1234567890";

    @ObfuscatedName("ab.am")
    public static boolean field669 = false;

    @ObfuscatedName("ab.bs")
    public static int field670 = 0;

    @ObfuscatedName("ab.bl")
    public static int[] field671 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ab.bz")
    public static int[] field672 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ab.bx")
    public static int field673 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.b(Ljava/awt/Component;Leg;Leg;ZII)V")
    public static void method527(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field643) {
            field658 = arg4;
            class73.method1574();
            byte[] var5 = arg1.method2709("title.jpg", "");
            Statics.field205 = new class72(var5, arg0);
            Statics.field641 = Statics.field205.method1432();
            Statics.field1827 = class70.method65(arg2, "logo", "");
            Statics.field675 = class70.method65(arg2, "titlebox", "");
            Statics.field661 = class70.method65(arg2, "titlebutton", "");
            Statics.field639 = class70.method2479(arg2, "runes", "");
            Statics.field648 = class70.method2479(arg2, "title_mute", "");
            Statics.field157 = class70.method65(arg2, "options_radio_buttons,0", "");
            Statics.field2481 = class70.method65(arg2, "options_radio_buttons,2", "");
            Statics.field610 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field610[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field610[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field610[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field610[var9 + 192] = 16777215;
            }
            Statics.field145 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field145[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field145[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field145[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field145[var13 + 192] = 16777215;
            }
            Statics.field167 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field167[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field167[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field167[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field167[var17 + 192] = 16777215;
            }
            Statics.field1062 = new int[256];
            Statics.field649 = new int[32768];
            Statics.field650 = new int[32768];
            method2075((class74) null);
            Statics.field626 = new int[32768];
            Statics.field637 = new int[32768];
            if (arg3) {
                field662 = "";
                field663 = "";
            }
            Statics.field58 = 0;
            Statics.field2493 = "";
            field665 = true;
            field669 = false;
            if (Statics.field250.field142) {
                class161.field2705 = 1;
                Statics.field2519 = null;
                Statics.field2103 = -1;
                Statics.field2709 = -1;
                Statics.field985 = 0;
                Statics.field2708 = false;
                Statics.field2710 = 2;
            } else {
                class147 var18 = Statics.field2462;
                int var19 = var18.method2719("scape main");
                int var20 = var18.method2708(var19, "");
                class161.field2705 = 1;
                Statics.field2519 = var18;
                Statics.field2103 = var19;
                Statics.field2709 = var20;
                Statics.field985 = 255;
                Statics.field2708 = false;
                Statics.field2710 = 2;
            }
            class150.method1869(false);
            Statics.field643 = true;
            Statics.field205.method1433(0, 0);
            Statics.field641.method1433(382, 0);
            Statics.field1827.method1584(382 - Statics.field1827.field1312 / 2, 18);
        } else if (arg4 == 4) {
            field658 = 4;
        }
    }

    @ObfuscatedName("e.u(Lew;I)V")
    public static void method138(class131 arg0) {
        if (!field669) {
            if ((class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4) && class127.field2013 >= 715 && class127.field2012 >= 453) {
                Statics.field250.field142 = !Statics.field250.field142;
                class9.method2680();
                if (Statics.field250.field142) {
                    Statics.field1003.method3003();
                    class161.field2705 = 1;
                    Statics.field2519 = null;
                } else {
                    class147 var7 = Statics.field2462;
                    int var8 = var7.method2719("scape main");
                    int var9 = var7.method2708(var8, "");
                    class161.method2681(var7, var8, var9, 255, false);
                }
            }
            if (client.field502 != 5) {
                field654++;
                if (client.field502 == 10 || client.field502 == 11) {
                    if (client.field265 == 0) {
                        if (class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4) {
                            byte var10 = 5;
                            short var11 = 463;
                            byte var12 = 100;
                            byte var13 = 35;
                            if (class127.field2013 >= var10 && class127.field2013 <= var10 + var12 && class127.field2012 >= var11 && class127.field2012 <= var11 + var13) {
                                method488();
                                return;
                            }
                        }
                        if (Statics.field687 != null) {
                            method488();
                        }
                    }
                    int var14 = class127.field2010;
                    int var15 = class127.field2013;
                    int var16 = class127.field2012;
                    if (!Statics.field1901 && var14 == 4) {
                        var14 = 1;
                    }
                    if (field658 == 0) {
                        short var17 = 302;
                        short var18 = 291;
                        if (var14 == 1 && var15 >= var17 - 75 && var15 <= var17 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            label616: {
                                String var19 = client.method1883("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var19));
                                        break label616;
                                    } catch (Exception var44) {
                                    }
                                }
                                if (class125.field1981.startsWith("win")) {
                                    class125.method2532(var19, 0, "openjs");
                                } else if (class125.field1981.startsWith("mac")) {
                                    class125.method2532(var19, 1, "openjs");
                                } else {
                                    class125.method2532(var19, 2, "openjs");
                                }
                            }
                        }
                        short var21 = 462;
                        if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var18 - 20 && var16 <= var18 + 20) {
                            if ((client.field259 & 0x4) != 0) {
                                if ((client.field259 & 0x400) == 0) {
                                    field659 = class142.field2344;
                                    field668 = class142.field2282;
                                    field646 = class142.field2258;
                                } else {
                                    field659 = class142.field2353;
                                    field668 = class142.field2171;
                                    field646 = class142.field2369;
                                }
                                field658 = 1;
                                field664 = 0;
                            } else if ((client.field259 & 0x400) == 0) {
                                field659 = class142.field2336;
                                field668 = class142.field2358;
                                field646 = class142.field2359;
                                field658 = 2;
                                field664 = 0;
                            } else {
                                field659 = class142.field2364;
                                field668 = class142.field2271;
                                field646 = class142.field2159;
                                field658 = 1;
                                field664 = 0;
                            }
                        }
                    } else if (field658 == 1) {
                        while (class124.method1970()) {
                            if (Statics.field1872 == 84) {
                                field659 = class142.field2336;
                                field668 = class142.field2358;
                                field646 = class142.field2359;
                                field658 = 2;
                                field664 = 0;
                            } else if (Statics.field1872 == 13) {
                                field658 = 0;
                            }
                        }
                        short var22 = 302;
                        short var23 = 321;
                        if (var14 == 1 && var15 >= var22 - 75 && var15 <= var22 + 75 && var16 >= var23 - 20 && var16 <= var23 + 20) {
                            field659 = class142.field2336;
                            field668 = class142.field2358;
                            field646 = class142.field2359;
                            field658 = 2;
                            field664 = 0;
                        }
                        short var24 = 462;
                        if (var14 == 1 && var15 >= var24 - 75 && var15 <= var24 + 75 && var16 >= var23 - 20 && var16 <= var23 + 20) {
                            field658 = 0;
                        }
                    } else if (field658 == 2) {
                        short var25 = 231;
                        int var46 = var25 + 30;
                        if (var14 == 1 && var16 >= var46 - 15 && var16 < var46) {
                            field664 = 0;
                        }
                        var46 += 15;
                        if (var14 == 1 && var16 >= var46 - 15 && var16 < var46) {
                            field664 = 1;
                        }
                        var46 += 15;
                        short var26 = 302;
                        short var27 = 321;
                        if (var14 == 1 && var15 >= var26 - 75 && var15 <= var26 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field662 = field662.trim();
                            if (field662.length() == 0) {
                                method501(class142.field2263, class142.field2343, class142.field2265);
                                return;
                            }
                            if (field663.length() == 0) {
                                method501(class142.field2266, class142.field2267, class142.field2370);
                                return;
                            }
                            method501(class142.field2372, class142.field2373, class142.field2294);
                            field653 = Statics.field250.field143.containsKey(class197.method2058(field662)) ? class144.field2410 : class144.field2405;
                            client.method1617(20);
                            return;
                        }
                        short var28 = 462;
                        if (var14 == 1 && var15 >= var28 - 75 && var15 <= var28 + 75 && var16 >= var27 - 20 && var16 <= var27 + 20) {
                            field658 = 0;
                            field662 = "";
                            field663 = "";
                            Statics.field58 = 0;
                            Statics.field2493 = "";
                            field665 = true;
                        }
                        while (true) {
                            while (class124.method1970()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field666.length(); var30++) {
                                    if (Statics.field2475 == field666.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1872 == 13) {
                                    field658 = 0;
                                    field662 = "";
                                    field663 = "";
                                    Statics.field58 = 0;
                                    Statics.field2493 = "";
                                    field665 = true;
                                } else if (field664 == 0) {
                                    if (Statics.field1872 == 85 && field662.length() > 0) {
                                        field662 = field662.substring(0, field662.length() - 1);
                                    }
                                    if (Statics.field1872 == 84 || Statics.field1872 == 80) {
                                        field664 = 1;
                                    }
                                    if (var29 && field662.length() < 320) {
                                        field662 = field662 + Statics.field2475;
                                    }
                                } else if (field664 == 1) {
                                    if (Statics.field1872 == 85 && field663.length() > 0) {
                                        field663 = field663.substring(0, field663.length() - 1);
                                    }
                                    if (Statics.field1872 == 84 || Statics.field1872 == 80) {
                                        field664 = 0;
                                    }
                                    if (Statics.field1872 == 84) {
                                        field662 = field662.trim();
                                        if (field662.length() == 0) {
                                            method501(class142.field2263, class142.field2343, class142.field2265);
                                            return;
                                        }
                                        if (field663.length() == 0) {
                                            method501(class142.field2266, class142.field2267, class142.field2370);
                                            return;
                                        }
                                        method501(class142.field2372, class142.field2373, class142.field2294);
                                        LinkedHashMap var31 = Statics.field250.field143;
                                        String var32 = field662;
                                        int var33 = var32.length();
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < var33; var35++) {
                                            var34 = (var34 << 5) - var34 + var32.charAt(var35);
                                        }
                                        field653 = var31.containsKey(var34) ? class144.field2410 : class144.field2405;
                                        client.method1617(20);
                                        return;
                                    }
                                    if (var29 && field663.length() < 20) {
                                        field663 = field663 + Statics.field2475;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field658 == 4) {
                        short var37 = 302;
                        short var38 = 321;
                        if (var14 == 1 && var15 >= var37 - 75 && var15 <= var37 + 75 && var16 >= var38 - 20 && var16 <= var38 + 20) {
                            Statics.field2493.trim();
                            if (Statics.field2493.length() != 6) {
                                method501(class142.field2268, class142.field2180, class142.field2181);
                                return;
                            }
                            Statics.field58 = Integer.parseInt(Statics.field2493);
                            Statics.field2493 = "";
                            field653 = field665 ? class144.field2403 : class144.field2406;
                            method501(class142.field2372, class142.field2373, class142.field2294);
                            client.method1617(20);
                            return;
                        }
                        if (var14 == 1 && var15 >= 373 && var15 <= 512 && var16 >= 263 && var16 <= 296) {
                            field665 = !field665;
                        }
                        if (var14 == 1 && var15 >= 348 && var15 <= 416 && var16 >= 351 && var16 <= 363) {
                            label631: {
                                String var39 = client.method1883("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var39));
                                        break label631;
                                    } catch (Exception var45) {
                                    }
                                }
                                if (class125.field1981.startsWith("win")) {
                                    class125.method2532(var39, 0, "openjs");
                                } else if (class125.field1981.startsWith("mac")) {
                                    class125.method2532(var39, 1, "openjs");
                                } else {
                                    class125.method2532(var39, 2, "openjs");
                                }
                            }
                        }
                        short var41 = 462;
                        if (var14 == 1 && var15 >= var41 - 75 && var15 <= var41 + 75 && var16 >= var38 - 20 && var16 <= var38 + 20) {
                            field658 = 0;
                            field662 = "";
                            field663 = "";
                            Statics.field58 = 0;
                            Statics.field2493 = "";
                        }
                        while (class124.method1970()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field638.length(); var43++) {
                                if (Statics.field2475 == field638.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field1872 == 13) {
                                field658 = 0;
                                field662 = "";
                                field663 = "";
                                Statics.field58 = 0;
                                Statics.field2493 = "";
                            } else {
                                if (Statics.field1872 == 85 && Statics.field2493.length() > 0) {
                                    Statics.field2493 = Statics.field2493.substring(0, Statics.field2493.length() - 1);
                                }
                                if (Statics.field1872 == 84) {
                                    Statics.field2493.trim();
                                    if (Statics.field2493.length() != 6) {
                                        method501(class142.field2268, class142.field2180, class142.field2181);
                                        return;
                                    }
                                    Statics.field58 = Integer.parseInt(Statics.field2493);
                                    Statics.field2493 = "";
                                    field653 = field665 ? class144.field2403 : class144.field2406;
                                    method501(class142.field2372, class142.field2373, class142.field2294);
                                    client.method1617(20);
                                    return;
                                }
                                if (var42 && Statics.field2493.length() < 6) {
                                    Statics.field2493 = Statics.field2493 + Statics.field2475;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field2010 == 1 || !Statics.field1901 && class127.field2010 == 4) {
            short var1 = 280;
            if (class127.field2013 >= var1 && class127.field2013 <= var1 + 14 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                method143(0, 0);
            } else if (class127.field2013 >= var1 + 15 && class127.field2013 <= var1 + 80 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                method143(0, 1);
            } else {
                short var2 = 390;
                if (class127.field2013 >= var2 && class127.field2013 <= var2 + 14 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                    method143(1, 0);
                } else if (class127.field2013 >= var2 + 15 && class127.field2013 <= var2 + 80 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                    method143(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field2013 >= var3 && class127.field2013 <= var3 + 14 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                        method143(2, 0);
                    } else if (class127.field2013 >= var3 + 15 && class127.field2013 <= var3 + 80 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                        method143(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field2013 >= var4 && class127.field2013 <= var4 + 14 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                            method143(3, 0);
                        } else if (class127.field2013 >= var4 + 15 && class127.field2013 <= var4 + 80 && class127.field2012 >= 4 && class127.field2012 <= 18) {
                            method143(3, 1);
                        } else if (class127.field2013 >= 708 && class127.field2012 >= 4 && class127.field2013 <= 758 && class127.field2012 <= 20) {
                            field669 = false;
                            Statics.field205.method1433(0, 0);
                            Statics.field641.method1433(382, 0);
                            Statics.field1827.method1584(382 - Statics.field1827.field1312 / 2, 18);
                        } else if (field673 != -1) {
                            class22 var5 = Statics.field1758[field673];
                            if (var5.method505() != client.field263) {
                                client.field263 = var5.method505();
                                boolean var6 = var5.method505();
                                if (Statics.field1021 != var6) {
                                    class45.field1014.method3117();
                                    class45.field1015.method3117();
                                    class45.field1016.method3117();
                                    Statics.field1021 = var6;
                                }
                            }
                            Statics.field2028 = var5.field571;
                            client.field273 = var5.field574;
                            client.field259 = var5.field569;
                            Statics.field896 = client.field261 == 0 ? 43594 : var5.field574 + 40000;
                            Statics.field1274 = client.field261 == 0 ? 443 : var5.field574 + 50000;
                            Statics.field369 = Statics.field896;
                            field669 = false;
                            Statics.field205.method1433(0, 0);
                            Statics.field641.method1433(382, 0);
                            Statics.field1827.method1584(382 - Statics.field1827.field1312 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.x(Lgy;Lgy;B)V")
    public static void method2(class191 arg0, class191 arg1) {
        if (field669) {
            if (Statics.field599 == null) {
                Statics.field599 = class70.method115(Statics.field584, "sl_back", "");
            }
            if (Statics.field955 == null) {
                Statics.field955 = class70.method2479(Statics.field584, "sl_flags", "");
            }
            if (Statics.field1862 == null) {
                Statics.field1862 = class70.method2479(Statics.field584, "sl_arrows", "");
            }
            if (Statics.field631 == null) {
                Statics.field631 = class70.method2479(Statics.field584, "sl_stars", "");
            }
            class73.method1523(0, 23, 765, 480, 0);
            class73.method1542(0, 0, 125, 23, 12425273, 9135624);
            class73.method1542(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3310(class142.field2383, 62, 15, 0, -1);
            if (Statics.field631 != null) {
                Statics.field631[1].method1584(140, 1);
                arg1.method3308(class142.field2384, 152, 10, 16777215, -1);
                Statics.field631[0].method1584(140, 12);
                arg1.method3308(class142.field2385, 152, 21, 16777215, -1);
            }
            if (Statics.field1862 != null) {
                short var2 = 280;
                if (field671[0] == 0 && field672[0] == 0) {
                    Statics.field1862[2].method1584(var2, 4);
                } else {
                    Statics.field1862[0].method1584(var2, 4);
                }
                if (field671[0] == 0 && field672[0] == 1) {
                    Statics.field1862[3].method1584(var2 + 15, 4);
                } else {
                    Statics.field1862[1].method1584(var2 + 15, 4);
                }
                arg0.method3308(class142.field2386, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field671[0] == 1 && field672[0] == 0) {
                    Statics.field1862[2].method1584(var3, 4);
                } else {
                    Statics.field1862[0].method1584(var3, 4);
                }
                if (field671[0] == 1 && field672[0] == 1) {
                    Statics.field1862[3].method1584(var3 + 15, 4);
                } else {
                    Statics.field1862[1].method1584(var3 + 15, 4);
                }
                arg0.method3308(class142.field2387, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field671[0] == 2 && field672[0] == 0) {
                    Statics.field1862[2].method1584(var4, 4);
                } else {
                    Statics.field1862[0].method1584(var4, 4);
                }
                if (field671[0] == 2 && field672[0] == 1) {
                    Statics.field1862[3].method1584(var4 + 15, 4);
                } else {
                    Statics.field1862[1].method1584(var4 + 15, 4);
                }
                arg0.method3308(class142.field2388, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field671[0] == 3 && field672[0] == 0) {
                    Statics.field1862[2].method1584(var5, 4);
                } else {
                    Statics.field1862[0].method1584(var5, 4);
                }
                if (field671[0] == 3 && field672[0] == 1) {
                    Statics.field1862[3].method1584(var5 + 15, 4);
                } else {
                    Statics.field1862[1].method1584(var5 + 15, 4);
                }
                arg0.method3308(class142.field2389, var5 + 32, 17, 16777215, -1);
            }
            class73.method1523(708, 4, 50, 16, 0);
            arg1.method3310(class142.field2248, 733, 16, 16777215, -1);
            field673 = -1;
            if (Statics.field599 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field670) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field670) {
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
                for (int var20 = 0; var20 < field670; var20++) {
                    class22 var21 = Statics.field1758[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field570);
                    if (var21.field570 == -1) {
                        var23 = class142.field2362;
                        var22 = false;
                    } else if (var21.field570 > 1980) {
                        var23 = class142.field2391;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method504()) {
                        if (var21.method505()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method505()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2004 >= var17 && class127.field2005 >= var16 && class127.field2004 < var6 + var17 && class127.field2005 < var7 + var16 && var22) {
                        field673 = var20;
                        Statics.field599[var24].method1487(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field599[var24].method1433(var17, var16);
                    }
                    if (Statics.field955 != null) {
                        Statics.field955[(var21.method505() ? 8 : 0) + var21.field573].method1584(var17 + 29, var16);
                    }
                    arg0.method3310(Integer.toString(var21.field574), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3310(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3342(Statics.field1758[field673].field568) + 6;
                    int var26 = arg1.field2898 + 8;
                    class73.method1523(class127.field2004 - var25 / 2, class127.field2005 + 20 + 5, var25, var26, 16777120);
                    class73.method1581(class127.field2004 - var25 / 2, class127.field2005 + 20 + 5, var25, var26, 0);
                    arg1.method3310(Statics.field1758[field673].field568, class127.field2004, class127.field2005 + 20 + 5 + arg1.field2898 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1978.getGraphics();
                Statics.field678.method1346(var27, 0, 0);
            } catch (Exception var100) {
                Statics.field1978.repaint();
            }
            return;
        }
        if (client.field502 == 0 || client.field502 == 5) {
            byte var29 = 20;
            arg0.method3310(class142.field2356, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1581(230, var30, 304, 34, 9179409);
            class73.method1581(231, var30 + 1, 302, 32, 0);
            class73.method1523(232, var30 + 2, field651 * 3, 30, 9179409);
            class73.method1523(field651 * 3 + 232, var30 + 2, 300 - field651 * 3, 30, 0);
            arg0.method3310(field657, 382, 276 - var29, 16777215, -1);
        }
        if (client.field502 == 20) {
            Statics.field675.method1584(382 - Statics.field675.field1312 / 2, 271 - Statics.field675.field1315 / 2);
            short var31 = 211;
            arg0.method3310(field659, 382, var31, 16776960, 0);
            int var102 = var31 + 15;
            arg0.method3310(field668, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            arg0.method3310(field646, 382, var103, 16776960, 0);
            int var104 = var103 + 15;
            int var105 = var104 + 10;
            if (field658 != 4) {
                arg0.method3308(class142.field2213, 272, var105, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field662; arg0.method3342(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3308(class190.method3300(var33), 312, var105, 16777215, 0);
                var102 = var105 + 15;
                String var35 = class142.field2382;
                String var36 = field663;
                String var37 = class197.method155('*', var36.length());
                arg0.method3308(var35 + var37, 274, var102, 16777215, 0);
                var102 += 15;
            }
        }
        if (client.field502 == 10 || client.field502 == 11) {
            Statics.field675.method1584(202, 171);
            if (field658 == 0) {
                short var38 = 251;
                arg0.method3310(class142.field2378, 382, var38, 16776960, 0);
                int var106 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field661.method1584(var39 - 73, var40 - 20);
                arg0.method3366(class142.field2172, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field661.method1584(var41 - 73, var40 - 20);
                arg0.method3366(class142.field2192, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field658 == 1) {
                arg0.method3310(class142.field2360, 382, 211, 16776960, 0);
                short var42 = 236;
                arg0.method3310(field659, 382, var42, 16777215, 0);
                int var107 = var42 + 15;
                arg0.method3310(field668, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                arg0.method3310(field646, 382, var108, 16777215, 0);
                int var109 = var108 + 15;
                short var43 = 302;
                short var44 = 321;
                Statics.field661.method1584(var43 - 73, var44 - 20);
                arg0.method3310(class142.field2152, var43, var44 + 5, 16777215, 0);
                short var45 = 462;
                Statics.field661.method1584(var45 - 73, var44 - 20);
                arg0.method3310(class142.field2248, var45, var44 + 5, 16777215, 0);
            } else if (field658 == 2) {
                short var46 = 211;
                arg0.method3310(field659, 382, var46, 16776960, 0);
                int var110 = var46 + 15;
                arg0.method3310(field668, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                arg0.method3310(field646, 382, var111, 16776960, 0);
                int var112 = var111 + 15;
                int var113 = var112 + 10;
                arg0.method3308(class142.field2213, 272, var113, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = field662; arg0.method3342(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method3308(class190.method3300(var48) + (field664 == 0 & client.field376 % 40 < 20 ? class2.method3286(16776960) + class2.field21 : ""), 312, var113, 16777215, 0);
                var110 = var113 + 15;
                String var50 = class142.field2382;
                String var51 = field663;
                String var52 = class197.method155('*', var51.length());
                arg0.method3308(var50 + var52 + (field664 == 1 & client.field376 % 40 < 20 ? class2.method3286(16776960) + class2.field21 : ""), 274, var110, 16777215, 0);
                var110 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field661.method1584(var53 - 73, var54 - 20);
                arg0.method3310(class142.field2381, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field661.method1584(var55 - 73, var54 - 20);
                arg0.method3310(class142.field2248, var55, var54 + 5, 16777215, 0);
            } else if (field658 == 4) {
                arg0.method3310(class142.field2155, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3310(field659, 382, var56, 16777215, 0);
                int var114 = var56 + 15;
                arg0.method3310(field668, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3310(field646, 382, var115, 16777215, 0);
                int var116 = var115 + 15;
                String var58 = class142.field2339;
                String var59 = Statics.field2493;
                String var60 = class197.method155('*', var59.length());
                arg0.method3308(var58 + var60 + (client.field376 % 40 < 20 ? class2.method3286(16776960) + class2.field21 : ""), 274, var116, 16777215, 0);
                int var117 = var116 - 8;
                arg0.method3308(class142.field2153, 373, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3308(class142.field2154, 373, var118, 16776960, 0);
                int var61 = 373 + arg0.method3342(class142.field2154) + 15;
                int var62 = var118 - arg0.field2898;
                class74 var63;
                if (field665) {
                    var63 = Statics.field2481;
                } else {
                    var63 = Statics.field157;
                }
                var63.method1584(var61, var62);
                var114 = var118 + 15;
                short var64 = 302;
                short var65 = 321;
                Statics.field661.method1584(var64 - 73, var65 - 20);
                arg0.method3310(class142.field2152, var64, var65 + 5, 16777215, 0);
                short var66 = 462;
                Statics.field661.method1584(var66 - 73, var65 - 20);
                arg0.method3310(class142.field2248, var66, var65 + 5, 16777215, 0);
                arg1.method3310(class142.field2371, 382, var65 + 36, 255, 0);
            }
        }
        if (field654 > 0) {
            method1971(field654);
            field654 = 0;
        }
        short var67 = 256;
        if (field647 > 0) {
            for (int var68 = 0; var68 < 256; var68++) {
                if (field647 > 768) {
                    Statics.field1062[var68] = method513(Statics.field610[var68], Statics.field145[var68], 1024 - field647);
                } else if (field647 > 256) {
                    Statics.field1062[var68] = Statics.field145[var68];
                } else {
                    Statics.field1062[var68] = method513(Statics.field145[var68], Statics.field610[var68], 256 - field647);
                }
            }
        } else if (field652 > 0) {
            for (int var69 = 0; var69 < 256; var69++) {
                if (field652 > 768) {
                    Statics.field1062[var69] = method513(Statics.field610[var69], Statics.field167[var69], 1024 - field652);
                } else if (field652 > 256) {
                    Statics.field1062[var69] = Statics.field167[var69];
                } else {
                    Statics.field1062[var69] = method513(Statics.field167[var69], Statics.field610[var69], 256 - field652);
                }
            }
        } else {
            for (int var70 = 0; var70 < 256; var70++) {
                Statics.field1062[var70] = Statics.field610[var70];
            }
        }
        class73.method1559(0, 9, 128, var67 + 7);
        Statics.field205.method1433(0, 0);
        class73.method1516();
        int var71 = 0;
        int var72 = 6885;
        for (int var73 = 1; var73 < var67 - 1; var73++) {
            int var74 = (var67 - var73) * field660[var73] / var67;
            int var75 = var74 + 22;
            if (var75 < 0) {
                var75 = 0;
            }
            var71 += var75;
            for (int var76 = var75; var76 < 128; var76++) {
                int var77 = Statics.field626[var71++];
                if (var77 == 0) {
                    var72++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field1062[var77];
                    int var81 = Statics.field678.field1291[var72];
                    Statics.field678.field1291[var72++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var72 += var75 + 765 - 128;
        }
        class73.method1559(637, 9, 765, var67 + 7);
        Statics.field641.method1433(382, 0);
        class73.method1516();
        int var82 = 0;
        int var83 = 7546;
        for (int var84 = 1; var84 < var67 - 1; var84++) {
            int var85 = (var67 - var84) * field660[var84] / var67;
            int var86 = 103 - var85;
            int var87 = var83 + var85;
            for (int var88 = 0; var88 < var86; var88++) {
                int var89 = Statics.field626[var82++];
                if (var89 == 0) {
                    var87++;
                } else {
                    int var91 = 256 - var89;
                    int var92 = Statics.field1062[var89];
                    int var93 = Statics.field678.field1291[var87];
                    Statics.field678.field1291[var87++] = ((var92 & 0xFF00) * var89 + (var93 & 0xFF00) * var91 & 0xFF0000) + ((var92 & 0xFF00FF) * var89 + (var93 & 0xFF00FF) * var91 & 0xFF00FF00) >> 8;
                }
            }
            var82 += 128 - var86;
            var83 = 765 - var86 - var85 + var87;
        }
        Statics.field648[Statics.field250.field142 ? 1 : 0].method1584(725, 463);
        if (client.field502 > 5 && client.field265 == 0) {
            if (Statics.field2104 == null) {
                Statics.field2104 = class70.method65(Statics.field584, "sl_button", "");
            } else {
                byte var94 = 5;
                short var95 = 463;
                byte var96 = 100;
                byte var97 = 35;
                Statics.field2104.method1584(var94, var95);
                arg0.method3310(class142.field2311 + " " + client.field273, var96 / 2 + var94, var97 / 2 + var95 - 2, 16777215, 0);
                if (Statics.field687 == null) {
                    arg1.method3310(class142.field2393, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                } else {
                    arg1.method3310(class142.field2392, var96 / 2 + var94, var97 / 2 + var95 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var98 = Statics.field1978.getGraphics();
            Statics.field678.method1346(var98, 0, 0);
        } catch (Exception var101) {
            Statics.field1978.repaint();
        }
    }

    @ObfuscatedName("w.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method501(String arg0, String arg1, String arg2) {
        field659 = arg0;
        field668 = arg1;
        field646 = arg2;
    }

    @ObfuscatedName("cl.o(Lbo;I)V")
    public static final void method2075(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field649.length; var2++) {
            Statics.field649[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field649[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field650[var8] = (Statics.field649[var8 - 1] + Statics.field649[var8 + 1] + Statics.field649[var8 - 128] + Statics.field649[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field649;
            Statics.field649 = Statics.field650;
            Statics.field650 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1315; var11++) {
            for (int var12 = 0; var12 < arg0.field1312; var12++) {
                if (arg0.field1314[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1318;
                    int var14 = var11 + 16 + arg0.field1317;
                    int var15 = (var14 << 7) + var13;
                    Statics.field649[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cm.n(IB)V")
    public static final void method1971(int arg0) {
        short var1 = 256;
        field667 += arg0 * 128;
        if (field667 > Statics.field649.length) {
            field667 -= Statics.field649.length;
            int var2 = (int) (Math.random() * 12.0D);
            method2075(Statics.field639[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field626[var3 + var4] - Statics.field649[field667 + var3 & Statics.field649.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field626[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field626[var9 + var10] = 255;
                } else {
                    Statics.field626[var9 + var10] = 0;
                }
            }
        }
        if (field647 > 0) {
            field647 -= arg0 * 4;
        }
        if (field652 > 0) {
            field652 -= arg0 * 4;
        }
        if (field647 == 0 && field652 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field647 = 1024;
            }
            if (var12 == 1) {
                field652 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field660[var13] = field660[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field660[var14] = (int) (Math.sin((double) field655 / 14.0D) * 16.0D + Math.sin((double) field655 / 15.0D) * 14.0D + Math.sin((double) field655 / 16.0D) * 12.0D);
            field655++;
        }
        field640 += arg0 * -746263099;
        int var15 = ((client.field376 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field640 * -1177319148; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field626[(var18 << 7) + var17] = 192;
        }
        field640 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field626[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field626[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field637[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field637[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field637[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field626[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("v.y(IIII)I")
    public static final int method513(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("h.f(I)V")
    public static void method488() {
        try {
            if (Statics.field687 == null) {
                Statics.field687 = new class17(Statics.field1761, new URL(Statics.field2952));
            } else {
                byte[] var0 = Statics.field687.method165();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field670 = var1.method2136();
                    Statics.field1758 = new class22[field670];
                    int var2 = 0;
                    while (var2 < field670) {
                        class22 var3 = Statics.field1758[var2] = new class22();
                        var3.field574 = var1.method2136();
                        var3.field569 = var1.method2139();
                        var3.field571 = var1.method2339();
                        var3.field568 = var1.method2339();
                        var3.field573 = var1.method2134();
                        var3.field570 = var1.method2153();
                        var3.field576 = var2++;
                    }
                    method136(Statics.field1758, 0, Statics.field1758.length - 1, field671, field672);
                    field669 = true;
                    Statics.field687 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field687 = null;
        }
    }

    @ObfuscatedName("t.p(III)V")
    public static void method143(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field671[var5] != arg0) {
                var2[var4] = field671[var5];
                var3[var4] = field672[var5];
                var4++;
            }
        }
        field671 = var2;
        field672 = var3;
        method136(Statics.field1758, 0, Statics.field1758.length - 1, field671, field672);
    }

    @ObfuscatedName("e.l([Lz;II[I[II)V")
    public static void method136(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field576;
                        var12 = var8.field576;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field570;
                        var12 = var8.field570;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method505() ? 1 : 0;
                        var12 = var8.method505() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field574;
                        var12 = var8.field574;
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
                        var15 = arg0[var5].field576;
                        var16 = var8.field576;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field570;
                        var16 = var8.field570;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method505() ? 1 : 0;
                        var16 = var8.method505() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field574;
                        var16 = var8.field574;
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
        method136(arg0, arg1, var6, arg3, arg4);
        method136(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

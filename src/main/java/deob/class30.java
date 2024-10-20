package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ae")
public class class30 {

    @ObfuscatedName("ae.d")
    public static int[] field658 = new int[256];

    @ObfuscatedName("ae.z")
    public static int field659 = 0;

    @ObfuscatedName("ae.x")
    public static int field660 = 0;

    @ObfuscatedName("ae.an")
    public static int field685 = 0;

    @ObfuscatedName("ae.ad")
    public static int field663 = 0;

    @ObfuscatedName("ae.ai")
    public static int field664 = 0;

    @ObfuscatedName("ae.ae")
    public static int field674 = 0;

    @ObfuscatedName("ae.aq")
    public static int field688 = 10;

    @ObfuscatedName("ae.av")
    public static String field667 = "";

    @ObfuscatedName("ae.am")
    public static int field668 = 0;

    @ObfuscatedName("ae.ac")
    public static String field680 = "";

    @ObfuscatedName("ae.ak")
    public static String field670 = "";

    @ObfuscatedName("ae.aa")
    public static String field671 = "";

    @ObfuscatedName("ae.al")
    public static String field656 = "";

    @ObfuscatedName("ae.ao")
    public static String field687 = "";

    @ObfuscatedName("ae.af")
    public static class150 field683 = class150.field2442;

    @ObfuscatedName("ae.ay")
    public static boolean field676 = true;

    @ObfuscatedName("ae.ax")
    public static int field677 = 0;

    @ObfuscatedName("ae.au")
    public static String field669 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ae.ap")
    public static String field679 = "1234567890";

    @ObfuscatedName("ae.ar")
    public static boolean field672 = false;

    @ObfuscatedName("ae.bi")
    public static int field681 = 0;

    @ObfuscatedName("ae.bt")
    public static int[] field673 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ae.by")
    public static int[] field684 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ae.ba")
    public static int field689 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.q(Ljava/awt/Component;Lff;Lff;ZII)V")
    public static void method496(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field654) {
            field668 = arg4;
            class75.method1563();
            byte[] var5 = arg1.method2815("title.jpg", "");
            Statics.field657 = new class74(var5, arg0);
            Statics.field2750 = Statics.field657.method1427();
            Statics.field1814 = class72.method135(arg2, "logo", "");
            Statics.field655 = class72.method135(arg2, "titlebox", "");
            Statics.field678 = class72.method135(arg2, "titlebutton", "");
            Statics.field1918 = class72.method12(arg2, "runes", "");
            Statics.field3014 = class72.method12(arg2, "title_mute", "");
            Statics.field907 = class72.method135(arg2, "options_radio_buttons,0", "");
            Statics.field544 = class72.method135(arg2, "options_radio_buttons,2", "");
            Statics.field3058 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field3058[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field3058[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field3058[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field3058[var9 + 192] = 16777215;
            }
            Statics.field592 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field592[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field592[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field592[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field592[var13 + 192] = 16777215;
            }
            Statics.field648 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field648[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field648[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field648[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field648[var17 + 192] = 16777215;
            }
            Statics.field2989 = new int[256];
            Statics.field661 = new int[32768];
            Statics.field52 = new int[32768];
            method818((class76) null);
            Statics.field142 = new int[32768];
            Statics.field561 = new int[32768];
            if (arg3) {
                field656 = "";
                field687 = "";
            }
            Statics.field675 = 0;
            Statics.field587 = "";
            field676 = true;
            field672 = false;
            if (Statics.field93.field136) {
                class173.method581(2);
            } else {
                class159 var18 = Statics.field549;
                int var19 = var18.method2813("scape main");
                int var20 = var18.method2814(var19, "");
                class173.method1980(2, var18, var19, var20, 255, false);
            }
            class162.method2794(false);
            Statics.field654 = true;
            Statics.field657.method1501(0, 0);
            Statics.field2750.method1501(382, 0);
            Statics.field1814.method1585(382 - Statics.field1814.field1323 / 2, 18);
        } else if (arg4 == 4) {
            field668 = 4;
        }
    }

    @ObfuscatedName("ff.s(I)V")
    public static void method2884() {
        if (!Statics.field654) {
            return;
        }
        Statics.field655 = null;
        Statics.field678 = null;
        Statics.field1918 = null;
        Statics.field657 = null;
        Statics.field2750 = null;
        Statics.field1814 = null;
        Statics.field3014 = null;
        Statics.field907 = null;
        Statics.field544 = null;
        Statics.field1663 = null;
        Statics.field1515 = null;
        Statics.field152 = null;
        Statics.field2137 = null;
        Statics.field206 = null;
        Statics.field3058 = null;
        Statics.field592 = null;
        Statics.field648 = null;
        Statics.field2989 = null;
        Statics.field661 = null;
        Statics.field52 = null;
        Statics.field142 = null;
        Statics.field561 = null;
        class173.method581(2);
        class162.method2794(true);
        Statics.field654 = false;
    }

    @ObfuscatedName("di.h(Lep;I)V")
    public static void method2544(class136 arg0) {
        if (!field672) {
            if ((class132.field2000 == 1 || !Statics.field2976 && class132.field2000 == 4) && class132.field2009 >= 715 && class132.field2010 >= 453) {
                Statics.field93.field136 = !Statics.field93.field136;
                class9.method91();
                if (Statics.field93.field136) {
                    Statics.field2795.method3131();
                    class173.field2796 = 1;
                    Statics.field2565 = null;
                } else {
                    class159 var6 = Statics.field549;
                    int var7 = var6.method2813("scape main");
                    int var8 = var6.method2814(var7, "");
                    class173.method35(var6, var7, var8, 255, false);
                }
            }
            if (client.field461 != 5) {
                field664++;
                if (client.field461 == 10 || client.field461 == 11) {
                    if (client.field272 == 0) {
                        if (class132.field2000 == 1 || !Statics.field2976 && class132.field2000 == 4) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class132.field2009 >= var9 && class132.field2009 <= var9 + var11 && class132.field2010 >= var10 && class132.field2010 <= var10 + var12) {
                                method905();
                                return;
                            }
                        }
                        if (Statics.field72 != null) {
                            method905();
                        }
                    }
                    int var13 = class132.field2000;
                    int var14 = class132.field2009;
                    int var15 = class132.field2010;
                    if (!Statics.field2976 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field668 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            label692: {
                                String var18 = client.method129("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var18));
                                        break label692;
                                    } catch (Exception var44) {
                                    }
                                }
                                if (class130.field1992.startsWith("win")) {
                                    class130.method1784(var18, 0);
                                } else if (class130.field1992.startsWith("mac")) {
                                    Statics.method819(var18, 1, "openjs");
                                } else {
                                    class130.method1784(var18, 2);
                                }
                            }
                        }
                        short var20 = 462;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field267 & 0x4) != 0) {
                                if ((client.field267 & 0x400) == 0) {
                                    field680 = class148.field2369;
                                    field670 = class148.field2370;
                                    field671 = class148.field2280;
                                } else {
                                    field680 = class148.field2375;
                                    field670 = class148.field2367;
                                    field671 = class148.field2377;
                                }
                                field668 = 1;
                                field677 = 0;
                            } else if ((client.field267 & 0x400) == 0) {
                                field680 = class148.field2365;
                                field670 = class148.field2366;
                                field671 = class148.field2253;
                                field668 = 2;
                                field677 = 0;
                            } else {
                                field680 = class148.field2372;
                                field670 = class148.field2373;
                                field671 = class148.field2374;
                                field668 = 1;
                                field677 = 0;
                            }
                        }
                    } else if (field668 == 1) {
                        while (class129.method161()) {
                            if (Statics.field2751 == 84) {
                                field680 = class148.field2365;
                                field670 = class148.field2366;
                                field671 = class148.field2253;
                                field668 = 2;
                                field677 = 0;
                            } else if (Statics.field2751 == 13) {
                                field668 = 0;
                            }
                        }
                        short var21 = 302;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field680 = class148.field2365;
                            field670 = class148.field2366;
                            field671 = class148.field2253;
                            field668 = 2;
                            field677 = 0;
                        }
                        short var23 = 462;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field668 = 0;
                        }
                    } else if (field668 == 2) {
                        short var24 = 231;
                        int var46 = var24 + 30;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field677 = 0;
                        }
                        var46 += 15;
                        if (var13 == 1 && var15 >= var46 - 15 && var15 < var46) {
                            field677 = 1;
                        }
                        var46 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method144(class148.field2396, class148.field2409, class148.field2398);
                            field668 = 5;
                            return;
                        }
                        short var26 = 302;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field656 = field656.trim();
                            if (field656.length() == 0) {
                                method144(class148.field2300, class148.field2272, class148.field2273);
                                return;
                            }
                            if (field687.length() == 0) {
                                method144(class148.field2264, class148.field2207, class148.field2276);
                                return;
                            }
                            method144(class148.field2380, class148.field2381, class148.field2382);
                            field683 = Statics.field93.field132.containsKey(class154.method520(field656)) ? class150.field2446 : class150.field2442;
                            client.method154(20);
                            return;
                        }
                        short var28 = 462;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field668 = 0;
                            field656 = "";
                            field687 = "";
                            Statics.field675 = 0;
                            Statics.field587 = "";
                            field676 = true;
                        }
                        while (true) {
                            while (class129.method161()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field669.length(); var30++) {
                                    if (Statics.field666 == field669.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2751 == 13) {
                                    field668 = 0;
                                    field656 = "";
                                    field687 = "";
                                    Statics.field675 = 0;
                                    Statics.field587 = "";
                                    field676 = true;
                                } else if (field677 == 0) {
                                    if (Statics.field2751 == 85 && field656.length() > 0) {
                                        field656 = field656.substring(0, field656.length() - 1);
                                    }
                                    if (Statics.field2751 == 84 || Statics.field2751 == 80) {
                                        field677 = 1;
                                    }
                                    if (var29 && field656.length() < 320) {
                                        field656 = field656 + Statics.field666;
                                    }
                                } else if (field677 == 1) {
                                    if (Statics.field2751 == 85 && field687.length() > 0) {
                                        field687 = field687.substring(0, field687.length() - 1);
                                    }
                                    if (Statics.field2751 == 84 || Statics.field2751 == 80) {
                                        field677 = 0;
                                    }
                                    if (Statics.field2751 == 84) {
                                        field656 = field656.trim();
                                        if (field656.length() == 0) {
                                            method144(class148.field2300, class148.field2272, class148.field2273);
                                            return;
                                        }
                                        if (field687.length() == 0) {
                                            method144(class148.field2264, class148.field2207, class148.field2276);
                                            return;
                                        }
                                        method144(class148.field2380, class148.field2381, class148.field2382);
                                        field683 = Statics.field93.field132.containsKey(class154.method520(field656)) ? class150.field2446 : class150.field2442;
                                        client.method154(20);
                                        return;
                                    }
                                    if (var29 && field687.length() < 20) {
                                        field687 = field687 + Statics.field666;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field668 == 4) {
                        short var31 = 302;
                        short var32 = 321;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            Statics.field587.trim();
                            if (Statics.field587.length() != 6) {
                                method144(class148.field2203, class148.field2188, class148.field2345);
                                return;
                            }
                            Statics.field675 = Integer.parseInt(Statics.field587);
                            Statics.field587 = "";
                            field683 = field676 ? class150.field2441 : class150.field2440;
                            method144(class148.field2380, class148.field2381, class148.field2382);
                            client.method154(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= 373 && var14 <= 512 && var15 >= 263 && var15 <= 296) {
                            field676 = !field676;
                        }
                        if (var13 == 1 && var14 >= 348 && var14 <= 416 && var15 >= 351 && var15 <= 363) {
                            label707: {
                                String var33 = client.method129("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var33));
                                        break label707;
                                    } catch (Exception var45) {
                                    }
                                }
                                if (class130.field1992.startsWith("win")) {
                                    class130.method1784(var33, 0);
                                } else if (class130.field1992.startsWith("mac")) {
                                    Statics.method819(var33, 1, "openjs");
                                } else {
                                    class130.method1784(var33, 2);
                                }
                            }
                        }
                        short var35 = 462;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field668 = 0;
                            field656 = "";
                            field687 = "";
                            Statics.field675 = 0;
                            Statics.field587 = "";
                        }
                        while (class129.method161()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field679.length(); var37++) {
                                if (Statics.field666 == field679.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field2751 == 13) {
                                field668 = 0;
                                field656 = "";
                                field687 = "";
                                Statics.field675 = 0;
                                Statics.field587 = "";
                            } else {
                                if (Statics.field2751 == 85 && Statics.field587.length() > 0) {
                                    Statics.field587 = Statics.field587.substring(0, Statics.field587.length() - 1);
                                }
                                if (Statics.field2751 == 84) {
                                    Statics.field587.trim();
                                    if (Statics.field587.length() != 6) {
                                        method144(class148.field2203, class148.field2188, class148.field2345);
                                        return;
                                    }
                                    Statics.field675 = Integer.parseInt(Statics.field587);
                                    Statics.field587 = "";
                                    field683 = field676 ? class150.field2441 : class150.field2440;
                                    method144(class148.field2380, class148.field2381, class148.field2382);
                                    client.method154(20);
                                    return;
                                }
                                if (var36 && Statics.field587.length() < 6) {
                                    Statics.field587 = Statics.field587 + Statics.field666;
                                }
                            }
                        }
                    } else if (field668 == 5) {
                        short var38 = 302;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            method80();
                            return;
                        }
                        short var40 = 462;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field680 = class148.field2365;
                            field670 = class148.field2366;
                            field671 = class148.field2253;
                            field668 = 2;
                            field677 = 0;
                            field687 = "";
                        }
                        while (class129.method161()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field669.length(); var42++) {
                                if (Statics.field666 == field669.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field2751 == 13) {
                                field680 = class148.field2365;
                                field670 = class148.field2366;
                                field671 = class148.field2253;
                                field668 = 2;
                                field677 = 0;
                                field687 = "";
                            } else {
                                if (Statics.field2751 == 85 && field656.length() > 0) {
                                    field656 = field656.substring(0, field656.length() - 1);
                                }
                                if (Statics.field2751 == 84) {
                                    method80();
                                    return;
                                }
                                if (var41 && field656.length() < 320) {
                                    field656 = field656 + Statics.field666;
                                }
                            }
                        }
                    } else if (field668 == 6) {
                        while (true) {
                            do {
                                if (!class129.method161()) {
                                    short var43 = 321;
                                    if (var13 == 1 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                                        field680 = class148.field2365;
                                        field670 = class148.field2366;
                                        field671 = class148.field2253;
                                        field668 = 2;
                                        field677 = 0;
                                        field687 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2751 != 84 && Statics.field2751 != 13);
                            field680 = class148.field2365;
                            field670 = class148.field2366;
                            field671 = class148.field2253;
                            field668 = 2;
                            field677 = 0;
                            field687 = "";
                        }
                    }
                }
            }
        } else if (class132.field2000 == 1 || !Statics.field2976 && class132.field2000 == 4) {
            short var1 = 280;
            if (class132.field2009 >= var1 && class132.field2009 <= var1 + 14 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                method3419(0, 0);
            } else if (class132.field2009 >= var1 + 15 && class132.field2009 <= var1 + 80 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                method3419(0, 1);
            } else {
                short var2 = 390;
                if (class132.field2009 >= var2 && class132.field2009 <= var2 + 14 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                    method3419(1, 0);
                } else if (class132.field2009 >= var2 + 15 && class132.field2009 <= var2 + 80 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                    method3419(1, 1);
                } else {
                    short var3 = 500;
                    if (class132.field2009 >= var3 && class132.field2009 <= var3 + 14 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                        method3419(2, 0);
                    } else if (class132.field2009 >= var3 + 15 && class132.field2009 <= var3 + 80 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                        method3419(2, 1);
                    } else {
                        short var4 = 610;
                        if (class132.field2009 >= var4 && class132.field2009 <= var4 + 14 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                            method3419(3, 0);
                        } else if (class132.field2009 >= var4 + 15 && class132.field2009 <= var4 + 80 && class132.field2010 >= 4 && class132.field2010 <= 18) {
                            method3419(3, 1);
                        } else if (class132.field2009 >= 708 && class132.field2010 >= 4 && class132.field2009 <= 758 && class132.field2010 <= 20) {
                            field672 = false;
                            Statics.field657.method1501(0, 0);
                            Statics.field2750.method1501(382, 0);
                            Statics.field1814.method1585(382 - Statics.field1814.field1323 / 2, 18);
                        } else if (field689 != -1) {
                            class24 var5 = Statics.field2777[field689];
                            Statics.method2732(var5);
                            field672 = false;
                            Statics.field657.method1501(0, 0);
                            Statics.field2750.method1501(382, 0);
                            Statics.field1814.method1585(382 - Statics.field1814.field1323 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.e(I)V")
    public static void method80() {
        field656 = field656.trim();
        if (field656.length() == 0) {
            method144(class148.field2396, class148.field2409, class148.field2398);
            return;
        }
        long var0 = class10.method1605();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field656;
            Random var4 = new Random();
            class111 var5 = new class111(128);
            class111 var6 = new class111(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2133(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2136(var4.nextInt());
            }
            var5.method2136(var7[0]);
            var5.method2136(var7[1]);
            var5.method2244(var0);
            var5.method2244(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2136(var4.nextInt());
            }
            var5.method2272(class10.field146, class10.field147);
            var6.method2133(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2136(var4.nextInt());
            }
            var6.method2244(var4.nextLong());
            var6.method2146(var4.nextLong());
            class141.method2093(var6);
            var6.method2244(var4.nextLong());
            var6.method2272(class10.field146, class10.field147);
            int var11 = class111.method2719(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class111 var12 = new class111(var11);
            var12.method2139(var3);
            var12.field1852 = var11;
            var12.method2164(var7);
            class111 var13 = new class111(var12.field1852 + var6.field1852 + var5.field1852 + 5);
            var13.method2133(2);
            var13.method2133(var5.field1852);
            var13.method2142(var5.field1859, 0, var5.field1852);
            var13.method2133(var6.field1852);
            var13.method2142(var6.field1859, 0, var6.field1852);
            var13.method2134(var12.field1852);
            var13.method2142(var12.field1859, 0, var12.field1852);
            byte[] var14 = var13.field1859;
            String var15 = class152.method1787(var14, 0, var14.length);
            String var16 = var15;
            byte var23;
            try {
                URL var17 = new URL(client.method129("services", false) + "m=accountappeal/login.ws");
                URLConnection var18 = var17.openConnection();
                var18.setDoInput(true);
                var18.setDoOutput(true);
                var18.setConnectTimeout(5000);
                OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                var19.write("data2=" + class216.method1983(var16) + "&dest=" + class216.method1983("passwordchoice.ws"));
                var19.flush();
                InputStream var20 = var18.getInputStream();
                class111 var21 = new class111(new byte[1000]);
                while (true) {
                    int var22 = var20.read(var21.field1859, var21.field1852, 1000 - var21.field1852);
                    if (var22 == -1) {
                        var19.close();
                        var20.close();
                        String var24 = new String(var21.field1859);
                        if (var24.startsWith("OFFLINE")) {
                            var23 = 4;
                        } else if (var24.startsWith("WRONG")) {
                            var23 = 7;
                        } else if (var24.startsWith("RELOAD")) {
                            var23 = 3;
                        } else if (var24.startsWith("Not permitted for social network accounts.")) {
                            var23 = 6;
                        } else {
                            var21.method2165(var7);
                            while (var21.field1852 > 0 && var21.field1859[var21.field1852 - 1] == 0) {
                                var21.field1852--;
                            }
                            String var25 = new String(var21.field1859, 0, var21.field1852);
                            boolean var26;
                            if (var25 == null) {
                                var26 = false;
                            } else {
                                label110: {
                                    try {
                                        new URL(var25);
                                    } catch (MalformedURLException var31) {
                                        var26 = false;
                                        break label110;
                                    }
                                    var26 = true;
                                }
                            }
                            if (var26) {
                                label105: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var25));
                                            break label105;
                                        } catch (Exception var30) {
                                        }
                                    }
                                    if (class130.field1992.startsWith("win")) {
                                        class130.method1784(var25, 0);
                                    } else if (class130.field1992.startsWith("mac")) {
                                        Statics.method819(var25, 1, "openjs");
                                    } else {
                                        class130.method1784(var25, 2);
                                    }
                                }
                                var23 = 2;
                            } else {
                                var23 = 5;
                            }
                        }
                        break;
                    }
                    var21.field1852 += var22;
                    if (var21.field1852 >= 1000) {
                        var23 = 5;
                        break;
                    }
                }
            } catch (Throwable var32) {
                var32.printStackTrace();
                var23 = 5;
            }
            var2 = var23;
        }
        switch(var2) {
            case 2:
                method144(class148.field2399, class148.field2214, class148.field2274);
                field668 = 6;
                break;
            case 3:
                method144(class148.field2401, class148.field2212, class148.field2404);
                break;
            case 4:
                method144(class148.field2405, class148.field2406, class148.field2407);
                break;
            case 5:
                method144(class148.field2198, class148.field2252, class148.field2410);
                break;
            case 6:
                method144(class148.field2343, class148.field2412, class148.field2413);
                break;
            case 7:
                method144(class148.field2414, class148.field2415, class148.field2416);
        }
    }

    @ObfuscatedName("ez.n(Lhz;Lhz;Lhz;B)V")
    public static void method2722(class214 arg0, class214 arg1, class214 arg2) {
        if (field672) {
            if (Statics.field1663 == null) {
                Statics.field1663 = class72.method602(Statics.field739, "sl_back", "");
            }
            if (Statics.field1515 == null) {
                Statics.field1515 = class72.method12(Statics.field739, "sl_flags", "");
            }
            if (Statics.field152 == null) {
                Statics.field152 = class72.method12(Statics.field739, "sl_arrows", "");
            }
            if (Statics.field2137 == null) {
                Statics.field2137 = class72.method12(Statics.field739, "sl_stars", "");
            }
            class75.method1567(0, 23, 765, 480, 0);
            class75.method1537(0, 0, 125, 23, 12425273, 9135624);
            class75.method1537(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3538(class148.field2179, 62, 15, 0, -1);
            if (Statics.field2137 != null) {
                Statics.field2137[1].method1585(140, 1);
                arg1.method3500(class148.field2223, 152, 10, 16777215, -1);
                Statics.field2137[0].method1585(140, 12);
                arg1.method3500(class148.field2419, 152, 21, 16777215, -1);
            }
            if (Statics.field152 != null) {
                short var3 = 280;
                if (field673[0] == 0 && field684[0] == 0) {
                    Statics.field152[2].method1585(var3, 4);
                } else {
                    Statics.field152[0].method1585(var3, 4);
                }
                if (field673[0] == 0 && field684[0] == 1) {
                    Statics.field152[3].method1585(var3 + 15, 4);
                } else {
                    Statics.field152[1].method1585(var3 + 15, 4);
                }
                arg0.method3500(class148.field2420, var3 + 32, 17, 16777215, -1);
                short var4 = 390;
                if (field673[0] == 1 && field684[0] == 0) {
                    Statics.field152[2].method1585(var4, 4);
                } else {
                    Statics.field152[0].method1585(var4, 4);
                }
                if (field673[0] == 1 && field684[0] == 1) {
                    Statics.field152[3].method1585(var4 + 15, 4);
                } else {
                    Statics.field152[1].method1585(var4 + 15, 4);
                }
                arg0.method3500(class148.field2371, var4 + 32, 17, 16777215, -1);
                short var5 = 500;
                if (field673[0] == 2 && field684[0] == 0) {
                    Statics.field152[2].method1585(var5, 4);
                } else {
                    Statics.field152[0].method1585(var5, 4);
                }
                if (field673[0] == 2 && field684[0] == 1) {
                    Statics.field152[3].method1585(var5 + 15, 4);
                } else {
                    Statics.field152[1].method1585(var5 + 15, 4);
                }
                arg0.method3500(class148.field2262, var5 + 32, 17, 16777215, -1);
                short var6 = 610;
                if (field673[0] == 3 && field684[0] == 0) {
                    Statics.field152[2].method1585(var6, 4);
                } else {
                    Statics.field152[0].method1585(var6, 4);
                }
                if (field673[0] == 3 && field684[0] == 1) {
                    Statics.field152[3].method1585(var6 + 15, 4);
                } else {
                    Statics.field152[1].method1585(var6 + 15, 4);
                }
                arg0.method3500(class148.field2423, var6 + 32, 17, 16777215, -1);
            }
            class75.method1567(708, 4, 50, 16, 0);
            arg1.method3538(class148.field2390, 733, 16, 16777215, -1);
            field689 = -1;
            if (Statics.field1663 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1);
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= field681) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= field681) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= field681) {
                        var10--;
                    }
                } while (var10 != var11 || var9 != var12);
                int var13 = (765 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (480 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = var16 + 23;
                int var18 = var15;
                int var19 = 0;
                boolean var20 = false;
                for (int var21 = 0; var21 < field681; var21++) {
                    class24 var22 = Statics.field2777[var21];
                    boolean var23 = true;
                    String var24 = Integer.toString(var22.field596);
                    if (var22.field596 == -1) {
                        var24 = class148.field2424;
                        var23 = false;
                    } else if (var22.field596 > 1980) {
                        var24 = class148.field2311;
                        var23 = false;
                    }
                    byte var25;
                    if (var22.method518()) {
                        if (var22.method511()) {
                            var25 = 3;
                        } else {
                            var25 = 2;
                        }
                    } else if (var22.method511()) {
                        var25 = 1;
                    } else {
                        var25 = 0;
                    }
                    if (class132.field2011 >= var18 && class132.field2005 * -322104283 >= var17 && class132.field2011 < var7 + var18 && class132.field2005 * -322104283 < var8 + var17 && var23) {
                        field689 = var21;
                        Statics.field1663[var25].method1470(var18, var17, 128, 16777215);
                        var20 = true;
                    } else {
                        Statics.field1663[var25].method1501(var18, var17);
                    }
                    if (Statics.field1515 != null) {
                        Statics.field1515[(var22.method511() ? 8 : 0) + var22.field598].method1585(var18 + 29, var17);
                    }
                    arg0.method3538(Integer.toString(var22.field601), var18 + 15, var8 / 2 + var17 + 5, 0, -1);
                    arg1.method3538(var24, var18 + 60, var8 / 2 + var17 + 5, 268435455, -1);
                    var17 += var8 + var14;
                    var19++;
                    if (var19 >= var10) {
                        var17 = var16 + 23;
                        var18 += var7 + var13;
                        var19 = 0;
                    }
                }
                if (var20) {
                    int var26 = arg1.method3495(Statics.field2777[field689].field595) + 6;
                    int var27 = arg1.field3039 + 8;
                    class75.method1567(class132.field2011 - var26 / 2, class132.field2005 * -322104283 + 20 + 5, var26, var27, 16777120);
                    class75.method1538(class132.field2011 - var26 / 2, class132.field2005 * -322104283 + 20 + 5, var26, var27, 0);
                    arg1.method3538(Statics.field2777[field689].field595, class132.field2011, class132.field2005 * -322104283 + 20 + 5 + arg1.field3039 + 4, 0, -1);
                }
            }
            try {
                Graphics var28 = Statics.field1563.getGraphics();
                Statics.field2050.method1357(var28, 0, 0);
            } catch (Exception var99) {
                Statics.field1563.repaint();
            }
            return;
        }
        if (client.field461 == 0 || client.field461 == 5) {
            byte var30 = 20;
            arg0.method3538(class148.field2364, 382, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class75.method1538(230, var31, 304, 34, 9179409);
            class75.method1538(231, var31 + 1, 302, 32, 0);
            class75.method1567(232, var31 + 2, field688 * 3, 30, 9179409);
            class75.method1567(field688 * 3 + 232, var31 + 2, 300 - field688 * 3, 30, 0);
            arg0.method3538(field667, 382, 276 - var30, 16777215, -1);
        }
        if (client.field461 == 20) {
            Statics.field655.method1585(382 - Statics.field655.field1323 / 2, 271 - Statics.field655.field1321 / 2);
            short var32 = 211;
            arg0.method3538(field680, 382, var32, 16776960, 0);
            int var101 = var32 + 15;
            arg0.method3538(field670, 382, var101, 16776960, 0);
            int var102 = var101 + 15;
            arg0.method3538(field671, 382, var102, 16776960, 0);
            int var103 = var102 + 15;
            int var104 = var103 + 10;
            if (field668 != 4) {
                arg0.method3500(class148.field2383, 272, var104, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field656; arg0.method3495(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method3500(class213.method3499(var34), 312, var104, 16777215, 0);
                var101 = var104 + 15;
                arg0.method3500(class148.field2384 + Statics.method2076(field687), 274, var101, 16777215, 0);
                var101 += 15;
            }
        }
        if (client.field461 == 10 || client.field461 == 11) {
            Statics.field655.method1585(202, 171);
            if (field668 == 0) {
                short var35 = 251;
                arg0.method3538(class148.field2386, 382, var35, 16776960, 0);
                int var105 = var35 + 30;
                short var36 = 302;
                short var37 = 291;
                Statics.field678.method1585(var36 - 73, var37 - 20);
                arg0.method3503(class148.field2387, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var38 = 462;
                Statics.field678.method1585(var38 - 73, var37 - 20);
                arg0.method3503(class148.field2351, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field668 == 1) {
                arg0.method3538(class148.field2368, 382, 211, 16776960, 0);
                short var39 = 236;
                arg0.method3538(field680, 382, var39, 16777215, 0);
                int var106 = var39 + 15;
                arg0.method3538(field670, 382, var106, 16777215, 0);
                int var107 = var106 + 15;
                arg0.method3538(field671, 382, var107, 16777215, 0);
                int var108 = var107 + 15;
                short var40 = 302;
                short var41 = 321;
                Statics.field678.method1585(var40 - 73, var41 - 20);
                arg0.method3538(class148.field2159, var40, var41 + 5, 16777215, 0);
                short var42 = 462;
                Statics.field678.method1585(var42 - 73, var41 - 20);
                arg0.method3538(class148.field2390, var42, var41 + 5, 16777215, 0);
            } else if (field668 == 2) {
                short var43 = 211;
                arg0.method3538(field680, 382, var43, 16776960, 0);
                int var109 = var43 + 15;
                arg0.method3538(field670, 382, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method3538(field671, 382, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var112 = var111 + 10;
                arg0.method3500(class148.field2383, 272, var112, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = field656; arg0.method3495(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method3500(class213.method3499(var45) + (field677 == 0 & client.field275 % 40 < 20 ? class2.method773(16776960) + class2.field16 : ""), 312, var112, 16777215, 0);
                var109 = var112 + 15;
                arg0.method3500(class148.field2384 + Statics.method2076(field687) + (field677 == 1 & client.field275 % 40 < 20 ? class2.method773(16776960) + class2.field16 : ""), 274, var109, 16777215, 0);
                var109 += 15;
                short var46 = 302;
                short var47 = 321;
                Statics.field678.method1585(var46 - 73, var47 - 20);
                arg0.method3538(class148.field2153, var46, var47 + 5, 16777215, 0);
                short var48 = 462;
                Statics.field678.method1585(var48 - 73, var47 - 20);
                arg0.method3538(class148.field2390, var48, var47 + 5, 16777215, 0);
                short var49 = 357;
                arg1.method3538(class148.field2391, 382, var49, 16776960, 0);
            } else if (field668 == 4) {
                arg0.method3538(class148.field2378, 382, 211, 16776960, 0);
                short var50 = 236;
                arg0.method3538(field680, 382, var50, 16777215, 0);
                int var113 = var50 + 15;
                arg0.method3538(field670, 382, var113, 16777215, 0);
                int var114 = var113 + 15;
                arg0.method3538(field671, 382, var114, 16777215, 0);
                int var115 = var114 + 15;
                arg0.method3500(class148.field2385 + Statics.method2076(Statics.field587) + (client.field275 % 40 < 20 ? class2.method773(16776960) + class2.field16 : ""), 274, var115, 16777215, 0);
                int var116 = var115 - 8;
                arg0.method3500(class148.field2266, 373, var116, 16776960, 0);
                int var117 = var116 + 15;
                arg0.method3500(class148.field2249, 373, var117, 16776960, 0);
                int var51 = 373 + arg0.method3495(class148.field2249) + 15;
                int var52 = var117 - arg0.field3039;
                class76 var53;
                if (field676) {
                    var53 = Statics.field544;
                } else {
                    var53 = Statics.field907;
                }
                var53.method1585(var51, var52);
                var113 = var117 + 15;
                short var54 = 302;
                short var55 = 321;
                Statics.field678.method1585(var54 - 73, var55 - 20);
                arg0.method3538(class148.field2159, var54, var55 + 5, 16777215, 0);
                short var56 = 462;
                Statics.field678.method1585(var56 - 73, var55 - 20);
                arg0.method3538(class148.field2390, var56, var55 + 5, 16777215, 0);
                arg1.method3538(class148.field2379, 382, var55 + 36, 255, 0);
            } else if (field668 == 5) {
                arg0.method3538(class148.field2197, 382, 201, 16776960, 0);
                short var57 = 221;
                arg2.method3538(field680, 382, var57, 16776960, 0);
                int var118 = var57 + 15;
                arg2.method3538(field670, 382, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg2.method3538(field671, 382, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var121 = var120 + 14;
                arg0.method3500(class148.field2393, 237, var121, 16777215, 0);
                short var58 = 174;
                String var59;
                for (var59 = field656; arg0.method3495(var59) > var58; var59 = var59.substring(1)) {
                }
                arg0.method3500(class213.method3499(var59) + (client.field275 % 40 < 20 ? class2.method773(16776960) + class2.field16 : ""), 348, var121, 16777215, 0);
                var118 = var121 + 15;
                short var60 = 302;
                short var61 = 321;
                Statics.field678.method1585(var60 - 73, var61 - 20);
                arg0.method3538(class148.field2394, var60, var61 + 5, 16777215, 0);
                short var62 = 462;
                Statics.field678.method1585(var62 - 73, var61 - 20);
                arg0.method3538(class148.field2395, var62, var61 + 5, 16777215, 0);
            } else if (field668 == 6) {
                short var63 = 211;
                arg0.method3538(field680, 382, var63, 16776960, 0);
                int var122 = var63 + 15;
                arg0.method3538(field670, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3538(field671, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                short var64 = 382;
                short var65 = 321;
                Statics.field678.method1585(var64 - 73, var65 - 20);
                arg0.method3538(class148.field2395, var64, var65 + 5, 16777215, 0);
            }
        }
        if (field664 > 0) {
            int var66 = field664;
            short var67 = 256;
            field685 += var66 * 128;
            if (field685 > Statics.field661.length) {
                field685 -= Statics.field661.length;
                int var68 = (int) (Math.random() * 12.0D);
                method818(Statics.field1918[var68]);
            }
            int var69 = 0;
            int var70 = var66 * 128;
            int var71 = (var67 - var66) * 128;
            for (int var72 = 0; var72 < var71; var72++) {
                int var73 = Statics.field142[var69 + var70] - Statics.field661[field685 + var69 & Statics.field661.length - 1] * var66 / 6;
                if (var73 < 0) {
                    var73 = 0;
                }
                Statics.field142[var69++] = var73;
            }
            for (int var74 = var67 - var66; var74 < var67; var74++) {
                int var75 = var74 * 128;
                for (int var76 = 0; var76 < 128; var76++) {
                    int var77 = (int) (Math.random() * 100.0D);
                    if (var77 < 50 && var76 > 10 && var76 < 118) {
                        Statics.field142[var75 + var76] = 255;
                    } else {
                        Statics.field142[var75 + var76] = 0;
                    }
                }
            }
            if (field659 > 0) {
                field659 -= var66 * 4;
            }
            if (field660 > 0) {
                field660 -= var66 * 4;
            }
            if (field659 == 0 && field660 == 0) {
                int var78 = (int) (Math.random() * (double) (2000 / var66));
                if (var78 == 0) {
                    field659 = 1024;
                }
                if (var78 == 1) {
                    field660 = 1024;
                }
            }
            for (int var79 = 0; var79 < var67 - var66; var79++) {
                field658[var79] = field658[var66 + var79];
            }
            for (int var80 = var67 - var66; var80 < var67; var80++) {
                field658[var80] = (int) (Math.sin((double) field674 / 14.0D) * 16.0D + Math.sin((double) field674 / 15.0D) * 14.0D + Math.sin((double) field674 / 16.0D) * 12.0D);
                field674++;
            }
            field663 += var66 * -102623895;
            int var81 = ((client.field275 & 0x1) + var66) / 2;
            if (var81 > 0) {
                for (int var82 = 0; var82 < field663 * -412402492; var82++) {
                    int var83 = (int) (Math.random() * 124.0D) + 2;
                    int var84 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field142[(var84 << 7) + var83] = 192;
                }
                field663 = 0;
                int var85 = 0;
                label413: while (true) {
                    if (var85 >= var67) {
                        int var89 = 0;
                        while (true) {
                            if (var89 >= 128) {
                                break label413;
                            }
                            int var90 = 0;
                            for (int var91 = -var81; var91 < var67; var91++) {
                                int var92 = var91 * 128;
                                if (var81 + var91 < var67) {
                                    var90 += Statics.field561[var81 * 128 + var89 + var92];
                                }
                                if (var91 - (var81 + 1) >= 0) {
                                    var90 -= Statics.field561[var89 + var92 - (var81 + 1) * 128];
                                }
                                if (var91 >= 0) {
                                    Statics.field142[var89 + var92] = var90 / (var81 * 2 + 1);
                                }
                            }
                            var89++;
                        }
                    }
                    int var86 = 0;
                    int var87 = var85 * 128;
                    for (int var88 = -var81; var88 < 128; var88++) {
                        if (var81 + var88 < 128) {
                            var86 += Statics.field142[var87 + var88 + var81];
                        }
                        if (var88 - (var81 + 1) >= 0) {
                            var86 -= Statics.field142[var87 + var88 - (var81 + 1)];
                        }
                        if (var88 >= 0) {
                            Statics.field561[var87 + var88] = var86 / (var81 * 2 + 1);
                        }
                    }
                    var85++;
                }
            }
            field664 = 0;
        }
        method1419();
        Statics.field3014[Statics.field93.field136 ? 1 : 0].method1585(725, 463);
        if (client.field461 > 5 && client.field272 == 0) {
            if (Statics.field206 == null) {
                Statics.field206 = class72.method135(Statics.field739, "sl_button", "");
            } else {
                byte var93 = 5;
                short var94 = 463;
                byte var95 = 100;
                byte var96 = 35;
                Statics.field206.method1585(var93, var94);
                arg0.method3538(class148.field2319 + " " + client.field493, var95 / 2 + var93, var96 / 2 + var94 - 2, 16777215, 0);
                if (Statics.field72 == null) {
                    arg1.method3538(class148.field2427, var95 / 2 + var93, var96 / 2 + var94 + 12, 16777215, 0);
                } else {
                    arg1.method3538(class148.field2426, var95 / 2 + var93, var96 / 2 + var94 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var97 = Statics.field1563.getGraphics();
            Statics.field2050.method1357(var97, 0, 0);
        } catch (Exception var100) {
            Statics.field1563.repaint();
        }
    }

    @ObfuscatedName("g.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method144(String arg0, String arg1, String arg2) {
        field680 = arg0;
        field670 = arg1;
        field671 = arg2;
    }

    @ObfuscatedName("ax.l(Lbm;I)V")
    public static final void method818(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field661.length; var2++) {
            Statics.field661[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field661[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field52[var8] = (Statics.field661[var8 - 1] + Statics.field661[var8 + 1] + Statics.field661[var8 - 128] + Statics.field661[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field661;
            Statics.field661 = Statics.field52;
            Statics.field52 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1321; var11++) {
            for (int var12 = 0; var12 < arg0.field1323; var12++) {
                if (arg0.field1328[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1325;
                    int var14 = var11 + 16 + arg0.field1326;
                    int var15 = (var14 << 7) + var13;
                    Statics.field661[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dn.m(IIII)I")
    public static final int method2086(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bh.o(I)V")
    public static final void method1419() {
        short var0 = 256;
        if (field659 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field659 > 768) {
                    Statics.field2989[var1] = method2086(Statics.field3058[var1], Statics.field592[var1], 1024 - field659);
                } else if (field659 > 256) {
                    Statics.field2989[var1] = Statics.field592[var1];
                } else {
                    Statics.field2989[var1] = method2086(Statics.field592[var1], Statics.field3058[var1], 256 - field659);
                }
            }
        } else if (field660 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field660 > 768) {
                    Statics.field2989[var2] = method2086(Statics.field3058[var2], Statics.field648[var2], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field2989[var2] = Statics.field648[var2];
                } else {
                    Statics.field2989[var2] = method2086(Statics.field648[var2], Statics.field3058[var2], 256 - field660);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2989[var3] = Statics.field3058[var3];
            }
        }
        class75.method1547(0, 9, 128, var0 + 7);
        Statics.field657.method1501(0, 0);
        class75.method1529();
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
                int var10 = Statics.field142[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2989[var10];
                    int var14 = Statics.field2050.field1297[var5];
                    Statics.field2050.field1297[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class75.method1547(637, 9, 765, var0 + 7);
        Statics.field2750.method1501(382, 0);
        class75.method1529();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field658[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field142[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2989[var22];
                    int var26 = Statics.field2050.field1297[var20];
                    Statics.field2050.field1297[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("at.p(I)V")
    public static void method905() {
        try {
            if (Statics.field72 == null) {
                Statics.field72 = new class18(Statics.field925, new URL(Statics.field2026));
            } else {
                byte[] var0 = Statics.field72.method168();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field681 = var1.method2307();
                    Statics.field2777 = new class24[field681];
                    int var2 = 0;
                    while (var2 < field681) {
                        class24 var3 = Statics.field2777[var2] = new class24();
                        var3.field601 = var1.method2307();
                        var3.field597 = var1.method2153();
                        var3.field594 = var1.method2156();
                        var3.field595 = var1.method2156();
                        var3.field598 = var1.method2231();
                        var3.field596 = var1.method2151();
                        var3.field591 = var2++;
                    }
                    method719(Statics.field2777, 0, Statics.field2777.length - 1, field673, field684);
                    field672 = true;
                    Statics.field72 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field72 = null;
        }
    }

    @ObfuscatedName("gi.u(III)V")
    public static void method3419(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field673[var5] != arg0) {
                var2[var4] = field673[var5];
                var3[var4] = field684[var5];
                var4++;
            }
        }
        field673 = var2;
        field684 = var3;
        method719(Statics.field2777, 0, Statics.field2777.length - 1, field673, field684);
    }

    @ObfuscatedName("af.g([Li;II[I[II)V")
    public static void method719(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field591;
                        var12 = var8.field591;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field596;
                        var12 = var8.field596;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method511() ? 1 : 0;
                        var12 = var8.method511() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field601;
                        var12 = var8.field601;
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
                        var15 = arg0[var5].field591;
                        var16 = var8.field591;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field596;
                        var16 = var8.field596;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method511() ? 1 : 0;
                        var16 = var8.method511() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field601;
                        var16 = var8.field601;
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
        method719(arg0, arg1, var6, arg3, arg4);
        method719(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

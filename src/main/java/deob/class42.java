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

@ObfuscatedName("ar")
public class class42 {

    @ObfuscatedName("ar.l")
    public static int field818 = 0;

    @ObfuscatedName("ar.y")
    public static int field833 = field818 + 202;

    @ObfuscatedName("ar.m")
    public static int[] field826 = new int[256];

    @ObfuscatedName("ar.e")
    public static int field827 = 0;

    @ObfuscatedName("ar.j")
    public static int field828 = 0;

    @ObfuscatedName("ar.ab")
    public static int field822 = 0;

    @ObfuscatedName("ar.af")
    public static int field848 = 0;

    @ObfuscatedName("ar.aw")
    public static int field824 = 0;

    @ObfuscatedName("ar.ac")
    public static int field825 = 0;

    @ObfuscatedName("ar.an")
    public static int field830 = 10;

    @ObfuscatedName("ar.ae")
    public static String field835 = "";

    @ObfuscatedName("ar.au")
    public static int field836 = 0;

    @ObfuscatedName("ar.am")
    public static String field831 = "";

    @ObfuscatedName("ar.as")
    public static String field841 = "";

    @ObfuscatedName("ar.ay")
    public static String field839 = "";

    @ObfuscatedName("ar.at")
    public static String field840 = "";

    @ObfuscatedName("ar.ai")
    public static String field834 = "";

    @ObfuscatedName("ar.aa")
    public static String field842 = "";

    @ObfuscatedName("ar.ar")
    public static class98 field843 = class98.field1625;

    @ObfuscatedName("ar.al")
    public static boolean field845 = true;

    @ObfuscatedName("ar.ah")
    public static int field846 = 0;

    @ObfuscatedName("ar.ak")
    public static String field837 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.ax")
    public static String field832 = "1234567890";

    @ObfuscatedName("ar.az")
    public static boolean field849 = false;

    @ObfuscatedName("ar.bl")
    public static int field850 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.b(Ljava/awt/Component;Lgj;Lgj;ZII)V")
    public static void method782(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field820) {
            field836 = arg4;
            class220.method3881();
            byte[] var5 = arg1.method3167("title.jpg", "");
            Statics.field821 = new class225(var5, arg0);
            Statics.field847 = Statics.field821.method3994();
            if ((client.field283 & 0x20000000) == 0) {
                Statics.field44 = class226.method837(arg2, "logo", "");
            } else {
                Statics.field44 = class226.method837(arg2, "logo_deadman_mode", "");
            }
            Statics.field819 = class226.method837(arg2, "titlebox", "");
            Statics.field817 = class226.method837(arg2, "titlebutton", "");
            Statics.field54 = class226.method3029(arg2, "runes", "");
            Statics.field65 = class226.method3029(arg2, "title_mute", "");
            Statics.field823 = class226.method837(arg2, "options_radio_buttons,0", "");
            Statics.field838 = class226.method837(arg2, "options_radio_buttons,2", "");
            Statics.field2123 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2123[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2123[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2123[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2123[var9 + 192] = 16777215;
            }
            Statics.field1174 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1174[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1174[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1174[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1174[var13 + 192] = 16777215;
            }
            Statics.field762 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field762[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field762[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field762[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field762[var17 + 192] = 16777215;
            }
            Statics.field2038 = new int[256];
            Statics.field2089 = new int[32768];
            Statics.field131 = new int[32768];
            method1530((class223) null);
            Statics.field829 = new int[32768];
            Statics.field52 = new int[32768];
            if (arg3) {
                field834 = "";
                field842 = "";
            }
            Statics.field844 = 0;
            Statics.field2098 = "";
            field845 = true;
            field849 = false;
            if (Statics.field1552.field693) {
                class139.method757(2);
            } else {
                class185 var18 = Statics.field123;
                int var19 = var18.method3165("scape main");
                int var20 = var18.method3209(var19, "");
                class139.method614(2, var18, var19, var20, 255, false);
            }
            class186.method691(false);
            Statics.field820 = true;
            field818 = (Statics.field22 - client.field501) / 2;
            field833 = field818 + 202;
            Statics.field821.method4004(field818, 0);
            Statics.field847.method4004(field818 + 382, 0);
            Statics.field44.method3957(field818 + 382 - Statics.field44.field3205 / 2, 18);
        } else if (arg4 == 4) {
            field836 = 4;
        }
    }

    @ObfuscatedName("gs.l(Ldn;B)V")
    public static void method3472(class114 arg0) {
        if (!field849) {
            if ((class116.field1797 == 1 || !Statics.field770 && class116.field1797 == 4) && class116.field1809 >= field818 + 765 - 50 && class116.field1799 >= 453) {
                Statics.field1552.field693 = !Statics.field1552.field693;
                class31.method1879();
                if (Statics.field1552.field693) {
                    Statics.field801.method2506();
                    class139.field1916 = 1;
                    Statics.field1919 = null;
                } else {
                    class185 var6 = Statics.field123;
                    int var7 = var6.method3165("scape main");
                    int var8 = var6.method3209(var7, "");
                    class139.method2044(var6, var7, var8, 255, false);
                }
            }
            if (client.field436 != 5) {
                field824++;
                if (client.field436 == 10 || client.field436 == 11) {
                    if (client.field290 == 0) {
                        if (class116.field1797 == 1 || !Statics.field770 && class116.field1797 == 4) {
                            int var9 = field818 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1809 >= var9 && class116.field1809 <= var9 + var11 && class116.field1799 >= var10 && class116.field1799 <= var10 + var12) {
                                if (class30.method198()) {
                                    field849 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1063 != null && class30.method198()) {
                            field849 = true;
                        }
                    }
                    int var13 = class116.field1797;
                    int var14 = class116.field1809;
                    int var15 = class116.field1799;
                    if (!Statics.field770 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field836 == 0) {
                        boolean var16 = false;
                        while (Statics.method792()) {
                            if (Statics.field212 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field833 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            label745: {
                                String var19 = client.method1900("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var19));
                                        break label745;
                                    } catch (Exception var50) {
                                    }
                                }
                                if (class115.field1788.startsWith("win")) {
                                    class115.method85(var19, 0);
                                } else if (class115.field1788.startsWith("mac")) {
                                    class115.method909(var19, 1, "openjs");
                                } else {
                                    class115.method85(var19, 2);
                                }
                            }
                        }
                        int var21 = field833 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field283 & 0x2000000) != 0) {
                                field831 = "";
                                field841 = class174.field2577;
                                field839 = class174.field2527;
                                field840 = class174.field2579;
                                field836 = 1;
                                field846 = 0;
                            } else if ((client.field283 & 0x4) != 0) {
                                if ((client.field283 & 0x400) == 0) {
                                    field841 = class174.field2568;
                                    field839 = class174.field2370;
                                    field840 = class174.field2570;
                                } else {
                                    field841 = class174.field2574;
                                    field839 = class174.field2505;
                                    field840 = class174.field2576;
                                }
                                field831 = class174.field2567;
                                field836 = 1;
                                field846 = 0;
                            } else if ((client.field283 & 0x400) == 0) {
                                field841 = class174.field2564;
                                field839 = class174.field2565;
                                field840 = class174.field2376;
                                field836 = 2;
                                field846 = 0;
                            } else {
                                field841 = class174.field2530;
                                field839 = class174.field2572;
                                field840 = class174.field2573;
                                field831 = class174.field2567;
                                field836 = 1;
                                field846 = 0;
                            }
                        }
                    } else if (field836 == 1) {
                        while (Statics.method792()) {
                            if (Statics.field212 == 84) {
                                field841 = class174.field2564;
                                field839 = class174.field2565;
                                field840 = class174.field2376;
                                field836 = 2;
                                field846 = 0;
                            } else if (Statics.field212 == 13) {
                                field836 = 0;
                            }
                        }
                        int var22 = field833 + 180 - 80;
                        short var23 = 321;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field841 = class174.field2564;
                            field839 = class174.field2565;
                            field840 = class174.field2376;
                            field836 = 2;
                            field846 = 0;
                        }
                        int var24 = field833 + 180 + 80;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field836 = 0;
                        }
                    } else if (field836 == 2) {
                        short var25 = 231;
                        int var51 = var25 + 30;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field846 = 0;
                        }
                        var51 += 15;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field846 = 1;
                        }
                        var51 += 15;
                        short var26 = 361;
                        if (var13 == 1 && var15 >= var26 - 15 && var15 < var26) {
                            method1987(class174.field2603, class174.field2604, class174.field2605);
                            field836 = 5;
                            return;
                        }
                        int var27 = field833 + 180 - 80;
                        short var28 = 321;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field834 = field834.trim();
                            if (field834.length() == 0) {
                                method1987(class174.field2470, class174.field2471, class174.field2454);
                                return;
                            }
                            if (field842.length() == 0) {
                                method1987(class174.field2473, class174.field2474, class174.field2475);
                                return;
                            }
                            method1987(class174.field2453, class174.field2364, class174.field2584);
                            field843 = Statics.field1552.field689.containsKey(class208.method164(field834)) ? class98.field1631 : class98.field1625;
                            client.method1883(20);
                            return;
                        }
                        int var29 = field833 + 180 + 80;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field836 = 0;
                            field834 = "";
                            field842 = "";
                            Statics.field844 = 0;
                            Statics.field2098 = "";
                            field845 = true;
                        }
                        while (true) {
                            while (Statics.method792()) {
                                boolean var30 = false;
                                for (int var31 = 0; var31 < field837.length(); var31++) {
                                    if (Statics.field33 == field837.charAt(var31)) {
                                        var30 = true;
                                        break;
                                    }
                                }
                                if (Statics.field212 == 13) {
                                    field836 = 0;
                                    field834 = "";
                                    field842 = "";
                                    Statics.field844 = 0;
                                    Statics.field2098 = "";
                                    field845 = true;
                                } else if (field846 == 0) {
                                    if (Statics.field212 == 85 && field834.length() > 0) {
                                        field834 = field834.substring(0, field834.length() - 1);
                                    }
                                    if (Statics.field212 == 84 || Statics.field212 == 80) {
                                        field846 = 1;
                                    }
                                    if (var30 && field834.length() < 320) {
                                        field834 = field834 + Statics.field33;
                                    }
                                } else if (field846 == 1) {
                                    if (Statics.field212 == 85 && field842.length() > 0) {
                                        field842 = field842.substring(0, field842.length() - 1);
                                    }
                                    if (Statics.field212 == 84 || Statics.field212 == 80) {
                                        field846 = 0;
                                    }
                                    if (Statics.field212 == 84) {
                                        field834 = field834.trim();
                                        if (field834.length() == 0) {
                                            method1987(class174.field2470, class174.field2471, class174.field2454);
                                            return;
                                        }
                                        if (field842.length() == 0) {
                                            method1987(class174.field2473, class174.field2474, class174.field2475);
                                            return;
                                        }
                                        method1987(class174.field2453, class174.field2364, class174.field2584);
                                        field843 = Statics.field1552.field689.containsKey(class208.method164(field834)) ? class98.field1631 : class98.field1625;
                                        client.method1883(20);
                                        return;
                                    }
                                    if (var30 && field842.length() < 20) {
                                        field842 = field842 + Statics.field33;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field836 == 3) {
                        int var32 = field833 + 180;
                        short var33 = 276;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            field841 = class174.field2564;
                            field839 = class174.field2565;
                            field840 = class174.field2376;
                            field836 = 2;
                            field846 = 0;
                        }
                        int var34 = field833 + 180;
                        short var35 = 326;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method1987(class174.field2603, class174.field2604, class174.field2605);
                            field836 = 5;
                            return;
                        }
                    } else if (field836 == 4) {
                        int var36 = field833 + 180 - 80;
                        short var37 = 321;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            Statics.field2098.trim();
                            if (Statics.field2098.length() != 6) {
                                method1987(class174.field2389, class174.field2390, class174.field2391);
                                return;
                            }
                            Statics.field844 = Integer.parseInt(Statics.field2098);
                            Statics.field2098 = "";
                            field843 = field845 ? class98.field1629 : class98.field1626;
                            method1987(class174.field2453, class174.field2364, class174.field2584);
                            client.method1883(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field833 + 180 - 9 && var14 <= field833 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field845 = !field845;
                        }
                        if (var13 == 1 && var14 >= field833 + 180 - 34 && var14 <= field833 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label760: {
                                String var38 = client.method1900("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var38));
                                        break label760;
                                    } catch (Exception var49) {
                                    }
                                }
                                if (class115.field1788.startsWith("win")) {
                                    class115.method85(var38, 0);
                                } else if (class115.field1788.startsWith("mac")) {
                                    class115.method909(var38, 1, "openjs");
                                } else {
                                    class115.method85(var38, 2);
                                }
                            }
                        }
                        int var40 = field833 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            field836 = 0;
                            field834 = "";
                            field842 = "";
                            Statics.field844 = 0;
                            Statics.field2098 = "";
                        }
                        while (Statics.method792()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field832.length(); var42++) {
                                if (Statics.field33 == field832.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field212 == 13) {
                                field836 = 0;
                                field834 = "";
                                field842 = "";
                                Statics.field844 = 0;
                                Statics.field2098 = "";
                            } else {
                                if (Statics.field212 == 85 && Statics.field2098.length() > 0) {
                                    Statics.field2098 = Statics.field2098.substring(0, Statics.field2098.length() - 1);
                                }
                                if (Statics.field212 == 84) {
                                    Statics.field2098.trim();
                                    if (Statics.field2098.length() != 6) {
                                        method1987(class174.field2389, class174.field2390, class174.field2391);
                                        return;
                                    }
                                    Statics.field844 = Integer.parseInt(Statics.field2098);
                                    Statics.field2098 = "";
                                    field843 = field845 ? class98.field1629 : class98.field1626;
                                    method1987(class174.field2453, class174.field2364, class174.field2584);
                                    client.method1883(20);
                                    return;
                                }
                                if (var41 && Statics.field2098.length() < 6) {
                                    Statics.field2098 = Statics.field2098 + Statics.field33;
                                }
                            }
                        }
                    } else if (field836 == 5) {
                        int var43 = field833 + 180 - 80;
                        short var44 = 321;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            method838();
                            return;
                        }
                        int var45 = field833 + 180 + 80;
                        if (var13 == 1 && var14 >= var45 - 75 && var14 <= var45 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            field841 = class174.field2564;
                            field839 = class174.field2565;
                            field840 = class174.field2376;
                            field836 = 2;
                            field846 = 0;
                            field842 = "";
                        }
                        while (Statics.method792()) {
                            boolean var46 = false;
                            for (int var47 = 0; var47 < field837.length(); var47++) {
                                if (Statics.field33 == field837.charAt(var47)) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (Statics.field212 == 13) {
                                field841 = class174.field2564;
                                field839 = class174.field2565;
                                field840 = class174.field2376;
                                field836 = 2;
                                field846 = 0;
                                field842 = "";
                            } else {
                                if (Statics.field212 == 85 && field834.length() > 0) {
                                    field834 = field834.substring(0, field834.length() - 1);
                                }
                                if (Statics.field212 == 84) {
                                    method838();
                                    return;
                                }
                                if (var46 && field834.length() < 320) {
                                    field834 = field834 + Statics.field33;
                                }
                            }
                        }
                    } else if (field836 == 6) {
                        while (true) {
                            do {
                                if (!Statics.method792()) {
                                    short var48 = 321;
                                    if (var13 == 1 && var15 >= var48 - 20 && var15 <= var48 + 20) {
                                        field841 = class174.field2564;
                                        field839 = class174.field2565;
                                        field840 = class174.field2376;
                                        field836 = 2;
                                        field846 = 0;
                                        field842 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field212 != 84 && Statics.field212 != 13);
                            field841 = class174.field2564;
                            field839 = class174.field2565;
                            field840 = class174.field2376;
                            field836 = 2;
                            field846 = 0;
                            field842 = "";
                        }
                    }
                }
            }
        } else if (class116.field1797 == 1 || !Statics.field770 && class116.field1797 == 4) {
            int var1 = field818 + 280;
            if (class116.field1809 >= var1 && class116.field1809 <= var1 + 14 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                class30.method215(0, 0);
            } else if (class116.field1809 >= var1 + 15 && class116.field1809 <= var1 + 80 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                class30.method215(0, 1);
            } else {
                int var2 = field818 + 390;
                if (class116.field1809 >= var2 && class116.field1809 <= var2 + 14 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                    class30.method215(1, 0);
                } else if (class116.field1809 >= var2 + 15 && class116.field1809 <= var2 + 80 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                    class30.method215(1, 1);
                } else {
                    int var3 = field818 + 500;
                    if (class116.field1809 >= var3 && class116.field1809 <= var3 + 14 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                        class30.method215(2, 0);
                    } else if (class116.field1809 >= var3 + 15 && class116.field1809 <= var3 + 80 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                        class30.method215(2, 1);
                    } else {
                        int var4 = field818 + 610;
                        if (class116.field1809 >= var4 && class116.field1809 <= var4 + 14 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                            class30.method215(3, 0);
                        } else if (class116.field1809 >= var4 + 15 && class116.field1809 <= var4 + 80 && class116.field1799 >= 4 && class116.field1799 <= 18) {
                            class30.method215(3, 1);
                        } else if (class116.field1809 >= field818 + 708 && class116.field1799 >= 4 && class116.field1809 <= field818 + 708 + 50 && class116.field1799 <= 20) {
                            field849 = false;
                            Statics.field821.method4004(field818, 0);
                            Statics.field847.method4004(field818 + 382, 0);
                            Statics.field44.method3957(field818 + 382 - Statics.field44.field3205 / 2, 18);
                        } else if (field850 != -1) {
                            class30 var5 = Statics.field674[field850];
                            method186(var5);
                            field849 = false;
                            Statics.field821.method4004(field818, 0);
                            Statics.field847.method4004(field818 + 382, 0);
                            Statics.field44.method3957(field818 + 382 - Statics.field44.field3205 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.i(I)V")
    public static void method838() {
        field834 = field834.trim();
        if (field834.length() == 0) {
            method1987(class174.field2603, class174.field2604, class174.field2605);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1900("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class154 var4 = new class154(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2083, var4.field2085, 1000 - var4.field2085);
                if (var5 == -1) {
                    var4.field2085 = 0;
                    long var8 = var4.method2769();
                    var6 = var8;
                    break;
                }
                var4.field2085 += var5;
                if (var4.field2085 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var42) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field834;
            Random var15 = new Random();
            class154 var16 = new class154(128);
            class154 var17 = new class154(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2832(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2666(var15.nextInt());
            }
            var16.method2666(var18[0]);
            var16.method2666(var18[1]);
            var16.method2667(var6);
            var16.method2667(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2666(var15.nextInt());
            }
            var16.method2699(class37.field764, class37.field765);
            var17.method2832(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2666(var15.nextInt());
            }
            var17.method2667(var15.nextLong());
            var17.method2885(var15.nextLong());
            client.method756(var17);
            var17.method2667(var15.nextLong());
            var17.method2699(class37.field764, class37.field765);
            int var22 = class154.method616(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class154 var23 = new class154(var22);
            var23.method2715(var14);
            var23.field2085 = var22;
            var23.method2695(var18);
            class154 var24 = new class154(var23.field2085 + var17.field2085 + var16.field2085 + 5);
            var24.method2832(2);
            var24.method2832(var16.field2085);
            var24.method2672(var16.field2083, 0, var16.field2085);
            var24.method2832(var17.field2085);
            var24.method2672(var17.field2083, 0, var17.field2085);
            var24.method2664(var23.field2085);
            var24.method2672(var23.field2083, 0, var23.field2085);
            String var25 = class207.method2515(var24.field2083);
            byte var32;
            try {
                URL var26 = new URL(client.method1900("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class232.method37(var25) + "&dest=" + class232.method37("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class154 var30 = new class154(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2083, var30.field2085, 1000 - var30.field2085);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2083);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2696(var18);
                            while (var30.field2085 > 0 && var30.field2083[var30.field2085 - 1] == 0) {
                                var30.field2085--;
                            }
                            String var34 = new String(var30.field2083, 0, var30.field2085);
                            boolean var35;
                            if (var34 == null) {
                                var35 = false;
                            } else {
                                label121: {
                                    try {
                                        new URL(var34);
                                    } catch (MalformedURLException var40) {
                                        var35 = false;
                                        break label121;
                                    }
                                    var35 = true;
                                }
                            }
                            if (var35) {
                                label116: {
                                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                        try {
                                            Desktop.getDesktop().browse(new URI(var34));
                                            break label116;
                                        } catch (Exception var39) {
                                        }
                                    }
                                    if (class115.field1788.startsWith("win")) {
                                        class115.method85(var34, 0);
                                    } else if (class115.field1788.startsWith("mac")) {
                                        class115.method909(var34, 1, "openjs");
                                    } else {
                                        class115.method85(var34, 2);
                                    }
                                }
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2085 += var31;
                    if (var30.field2085 >= 1000) {
                        var32 = 5;
                        break;
                    }
                }
            } catch (Throwable var41) {
                var41.printStackTrace();
                var32 = 5;
            }
            var13 = var32;
        }
        switch(var13) {
            case 2:
                method1987(class174.field2606, class174.field2590, class174.field2437);
                field836 = 6;
                break;
            case 3:
                method1987(class174.field2609, class174.field2613, class174.field2443);
                break;
            case 4:
                method1987(class174.field2612, class174.field2424, class174.field2614);
                break;
            case 5:
                method1987(class174.field2615, class174.field2562, class174.field2372);
                break;
            case 6:
                method1987(class174.field2626, class174.field2580, class174.field2620);
                break;
            case 7:
                method1987(class174.field2439, class174.field2421, class174.field2517);
        }
    }

    @ObfuscatedName("q.t(Lhm;Lhm;Lhm;ZB)V")
    public static void method207(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field818 = (Statics.field22 - client.field501) / 2;
            field833 = field818 + 202;
        }
        if (field849) {
            if (Statics.field576 == null) {
                Statics.field576 = class226.method2645(Statics.field1791, "sl_back", "");
            }
            if (Statics.field173 == null) {
                Statics.field173 = class226.method3029(Statics.field1791, "sl_flags", "");
            }
            if (Statics.field1818 == null) {
                Statics.field1818 = class226.method3029(Statics.field1791, "sl_arrows", "");
            }
            if (Statics.field2692 == null) {
                Statics.field2692 = class226.method3029(Statics.field1791, "sl_stars", "");
            }
            class220.method3884(field818, 23, 765, 480, 0);
            class220.method3888(field818, 0, 125, 23, 12425273, 9135624);
            class220.method3888(field818 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3794(class174.field2539, field818 + 62, 15, 0, -1);
            if (Statics.field2692 != null) {
                Statics.field2692[1].method3957(field818 + 140, 1);
                arg1.method3769(class174.field2625, field818 + 152, 10, 16777215, -1);
                Statics.field2692[0].method3957(field818 + 140, 12);
                arg1.method3769(class174.field2459, field818 + 152, 21, 16777215, -1);
            }
            if (Statics.field1818 != null) {
                int var4 = field818 + 280;
                if (class30.field678[0] == 0 && class30.field679[0] == 0) {
                    Statics.field1818[2].method3957(var4, 4);
                } else {
                    Statics.field1818[0].method3957(var4, 4);
                }
                if (class30.field678[0] == 0 && class30.field679[0] == 1) {
                    Statics.field1818[3].method3957(var4 + 15, 4);
                } else {
                    Statics.field1818[1].method3957(var4 + 15, 4);
                }
                arg0.method3769(class174.field2627, var4 + 32, 17, 16777215, -1);
                int var5 = field818 + 390;
                if (class30.field678[0] == 1 && class30.field679[0] == 0) {
                    Statics.field1818[2].method3957(var5, 4);
                } else {
                    Statics.field1818[0].method3957(var5, 4);
                }
                if (class30.field678[0] == 1 && class30.field679[0] == 1) {
                    Statics.field1818[3].method3957(var5 + 15, 4);
                } else {
                    Statics.field1818[1].method3957(var5 + 15, 4);
                }
                arg0.method3769(class174.field2628, var5 + 32, 17, 16777215, -1);
                int var6 = field818 + 500;
                if (class30.field678[0] == 2 && class30.field679[0] == 0) {
                    Statics.field1818[2].method3957(var6, 4);
                } else {
                    Statics.field1818[0].method3957(var6, 4);
                }
                if (class30.field678[0] == 2 && class30.field679[0] == 1) {
                    Statics.field1818[3].method3957(var6 + 15, 4);
                } else {
                    Statics.field1818[1].method3957(var6 + 15, 4);
                }
                arg0.method3769(class174.field2629, var6 + 32, 17, 16777215, -1);
                int var7 = field818 + 610;
                if (class30.field678[0] == 3 && class30.field679[0] == 0) {
                    Statics.field1818[2].method3957(var7, 4);
                } else {
                    Statics.field1818[0].method3957(var7, 4);
                }
                if (class30.field678[0] == 3 && class30.field679[0] == 1) {
                    Statics.field1818[3].method3957(var7 + 15, 4);
                } else {
                    Statics.field1818[1].method3957(var7 + 15, 4);
                }
                arg0.method3769(class174.field2632, var7 + 32, 17, 16777215, -1);
            }
            class220.method3884(field818 + 708, 4, 50, 16, 0);
            arg1.method3794(class174.field2592, field818 + 708 + 25, 16, 16777215, -1);
            field850 = -1;
            if (Statics.field576 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field677) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field677) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field677) {
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
                int var19 = field818 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field677; var22++) {
                    class30 var23 = Statics.field674[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field683);
                    if (var23.field683 == -1) {
                        var25 = class174.field2631;
                        var24 = false;
                    } else if (var23.field683 > 1980) {
                        var25 = class174.field2608;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method650()) {
                        if (var23.method660()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method649()) {
                        var26 = 16711680;
                        if (var23.method660()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method644()) {
                        if (var23.method660()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method660()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1803 >= var19 && class116.field1802 * 603852017 >= var18 && class116.field1803 < var8 + var19 && class116.field1802 * 603852017 < var9 + var18 && var24) {
                        field850 = var22;
                        Statics.field576[var27].method4010(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field576[var27].method4004(var19, var18);
                    }
                    if (Statics.field173 != null) {
                        Statics.field173[(var23.method660() ? 8 : 0) + var23.field686].method3957(var19 + 29, var18);
                    }
                    arg0.method3794(Integer.toString(var23.field681), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3794(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3764(Statics.field674[field850].field685) + 6;
                    int var29 = arg1.field3105 + 8;
                    class220.method3884(class116.field1803 - var28 / 2, class116.field1802 * 603852017 + 20 + 5, var28, var29, 16777120);
                    class220.method3889(class116.field1803 - var28 / 2, class116.field1802 * 603852017 + 20 + 5, var28, var29, 0);
                    arg1.method3794(Statics.field674[field850].field685, class116.field1803, class116.field1802 * 603852017 + 20 + 5 + arg1.field3105 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field3.getGraphics();
                Statics.field232.method3860(var30, 0, 0);
            } catch (Exception var91) {
                Statics.field3.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field821.method4004(field818, 0);
            Statics.field847.method4004(field818 + 382, 0);
            Statics.field44.method3957(field818 + 382 - Statics.field44.field3205 / 2, 18);
        }
        if (client.field436 == 0 || client.field436 == 5) {
            byte var32 = 20;
            arg0.method3794(class174.field2563, field833 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3889(field833 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3889(field833 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3884(field833 + 180 - 150, var33 + 2, field830 * 3, 30, 9179409);
            class220.method3884(field830 * 3 + (field833 + 180 - 150), var33 + 2, 300 - field830 * 3, 30, 0);
            arg0.method3794(field835, field833 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field436 == 20) {
            Statics.field819.method3957(field833 + 180 - Statics.field819.field3205 / 2, 271 - Statics.field819.field3203 / 2);
            short var34 = 211;
            arg0.method3794(field841, field833 + 180, var34, 16776960, 0);
            int var93 = var34 + 15;
            arg0.method3794(field839, field833 + 180, var93, 16776960, 0);
            int var94 = var93 + 15;
            arg0.method3794(field840, field833 + 180, var94, 16776960, 0);
            int var95 = var94 + 15;
            int var96 = var95 + 10;
            if (field836 != 4) {
                arg0.method3769(class174.field2465, field833 + 180 - 110, var96, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field834; arg0.method3764(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3769(class210.method3768(var36), field833 + 180 - 70, var96, 16777215, 0);
                var93 = var96 + 15;
                String var38 = class174.field2504;
                String var39 = field842;
                String var40 = class208.method2603('*', var39.length());
                arg0.method3769(var38 + var40, field833 + 180 - 108, var93, 16777215, 0);
                var93 += 15;
            }
        }
        if (client.field436 == 10 || client.field436 == 11) {
            Statics.field819.method3957(field833, 171);
            if (field836 == 0) {
                short var41 = 251;
                arg0.method3794(class174.field2588, field833 + 180, var41, 16776960, 0);
                int var97 = var41 + 30;
                int var42 = field833 + 180 - 80;
                short var43 = 291;
                Statics.field817.method3957(var42 - 73, var43 - 20);
                arg0.method3829(class174.field2589, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field833 + 180 + 80;
                Statics.field817.method3957(var44 - 73, var43 - 20);
                arg0.method3829(class174.field2555, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field836 == 1) {
                arg0.method3794(field831, field833 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3794(field841, field833 + 180, var45, 16777215, 0);
                int var98 = var45 + 15;
                arg0.method3794(field839, field833 + 180, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3794(field840, field833 + 180, var99, 16777215, 0);
                int var100 = var99 + 15;
                int var46 = field833 + 180 - 80;
                short var47 = 321;
                Statics.field817.method3957(var46 - 73, var47 - 20);
                arg0.method3794(class174.field2361, var46, var47 + 5, 16777215, 0);
                int var48 = field833 + 180 + 80;
                Statics.field817.method3957(var48 - 73, var47 - 20);
                arg0.method3794(class174.field2592, var48, var47 + 5, 16777215, 0);
            } else if (field836 == 2) {
                short var49 = 211;
                arg0.method3794(field841, field833 + 180, var49, 16776960, 0);
                int var101 = var49 + 15;
                arg0.method3794(field839, field833 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3794(field840, field833 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 10;
                arg0.method3769(class174.field2465, field833 + 180 - 110, var104, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field834; arg0.method3764(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3769(class210.method3768(var51) + (field846 == 0 & client.field293 % 40 < 20 ? class38.method3310(16776960) + class38.field785 : ""), field833 + 180 - 70, var104, 16777215, 0);
                var101 = var104 + 15;
                String var53 = class174.field2504;
                String var54 = field842;
                String var55 = class208.method2603('*', var54.length());
                arg0.method3769(var53 + var55 + (field846 == 1 & client.field293 % 40 < 20 ? class38.method3310(16776960) + class38.field785 : ""), field833 + 180 - 108, var101, 16777215, 0);
                var101 += 15;
                int var56 = field833 + 180 - 80;
                short var57 = 321;
                Statics.field817.method3957(var56 - 73, var57 - 20);
                arg0.method3794(class174.field2483, var56, var57 + 5, 16777215, 0);
                int var58 = field833 + 180 + 80;
                Statics.field817.method3957(var58 - 73, var57 - 20);
                arg0.method3794(class174.field2592, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3794(class174.field2598, field833 + 180, var59, 16776960, 0);
            } else if (field836 == 3) {
                short var60 = 201;
                arg0.method3794(class174.field2593, field833 + 180, var60, 16776960, 0);
                int var105 = var60 + 20;
                arg1.method3794(class174.field2594, field833 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg1.method3794(class174.field2440, field833 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var61 = field833 + 180;
                short var62 = 276;
                Statics.field817.method3957(var61 - 73, var62 - 20);
                arg2.method3794(class174.field2596, var61, var62 + 5, 16777215, 0);
                int var63 = field833 + 180;
                short var64 = 326;
                Statics.field817.method3957(var63 - 73, var64 - 20);
                arg2.method3794(class174.field2597, var63, var64 + 5, 16777215, 0);
            } else if (field836 == 4) {
                arg0.method3794(class174.field2450, field833 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3794(field841, field833 + 180, var65, 16777215, 0);
                int var108 = var65 + 15;
                arg0.method3794(field839, field833 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method3794(field840, field833 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                String var67 = class174.field2587;
                String var68 = Statics.field2098;
                String var69 = class208.method2603('*', var68.length());
                arg0.method3769(var67 + var69 + (client.field293 % 40 < 20 ? class38.method3310(16776960) + class38.field785 : ""), field833 + 180 - 108, var110, 16777215, 0);
                int var111 = var110 - 8;
                arg0.method3769(class174.field2363, field833 + 180 - 9, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method3769(class174.field2412, field833 + 180 - 9, var112, 16776960, 0);
                int var70 = field833 + 180 - 9 + arg0.method3764(class174.field2412) + 15;
                int var71 = var112 - arg0.field3105;
                class223 var72;
                if (field845) {
                    var72 = Statics.field838;
                } else {
                    var72 = Statics.field823;
                }
                var72.method3957(var70, var71);
                var108 = var112 + 15;
                int var73 = field833 + 180 - 80;
                short var74 = 321;
                Statics.field817.method3957(var73 - 73, var74 - 20);
                arg0.method3794(class174.field2361, var73, var74 + 5, 16777215, 0);
                int var75 = field833 + 180 + 80;
                Statics.field817.method3957(var75 - 73, var74 - 20);
                arg0.method3794(class174.field2592, var75, var74 + 5, 16777215, 0);
                arg1.method3794(class174.field2362, field833 + 180, var74 + 36, 255, 0);
            } else if (field836 == 5) {
                arg0.method3794(class174.field2397, field833 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3794(field841, field833 + 180, var76, 16776960, 0);
                int var113 = var76 + 15;
                arg2.method3794(field839, field833 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method3794(field840, field833 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 14;
                arg0.method3769(class174.field2600, field833 + 180 - 145, var116, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field834; arg0.method3764(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3769(class210.method3768(var78) + (client.field293 % 40 < 20 ? class38.method3310(16776960) + class38.field785 : ""), field833 + 180 - 34, var116, 16777215, 0);
                var113 = var116 + 15;
                int var79 = field833 + 180 - 80;
                short var80 = 321;
                Statics.field817.method3957(var79 - 73, var80 - 20);
                arg0.method3794(class174.field2601, var79, var80 + 5, 16777215, 0);
                int var81 = field833 + 180 + 80;
                Statics.field817.method3957(var81 - 73, var80 - 20);
                arg0.method3794(class174.field2418, var81, var80 + 5, 16777215, 0);
            } else if (field836 == 6) {
                short var82 = 211;
                arg0.method3794(field841, field833 + 180, var82, 16776960, 0);
                int var117 = var82 + 15;
                arg0.method3794(field839, field833 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3794(field840, field833 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var83 = field833 + 180;
                short var84 = 321;
                Statics.field817.method3957(var83 - 73, var84 - 20);
                arg0.method3794(class174.field2418, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field824 > 0) {
            Statics.method3626(field824);
            field824 = 0;
        }
        method202();
        Statics.field65[Statics.field1552.field693 ? 1 : 0].method3957(field818 + 765 - 40, 463);
        if (client.field436 > 5 && client.field290 == 0) {
            if (Statics.field796 == null) {
                Statics.field796 = class226.method837(Statics.field1791, "sl_button", "");
            } else {
                int var85 = field818 + 5;
                short var86 = 463;
                byte var87 = 100;
                byte var88 = 35;
                Statics.field796.method3957(var85, var86);
                arg0.method3794(class174.field2518 + " " + client.field282, var87 / 2 + var85, var88 / 2 + var86 - 2, 16777215, 0);
                if (Statics.field1063 == null) {
                    arg1.method3794(class174.field2634, var87 / 2 + var85, var88 / 2 + var86 + 12, 16777215, 0);
                } else {
                    arg1.method3794(class174.field2480, var87 / 2 + var85, var88 / 2 + var86 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var89 = Statics.field3.getGraphics();
            Statics.field232.method3860(var89, 0, 0);
        } catch (Exception var92) {
            Statics.field3.repaint();
        }
    }

    @ObfuscatedName("dm.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1987(String arg0, String arg1, String arg2) {
        field841 = arg0;
        field839 = arg1;
        field840 = arg2;
    }

    @ObfuscatedName("cu.x(Lhu;B)V")
    public static final void method1530(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2089.length; var2++) {
            Statics.field2089[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2089[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field131[var8] = (Statics.field2089[var8 - 1] + Statics.field2089[var8 + 1] + Statics.field2089[var8 - 128] + Statics.field2089[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2089;
            Statics.field2089 = Statics.field131;
            Statics.field131 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3203; var11++) {
            for (int var12 = 0; var12 < arg0.field3205; var12++) {
                if (arg0.field3209[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3207;
                    int var14 = var11 + 16 + arg0.field3208;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2089[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ca.p(IIII)I")
    public static final int method1877(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("m.s(I)V")
    public static final void method202() {
        short var0 = 256;
        if (field827 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field827 > 768) {
                    Statics.field2038[var1] = method1877(Statics.field2123[var1], Statics.field1174[var1], 1024 - field827);
                } else if (field827 > 256) {
                    Statics.field2038[var1] = Statics.field1174[var1];
                } else {
                    Statics.field2038[var1] = method1877(Statics.field1174[var1], Statics.field2123[var1], 256 - field827);
                }
            }
        } else if (field828 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field828 > 768) {
                    Statics.field2038[var2] = method1877(Statics.field2123[var2], Statics.field762[var2], 1024 - field828);
                } else if (field828 > 256) {
                    Statics.field2038[var2] = Statics.field762[var2];
                } else {
                    Statics.field2038[var2] = method1877(Statics.field762[var2], Statics.field2123[var2], 256 - field828);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2038[var3] = Statics.field2123[var3];
            }
        }
        class220.method3909(field818, 9, field818 + 128, var0 + 7);
        Statics.field821.method4004(field818, 0);
        class220.method3925();
        int var4 = 0;
        int var5 = field818 + Statics.field232.field3191 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field826[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field829[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2038[var10];
                    int var14 = Statics.field232.field3193[var5];
                    Statics.field232.field3193[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field232.field3191 + var8 - 128;
        }
        class220.method3909(field818 + 765 - 128, 9, field818 + 765, var0 + 7);
        Statics.field847.method4004(field818 + 382, 0);
        class220.method3925();
        int var15 = 0;
        int var16 = field818 + Statics.field232.field3191 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field826[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field829[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2038[var22];
                    int var26 = Statics.field232.field3193[var20];
                    Statics.field232.field3193[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field232.field3191 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("o.o(Laf;I)V")
    public static void method186(class30 arg0) {
        if (arg0.method660() != client.field288) {
            client.field288 = arg0.method660();
            class199.method2985(arg0.method660());
        }
        Statics.field1718 = arg0.field684;
        client.field282 = arg0.field681;
        client.field283 = arg0.field676;
        Statics.field1407 = client.field296 == 0 ? 43594 : arg0.field681 + 40000;
        Statics.field891 = client.field296 == 0 ? 443 : arg0.field681 + 50000;
        Statics.field714 = Statics.field1407;
    }
}

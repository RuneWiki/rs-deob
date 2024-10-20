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

@ObfuscatedName("ag")
public class class42 {

    @ObfuscatedName("ag.y")
    public static int field847 = 0;

    @ObfuscatedName("ag.h")
    public static int field827 = field847 + 202;

    @ObfuscatedName("ag.t")
    public static int[] field828 = new int[256];

    @ObfuscatedName("ag.m")
    public static int field831 = 0;

    @ObfuscatedName("ag.e")
    public static int field832 = 0;

    @ObfuscatedName("ag.aw")
    public static int field826 = 0;

    @ObfuscatedName("ag.as")
    public static int field836 = 0;

    @ObfuscatedName("ag.ah")
    public static int field837 = 0;

    @ObfuscatedName("ag.aa")
    public static int field838 = 0;

    @ObfuscatedName("ag.ai")
    public static int field850 = 10;

    @ObfuscatedName("ag.af")
    public static String field840 = "";

    @ObfuscatedName("ag.aj")
    public static int field835 = 0;

    @ObfuscatedName("ag.am")
    public static String field820 = "";

    @ObfuscatedName("ag.ar")
    public static String field843 = "";

    @ObfuscatedName("ag.ad")
    public static String field844 = "";

    @ObfuscatedName("ag.ay")
    public static String field833 = "";

    @ObfuscatedName("ag.ao")
    public static String field841 = "";

    @ObfuscatedName("ag.ac")
    public static String field845 = "";

    @ObfuscatedName("ag.ag")
    public static class98 field855 = class98.field1625;

    @ObfuscatedName("ag.ax")
    public static boolean field849 = true;

    @ObfuscatedName("ag.ae")
    public static int field842 = 0;

    @ObfuscatedName("ag.ab")
    public static String field851 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ag.al")
    public static String field852 = "1234567890";

    @ObfuscatedName("ag.av")
    public static boolean field823 = false;

    @ObfuscatedName("ag.bl")
    public static int field854 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.k(Ljava/awt/Component;Lgh;Lgh;ZII)V")
    public static void method746(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field846) {
            field835 = arg4;
            class220.method3756();
            byte[] var5 = arg1.method3133("title.jpg", "");
            Statics.field2210 = new class225(var5, arg0);
            Statics.field2033 = Statics.field2210.method3856();
            if ((client.field481 & 0x20000000) == 0) {
                Statics.field12 = class226.method3003(arg2, "logo", "");
            } else {
                Statics.field12 = class226.method3003(arg2, "logo_deadman_mode", "");
            }
            Statics.field822 = class226.method3003(arg2, "titlebox", "");
            Statics.field821 = class226.method3003(arg2, "titlebutton", "");
            Statics.field824 = class226.method1619(arg2, "runes", "");
            Statics.field825 = class226.method1619(arg2, "title_mute", "");
            Statics.field1080 = class226.method3003(arg2, "options_radio_buttons,0", "");
            Statics.field2678 = class226.method3003(arg2, "options_radio_buttons,2", "");
            Statics.field48 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field48[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field48[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field48[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field48[var9 + 192] = 16777215;
            }
            Statics.field3072 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field3072[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field3072[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field3072[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3072[var13 + 192] = 16777215;
            }
            Statics.field830 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field830[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field830[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field830[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field830[var17 + 192] = 16777215;
            }
            Statics.field829 = new int[256];
            Statics.field1084 = new int[32768];
            Statics.field1819 = new int[32768];
            method1825((class223) null);
            Statics.field848 = new int[32768];
            Statics.field834 = new int[32768];
            if (arg3) {
                field841 = "";
                field845 = "";
            }
            Statics.field28 = 0;
            Statics.field970 = "";
            field849 = true;
            field823 = false;
            if (Statics.field1457.field684) {
                class139.method1852(2);
            } else {
                class139.method1329(2, Statics.field924, "scape main", "", 255, false);
            }
            class186.method1788(false);
            Statics.field846 = true;
            field847 = (Statics.field124 - client.field538) / 2;
            field827 = field847 + 202;
            Statics.field2210.method3893(field847, 0);
            Statics.field2033.method3893(field847 + 382, 0);
            Statics.field12.method3829(field847 + 382 - Statics.field12.field3191 / 2, 18);
        } else if (arg4 == 4) {
            field835 = 4;
        }
    }

    @ObfuscatedName("ay.y(Ldr;B)V")
    public static void method748(class114 arg0) {
        if (!field823) {
            if ((class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4) && class116.field1801 >= field847 + 765 - 50 && class116.field1808 >= 453) {
                Statics.field1457.field684 = !Statics.field1457.field684;
                class31.method40();
                if (Statics.field1457.field684) {
                    class139.method1616();
                } else {
                    class185 var6 = Statics.field924;
                    int var7 = var6.method3076("scape main");
                    int var8 = var6.method3077(var7, "");
                    class139.method2715(var6, var7, var8, 255, false);
                }
            }
            if (client.field308 != 5) {
                field837++;
                if (client.field308 == 10 || client.field308 == 11) {
                    if (client.field286 == 0) {
                        if (class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4) {
                            int var9 = field847 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1801 >= var9 && class116.field1801 <= var9 + var11 && class116.field1808 >= var10 && class116.field1808 <= var10 + var12) {
                                method2959();
                                return;
                            }
                        }
                        if (Statics.field674 != null) {
                            method2959();
                        }
                    }
                    int var13 = class116.field1805;
                    int var14 = class116.field1801;
                    int var15 = class116.field1808;
                    if (!Statics.field1810 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field835 == 0) {
                        boolean var16 = false;
                        while (class106.method3605()) {
                            if (Statics.field894 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field827 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            label739: {
                                String var19 = client.method97("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var19));
                                        break label739;
                                    } catch (Exception var50) {
                                    }
                                }
                                if (class115.field1786.startsWith("win")) {
                                    class115.method170(var19, 0, "openjs");
                                } else if (class115.field1786.startsWith("mac")) {
                                    class115.method170(var19, 1, "openjs");
                                } else {
                                    class115.method170(var19, 2, "openjs");
                                }
                            }
                        }
                        int var21 = field827 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field481 & 0x2000000) != 0) {
                                field820 = "";
                                field843 = class174.field2435;
                                field844 = class174.field2601;
                                field833 = class174.field2565;
                                field835 = 1;
                                field842 = 0;
                            } else if ((client.field481 & 0x4) != 0) {
                                if ((client.field481 & 0x400) == 0) {
                                    field843 = class174.field2554;
                                    field844 = class174.field2555;
                                    field833 = class174.field2556;
                                } else {
                                    field843 = class174.field2560;
                                    field844 = class174.field2359;
                                    field833 = class174.field2562;
                                }
                                field820 = class174.field2553;
                                field835 = 1;
                                field842 = 0;
                            } else if ((client.field481 & 0x400) == 0) {
                                field843 = class174.field2550;
                                field844 = class174.field2523;
                                field833 = class174.field2552;
                                field835 = 2;
                                field842 = 0;
                            } else {
                                field843 = class174.field2557;
                                field844 = class174.field2480;
                                field833 = class174.field2559;
                                field820 = class174.field2553;
                                field835 = 1;
                                field842 = 0;
                            }
                        }
                    } else if (field835 == 1) {
                        while (class106.method3605()) {
                            if (Statics.field894 == 84) {
                                field843 = class174.field2550;
                                field844 = class174.field2523;
                                field833 = class174.field2552;
                                field835 = 2;
                                field842 = 0;
                            } else if (Statics.field894 == 13) {
                                field835 = 0;
                            }
                        }
                        int var22 = field827 + 180 - 80;
                        short var23 = 321;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field843 = class174.field2550;
                            field844 = class174.field2523;
                            field833 = class174.field2552;
                            field835 = 2;
                            field842 = 0;
                        }
                        int var24 = field827 + 180 + 80;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                            field835 = 0;
                        }
                    } else if (field835 == 2) {
                        short var25 = 231;
                        int var51 = var25 + 30;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field842 = 0;
                        }
                        var51 += 15;
                        if (var13 == 1 && var15 >= var51 - 15 && var15 < var51) {
                            field842 = 1;
                        }
                        var51 += 15;
                        short var26 = 361;
                        if (var13 == 1 && var15 >= var26 - 15 && var15 < var26) {
                            method2568(class174.field2588, class174.field2590, class174.field2490);
                            field835 = 5;
                            return;
                        }
                        int var27 = field827 + 180 - 80;
                        short var28 = 321;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field841 = field841.trim();
                            if (field841.length() == 0) {
                                method2568(class174.field2456, class174.field2457, class174.field2458);
                                return;
                            }
                            if (field845.length() == 0) {
                                method2568(class174.field2342, class174.field2460, class174.field2461);
                                return;
                            }
                            method2568(class174.field2568, class174.field2569, class174.field2570);
                            field855 = Statics.field1457.field689.containsKey(class208.method1475(field841)) ? class98.field1629 : class98.field1625;
                            client.method168(20);
                            return;
                        }
                        int var29 = field827 + 180 + 80;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var28 - 20 && var15 <= var28 + 20) {
                            field835 = 0;
                            field841 = "";
                            field845 = "";
                            Statics.field28 = 0;
                            Statics.field970 = "";
                            field849 = true;
                        }
                        while (true) {
                            while (class106.method3605()) {
                                boolean var30 = false;
                                for (int var31 = 0; var31 < field851.length(); var31++) {
                                    if (Statics.field274 == field851.charAt(var31)) {
                                        var30 = true;
                                        break;
                                    }
                                }
                                if (Statics.field894 == 13) {
                                    field835 = 0;
                                    field841 = "";
                                    field845 = "";
                                    Statics.field28 = 0;
                                    Statics.field970 = "";
                                    field849 = true;
                                } else if (field842 == 0) {
                                    if (Statics.field894 == 85 && field841.length() > 0) {
                                        field841 = field841.substring(0, field841.length() - 1);
                                    }
                                    if (Statics.field894 == 84 || Statics.field894 == 80) {
                                        field842 = 1;
                                    }
                                    if (var30 && field841.length() < 320) {
                                        field841 = field841 + Statics.field274;
                                    }
                                } else if (field842 == 1) {
                                    if (Statics.field894 == 85 && field845.length() > 0) {
                                        field845 = field845.substring(0, field845.length() - 1);
                                    }
                                    if (Statics.field894 == 84 || Statics.field894 == 80) {
                                        field842 = 0;
                                    }
                                    if (Statics.field894 == 84) {
                                        field841 = field841.trim();
                                        if (field841.length() == 0) {
                                            method2568(class174.field2456, class174.field2457, class174.field2458);
                                            return;
                                        }
                                        if (field845.length() == 0) {
                                            method2568(class174.field2342, class174.field2460, class174.field2461);
                                            return;
                                        }
                                        method2568(class174.field2568, class174.field2569, class174.field2570);
                                        field855 = Statics.field1457.field689.containsKey(class208.method1475(field841)) ? class98.field1629 : class98.field1625;
                                        client.method168(20);
                                        return;
                                    }
                                    if (var30 && field845.length() < 20) {
                                        field845 = field845 + Statics.field274;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field835 == 3) {
                        int var32 = field827 + 180;
                        short var33 = 276;
                        if (var13 == 1 && var14 >= var32 - 75 && var14 <= var32 + 75 && var15 >= var33 - 20 && var15 <= var33 + 20) {
                            field843 = class174.field2550;
                            field844 = class174.field2523;
                            field833 = class174.field2552;
                            field835 = 2;
                            field842 = 0;
                        }
                        int var34 = field827 + 180;
                        short var35 = 326;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method2568(class174.field2588, class174.field2590, class174.field2490);
                            field835 = 5;
                            return;
                        }
                    } else if (field835 == 4) {
                        int var36 = field827 + 180 - 80;
                        short var37 = 321;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            Statics.field970.trim();
                            if (Statics.field970.length() != 6) {
                                method2568(class174.field2375, class174.field2376, class174.field2377);
                                return;
                            }
                            Statics.field28 = Integer.parseInt(Statics.field970);
                            Statics.field970 = "";
                            field855 = field849 ? class98.field1624 : class98.field1626;
                            method2568(class174.field2568, class174.field2569, class174.field2570);
                            client.method168(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field827 + 180 - 9 && var14 <= field827 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field849 = !field849;
                        }
                        if (var13 == 1 && var14 >= field827 + 180 - 34 && var14 <= field827 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label754: {
                                String var38 = client.method97("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var38));
                                        break label754;
                                    } catch (Exception var49) {
                                    }
                                }
                                if (class115.field1786.startsWith("win")) {
                                    class115.method170(var38, 0, "openjs");
                                } else if (class115.field1786.startsWith("mac")) {
                                    class115.method170(var38, 1, "openjs");
                                } else {
                                    class115.method170(var38, 2, "openjs");
                                }
                            }
                        }
                        int var40 = field827 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            field835 = 0;
                            field841 = "";
                            field845 = "";
                            Statics.field28 = 0;
                            Statics.field970 = "";
                        }
                        while (class106.method3605()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field852.length(); var42++) {
                                if (Statics.field274 == field852.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field894 == 13) {
                                field835 = 0;
                                field841 = "";
                                field845 = "";
                                Statics.field28 = 0;
                                Statics.field970 = "";
                            } else {
                                if (Statics.field894 == 85 && Statics.field970.length() > 0) {
                                    Statics.field970 = Statics.field970.substring(0, Statics.field970.length() - 1);
                                }
                                if (Statics.field894 == 84) {
                                    Statics.field970.trim();
                                    if (Statics.field970.length() != 6) {
                                        method2568(class174.field2375, class174.field2376, class174.field2377);
                                        return;
                                    }
                                    Statics.field28 = Integer.parseInt(Statics.field970);
                                    Statics.field970 = "";
                                    field855 = field849 ? class98.field1624 : class98.field1626;
                                    method2568(class174.field2568, class174.field2569, class174.field2570);
                                    client.method168(20);
                                    return;
                                }
                                if (var41 && Statics.field970.length() < 6) {
                                    Statics.field970 = Statics.field970 + Statics.field274;
                                }
                            }
                        }
                    } else if (field835 == 5) {
                        int var43 = field827 + 180 - 80;
                        short var44 = 321;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            method2115();
                            return;
                        }
                        int var45 = field827 + 180 + 80;
                        if (var13 == 1 && var14 >= var45 - 75 && var14 <= var45 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            field843 = class174.field2550;
                            field844 = class174.field2523;
                            field833 = class174.field2552;
                            field835 = 2;
                            field842 = 0;
                            field845 = "";
                        }
                        while (class106.method3605()) {
                            boolean var46 = false;
                            for (int var47 = 0; var47 < field851.length(); var47++) {
                                if (Statics.field274 == field851.charAt(var47)) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (Statics.field894 == 13) {
                                field843 = class174.field2550;
                                field844 = class174.field2523;
                                field833 = class174.field2552;
                                field835 = 2;
                                field842 = 0;
                                field845 = "";
                            } else {
                                if (Statics.field894 == 85 && field841.length() > 0) {
                                    field841 = field841.substring(0, field841.length() - 1);
                                }
                                if (Statics.field894 == 84) {
                                    method2115();
                                    return;
                                }
                                if (var46 && field841.length() < 320) {
                                    field841 = field841 + Statics.field274;
                                }
                            }
                        }
                    } else if (field835 == 6) {
                        while (true) {
                            do {
                                if (!class106.method3605()) {
                                    short var48 = 321;
                                    if (var13 == 1 && var15 >= var48 - 20 && var15 <= var48 + 20) {
                                        field843 = class174.field2550;
                                        field844 = class174.field2523;
                                        field833 = class174.field2552;
                                        field835 = 2;
                                        field842 = 0;
                                        field845 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field894 != 84 && Statics.field894 != 13);
                            field843 = class174.field2550;
                            field844 = class174.field2523;
                            field833 = class174.field2552;
                            field835 = 2;
                            field842 = 0;
                            field845 = "";
                        }
                    }
                }
            }
        } else if (class116.field1805 == 1 || !Statics.field1810 && class116.field1805 == 4) {
            int var1 = field847 + 280;
            if (class116.field1801 >= var1 && class116.field1801 <= var1 + 14 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                class30.method3725(0, 0);
            } else if (class116.field1801 >= var1 + 15 && class116.field1801 <= var1 + 80 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                class30.method3725(0, 1);
            } else {
                int var2 = field847 + 390;
                if (class116.field1801 >= var2 && class116.field1801 <= var2 + 14 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                    class30.method3725(1, 0);
                } else if (class116.field1801 >= var2 + 15 && class116.field1801 <= var2 + 80 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                    class30.method3725(1, 1);
                } else {
                    int var3 = field847 + 500;
                    if (class116.field1801 >= var3 && class116.field1801 <= var3 + 14 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                        class30.method3725(2, 0);
                    } else if (class116.field1801 >= var3 + 15 && class116.field1801 <= var3 + 80 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                        class30.method3725(2, 1);
                    } else {
                        int var4 = field847 + 610;
                        if (class116.field1801 >= var4 && class116.field1801 <= var4 + 14 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                            class30.method3725(3, 0);
                        } else if (class116.field1801 >= var4 + 15 && class116.field1801 <= var4 + 80 && class116.field1808 >= 4 && class116.field1808 <= 18) {
                            class30.method3725(3, 1);
                        } else if (class116.field1801 >= field847 + 708 && class116.field1808 >= 4 && class116.field1801 <= field847 + 708 + 50 && class116.field1808 <= 20) {
                            field823 = false;
                            Statics.field2210.method3893(field847, 0);
                            Statics.field2033.method3893(field847 + 382, 0);
                            Statics.field12.method3829(field847 + 382 - Statics.field12.field3191 / 2, 18);
                        } else if (field854 != -1) {
                            class30 var5 = Statics.field185[field854];
                            method868(var5);
                            field823 = false;
                            Statics.field2210.method3893(field847, 0);
                            Statics.field2033.method3893(field847 + 382, 0);
                            Statics.field12.method3829(field847 + 382 - Statics.field12.field3191 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.o(B)V")
    public static void method2115() {
        field841 = field841.trim();
        if (field841.length() == 0) {
            method2568(class174.field2588, class174.field2590, class174.field2490);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method97("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2258, var4.field2267, 1000 - var4.field2267);
                if (var5 == -1) {
                    var4.field2267 = 0;
                    long var8 = var4.method2738();
                    var6 = var8;
                    break;
                }
                var4.field2267 += var5;
                if (var4.field2267 >= 1000) {
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
            String var14 = field841;
            Random var15 = new Random();
            class161 var16 = new class161(128);
            class161 var17 = new class161(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2718(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2863(var15.nextInt());
            }
            var16.method2863(var18[0]);
            var16.method2863(var18[1]);
            var16.method2723(var6);
            var16.method2723(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2863(var15.nextInt());
            }
            var16.method2910(class37.field771, class37.field768);
            var17.method2718(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2863(var15.nextInt());
            }
            var17.method2723(var15.nextLong());
            var17.method2722(var15.nextLong());
            class105.method874(var17);
            var17.method2723(var15.nextLong());
            var17.method2910(class37.field771, class37.field768);
            int var22 = class161.method1885(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class161 var23 = new class161(var22);
            var23.method2903(var14);
            var23.field2267 = var22;
            var23.method2846(var18);
            class161 var24 = new class161(var23.field2267 + var17.field2267 + var16.field2267 + 5);
            var24.method2718(2);
            var24.method2718(var16.field2267);
            var24.method2727(var16.field2258, 0, var16.field2267);
            var24.method2718(var17.field2267);
            var24.method2727(var17.field2258, 0, var17.field2267);
            var24.method2900(var23.field2267);
            var24.method2727(var23.field2258, 0, var23.field2267);
            String var25 = class207.method197(var24.field2258);
            byte var32;
            try {
                URL var26 = new URL(client.method97("services", false) + "m=accountappeal/login.ws");
                URLConnection var27 = var26.openConnection();
                var27.setDoInput(true);
                var27.setDoOutput(true);
                var27.setConnectTimeout(5000);
                OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
                var28.write("data2=" + class232.method263(var25) + "&dest=" + class232.method263("passwordchoice.ws"));
                var28.flush();
                InputStream var29 = var27.getInputStream();
                class161 var30 = new class161(new byte[1000]);
                while (true) {
                    int var31 = var29.read(var30.field2258, var30.field2267, 1000 - var30.field2267);
                    if (var31 == -1) {
                        var28.close();
                        var29.close();
                        String var33 = new String(var30.field2258);
                        if (var33.startsWith("OFFLINE")) {
                            var32 = 4;
                        } else if (var33.startsWith("WRONG")) {
                            var32 = 7;
                        } else if (var33.startsWith("RELOAD")) {
                            var32 = 3;
                        } else if (var33.startsWith("Not permitted for social network accounts.")) {
                            var32 = 6;
                        } else {
                            var30.method2750(var18);
                            while (var30.field2267 > 0 && var30.field2258[var30.field2267 - 1] == 0) {
                                var30.field2267--;
                            }
                            String var34 = new String(var30.field2258, 0, var30.field2267);
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
                                    if (class115.field1786.startsWith("win")) {
                                        class115.method170(var34, 0, "openjs");
                                    } else if (class115.field1786.startsWith("mac")) {
                                        class115.method170(var34, 1, "openjs");
                                    } else {
                                        class115.method170(var34, 2, "openjs");
                                    }
                                }
                                var32 = 2;
                            } else {
                                var32 = 5;
                            }
                        }
                        break;
                    }
                    var30.field2267 += var31;
                    if (var30.field2267 >= 1000) {
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
                method2568(class174.field2347, class174.field2475, class174.field2541);
                field835 = 6;
                break;
            case 3:
                method2568(class174.field2381, class174.field2596, class174.field2505);
                break;
            case 4:
                method2568(class174.field2598, class174.field2599, class174.field2362);
                break;
            case 5:
                method2568(class174.field2436, class174.field2602, class174.field2498);
                break;
            case 6:
                method2568(class174.field2542, class174.field2605, class174.field2606);
                break;
            case 7:
                method2568(class174.field2607, class174.field2393, class174.field2609);
        }
    }

    @ObfuscatedName("aw.r(Lhm;Lhm;Lhm;ZB)V")
    public static void method646(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field847 = (Statics.field124 - client.field538) / 2;
            field827 = field847 + 202;
        }
        if (field823) {
            if (Statics.field3252 == null) {
                Statics.field3252 = class226.method623(Statics.field148, "sl_back", "");
            }
            if (Statics.field2856 == null) {
                Statics.field2856 = class226.method1619(Statics.field148, "sl_flags", "");
            }
            if (Statics.field1053 == null) {
                Statics.field1053 = class226.method1619(Statics.field148, "sl_arrows", "");
            }
            if (Statics.field1679 == null) {
                Statics.field1679 = class226.method1619(Statics.field148, "sl_stars", "");
            }
            class220.method3783(field847, 23, 765, 480, 0);
            class220.method3773(field847, 0, 125, 23, 12425273, 9135624);
            class220.method3773(field847 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3657(class174.field2529, field847 + 62, 15, 0, -1);
            if (Statics.field1679 != null) {
                Statics.field1679[1].method3829(field847 + 140, 1);
                arg1.method3699(class174.field2611, field847 + 152, 10, 16777215, -1);
                Statics.field1679[0].method3829(field847 + 140, 12);
                arg1.method3699(class174.field2612, field847 + 152, 21, 16777215, -1);
            }
            if (Statics.field1053 != null) {
                int var4 = field847 + 280;
                if (class30.field670[0] == 0 && class30.field675[0] == 0) {
                    Statics.field1053[2].method3829(var4, 4);
                } else {
                    Statics.field1053[0].method3829(var4, 4);
                }
                if (class30.field670[0] == 0 && class30.field675[0] == 1) {
                    Statics.field1053[3].method3829(var4 + 15, 4);
                } else {
                    Statics.field1053[1].method3829(var4 + 15, 4);
                }
                arg0.method3699(class174.field2613, var4 + 32, 17, 16777215, -1);
                int var5 = field847 + 390;
                if (class30.field670[0] == 1 && class30.field675[0] == 0) {
                    Statics.field1053[2].method3829(var5, 4);
                } else {
                    Statics.field1053[0].method3829(var5, 4);
                }
                if (class30.field670[0] == 1 && class30.field675[0] == 1) {
                    Statics.field1053[3].method3829(var5 + 15, 4);
                } else {
                    Statics.field1053[1].method3829(var5 + 15, 4);
                }
                arg0.method3699(class174.field2614, var5 + 32, 17, 16777215, -1);
                int var6 = field847 + 500;
                if (class30.field670[0] == 2 && class30.field675[0] == 0) {
                    Statics.field1053[2].method3829(var6, 4);
                } else {
                    Statics.field1053[0].method3829(var6, 4);
                }
                if (class30.field670[0] == 2 && class30.field675[0] == 1) {
                    Statics.field1053[3].method3829(var6 + 15, 4);
                } else {
                    Statics.field1053[1].method3829(var6 + 15, 4);
                }
                arg0.method3699(class174.field2615, var6 + 32, 17, 16777215, -1);
                int var7 = field847 + 610;
                if (class30.field670[0] == 3 && class30.field675[0] == 0) {
                    Statics.field1053[2].method3829(var7, 4);
                } else {
                    Statics.field1053[0].method3829(var7, 4);
                }
                if (class30.field670[0] == 3 && class30.field675[0] == 1) {
                    Statics.field1053[3].method3829(var7 + 15, 4);
                } else {
                    Statics.field1053[1].method3829(var7 + 15, 4);
                }
                arg0.method3699(class174.field2616, var7 + 32, 17, 16777215, -1);
            }
            class220.method3783(field847 + 708, 4, 50, 16, 0);
            arg1.method3657(class174.field2578, field847 + 708 + 25, 16, 16777215, -1);
            field854 = -1;
            if (Statics.field3252 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field678) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field678) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field678) {
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
                int var19 = field847 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class30.field678; var22++) {
                    class30 var23 = Statics.field185[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field677);
                    if (var23.field677 == -1) {
                        var25 = class174.field2419;
                        var24 = false;
                    } else if (var23.field677 > 1980) {
                        var25 = class174.field2449;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method654()) {
                        if (var23.method649()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method658()) {
                        var26 = 16711680;
                        if (var23.method649()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method651()) {
                        if (var23.method649()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method649()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1800 >= var19 && class116.field1795 >= var18 && class116.field1800 < var8 + var19 && class116.field1795 < var9 + var18 && var24) {
                        field854 = var22;
                        Statics.field3252[var27].method3944(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3252[var27].method3893(var19, var18);
                    }
                    if (Statics.field2856 != null) {
                        Statics.field2856[(var23.method649() ? 8 : 0) + var23.field680].method3829(var19 + 29, var18);
                    }
                    arg0.method3657(Integer.toString(var23.field672), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3657(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3667(Statics.field185[field854].field679) + 6;
                    int var29 = arg1.field3087 + 8;
                    class220.method3783(class116.field1800 - var28 / 2, class116.field1795 + 20 + 5, var28, var29, 16777120);
                    class220.method3764(class116.field1800 - var28 / 2, class116.field1795 + 20 + 5, var28, var29, 0);
                    arg1.method3657(Statics.field185[field854].field679, class116.field1800, class116.field1795 + 20 + 5 + arg1.field3087 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field729.getGraphics();
                Statics.field144.method3739(var30, 0, 0);
            } catch (Exception var157) {
                Statics.field729.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2210.method3893(field847, 0);
            Statics.field2033.method3893(field847 + 382, 0);
            Statics.field12.method3829(field847 + 382 - Statics.field12.field3191 / 2, 18);
        }
        if (client.field308 == 0 || client.field308 == 5) {
            byte var32 = 20;
            arg0.method3657(class174.field2437, field827 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3764(field827 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3764(field827 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3783(field827 + 180 - 150, var33 + 2, field850 * 3, 30, 9179409);
            class220.method3783(field850 * 3 + (field827 + 180 - 150), var33 + 2, 300 - field850 * 3, 30, 0);
            arg0.method3657(field840, field827 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field308 == 20) {
            Statics.field822.method3829(field827 + 180 - Statics.field822.field3191 / 2, 271 - Statics.field822.field3192 / 2);
            short var34 = 211;
            arg0.method3657(field843, field827 + 180, var34, 16776960, 0);
            int var159 = var34 + 15;
            arg0.method3657(field844, field827 + 180, var159, 16776960, 0);
            int var160 = var159 + 15;
            arg0.method3657(field833, field827 + 180, var160, 16776960, 0);
            int var161 = var160 + 15;
            int var162 = var161 + 10;
            if (field835 != 4) {
                arg0.method3699(class174.field2571, field827 + 180 - 110, var162, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field841; arg0.method3667(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3699(class210.method3716(var36), field827 + 180 - 70, var162, 16777215, 0);
                var159 = var162 + 15;
                String var38 = class174.field2572;
                String var39 = field845;
                int var40 = var39.length();
                char[] var41 = new char[var40];
                for (int var42 = 0; var42 < var40; var42++) {
                    var41[var42] = '*';
                }
                String var43 = new String(var41);
                arg0.method3699(var38 + var43, field827 + 180 - 108, var159, 16777215, 0);
                var159 += 15;
            }
        }
        if (client.field308 == 10 || client.field308 == 11) {
            Statics.field822.method3829(field827, 171);
            if (field835 == 0) {
                short var45 = 251;
                arg0.method3657(class174.field2574, field827 + 180, var45, 16776960, 0);
                int var163 = var45 + 30;
                int var46 = field827 + 180 - 80;
                short var47 = 291;
                Statics.field821.method3829(var46 - 73, var47 - 20);
                arg0.method3658(class174.field2438, var46 - 73, var47 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var48 = field827 + 180 + 80;
                Statics.field821.method3829(var48 - 73, var47 - 20);
                arg0.method3658(class174.field2576, var48 - 73, var47 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field835 == 1) {
                arg0.method3657(field820, field827 + 180, 211, 16776960, 0);
                short var49 = 236;
                arg0.method3657(field843, field827 + 180, var49, 16777215, 0);
                int var164 = var49 + 15;
                arg0.method3657(field844, field827 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                arg0.method3657(field833, field827 + 180, var165, 16777215, 0);
                int var166 = var165 + 15;
                int var50 = field827 + 180 - 80;
                short var51 = 321;
                Statics.field821.method3829(var50 - 73, var51 - 20);
                arg0.method3657(class174.field2388, var50, var51 + 5, 16777215, 0);
                int var52 = field827 + 180 + 80;
                Statics.field821.method3829(var52 - 73, var51 - 20);
                arg0.method3657(class174.field2578, var52, var51 + 5, 16777215, 0);
            } else if (field835 == 2) {
                short var53 = 211;
                arg0.method3657(field843, field827 + 180, var53, 16776960, 0);
                int var167 = var53 + 15;
                arg0.method3657(field844, field827 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg0.method3657(field833, field827 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var170 = var169 + 10;
                arg0.method3699(class174.field2571, field827 + 180 - 110, var170, 16777215, 0);
                short var54 = 200;
                String var55;
                for (var55 = field841; arg0.method3667(var55) > var54; var55 = var55.substring(1)) {
                }
                arg0.method3699(class210.method3716(var55) + (field842 == 0 & client.field454 % 40 < 20 ? class38.method2958(16776960) + class38.field778 : ""), field827 + 180 - 70, var170, 16777215, 0);
                var167 = var170 + 15;
                String var57 = class174.field2572;
                String var58 = field845;
                int var59 = var58.length();
                char[] var60 = new char[var59];
                for (int var61 = 0; var61 < var59; var61++) {
                    var60[var61] = '*';
                }
                String var62 = new String(var60);
                arg0.method3699(var57 + var62 + (field842 == 1 & client.field454 % 40 < 20 ? class38.method2958(16776960) + class38.field778 : ""), field827 + 180 - 108, var167, 16777215, 0);
                var167 += 15;
                int var64 = field827 + 180 - 80;
                short var65 = 321;
                Statics.field821.method3829(var64 - 73, var65 - 20);
                arg0.method3657(class174.field2548, var64, var65 + 5, 16777215, 0);
                int var66 = field827 + 180 + 80;
                Statics.field821.method3829(var66 - 73, var65 - 20);
                arg0.method3657(class174.field2578, var66, var65 + 5, 16777215, 0);
                short var67 = 357;
                arg1.method3657(class174.field2443, field827 + 180, var67, 16776960, 0);
            } else if (field835 == 3) {
                short var68 = 201;
                arg0.method3657(class174.field2579, field827 + 180, var68, 16776960, 0);
                int var171 = var68 + 20;
                arg1.method3657(class174.field2502, field827 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg1.method3657(class174.field2581, field827 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var69 = field827 + 180;
                short var70 = 276;
                Statics.field821.method3829(var69 - 73, var70 - 20);
                arg2.method3657(class174.field2582, var69, var70 + 5, 16777215, 0);
                int var71 = field827 + 180;
                short var72 = 326;
                Statics.field821.method3829(var71 - 73, var72 - 20);
                arg2.method3657(class174.field2494, var71, var72 + 5, 16777215, 0);
            } else if (field835 == 4) {
                arg0.method3657(class174.field2566, field827 + 180, 211, 16776960, 0);
                short var73 = 236;
                arg0.method3657(field843, field827 + 180, var73, 16777215, 0);
                int var174 = var73 + 15;
                arg0.method3657(field844, field827 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                arg0.method3657(field833, field827 + 180, var175, 16777215, 0);
                int var176 = var175 + 15;
                String var75 = class174.field2573;
                String var76 = Statics.field970;
                int var77 = var76.length();
                char[] var78 = new char[var77];
                for (int var79 = 0; var79 < var77; var79++) {
                    var78[var79] = '*';
                }
                String var80 = new String(var78);
                arg0.method3699(var75 + var80 + (client.field454 % 40 < 20 ? class38.method2958(16776960) + class38.field778 : ""), field827 + 180 - 108, var176, 16777215, 0);
                var174 = var176 - 8;
                arg0.method3699(class174.field2358, field827 + 180 - 9, var174, 16776960, 0);
                var174 += 15;
                arg0.method3699(class174.field2591, field827 + 180 - 9, var174, 16776960, 0);
                int var82 = field827 + 180 - 9 + arg0.method3667(class174.field2591) + 15;
                int var83 = var174 - arg0.field3087;
                class223 var84;
                if (field849) {
                    var84 = Statics.field2678;
                } else {
                    var84 = Statics.field1080;
                }
                var84.method3829(var82, var83);
                var174 += 15;
                int var85 = field827 + 180 - 80;
                short var86 = 321;
                Statics.field821.method3829(var85 - 73, var86 - 20);
                arg0.method3657(class174.field2388, var85, var86 + 5, 16777215, 0);
                int var87 = field827 + 180 + 80;
                Statics.field821.method3829(var87 - 73, var86 - 20);
                arg0.method3657(class174.field2578, var87, var86 + 5, 16777215, 0);
                arg1.method3657(class174.field2567, field827 + 180, var86 + 36, 255, 0);
            } else if (field835 == 5) {
                arg0.method3657(class174.field2585, field827 + 180, 201, 16776960, 0);
                short var88 = 221;
                arg2.method3657(field843, field827 + 180, var88, 16776960, 0);
                int var177 = var88 + 15;
                arg2.method3657(field844, field827 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg2.method3657(field833, field827 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var180 = var179 + 14;
                arg0.method3699(class174.field2586, field827 + 180 - 145, var180, 16777215, 0);
                short var89 = 174;
                String var90;
                for (var90 = field841; arg0.method3667(var90) > var89; var90 = var90.substring(1)) {
                }
                arg0.method3699(class210.method3716(var90) + (client.field454 % 40 < 20 ? class38.method2958(16776960) + class38.field778 : ""), field827 + 180 - 34, var180, 16777215, 0);
                var177 = var180 + 15;
                int var91 = field827 + 180 - 80;
                short var92 = 321;
                Statics.field821.method3829(var91 - 73, var92 - 20);
                arg0.method3657(class174.field2587, var91, var92 + 5, 16777215, 0);
                int var93 = field827 + 180 + 80;
                Statics.field821.method3829(var93 - 73, var92 - 20);
                arg0.method3657(class174.field2397, var93, var92 + 5, 16777215, 0);
            } else if (field835 == 6) {
                short var94 = 211;
                arg0.method3657(field843, field827 + 180, var94, 16776960, 0);
                int var181 = var94 + 15;
                arg0.method3657(field844, field827 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg0.method3657(field833, field827 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                int var95 = field827 + 180;
                short var96 = 321;
                Statics.field821.method3829(var95 - 73, var96 - 20);
                arg0.method3657(class174.field2397, var95, var96 + 5, 16777215, 0);
            }
        }
        if (field837 > 0) {
            int var97 = field837;
            short var98 = 256;
            field826 += var97 * 128;
            if (field826 > Statics.field1084.length) {
                field826 -= Statics.field1084.length;
                int var99 = (int) (Math.random() * 12.0D);
                method1825(Statics.field824[var99]);
            }
            int var100 = 0;
            int var101 = var97 * 128;
            int var102 = (var98 - var97) * 128;
            for (int var103 = 0; var103 < var102; var103++) {
                int var104 = Statics.field848[var100 + var101] - Statics.field1084[field826 + var100 & Statics.field1084.length - 1] * var97 / 6;
                if (var104 < 0) {
                    var104 = 0;
                }
                Statics.field848[var100++] = var104;
            }
            for (int var105 = var98 - var97; var105 < var98; var105++) {
                int var106 = var105 * 128;
                for (int var107 = 0; var107 < 128; var107++) {
                    int var108 = (int) (Math.random() * 100.0D);
                    if (var108 < 50 && var107 > 10 && var107 < 118) {
                        Statics.field848[var106 + var107] = 255;
                    } else {
                        Statics.field848[var106 + var107] = 0;
                    }
                }
            }
            if (field831 > 0) {
                field831 -= var97 * 4;
            }
            if (field832 > 0) {
                field832 -= var97 * 4;
            }
            if (field831 == 0 && field832 == 0) {
                int var109 = (int) (Math.random() * (double) (2000 / var97));
                if (var109 == 0) {
                    field831 = 1024;
                }
                if (var109 == 1) {
                    field832 = 1024;
                }
            }
            for (int var110 = 0; var110 < var98 - var97; var110++) {
                field828[var110] = field828[var97 + var110];
            }
            for (int var111 = var98 - var97; var111 < var98; var111++) {
                field828[var111] = (int) (Math.sin((double) field838 / 14.0D) * 16.0D + Math.sin((double) field838 / 15.0D) * 14.0D + Math.sin((double) field838 / 16.0D) * 12.0D);
                field838++;
            }
            field836 += var97 * -1879347109;
            int var112 = ((client.field454 & 0x1) + var97) / 2;
            if (var112 > 0) {
                for (int var113 = 0; var113 < field836 * -1746342292; var113++) {
                    int var114 = (int) (Math.random() * 124.0D) + 2;
                    int var115 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field848[(var115 << 7) + var114] = 192;
                }
                field836 = 0;
                int var116 = 0;
                label534: while (true) {
                    if (var116 >= var98) {
                        int var120 = 0;
                        while (true) {
                            if (var120 >= 128) {
                                break label534;
                            }
                            int var121 = 0;
                            for (int var122 = -var112; var122 < var98; var122++) {
                                int var123 = var122 * 128;
                                if (var112 + var122 < var98) {
                                    var121 += Statics.field834[var112 * 128 + var120 + var123];
                                }
                                if (var122 - (var112 + 1) >= 0) {
                                    var121 -= Statics.field834[var120 + var123 - (var112 + 1) * 128];
                                }
                                if (var122 >= 0) {
                                    Statics.field848[var120 + var123] = var121 / (var112 * 2 + 1);
                                }
                            }
                            var120++;
                        }
                    }
                    int var117 = 0;
                    int var118 = var116 * 128;
                    for (int var119 = -var112; var119 < 128; var119++) {
                        if (var112 + var119 < 128) {
                            var117 += Statics.field848[var118 + var119 + var112];
                        }
                        if (var119 - (var112 + 1) >= 0) {
                            var117 -= Statics.field848[var118 + var119 - (var112 + 1)];
                        }
                        if (var119 >= 0) {
                            Statics.field834[var118 + var119] = var117 / (var112 * 2 + 1);
                        }
                    }
                    var116++;
                }
            }
            field837 = 0;
        }
        short var124 = 256;
        if (field831 > 0) {
            for (int var125 = 0; var125 < 256; var125++) {
                if (field831 > 768) {
                    Statics.field829[var125] = Statics.method756(Statics.field48[var125], Statics.field3072[var125], 1024 - field831);
                } else if (field831 > 256) {
                    Statics.field829[var125] = Statics.field3072[var125];
                } else {
                    Statics.field829[var125] = Statics.method756(Statics.field3072[var125], Statics.field48[var125], 256 - field831);
                }
            }
        } else if (field832 > 0) {
            for (int var126 = 0; var126 < 256; var126++) {
                if (field832 > 768) {
                    Statics.field829[var126] = Statics.method756(Statics.field48[var126], Statics.field830[var126], 1024 - field832);
                } else if (field832 > 256) {
                    Statics.field829[var126] = Statics.field830[var126];
                } else {
                    Statics.field829[var126] = Statics.method756(Statics.field830[var126], Statics.field48[var126], 256 - field832);
                }
            }
        } else {
            for (int var127 = 0; var127 < 256; var127++) {
                Statics.field829[var127] = Statics.field48[var127];
            }
        }
        class220.method3752(field847, 9, field847 + 128, var124 + 7);
        Statics.field2210.method3893(field847, 0);
        class220.method3751();
        int var128 = 0;
        int var129 = field847 + Statics.field144.field3178 * 9;
        for (int var130 = 1; var130 < var124 - 1; var130++) {
            int var131 = (var124 - var130) * field828[var130] / var124;
            int var132 = var131 + 22;
            if (var132 < 0) {
                var132 = 0;
            }
            var128 += var132;
            for (int var133 = var132; var133 < 128; var133++) {
                int var134 = Statics.field848[var128++];
                if (var134 == 0) {
                    var129++;
                } else {
                    int var136 = 256 - var134;
                    int var137 = Statics.field829[var134];
                    int var138 = Statics.field144.field3180[var129];
                    Statics.field144.field3180[var129++] = ((var137 & 0xFF00) * var134 + (var138 & 0xFF00) * var136 & 0xFF0000) + ((var137 & 0xFF00FF) * var134 + (var138 & 0xFF00FF) * var136 & 0xFF00FF00) >> 8;
                }
            }
            var129 += Statics.field144.field3178 + var132 - 128;
        }
        class220.method3752(field847 + 765 - 128, 9, field847 + 765, var124 + 7);
        Statics.field2033.method3893(field847 + 382, 0);
        class220.method3751();
        int var139 = 0;
        int var140 = field847 + Statics.field144.field3178 * 9 + 24 + 637;
        for (int var141 = 1; var141 < var124 - 1; var141++) {
            int var142 = (var124 - var141) * field828[var141] / var124;
            int var143 = 103 - var142;
            int var144 = var140 + var142;
            for (int var145 = 0; var145 < var143; var145++) {
                int var146 = Statics.field848[var139++];
                if (var146 == 0) {
                    var144++;
                } else {
                    int var148 = 256 - var146;
                    int var149 = Statics.field829[var146];
                    int var150 = Statics.field144.field3180[var144];
                    Statics.field144.field3180[var144++] = ((var149 & 0xFF00FF) * var146 + (var150 & 0xFF00FF) * var148 & 0xFF00FF00) + ((var149 & 0xFF00) * var146 + (var150 & 0xFF00) * var148 & 0xFF0000) >> 8;
                }
            }
            var139 += 128 - var143;
            var140 = Statics.field144.field3178 - var143 - var142 + var144;
        }
        Statics.field825[Statics.field1457.field684 ? 1 : 0].method3829(field847 + 765 - 40, 463);
        if (client.field308 > 5 && client.field286 == 0) {
            if (Statics.field71 == null) {
                Statics.field71 = class226.method3003(Statics.field148, "sl_button", "");
            } else {
                int var151 = field847 + 5;
                short var152 = 463;
                byte var153 = 100;
                byte var154 = 35;
                Statics.field71.method3829(var151, var152);
                arg0.method3657(class174.field2503 + " " + client.field329, var153 / 2 + var151, var154 / 2 + var152 - 2, 16777215, 0);
                if (Statics.field674 == null) {
                    arg1.method3657(class174.field2620, var153 / 2 + var151, var154 / 2 + var152 + 12, 16777215, 0);
                } else {
                    arg1.method3657(class174.field2619, var153 / 2 + var151, var154 / 2 + var152 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var155 = Statics.field729.getGraphics();
            Statics.field144.method3739(var155, 0, 0);
        } catch (Exception var158) {
            Statics.field729.repaint();
        }
    }

    @ObfuscatedName("eu.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2568(String arg0, String arg1, String arg2) {
        field843 = arg0;
        field844 = arg1;
        field833 = arg2;
    }

    @ObfuscatedName("cd.j(Lhg;I)V")
    public static final void method1825(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1084.length; var2++) {
            Statics.field1084[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1084[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1819[var8] = (Statics.field1084[var8 - 1] + Statics.field1084[var8 + 1] + Statics.field1084[var8 - 128] + Statics.field1084[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1084;
            Statics.field1084 = Statics.field1819;
            Statics.field1819 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3192; var11++) {
            for (int var12 = 0; var12 < arg0.field3191; var12++) {
                if (arg0.field3196[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3193;
                    int var14 = var11 + 16 + arg0.field3194;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1084[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("al.g(Las;I)V")
    public static void method868(class30 arg0) {
        if (arg0.method649() != client.field284) {
            client.field284 = arg0.method649();
            boolean var1 = arg0.method649();
            if (Statics.field2932 != var1) {
                class199.method695();
                Statics.field2932 = var1;
            }
        }
        Statics.field94 = arg0.field673;
        client.field329 = arg0.field672;
        client.field481 = arg0.field676;
        Statics.field2217 = client.field282 == 0 ? 43594 : arg0.field672 + 40000;
        Statics.field55 = client.field282 == 0 ? 443 : arg0.field672 + 50000;
        Statics.field493 = Statics.field2217;
    }

    @ObfuscatedName("fs.i(I)V")
    public static void method2959() {
        if (class30.method115()) {
            field823 = true;
        }
    }
}

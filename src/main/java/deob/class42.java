package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("aq")
public class class42 {

    @ObfuscatedName("aq.x")
    public static int field847 = 0;

    @ObfuscatedName("aq.j")
    public static int field815 = field847 + 202;

    @ObfuscatedName("aq.k")
    public static int[] field816 = new int[256];

    @ObfuscatedName("aq.w")
    public static int field807 = 0;

    @ObfuscatedName("aq.n")
    public static int field811 = 0;

    @ObfuscatedName("aq.al")
    public static int field822 = 0;

    @ObfuscatedName("aq.an")
    public static int field823 = 0;

    @ObfuscatedName("aq.af")
    public static int field824 = 0;

    @ObfuscatedName("aq.aa")
    public static int field844 = 0;

    @ObfuscatedName("aq.ax")
    public static int field826 = 10;

    @ObfuscatedName("aq.ai")
    public static String field827 = "";

    @ObfuscatedName("aq.ah")
    public static int field821 = 0;

    @ObfuscatedName("aq.av")
    public static String field829 = "";

    @ObfuscatedName("aq.at")
    public static String field830 = "";

    @ObfuscatedName("aq.az")
    public static String field828 = "";

    @ObfuscatedName("aq.ad")
    public static String field832 = "";

    @ObfuscatedName("aq.aw")
    public static String field813 = "";

    @ObfuscatedName("aq.ak")
    public static String field834 = "";

    @ObfuscatedName("aq.aq")
    public static class98 field835 = class98.field1621;

    @ObfuscatedName("aq.ay")
    public static boolean field836 = true;

    @ObfuscatedName("aq.ar")
    public static int field837 = 0;

    @ObfuscatedName("aq.ab")
    public static String field838 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aq.as")
    public static String field839 = "1234567890";

    @ObfuscatedName("aq.ae")
    public static boolean field825 = false;

    @ObfuscatedName("aq.be")
    public static int field842 = -1;

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.u(Lgt;Lgt;B)I")
    public static int method1594(class183 arg0, class183 arg1) {
        int var2 = 0;
        if (arg0.method3079("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3079("logo", "")) {
            var2++;
        }
        if (arg1.method3079("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3079("titlebox", "")) {
            var2++;
        }
        if (arg1.method3079("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3079("runes", "")) {
            var2++;
        }
        if (arg1.method3079("title_mute", "")) {
            var2++;
        }
        if (arg1.method3062("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3062("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3079("sl_back", "");
        arg1.method3079("sl_flags", "");
        arg1.method3079("sl_arrows", "");
        arg1.method3079("sl_stars", "");
        arg1.method3079("sl_button", "");
        return var2;
    }

    @ObfuscatedName("az.x(Ljava/awt/Component;Lgt;Lgt;ZII)V")
    public static void method725(Component arg0, class183 arg1, class183 arg2, boolean arg3, int arg4) {
        if (!Statics.field2174) {
            field821 = arg4;
            class220.method3793();
            byte[] var5 = arg1.method3078("title.jpg", "");
            Statics.field810 = new class225(var5, arg0);
            Statics.field841 = Statics.field810.method3888();
            if ((client.field482 & 0x20000000) == 0) {
                Statics.field3247 = class226.method3491(arg2, "logo", "");
            } else {
                Statics.field3247 = class226.method3491(arg2, "logo_deadman_mode", "");
            }
            Statics.field808 = class226.method3491(arg2, "titlebox", "");
            Statics.field809 = class226.method3491(arg2, "titlebutton", "");
            Statics.field760 = class226.method2801(arg2, "runes", "");
            Statics.field789 = class226.method2801(arg2, "title_mute", "");
            Statics.field812 = class226.method3491(arg2, "options_radio_buttons,0", "");
            Statics.field81 = class226.method3491(arg2, "options_radio_buttons,2", "");
            Statics.field817 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field817[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field817[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field817[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field817[var9 + 192] = 16777215;
            }
            Statics.field818 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field818[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field818[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field818[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field818[var13 + 192] = 16777215;
            }
            Statics.field1301 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1301[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1301[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1301[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1301[var17 + 192] = 16777215;
            }
            Statics.field1200 = new int[256];
            Statics.field1532 = new int[32768];
            Statics.field1628 = new int[32768];
            method594((class223) null);
            Statics.field49 = new int[32768];
            Statics.field814 = new int[32768];
            if (arg3) {
                field813 = "";
                field834 = "";
            }
            Statics.field1748 = 0;
            Statics.field276 = "";
            field836 = true;
            field825 = false;
            if (Statics.field22.field693) {
                class139.field1901 = 1;
                Statics.field1904 = null;
                Statics.field921 = -1;
                Statics.field3 = -1;
                Statics.field1467 = 0;
                Statics.field917 = false;
                Statics.field1905 = 2;
            } else {
                class185 var18 = Statics.field782;
                int var19 = var18.method3076("scape main");
                int var20 = var18.method3077(var19, "");
                class139.method1593(2, var18, var19, var20, 255, false);
            }
            class186.method1596(false);
            Statics.field2174 = true;
            field847 = (Statics.field2 - client.field496 * 765) / 2;
            field815 = field847 + 202;
            Statics.field810.method3885(field847, 0);
            Statics.field841.method3885(field847 + 382, 0);
            Statics.field3247.method3839(field847 + 382 - Statics.field3247.field3196 / 2, 18);
        } else if (arg4 == 4) {
            field821 = 4;
        }
    }

    @ObfuscatedName("m.i(Ldn;I)V")
    public static void method153(class114 arg0) {
        if (!field825) {
            if ((class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4) && class116.field1792 >= field847 + 765 - 50 && class116.field1797 >= 453) {
                Statics.field22.field693 = !Statics.field22.field693;
                class31.method109();
                if (Statics.field22.field693) {
                    class139.method119();
                } else {
                    class185 var6 = Statics.field782;
                    int var7 = var6.method3076("scape main");
                    int var8 = var6.method3077(var7, "");
                    class139.method1900(var6, var7, var8, 255, false);
                }
            }
            if (client.field289 != 5) {
                field824++;
                if (client.field289 == 10 || client.field289 == 11) {
                    if (client.field473 == 0) {
                        if (class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4) {
                            int var9 = field847 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class116.field1792 >= var9 && class116.field1792 <= var9 + var11 && class116.field1797 >= var10 && class116.field1797 <= var10 + var12) {
                                method2875();
                                return;
                            }
                        }
                        if (Statics.field160 != null) {
                            method2875();
                        }
                    }
                    int var13 = class116.field1795;
                    int var14 = class116.field1792;
                    int var15 = class116.field1797;
                    if (!Statics.field1298 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field821 == 0) {
                        int var16 = field815 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            class115.method2808(client.method2916("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var18 = field815 + 180 + 80;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field482 & 0x2000000) != 0) {
                                field829 = "";
                                field830 = class174.field2463;
                                field828 = class174.field2561;
                                field832 = class174.field2562;
                                field821 = 1;
                                field837 = 0;
                            } else if ((client.field482 & 0x4) != 0) {
                                if ((client.field482 & 0x400) == 0) {
                                    field830 = class174.field2551;
                                    field828 = class174.field2552;
                                    field832 = class174.field2467;
                                } else {
                                    field830 = class174.field2447;
                                    field828 = class174.field2352;
                                    field832 = class174.field2377;
                                }
                                field829 = class174.field2550;
                                field821 = 1;
                                field837 = 0;
                            } else if ((client.field482 & 0x400) == 0) {
                                field830 = class174.field2547;
                                field828 = class174.field2465;
                                field832 = class174.field2549;
                                field821 = 2;
                                field837 = 0;
                            } else {
                                field830 = class174.field2554;
                                field828 = class174.field2435;
                                field832 = class174.field2556;
                                field829 = class174.field2550;
                                field821 = 1;
                                field837 = 0;
                            }
                        }
                    } else if (field821 == 1) {
                        while (class106.method3347()) {
                            if (Statics.field2135 == 84) {
                                field830 = class174.field2547;
                                field828 = class174.field2465;
                                field832 = class174.field2549;
                                field821 = 2;
                                field837 = 0;
                            } else if (Statics.field2135 == 13) {
                                field821 = 0;
                            }
                        }
                        int var19 = field815 + 180 - 80;
                        short var20 = 321;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field830 = class174.field2547;
                            field828 = class174.field2465;
                            field832 = class174.field2549;
                            field821 = 2;
                            field837 = 0;
                        }
                        int var21 = field815 + 180 + 80;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var20 - 20 && var15 <= var20 + 20) {
                            field821 = 0;
                        }
                    } else if (field821 == 2) {
                        short var22 = 231;
                        int var45 = var22 + 30;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field837 = 0;
                        }
                        var45 += 15;
                        if (var13 == 1 && var15 >= var45 - 15 && var15 < var45) {
                            field837 = 1;
                        }
                        var45 += 15;
                        short var23 = 361;
                        if (var13 == 1 && var15 >= var23 - 15 && var15 < var23) {
                            method2080(class174.field2586, class174.field2587, class174.field2580);
                            field821 = 5;
                            return;
                        }
                        int var24 = field815 + 180 - 80;
                        short var25 = 321;
                        if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field813 = field813.trim();
                            if (field813.length() == 0) {
                                method2080(class174.field2453, class174.field2343, class174.field2413);
                                return;
                            }
                            if (field834.length() == 0) {
                                method2080(class174.field2456, class174.field2457, class174.field2346);
                                return;
                            }
                            method2080(class174.field2385, class174.field2585, class174.field2565);
                            field835 = Statics.field22.field692.containsKey(class208.method3324(field813)) ? class98.field1620 : class98.field1621;
                            client.method177(20);
                            return;
                        }
                        int var26 = field815 + 180 + 80;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var25 - 20 && var15 <= var25 + 20) {
                            field821 = 0;
                            field813 = "";
                            field834 = "";
                            Statics.field1748 = 0;
                            Statics.field276 = "";
                            field836 = true;
                        }
                        while (true) {
                            while (class106.method3347()) {
                                boolean var27 = false;
                                for (int var28 = 0; var28 < field838.length(); var28++) {
                                    if (Statics.field2632 == field838.charAt(var28)) {
                                        var27 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2135 == 13) {
                                    field821 = 0;
                                    field813 = "";
                                    field834 = "";
                                    Statics.field1748 = 0;
                                    Statics.field276 = "";
                                    field836 = true;
                                } else if (field837 == 0) {
                                    if (Statics.field2135 == 85 && field813.length() > 0) {
                                        field813 = field813.substring(0, field813.length() - 1);
                                    }
                                    if (Statics.field2135 == 84 || Statics.field2135 == 80) {
                                        field837 = 1;
                                    }
                                    if (var27 && field813.length() < 320) {
                                        field813 = field813 + Statics.field2632;
                                    }
                                } else if (field837 == 1) {
                                    if (Statics.field2135 == 85 && field834.length() > 0) {
                                        field834 = field834.substring(0, field834.length() - 1);
                                    }
                                    if (Statics.field2135 == 84 || Statics.field2135 == 80) {
                                        field837 = 0;
                                    }
                                    if (Statics.field2135 == 84) {
                                        field813 = field813.trim();
                                        if (field813.length() == 0) {
                                            method2080(class174.field2453, class174.field2343, class174.field2413);
                                            return;
                                        }
                                        if (field834.length() == 0) {
                                            method2080(class174.field2456, class174.field2457, class174.field2346);
                                            return;
                                        }
                                        method2080(class174.field2385, class174.field2585, class174.field2565);
                                        field835 = Statics.field22.field692.containsKey(class208.method3324(field813)) ? class98.field1620 : class98.field1621;
                                        client.method177(20);
                                        return;
                                    }
                                    if (var27 && field834.length() < 20) {
                                        field834 = field834 + Statics.field2632;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field821 == 3) {
                        int var29 = field815 + 180;
                        short var30 = 276;
                        if (var13 == 1 && var14 >= var29 - 75 && var14 <= var29 + 75 && var15 >= var30 - 20 && var15 <= var30 + 20) {
                            field830 = class174.field2547;
                            field828 = class174.field2465;
                            field832 = class174.field2549;
                            field821 = 2;
                            field837 = 0;
                        }
                        int var31 = field815 + 180;
                        short var32 = 326;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            method2080(class174.field2586, class174.field2587, class174.field2580);
                            field821 = 5;
                            return;
                        }
                    } else if (field821 == 4) {
                        int var33 = field815 + 180 - 80;
                        short var34 = 321;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            Statics.field276.trim();
                            if (Statics.field276.length() != 6) {
                                method2080(class174.field2451, class174.field2448, class174.field2374);
                                return;
                            }
                            Statics.field1748 = Integer.parseInt(Statics.field276);
                            Statics.field276 = "";
                            field835 = field836 ? class98.field1626 : class98.field1625;
                            method2080(class174.field2385, class174.field2585, class174.field2565);
                            client.method177(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field815 + 180 - 9 && var14 <= field815 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field836 = !field836;
                        }
                        if (var13 == 1 && var14 >= field815 + 180 - 34 && var14 <= field815 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var35 = client.method2916("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class115.method25(var35, true, "openjs", false);
                        }
                        int var36 = field815 + 180 + 80;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            field821 = 0;
                            field813 = "";
                            field834 = "";
                            Statics.field1748 = 0;
                            Statics.field276 = "";
                        }
                        while (class106.method3347()) {
                            boolean var37 = false;
                            for (int var38 = 0; var38 < field839.length(); var38++) {
                                if (Statics.field2632 == field839.charAt(var38)) {
                                    var37 = true;
                                    break;
                                }
                            }
                            if (Statics.field2135 == 13) {
                                field821 = 0;
                                field813 = "";
                                field834 = "";
                                Statics.field1748 = 0;
                                Statics.field276 = "";
                            } else {
                                if (Statics.field2135 == 85 && Statics.field276.length() > 0) {
                                    Statics.field276 = Statics.field276.substring(0, Statics.field276.length() - 1);
                                }
                                if (Statics.field2135 == 84) {
                                    Statics.field276.trim();
                                    if (Statics.field276.length() != 6) {
                                        method2080(class174.field2451, class174.field2448, class174.field2374);
                                        return;
                                    }
                                    Statics.field1748 = Integer.parseInt(Statics.field276);
                                    Statics.field276 = "";
                                    field835 = field836 ? class98.field1626 : class98.field1625;
                                    method2080(class174.field2385, class174.field2585, class174.field2565);
                                    client.method177(20);
                                    return;
                                }
                                if (var37 && Statics.field276.length() < 6) {
                                    Statics.field276 = Statics.field276 + Statics.field2632;
                                }
                            }
                        }
                    } else if (field821 == 5) {
                        int var39 = field815 + 180 - 80;
                        short var40 = 321;
                        if (var13 == 1 && var14 >= var39 - 75 && var14 <= var39 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            method3300();
                            return;
                        }
                        int var41 = field815 + 180 + 80;
                        if (var13 == 1 && var14 >= var41 - 75 && var14 <= var41 + 75 && var15 >= var40 - 20 && var15 <= var40 + 20) {
                            field830 = class174.field2547;
                            field828 = class174.field2465;
                            field832 = class174.field2549;
                            field821 = 2;
                            field837 = 0;
                            field834 = "";
                        }
                        while (class106.method3347()) {
                            boolean var42 = false;
                            for (int var43 = 0; var43 < field838.length(); var43++) {
                                if (Statics.field2632 == field838.charAt(var43)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            if (Statics.field2135 == 13) {
                                field830 = class174.field2547;
                                field828 = class174.field2465;
                                field832 = class174.field2549;
                                field821 = 2;
                                field837 = 0;
                                field834 = "";
                            } else {
                                if (Statics.field2135 == 85 && field813.length() > 0) {
                                    field813 = field813.substring(0, field813.length() - 1);
                                }
                                if (Statics.field2135 == 84) {
                                    method3300();
                                    return;
                                }
                                if (var42 && field813.length() < 320) {
                                    field813 = field813 + Statics.field2632;
                                }
                            }
                        }
                    } else if (field821 == 6) {
                        while (true) {
                            do {
                                if (!class106.method3347()) {
                                    short var44 = 321;
                                    if (var13 == 1 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                                        field830 = class174.field2547;
                                        field828 = class174.field2465;
                                        field832 = class174.field2549;
                                        field821 = 2;
                                        field837 = 0;
                                        field834 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2135 != 84 && Statics.field2135 != 13);
                            field830 = class174.field2547;
                            field828 = class174.field2465;
                            field832 = class174.field2549;
                            field821 = 2;
                            field837 = 0;
                            field834 = "";
                        }
                    }
                }
            }
        } else if (class116.field1795 == 1 || !Statics.field1298 && class116.field1795 == 4) {
            int var1 = field847 + 280;
            if (class116.field1792 >= var1 && class116.field1792 <= var1 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                class30.method2873(0, 0);
            } else if (class116.field1792 >= var1 + 15 && class116.field1792 <= var1 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                class30.method2873(0, 1);
            } else {
                int var2 = field847 + 390;
                if (class116.field1792 >= var2 && class116.field1792 <= var2 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                    class30.method2873(1, 0);
                } else if (class116.field1792 >= var2 + 15 && class116.field1792 <= var2 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                    class30.method2873(1, 1);
                } else {
                    int var3 = field847 + 500;
                    if (class116.field1792 >= var3 && class116.field1792 <= var3 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                        class30.method2873(2, 0);
                    } else if (class116.field1792 >= var3 + 15 && class116.field1792 <= var3 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                        class30.method2873(2, 1);
                    } else {
                        int var4 = field847 + 610;
                        if (class116.field1792 >= var4 && class116.field1792 <= var4 + 14 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                            class30.method2873(3, 0);
                        } else if (class116.field1792 >= var4 + 15 && class116.field1792 <= var4 + 80 && class116.field1797 >= 4 && class116.field1797 <= 18) {
                            class30.method2873(3, 1);
                        } else if (class116.field1792 >= field847 + 708 && class116.field1797 >= 4 && class116.field1792 <= field847 + 708 + 50 && class116.field1797 <= 20) {
                            field825 = false;
                            Statics.field810.method3885(field847, 0);
                            Statics.field841.method3885(field847 + 382, 0);
                            Statics.field3247.method3839(field847 + 382 - Statics.field3247.field3196 / 2, 18);
                        } else if (field842 != -1) {
                            class30 var5 = Statics.field674[field842];
                            method2432(var5);
                            field825 = false;
                            Statics.field810.method3885(field847, 0);
                            Statics.field841.method3885(field847 + 382, 0);
                            Statics.field3247.method3839(field847 + 382 - Statics.field3247.field3196 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("go.a(I)V")
    public static void method3300() {
        field813 = field813.trim();
        if (field813.length() == 0) {
            method2080(class174.field2586, class174.field2587, class174.field2580);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2916("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2078, var4.field2073, 1000 - var4.field2073);
                if (var5 == -1) {
                    var4.field2073 = 0;
                    long var8 = var4.method2721();
                    var6 = var8;
                    break;
                }
                var4.field2073 += var5;
                if (var4.field2073 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var45) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field813;
            Random var15 = new Random();
            class154 var16 = new class154(128);
            class154 var17 = new class154(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2573(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2576(var15.nextInt());
            }
            var16.method2576(var18[0]);
            var16.method2576(var18[1]);
            var16.method2746(var6);
            var16.method2746(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2576(var15.nextInt());
            }
            var16.method2609(class37.field768, class37.field767);
            var17.method2573(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2576(var15.nextInt());
            }
            var17.method2746(var15.nextLong());
            var17.method2577(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class105.field1683.method1265(0L);
                class105.field1683.method1267(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var44) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2582(var22, 0, 24);
            var17.method2746(var15.nextLong());
            var17.method2609(class37.field768, class37.field767);
            int var26 = class154.method2553(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class154 var27 = new class154(var26);
            var27.method2624(var14);
            var27.field2073 = var26;
            var27.method2699(var18);
            class154 var28 = new class154(var27.field2073 + var17.field2073 + var16.field2073 + 5);
            var28.method2573(2);
            var28.method2573(var16.field2073);
            var28.method2582(var16.field2078, 0, var16.field2073);
            var28.method2573(var17.field2073);
            var28.method2582(var17.field2078, 0, var17.field2073);
            var28.method2731(var27.field2073);
            var28.method2582(var27.field2078, 0, var27.field2073);
            String var29 = class207.method1042(var28.field2078);
            byte var36;
            try {
                URL var30 = new URL(client.method2916("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                var32.write("data2=" + class232.method2815(var29) + "&dest=" + class232.method2815("passwordchoice.ws"));
                var32.flush();
                InputStream var33 = var31.getInputStream();
                class154 var34 = new class154(new byte[1000]);
                while (true) {
                    int var35 = var33.read(var34.field2078, var34.field2073, 1000 - var34.field2073);
                    if (var35 == -1) {
                        var32.close();
                        var33.close();
                        String var37 = new String(var34.field2078);
                        if (var37.startsWith("OFFLINE")) {
                            var36 = 4;
                        } else if (var37.startsWith("WRONG")) {
                            var36 = 7;
                        } else if (var37.startsWith("RELOAD")) {
                            var36 = 3;
                        } else if (var37.startsWith("Not permitted for social network accounts.")) {
                            var36 = 6;
                        } else {
                            var34.method2606(var18);
                            while (var34.field2073 > 0 && var34.field2078[var34.field2073 - 1] == 0) {
                                var34.field2073--;
                            }
                            String var38 = new String(var34.field2078, 0, var34.field2073);
                            boolean var39;
                            if (var38 == null) {
                                var39 = false;
                            } else {
                                label114: {
                                    try {
                                        new URL(var38);
                                    } catch (MalformedURLException var42) {
                                        var39 = false;
                                        break label114;
                                    }
                                    var39 = true;
                                }
                            }
                            if (var39) {
                                class115.method2808(var38, true, false);
                                var36 = 2;
                            } else {
                                var36 = 5;
                            }
                        }
                        break;
                    }
                    var34.field2073 += var35;
                    if (var34.field2073 >= 1000) {
                        var36 = 5;
                        break;
                    }
                }
            } catch (Throwable var43) {
                var43.printStackTrace();
                var36 = 5;
            }
            var13 = var36;
        }
        switch(var13) {
            case 2:
                method2080(class174.field2589, class174.field2590, class174.field2591);
                field821 = 6;
                break;
            case 3:
                method2080(class174.field2592, class174.field2539, class174.field2594);
                break;
            case 4:
                method2080(class174.field2484, class174.field2530, class174.field2597);
                break;
            case 5:
                method2080(class174.field2557, class174.field2415, class174.field2600);
                break;
            case 6:
                method2080(class174.field2431, class174.field2602, class174.field2588);
                break;
            case 7:
                method2080(class174.field2604, class174.field2605, class174.field2606);
        }
    }

    @ObfuscatedName("z.c(Lhb;Lhb;Lhb;ZI)V")
    public static void method117(class209 arg0, class209 arg1, class209 arg2, boolean arg3) {
        if (arg3) {
            field847 = (Statics.field2 - client.field496 * 765) / 2;
            field815 = field847 + 202;
        }
        if (field825) {
            if (Statics.field68 == null) {
                Statics.field68 = class226.method593(Statics.field5, "sl_back", "");
            }
            if (Statics.field205 == null) {
                Statics.field205 = class226.method2801(Statics.field5, "sl_flags", "");
            }
            if (Statics.field134 == null) {
                Statics.field134 = class226.method2801(Statics.field5, "sl_arrows", "");
            }
            if (Statics.field1103 == null) {
                Statics.field1103 = class226.method2801(Statics.field5, "sl_stars", "");
            }
            class220.method3779(field847, 23, 765, 480, 0);
            class220.method3777(field847, 0, 125, 23, 12425273, 9135624);
            class220.method3777(field847 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3661(class174.field2559, field847 + 62, 15, 0, -1);
            if (Statics.field1103 != null) {
                Statics.field1103[1].method3839(field847 + 140, 1);
                arg1.method3658(class174.field2608, field847 + 152, 10, 16777215, -1);
                Statics.field1103[0].method3839(field847 + 140, 12);
                arg1.method3658(class174.field2609, field847 + 152, 21, 16777215, -1);
            }
            if (Statics.field134 != null) {
                int var4 = field847 + 280;
                if (class30.field675[0] == 0 && class30.field677[0] == 0) {
                    Statics.field134[2].method3839(var4, 4);
                } else {
                    Statics.field134[0].method3839(var4, 4);
                }
                if (class30.field675[0] == 0 && class30.field677[0] == 1) {
                    Statics.field134[3].method3839(var4 + 15, 4);
                } else {
                    Statics.field134[1].method3839(var4 + 15, 4);
                }
                arg0.method3658(class174.field2610, var4 + 32, 17, 16777215, -1);
                int var5 = field847 + 390;
                if (class30.field675[0] == 1 && class30.field677[0] == 0) {
                    Statics.field134[2].method3839(var5, 4);
                } else {
                    Statics.field134[0].method3839(var5, 4);
                }
                if (class30.field675[0] == 1 && class30.field677[0] == 1) {
                    Statics.field134[3].method3839(var5 + 15, 4);
                } else {
                    Statics.field134[1].method3839(var5 + 15, 4);
                }
                arg0.method3658(class174.field2601, var5 + 32, 17, 16777215, -1);
                int var6 = field847 + 500;
                if (class30.field675[0] == 2 && class30.field677[0] == 0) {
                    Statics.field134[2].method3839(var6, 4);
                } else {
                    Statics.field134[0].method3839(var6, 4);
                }
                if (class30.field675[0] == 2 && class30.field677[0] == 1) {
                    Statics.field134[3].method3839(var6 + 15, 4);
                } else {
                    Statics.field134[1].method3839(var6 + 15, 4);
                }
                arg0.method3658(class174.field2612, var6 + 32, 17, 16777215, -1);
                int var7 = field847 + 610;
                if (class30.field675[0] == 3 && class30.field677[0] == 0) {
                    Statics.field134[2].method3839(var7, 4);
                } else {
                    Statics.field134[0].method3839(var7, 4);
                }
                if (class30.field675[0] == 3 && class30.field677[0] == 1) {
                    Statics.field134[3].method3839(var7 + 15, 4);
                } else {
                    Statics.field134[1].method3839(var7 + 15, 4);
                }
                arg0.method3658(class174.field2613, var7 + 32, 17, 16777215, -1);
            }
            class220.method3779(field847 + 708, 4, 50, 16, 0);
            arg1.method3661(class174.field2533, field847 + 708 + 25, 16, 16777215, -1);
            field842 = -1;
            if (Statics.field68 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class30.field685) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class30.field685) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class30.field685) {
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
                for (int var22 = 0; var22 < class30.field685; var22++) {
                    class30 var23 = Statics.field674[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field680);
                    if (var23.field680 == -1) {
                        var25 = class174.field2614;
                        var24 = false;
                    } else if (var23.field680 > 1980) {
                        var25 = class174.field2615;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method629()) {
                        if (var23.method634()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method644()) {
                        var26 = 16711680;
                        if (var23.method634()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method623()) {
                        if (var23.method634()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method634()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class116.field1789 >= var19 && class116.field1790 * -1088631201 >= var18 && class116.field1789 < var8 + var19 && class116.field1790 * -1088631201 < var9 + var18 && var24) {
                        field842 = var22;
                        Statics.field68[var27].method3871(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field68[var27].method3885(var19, var18);
                    }
                    if (Statics.field205 != null) {
                        Statics.field205[(var23.method634() ? 8 : 0) + var23.field684].method3839(var19 + 29, var18);
                    }
                    arg0.method3661(Integer.toString(var23.field679), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3661(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3665(Statics.field674[field842].field683) + 6;
                    int var29 = arg1.field3088 + 8;
                    class220.method3779(class116.field1789 - var28 / 2, class116.field1790 * -1088631201 + 20 + 5, var28, var29, 16777120);
                    class220.method3763(class116.field1789 - var28 / 2, class116.field1790 * -1088631201 + 20 + 5, var28, var29, 0);
                    arg1.method3661(Statics.field674[field842].field683, class116.field1789, class116.field1790 * -1088631201 + 20 + 5 + arg1.field3088 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field2146.getGraphics();
                Statics.field1759.method3745(var30, 0, 0);
            } catch (Exception var133) {
                Statics.field2146.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field810.method3885(field847, 0);
            Statics.field841.method3885(field847 + 382, 0);
            Statics.field3247.method3839(field847 + 382 - Statics.field3247.field3196 / 2, 18);
        }
        if (client.field289 == 0 || client.field289 == 5) {
            byte var32 = 20;
            arg0.method3661(class174.field2546, field815 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class220.method3763(field815 + 180 - 152, var33, 304, 34, 9179409);
            class220.method3763(field815 + 180 - 151, var33 + 1, 302, 32, 0);
            class220.method3779(field815 + 180 - 150, var33 + 2, field826 * 3, 30, 9179409);
            class220.method3779(field826 * 3 + (field815 + 180 - 150), var33 + 2, 300 - field826 * 3, 30, 0);
            arg0.method3661(field827, field815 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field289 == 20) {
            Statics.field808.method3839(field815 + 180 - Statics.field808.field3196 / 2, 271 - Statics.field808.field3191 / 2);
            short var34 = 211;
            arg0.method3661(field830, field815 + 180, var34, 16776960, 0);
            int var135 = var34 + 15;
            arg0.method3661(field828, field815 + 180, var135, 16776960, 0);
            int var136 = var135 + 15;
            arg0.method3661(field832, field815 + 180, var136, 16776960, 0);
            int var137 = var136 + 15;
            int var138 = var137 + 10;
            if (field821 != 4) {
                arg0.method3658(class174.field2373, field815 + 180 - 110, var138, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field813; arg0.method3665(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3658(class210.method3657(var36), field815 + 180 - 70, var138, 16777215, 0);
                var135 = var138 + 15;
                arg0.method3658(class174.field2569 + class208.method95(field834), field815 + 180 - 108, var135, 16777215, 0);
                var135 += 15;
            }
        }
        if (client.field289 == 10 || client.field289 == 11) {
            Statics.field808.method3839(field815, 171);
            if (field821 == 0) {
                short var37 = 251;
                arg0.method3661(class174.field2518, field815 + 180, var37, 16776960, 0);
                int var139 = var37 + 30;
                int var38 = field815 + 180 - 80;
                short var39 = 291;
                Statics.field809.method3839(var38 - 73, var39 - 20);
                arg0.method3662(class174.field2572, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field815 + 180 + 80;
                Statics.field809.method3839(var40 - 73, var39 - 20);
                arg0.method3662(class174.field2573, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field821 == 1) {
                arg0.method3661(field829, field815 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3661(field830, field815 + 180, var41, 16777215, 0);
                int var140 = var41 + 15;
                arg0.method3661(field828, field815 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                arg0.method3661(field832, field815 + 180, var141, 16777215, 0);
                int var142 = var141 + 15;
                int var42 = field815 + 180 - 80;
                short var43 = 321;
                Statics.field809.method3839(var42 - 73, var43 - 20);
                arg0.method3661(class174.field2344, var42, var43 + 5, 16777215, 0);
                int var44 = field815 + 180 + 80;
                Statics.field809.method3839(var44 - 73, var43 - 20);
                arg0.method3661(class174.field2533, var44, var43 + 5, 16777215, 0);
            } else if (field821 == 2) {
                short var45 = 211;
                arg0.method3661(field830, field815 + 180, var45, 16776960, 0);
                int var143 = var45 + 15;
                arg0.method3661(field828, field815 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                arg0.method3661(field832, field815 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                int var146 = var145 + 10;
                arg0.method3658(class174.field2373, field815 + 180 - 110, var146, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field813; arg0.method3665(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3658(class210.method3657(var47) + (field837 == 0 & client.field291 % 40 < 20 ? class38.method689(16776960) + class38.field774 : ""), field815 + 180 - 70, var146, 16777215, 0);
                var143 = var146 + 15;
                arg0.method3658(class174.field2569 + class208.method95(field834) + (field837 == 1 & client.field291 % 40 < 20 ? class38.method689(16776960) + class38.field774 : ""), field815 + 180 - 108, var143, 16777215, 0);
                var143 += 15;
                int var48 = field815 + 180 - 80;
                short var49 = 321;
                Statics.field809.method3839(var48 - 73, var49 - 20);
                arg0.method3661(class174.field2574, var48, var49 + 5, 16777215, 0);
                int var50 = field815 + 180 + 80;
                Statics.field809.method3839(var50 - 73, var49 - 20);
                arg0.method3661(class174.field2533, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3661(class174.field2449, field815 + 180, var51, 16776960, 0);
            } else if (field821 == 3) {
                short var52 = 201;
                arg0.method3661(class174.field2576, field815 + 180, var52, 16776960, 0);
                int var147 = var52 + 20;
                arg1.method3661(class174.field2577, field815 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg1.method3661(class174.field2578, field815 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var53 = field815 + 180;
                short var54 = 276;
                Statics.field809.method3839(var53 - 73, var54 - 20);
                arg2.method3661(class174.field2579, var53, var54 + 5, 16777215, 0);
                int var55 = field815 + 180;
                short var56 = 326;
                Statics.field809.method3839(var55 - 73, var56 - 20);
                arg2.method3661(class174.field2532, var55, var56 + 5, 16777215, 0);
            } else if (field821 == 4) {
                arg0.method3661(class174.field2563, field815 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3661(field830, field815 + 180, var57, 16777215, 0);
                int var150 = var57 + 15;
                arg0.method3661(field828, field815 + 180, var150, 16777215, 0);
                int var151 = var150 + 15;
                arg0.method3661(field832, field815 + 180, var151, 16777215, 0);
                int var152 = var151 + 15;
                arg0.method3658(class174.field2570 + class208.method95(Statics.field276) + (client.field291 % 40 < 20 ? class38.method689(16776960) + class38.field774 : ""), field815 + 180 - 108, var152, 16777215, 0);
                int var153 = var152 - 8;
                arg0.method3658(class174.field2492, field815 + 180 - 9, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg0.method3658(class174.field2523, field815 + 180 - 9, var154, 16776960, 0);
                int var58 = field815 + 180 - 9 + arg0.method3665(class174.field2523) + 15;
                int var59 = var154 - arg0.field3088;
                class223 var60;
                if (field836) {
                    var60 = Statics.field81;
                } else {
                    var60 = Statics.field812;
                }
                var60.method3839(var58, var59);
                var150 = var154 + 15;
                int var61 = field815 + 180 - 80;
                short var62 = 321;
                Statics.field809.method3839(var61 - 73, var62 - 20);
                arg0.method3661(class174.field2344, var61, var62 + 5, 16777215, 0);
                int var63 = field815 + 180 + 80;
                Statics.field809.method3839(var63 - 73, var62 - 20);
                arg0.method3661(class174.field2533, var63, var62 + 5, 16777215, 0);
                arg1.method3661(class174.field2364, field815 + 180, var62 + 36, 255, 0);
            } else if (field821 == 5) {
                arg0.method3661(class174.field2575, field815 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3661(field830, field815 + 180, var64, 16776960, 0);
                int var155 = var64 + 15;
                arg2.method3661(field828, field815 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg2.method3661(field832, field815 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var158 = var157 + 14;
                arg0.method3658(class174.field2583, field815 + 180 - 145, var158, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field813; arg0.method3665(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3658(class210.method3657(var66) + (client.field291 % 40 < 20 ? class38.method689(16776960) + class38.field774 : ""), field815 + 180 - 34, var158, 16777215, 0);
                var155 = var158 + 15;
                int var67 = field815 + 180 - 80;
                short var68 = 321;
                Statics.field809.method3839(var67 - 73, var68 - 20);
                arg0.method3661(class174.field2584, var67, var68 + 5, 16777215, 0);
                int var69 = field815 + 180 + 80;
                Statics.field809.method3839(var69 - 73, var68 - 20);
                arg0.method3661(class174.field2503, var69, var68 + 5, 16777215, 0);
            } else if (field821 == 6) {
                short var70 = 211;
                arg0.method3661(field830, field815 + 180, var70, 16776960, 0);
                int var159 = var70 + 15;
                arg0.method3661(field828, field815 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg0.method3661(field832, field815 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var71 = field815 + 180;
                short var72 = 321;
                Statics.field809.method3839(var71 - 73, var72 - 20);
                arg0.method3661(class174.field2503, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field824 > 0) {
            int var73 = field824;
            short var74 = 256;
            field822 += var73 * 128;
            if (field822 > Statics.field1532.length) {
                field822 -= Statics.field1532.length;
                int var75 = (int) (Math.random() * 12.0D);
                method594(Statics.field760[var75]);
            }
            int var76 = 0;
            int var77 = var73 * 128;
            int var78 = (var74 - var73) * 128;
            for (int var79 = 0; var79 < var78; var79++) {
                int var80 = Statics.field49[var76 + var77] - Statics.field1532[field822 + var76 & Statics.field1532.length - 1] * var73 / 6;
                if (var80 < 0) {
                    var80 = 0;
                }
                Statics.field49[var76++] = var80;
            }
            for (int var81 = var74 - var73; var81 < var74; var81++) {
                int var82 = var81 * 128;
                for (int var83 = 0; var83 < 128; var83++) {
                    int var84 = (int) (Math.random() * 100.0D);
                    if (var84 < 50 && var83 > 10 && var83 < 118) {
                        Statics.field49[var82 + var83] = 255;
                    } else {
                        Statics.field49[var82 + var83] = 0;
                    }
                }
            }
            if (field807 > 0) {
                field807 -= var73 * 4;
            }
            if (field811 > 0) {
                field811 -= var73 * 4;
            }
            if (field807 == 0 && field811 == 0) {
                int var85 = (int) (Math.random() * (double) (2000 / var73));
                if (var85 == 0) {
                    field807 = 1024;
                }
                if (var85 == 1) {
                    field811 = 1024;
                }
            }
            for (int var86 = 0; var86 < var74 - var73; var86++) {
                field816[var86] = field816[var73 + var86];
            }
            for (int var87 = var74 - var73; var87 < var74; var87++) {
                field816[var87] = (int) (Math.sin((double) field844 / 14.0D) * 16.0D + Math.sin((double) field844 / 15.0D) * 14.0D + Math.sin((double) field844 / 16.0D) * 12.0D);
                field844++;
            }
            field823 += var73 * 1270202731;
            int var88 = ((client.field291 & 0x1) + var73) / 2;
            if (var88 > 0) {
                for (int var89 = 0; var89 < field823 * -1006713300; var89++) {
                    int var90 = (int) (Math.random() * 124.0D) + 2;
                    int var91 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field49[(var91 << 7) + var90] = 192;
                }
                field823 = 0;
                int var92 = 0;
                label525: while (true) {
                    if (var92 >= var74) {
                        int var96 = 0;
                        while (true) {
                            if (var96 >= 128) {
                                break label525;
                            }
                            int var97 = 0;
                            for (int var98 = -var88; var98 < var74; var98++) {
                                int var99 = var98 * 128;
                                if (var88 + var98 < var74) {
                                    var97 += Statics.field814[var88 * 128 + var96 + var99];
                                }
                                if (var98 - (var88 + 1) >= 0) {
                                    var97 -= Statics.field814[var96 + var99 - (var88 + 1) * 128];
                                }
                                if (var98 >= 0) {
                                    Statics.field49[var96 + var99] = var97 / (var88 * 2 + 1);
                                }
                            }
                            var96++;
                        }
                    }
                    int var93 = 0;
                    int var94 = var92 * 128;
                    for (int var95 = -var88; var95 < 128; var95++) {
                        if (var88 + var95 < 128) {
                            var93 += Statics.field49[var94 + var95 + var88];
                        }
                        if (var95 - (var88 + 1) >= 0) {
                            var93 -= Statics.field49[var94 + var95 - (var88 + 1)];
                        }
                        if (var95 >= 0) {
                            Statics.field814[var94 + var95] = var93 / (var88 * 2 + 1);
                        }
                    }
                    var92++;
                }
            }
            field824 = 0;
        }
        short var100 = 256;
        if (field807 > 0) {
            for (int var101 = 0; var101 < 256; var101++) {
                if (field807 > 768) {
                    Statics.field1200[var101] = method185(Statics.field817[var101], Statics.field818[var101], 1024 - field807);
                } else if (field807 > 256) {
                    Statics.field1200[var101] = Statics.field818[var101];
                } else {
                    Statics.field1200[var101] = method185(Statics.field818[var101], Statics.field817[var101], 256 - field807);
                }
            }
        } else if (field811 > 0) {
            for (int var102 = 0; var102 < 256; var102++) {
                if (field811 > 768) {
                    Statics.field1200[var102] = method185(Statics.field817[var102], Statics.field1301[var102], 1024 - field811);
                } else if (field811 > 256) {
                    Statics.field1200[var102] = Statics.field1301[var102];
                } else {
                    Statics.field1200[var102] = method185(Statics.field1301[var102], Statics.field817[var102], 256 - field811);
                }
            }
        } else {
            for (int var103 = 0; var103 < 256; var103++) {
                Statics.field1200[var103] = Statics.field817[var103];
            }
        }
        class220.method3751(field847, 9, field847 + 128, var100 + 7);
        Statics.field810.method3885(field847, 0);
        class220.method3750();
        int var104 = 0;
        int var105 = field847 + Statics.field1759.field3178 * 9;
        for (int var106 = 1; var106 < var100 - 1; var106++) {
            int var107 = (var100 - var106) * field816[var106] / var100;
            int var108 = var107 + 22;
            if (var108 < 0) {
                var108 = 0;
            }
            var104 += var108;
            for (int var109 = var108; var109 < 128; var109++) {
                int var110 = Statics.field49[var104++];
                if (var110 == 0) {
                    var105++;
                } else {
                    int var112 = 256 - var110;
                    int var113 = Statics.field1200[var110];
                    int var114 = Statics.field1759.field3179[var105];
                    Statics.field1759.field3179[var105++] = ((var113 & 0xFF00FF) * var110 + (var114 & 0xFF00FF) * var112 & 0xFF00FF00) + ((var113 & 0xFF00) * var110 + (var114 & 0xFF00) * var112 & 0xFF0000) >> 8;
                }
            }
            var105 += Statics.field1759.field3178 + var108 - 128;
        }
        class220.method3751(field847 + 765 - 128, 9, field847 + 765, var100 + 7);
        Statics.field841.method3885(field847 + 382, 0);
        class220.method3750();
        int var115 = 0;
        int var116 = field847 + Statics.field1759.field3178 * 9 + 24 + 637;
        for (int var117 = 1; var117 < var100 - 1; var117++) {
            int var118 = (var100 - var117) * field816[var117] / var100;
            int var119 = 103 - var118;
            int var120 = var116 + var118;
            for (int var121 = 0; var121 < var119; var121++) {
                int var122 = Statics.field49[var115++];
                if (var122 == 0) {
                    var120++;
                } else {
                    int var124 = 256 - var122;
                    int var125 = Statics.field1200[var122];
                    int var126 = Statics.field1759.field3179[var120];
                    Statics.field1759.field3179[var120++] = ((var125 & 0xFF00) * var122 + (var126 & 0xFF00) * var124 & 0xFF0000) + ((var125 & 0xFF00FF) * var122 + (var126 & 0xFF00FF) * var124 & 0xFF00FF00) >> 8;
                }
            }
            var115 += 128 - var119;
            var116 = Statics.field1759.field3178 - var119 - var118 + var120;
        }
        Statics.field789[Statics.field22.field693 ? 1 : 0].method3839(field847 + 765 - 40, 463);
        if (client.field289 > 5 && client.field473 == 0) {
            if (Statics.field2731 == null) {
                Statics.field2731 = class226.method3491(Statics.field5, "sl_button", "");
            } else {
                int var127 = field847 + 5;
                short var128 = 463;
                byte var129 = 100;
                byte var130 = 35;
                Statics.field2731.method3839(var127, var128);
                arg0.method3661(class174.field2389 + " " + client.field282, var129 / 2 + var127, var130 / 2 + var128 - 2, 16777215, 0);
                if (Statics.field160 == null) {
                    arg1.method3661(class174.field2469, var129 / 2 + var127, var130 / 2 + var128 + 12, 16777215, 0);
                } else {
                    arg1.method3661(class174.field2616, var129 / 2 + var127, var130 / 2 + var128 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var131 = Statics.field2146.getGraphics();
            Statics.field1759.method3745(var131, 0, 0);
        } catch (Exception var134) {
            Statics.field2146.repaint();
        }
    }

    @ObfuscatedName("dw.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2080(String arg0, String arg1, String arg2) {
        field830 = arg0;
        field828 = arg1;
        field832 = arg2;
    }

    @ObfuscatedName("b.z(Lhl;I)V")
    public static final void method594(class223 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1532.length; var2++) {
            Statics.field1532[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1532[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1628[var8] = (Statics.field1532[var8 - 1] + Statics.field1532[var8 + 1] + Statics.field1532[var8 - 128] + Statics.field1532[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1532;
            Statics.field1532 = Statics.field1628;
            Statics.field1628 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3191; var11++) {
            for (int var12 = 0; var12 < arg0.field3196; var12++) {
                if (arg0.field3194[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3195;
                    int var14 = var11 + 16 + arg0.field3193;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1532[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("k.t(IIIB)I")
    public static final int method185(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ed.m(Lan;B)V")
    public static void method2432(class30 arg0) {
        if (arg0.method634() != client.field286) {
            client.field286 = arg0.method634();
            class199.method186(arg0.method634());
        }
        Statics.field2070 = arg0.field682;
        client.field282 = arg0.field679;
        client.field482 = arg0.field678;
        Statics.field1720 = client.field417 == 0 ? 43594 : arg0.field679 + 40000;
        Statics.field91 = client.field417 == 0 ? 443 : arg0.field679 + 50000;
        Statics.field1352 = Statics.field1720;
    }

    @ObfuscatedName("fj.q(B)V")
    public static void method2875() {
        if (class30.method1785()) {
            field825 = true;
        }
    }
}

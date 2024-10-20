package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;

@ObfuscatedName("ar")
public class class32 {

    @ObfuscatedName("ar.i")
    public static int field704 = 0;

    @ObfuscatedName("ar.j")
    public static int field722 = field704 + 202;

    @ObfuscatedName("ar.u")
    public static int[] field708 = new int[256];

    @ObfuscatedName("ar.v")
    public static int field710 = 0;

    @ObfuscatedName("ar.m")
    public static int field711 = 0;

    @ObfuscatedName("ar.ag")
    public static int field715 = 0;

    @ObfuscatedName("ar.al")
    public static int field730 = 0;

    @ObfuscatedName("ar.av")
    public static int field714 = 0;

    @ObfuscatedName("ar.ar")
    public static int field721 = 0;

    @ObfuscatedName("ar.ay")
    public static int field716 = 10;

    @ObfuscatedName("ar.aq")
    public static String field736 = "";

    @ObfuscatedName("ar.ai")
    public static int field718 = 0;

    @ObfuscatedName("ar.an")
    public static String field709 = "";

    @ObfuscatedName("ar.aw")
    public static String field720 = "";

    @ObfuscatedName("ar.ap")
    public static String field735 = "";

    @ObfuscatedName("ar.ak")
    public static String field713 = "";

    @ObfuscatedName("ar.ac")
    public static String field723 = "";

    @ObfuscatedName("ar.ao")
    public static String field724 = "";

    @ObfuscatedName("ar.aj")
    public static class160 field725 = class160.field2626;

    @ObfuscatedName("ar.aa")
    public static boolean field726 = true;

    @ObfuscatedName("ar.au")
    public static int field727 = 0;

    @ObfuscatedName("ar.ab")
    public static String field729 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ar.am")
    public static String field719 = "1234567890";

    @ObfuscatedName("ar.az")
    public static boolean field703 = false;

    @ObfuscatedName("ar.bd")
    public static int field731 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.t(Ljava/awt/Component;Lfp;Lfp;ZIS)V")
    public static void method2627(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field717) {
            field718 = arg4;
            class80.method1638();
            byte[] var5 = arg1.method3060("title.jpg", "");
            Statics.field1101 = new class79(var5, arg0);
            Statics.field706 = Statics.field1101.method1544();
            if ((client.field284 & 0x20000000) == 0) {
                Statics.field2102 = class77.method672(arg2, "logo", "");
            } else {
                Statics.field2102 = class77.method672(arg2, "logo_deadman_mode", "");
            }
            Statics.field2082 = class77.method672(arg2, "titlebox", "");
            Statics.field705 = class77.method672(arg2, "titlebutton", "");
            Statics.field1917 = class77.method3630(arg2, "runes", "");
            Statics.field712 = class77.method3630(arg2, "title_mute", "");
            Statics.field72 = class77.method672(arg2, "options_radio_buttons,0", "");
            Statics.field1466 = class77.method672(arg2, "options_radio_buttons,2", "");
            Statics.field2006 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2006[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2006[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2006[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2006[var9 + 192] = 16777215;
            }
            Statics.field1635 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1635[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1635[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1635[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1635[var13 + 192] = 16777215;
            }
            Statics.field272 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field272[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field272[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field272[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field272[var17 + 192] = 16777215;
            }
            Statics.field1065 = new int[256];
            Statics.field2679 = new int[32768];
            Statics.field701 = new int[32768];
            method2785((class81) null);
            Statics.field753 = new int[32768];
            Statics.field137 = new int[32768];
            if (arg3) {
                field723 = "";
                field724 = "";
            }
            Statics.field34 = 0;
            Statics.field1644 = "";
            field726 = true;
            field703 = false;
            if (Statics.field1989.field146) {
                class184.method540(2);
            } else {
                class169 var18 = Statics.field1784;
                int var19 = var18.method3017("scape main");
                int var20 = var18.method3018(var19, "");
                class184.method2924(2, var18, var19, var20, 255, false);
            }
            if (Statics.field1024 != null) {
                try {
                    class120 var21 = new class120(4);
                    var21.method2293(3);
                    var21.method2295(0);
                    Statics.field1024.method2790(var21.field2002, 0, 4);
                } catch (IOException var25) {
                    try {
                        Statics.field1024.method2786();
                    } catch (Exception var24) {
                    }
                    class172.field2753++;
                    Statics.field1024 = null;
                }
            }
            Statics.field717 = true;
            field704 = (Statics.field163 - client.field566) / 2;
            field722 = field704 + 202;
            Statics.field1101.method1608(field704, 0);
            Statics.field706.method1608(field704 + 382, 0);
            Statics.field2102.method1703(field704 + 382 - Statics.field2102.field1425 / 2, 18);
        } else if (arg4 == 4) {
            field718 = 4;
        }
    }

    @ObfuscatedName("w.i(Leh;I)V")
    public static void method564(class145 arg0) {
        if (!field703) {
            if ((class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4) && class141.field2191 >= field704 + 765 - 50 && class141.field2188 >= 453) {
                Statics.field1989.field146 = !Statics.field1989.field146;
                class9.method581();
                if (Statics.field1989.field146) {
                    class184.method3137();
                } else {
                    class184.method3443(Statics.field1784, "scape main", "", 255, false);
                }
            }
            if (client.field463 != 5) {
                field714++;
                if (client.field463 == 10 || client.field463 == 11) {
                    if (client.field289 == 0) {
                        if (class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4) {
                            int var6 = field704 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class141.field2191 >= var6 && class141.field2191 <= var6 + var8 && class141.field2188 >= var7 && class141.field2188 <= var7 + var9) {
                                if (class26.method154()) {
                                    field703 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field970 != null && class26.method154()) {
                            field703 = true;
                        }
                    }
                    int var10 = class141.field2186;
                    int var11 = class141.field2191;
                    int var12 = class141.field2188;
                    if (!Statics.field1756 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field718 == 0) {
                        int var13 = field722 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            Statics.method2683(client.method158("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field722 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field284 & 0x2000000) != 0) {
                                field709 = "";
                                field720 = class158.field2558;
                                field735 = class158.field2419;
                                field713 = class158.field2560;
                                field718 = 1;
                                field727 = 0;
                            } else if ((client.field284 & 0x4) != 0) {
                                if ((client.field284 & 0x400) == 0) {
                                    field720 = class158.field2549;
                                    field735 = class158.field2550;
                                    field713 = class158.field2551;
                                } else {
                                    field720 = class158.field2518;
                                    field735 = class158.field2556;
                                    field713 = class158.field2557;
                                }
                                field709 = class158.field2548;
                                field718 = 1;
                                field727 = 0;
                            } else if ((client.field284 & 0x400) == 0) {
                                field720 = class158.field2545;
                                field735 = class158.field2579;
                                field713 = class158.field2547;
                                field718 = 2;
                                field727 = 0;
                            } else {
                                field720 = class158.field2534;
                                field735 = class158.field2553;
                                field713 = class158.field2369;
                                field709 = class158.field2548;
                                field718 = 1;
                                field727 = 0;
                            }
                        }
                    } else if (field718 == 1) {
                        while (class138.method2644()) {
                            if (Statics.field2143 == 84) {
                                field720 = class158.field2545;
                                field735 = class158.field2579;
                                field713 = class158.field2547;
                                field718 = 2;
                                field727 = 0;
                            } else if (Statics.field2143 == 13) {
                                field718 = 0;
                            }
                        }
                        int var16 = field722 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field720 = class158.field2545;
                            field735 = class158.field2579;
                            field713 = class158.field2547;
                            field718 = 2;
                            field727 = 0;
                        }
                        int var18 = field722 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field718 = 0;
                        }
                    } else if (field718 == 2) {
                        short var19 = 231;
                        int var53 = var19 + 30;
                        if (var10 == 1 && var12 >= var53 - 15 && var12 < var53) {
                            field727 = 0;
                        }
                        var53 += 15;
                        if (var10 == 1 && var12 >= var53 - 15 && var12 < var53) {
                            field727 = 1;
                        }
                        var53 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method955(class158.field2529, class158.field2585, class158.field2586);
                            field718 = 5;
                            return;
                        }
                        int var21 = field722 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field723 = field723.trim();
                            if (field723.length() == 0) {
                                method955(class158.field2451, class158.field2452, class158.field2591);
                                return;
                            }
                            if (field724.length() == 0) {
                                method955(class158.field2566, class158.field2455, class158.field2456);
                                return;
                            }
                            method955(class158.field2563, class158.field2357, class158.field2565);
                            LinkedHashMap var23 = Statics.field1989.field142;
                            String var24 = field723;
                            int var25 = var24.length();
                            int var26 = 0;
                            for (int var27 = 0; var27 < var25; var27++) {
                                var26 = (var26 << 5) - var26 + var24.charAt(var27);
                            }
                            field725 = var23.containsKey(var26) ? class160.field2633 : class160.field2626;
                            client.method15(20);
                            return;
                        }
                        int var29 = field722 + 180 + 80;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field718 = 0;
                            field723 = "";
                            field724 = "";
                            Statics.field34 = 0;
                            Statics.field1644 = "";
                            field726 = true;
                        }
                        while (true) {
                            while (class138.method2644()) {
                                boolean var30 = false;
                                for (int var31 = 0; var31 < field729.length(); var31++) {
                                    if (Statics.field626 == field729.charAt(var31)) {
                                        var30 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2143 == 13) {
                                    field718 = 0;
                                    field723 = "";
                                    field724 = "";
                                    Statics.field34 = 0;
                                    Statics.field1644 = "";
                                    field726 = true;
                                } else if (field727 == 0) {
                                    if (Statics.field2143 == 85 && field723.length() > 0) {
                                        field723 = field723.substring(0, field723.length() - 1);
                                    }
                                    if (Statics.field2143 == 84 || Statics.field2143 == 80) {
                                        field727 = 1;
                                    }
                                    if (var30 && field723.length() < 320) {
                                        field723 = field723 + Statics.field626;
                                    }
                                } else if (field727 == 1) {
                                    if (Statics.field2143 == 85 && field724.length() > 0) {
                                        field724 = field724.substring(0, field724.length() - 1);
                                    }
                                    if (Statics.field2143 == 84 || Statics.field2143 == 80) {
                                        field727 = 0;
                                    }
                                    if (Statics.field2143 == 84) {
                                        field723 = field723.trim();
                                        if (field723.length() == 0) {
                                            method955(class158.field2451, class158.field2452, class158.field2591);
                                            return;
                                        }
                                        if (field724.length() == 0) {
                                            method955(class158.field2566, class158.field2455, class158.field2456);
                                            return;
                                        }
                                        method955(class158.field2563, class158.field2357, class158.field2565);
                                        LinkedHashMap var32 = Statics.field1989.field142;
                                        String var33 = field723;
                                        int var34 = var33.length();
                                        int var35 = 0;
                                        for (int var36 = 0; var36 < var34; var36++) {
                                            var35 = (var35 << 5) - var35 + var33.charAt(var36);
                                        }
                                        field725 = var32.containsKey(var35) ? class160.field2633 : class160.field2626;
                                        client.method15(20);
                                        return;
                                    }
                                    if (var30 && field724.length() < 20) {
                                        field724 = field724 + Statics.field626;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field718 == 3) {
                        int var38 = field722 + 180;
                        short var39 = 276;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var39 - 20 && var12 <= var39 + 20) {
                            field720 = class158.field2545;
                            field735 = class158.field2579;
                            field713 = class158.field2547;
                            field718 = 2;
                            field727 = 0;
                        }
                        int var40 = field722 + 180;
                        short var41 = 326;
                        if (var10 == 1 && var11 >= var40 - 75 && var11 <= var40 + 75 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                            method955(class158.field2529, class158.field2585, class158.field2586);
                            field718 = 5;
                            return;
                        }
                    } else if (field718 == 4) {
                        int var42 = field722 + 180 - 80;
                        short var43 = 321;
                        if (var10 == 1 && var11 >= var42 - 75 && var11 <= var42 + 75 && var12 >= var43 - 20 && var12 <= var43 + 20) {
                            Statics.field1644.trim();
                            if (Statics.field1644.length() != 6) {
                                method955(class158.field2471, class158.field2371, class158.field2372);
                                return;
                            }
                            Statics.field34 = Integer.parseInt(Statics.field1644);
                            Statics.field1644 = "";
                            field725 = field726 ? class160.field2635 : class160.field2629;
                            method955(class158.field2563, class158.field2357, class158.field2565);
                            client.method15(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field722 + 180 - 9 && var11 <= field722 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field726 = !field726;
                        }
                        if (var10 == 1 && var11 >= field722 + 180 - 34 && var11 <= field722 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            Statics.method2683(client.method158("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var44 = field722 + 180 + 80;
                        if (var10 == 1 && var11 >= var44 - 75 && var11 <= var44 + 75 && var12 >= var43 - 20 && var12 <= var43 + 20) {
                            field718 = 0;
                            field723 = "";
                            field724 = "";
                            Statics.field34 = 0;
                            Statics.field1644 = "";
                        }
                        while (class138.method2644()) {
                            boolean var45 = false;
                            for (int var46 = 0; var46 < field719.length(); var46++) {
                                if (Statics.field626 == field719.charAt(var46)) {
                                    var45 = true;
                                    break;
                                }
                            }
                            if (Statics.field2143 == 13) {
                                field718 = 0;
                                field723 = "";
                                field724 = "";
                                Statics.field34 = 0;
                                Statics.field1644 = "";
                            } else {
                                if (Statics.field2143 == 85 && Statics.field1644.length() > 0) {
                                    Statics.field1644 = Statics.field1644.substring(0, Statics.field1644.length() - 1);
                                }
                                if (Statics.field2143 == 84) {
                                    Statics.field1644.trim();
                                    if (Statics.field1644.length() != 6) {
                                        method955(class158.field2471, class158.field2371, class158.field2372);
                                        return;
                                    }
                                    Statics.field34 = Integer.parseInt(Statics.field1644);
                                    Statics.field1644 = "";
                                    field725 = field726 ? class160.field2635 : class160.field2629;
                                    method955(class158.field2563, class158.field2357, class158.field2565);
                                    client.method15(20);
                                    return;
                                }
                                if (var45 && Statics.field1644.length() < 6) {
                                    Statics.field1644 = Statics.field1644 + Statics.field626;
                                }
                            }
                        }
                    } else if (field718 == 5) {
                        int var47 = field722 + 180 - 80;
                        short var48 = 321;
                        if (var10 == 1 && var11 >= var47 - 75 && var11 <= var47 + 75 && var12 >= var48 - 20 && var12 <= var48 + 20) {
                            method7();
                            return;
                        }
                        int var49 = field722 + 180 + 80;
                        if (var10 == 1 && var11 >= var49 - 75 && var11 <= var49 + 75 && var12 >= var48 - 20 && var12 <= var48 + 20) {
                            field720 = class158.field2545;
                            field735 = class158.field2579;
                            field713 = class158.field2547;
                            field718 = 2;
                            field727 = 0;
                            field724 = "";
                        }
                        while (class138.method2644()) {
                            boolean var50 = false;
                            for (int var51 = 0; var51 < field729.length(); var51++) {
                                if (Statics.field626 == field729.charAt(var51)) {
                                    var50 = true;
                                    break;
                                }
                            }
                            if (Statics.field2143 == 13) {
                                field720 = class158.field2545;
                                field735 = class158.field2579;
                                field713 = class158.field2547;
                                field718 = 2;
                                field727 = 0;
                                field724 = "";
                            } else {
                                if (Statics.field2143 == 85 && field723.length() > 0) {
                                    field723 = field723.substring(0, field723.length() - 1);
                                }
                                if (Statics.field2143 == 84) {
                                    method7();
                                    return;
                                }
                                if (var50 && field723.length() < 320) {
                                    field723 = field723 + Statics.field626;
                                }
                            }
                        }
                    } else if (field718 == 6) {
                        while (true) {
                            do {
                                if (!class138.method2644()) {
                                    short var52 = 321;
                                    if (var10 == 1 && var12 >= var52 - 20 && var12 <= var52 + 20) {
                                        field720 = class158.field2545;
                                        field735 = class158.field2579;
                                        field713 = class158.field2547;
                                        field718 = 2;
                                        field727 = 0;
                                        field724 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2143 != 84 && Statics.field2143 != 13);
                            field720 = class158.field2545;
                            field735 = class158.field2579;
                            field713 = class158.field2547;
                            field718 = 2;
                            field727 = 0;
                            field724 = "";
                        }
                    }
                }
            }
        } else if (class141.field2186 == 1 || !Statics.field1756 && class141.field2186 == 4) {
            int var1 = field704 + 280;
            if (class141.field2191 >= var1 && class141.field2191 <= var1 + 14 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                class26.method2227(0, 0);
            } else if (class141.field2191 >= var1 + 15 && class141.field2191 <= var1 + 80 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                class26.method2227(0, 1);
            } else {
                int var2 = field704 + 390;
                if (class141.field2191 >= var2 && class141.field2191 <= var2 + 14 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                    class26.method2227(1, 0);
                } else if (class141.field2191 >= var2 + 15 && class141.field2191 <= var2 + 80 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                    class26.method2227(1, 1);
                } else {
                    int var3 = field704 + 500;
                    if (class141.field2191 >= var3 && class141.field2191 <= var3 + 14 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                        class26.method2227(2, 0);
                    } else if (class141.field2191 >= var3 + 15 && class141.field2191 <= var3 + 80 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                        class26.method2227(2, 1);
                    } else {
                        int var4 = field704 + 610;
                        if (class141.field2191 >= var4 && class141.field2191 <= var4 + 14 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                            class26.method2227(3, 0);
                        } else if (class141.field2191 >= var4 + 15 && class141.field2191 <= var4 + 80 && class141.field2188 >= 4 && class141.field2188 <= 18) {
                            class26.method2227(3, 1);
                        } else if (class141.field2191 >= field704 + 708 && class141.field2188 >= 4 && class141.field2191 <= field704 + 708 + 50 && class141.field2188 <= 20) {
                            field703 = false;
                            Statics.field1101.method1608(field704, 0);
                            Statics.field706.method1608(field704 + 382, 0);
                            Statics.field2102.method1703(field704 + 382 - Statics.field2102.field1425 / 2, 18);
                        } else if (field731 != -1) {
                            class26 var5 = Statics.field637[field731];
                            method1491(var5);
                            field703 = false;
                            Statics.field1101.method1608(field704, 0);
                            Statics.field706.method1608(field704 + 382, 0);
                            Statics.field2102.method1703(field704 + 382 - Statics.field2102.field1425 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.g(I)V")
    public static void method7() {
        field723 = field723.trim();
        if (field723.length() == 0) {
            method955(class158.field2529, class158.field2585, class158.field2586);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method158("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class120 var4 = new class120(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2002, var4.field2001, 1000 - var4.field2001);
                if (var5 == -1) {
                    var4.field2001 = 0;
                    long var8 = var4.method2314();
                    var6 = var8;
                    break;
                }
                var4.field2001 += var5;
                if (var4.field2001 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = Statics.method2000(var6, field723);
        }
        switch(var13) {
            case 2:
                method955(class158.field2587, class158.field2475, class158.field2433);
                field718 = 6;
                break;
            case 3:
                method955(class158.field2590, class158.field2495, class158.field2592);
                break;
            case 4:
                method955(class158.field2593, class158.field2337, class158.field2396);
                break;
            case 5:
                method955(class158.field2596, class158.field2459, class158.field2598);
                break;
            case 6:
                method955(class158.field2599, class158.field2600, class158.field2601);
                break;
            case 7:
                method955(class158.field2424, class158.field2603, class158.field2604);
        }
    }

    @ObfuscatedName("aq.h(Lhv;Lhv;Lhv;ZI)V")
    public static void method684(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field704 = (Statics.field163 - client.field566) / 2;
            field722 = field704 + 202;
        }
        if (field703) {
            method631(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1101.method1608(field704, 0);
            Statics.field706.method1608(field704 + 382, 0);
            Statics.field2102.method1703(field704 + 382 - Statics.field2102.field1425 / 2, 18);
        }
        if (client.field463 == 0 || client.field463 == 5) {
            byte var4 = 20;
            arg0.method3707(class158.field2389, field722 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1653(field722 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1653(field722 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1666(field722 + 180 - 150, var5 + 2, field716 * 3, 30, 9179409);
            class80.method1666(field716 * 3 + (field722 + 180 - 150), var5 + 2, 300 - field716 * 3, 30, 0);
            arg0.method3707(field736, field722 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field463 == 20) {
            Statics.field2082.method1703(field722 + 180 - Statics.field2082.field1425 / 2, 271 - Statics.field2082.field1426 / 2);
            short var6 = 211;
            arg0.method3707(field720, field722 + 180, var6, 16776960, 0);
            int var103 = var6 + 15;
            arg0.method3707(field735, field722 + 180, var103, 16776960, 0);
            int var104 = var103 + 15;
            arg0.method3707(field713, field722 + 180, var104, 16776960, 0);
            int var105 = var104 + 15;
            int var106 = var105 + 10;
            if (field718 != 4) {
                arg0.method3705(class158.field2458, field722 + 180 - 110, var106, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field723; arg0.method3700(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3705(class224.method3704(var8), field722 + 180 - 70, var106, 16777215, 0);
                var103 = var106 + 15;
                String var10 = class158.field2567;
                String var11 = field724;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3705(var10 + var15, field722 + 180 - 108, var103, 16777215, 0);
                var103 += 15;
            }
        }
        if (client.field463 == 10 || client.field463 == 11) {
            Statics.field2082.method1703(field722, 171);
            if (field718 == 0) {
                short var17 = 251;
                arg0.method3707(class158.field2569, field722 + 180, var17, 16776960, 0);
                int var107 = var17 + 30;
                int var18 = field722 + 180 - 80;
                short var19 = 291;
                Statics.field705.method1703(var18 - 73, var19 - 20);
                arg0.method3722(class158.field2570, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field722 + 180 + 80;
                Statics.field705.method1703(var20 - 73, var19 - 20);
                arg0.method3722(class158.field2571, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field718 == 1) {
                arg0.method3707(field709, field722 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3707(field720, field722 + 180, var21, 16777215, 0);
                int var108 = var21 + 15;
                arg0.method3707(field735, field722 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method3707(field713, field722 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                int var22 = field722 + 180 - 80;
                short var23 = 321;
                Statics.field705.method1703(var22 - 73, var23 - 20);
                arg0.method3707(class158.field2342, var22, var23 + 5, 16777215, 0);
                int var24 = field722 + 180 + 80;
                Statics.field705.method1703(var24 - 73, var23 - 20);
                arg0.method3707(class158.field2573, var24, var23 + 5, 16777215, 0);
            } else if (field718 == 2) {
                short var25 = 211;
                arg0.method3707(field720, field722 + 180, var25, 16776960, 0);
                int var111 = var25 + 15;
                arg0.method3707(field735, field722 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method3707(field713, field722 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var114 = var113 + 10;
                arg0.method3705(class158.field2458, field722 + 180 - 110, var114, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field723; arg0.method3700(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3705(class224.method3704(var27) + (field727 == 0 & client.field333 % 40 < 20 ? class2.method2916(16776960) + class2.field21 : ""), field722 + 180 - 70, var114, 16777215, 0);
                var111 = var114 + 15;
                String var29 = class158.field2567;
                String var30 = field724;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3705(var29 + var34 + (field727 == 1 & client.field333 % 40 < 20 ? class2.method2916(16776960) + class2.field21 : ""), field722 + 180 - 108, var111, 16777215, 0);
                var111 += 15;
                int var36 = field722 + 180 - 80;
                short var37 = 321;
                Statics.field705.method1703(var36 - 73, var37 - 20);
                arg0.method3707(class158.field2381, var36, var37 + 5, 16777215, 0);
                int var38 = field722 + 180 + 80;
                Statics.field705.method1703(var38 - 73, var37 - 20);
                arg0.method3707(class158.field2573, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3707(class158.field2401, field722 + 180, var39, 16776960, 0);
            } else if (field718 == 3) {
                short var40 = 201;
                arg0.method3707(class158.field2559, field722 + 180, var40, 16776960, 0);
                int var115 = var40 + 20;
                arg1.method3707(class158.field2575, field722 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg1.method3707(class158.field2576, field722 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var41 = field722 + 180;
                short var42 = 276;
                Statics.field705.method1703(var41 - 73, var42 - 20);
                arg2.method3707(class158.field2577, var41, var42 + 5, 16777215, 0);
                int var43 = field722 + 180;
                short var44 = 326;
                Statics.field705.method1703(var43 - 73, var44 - 20);
                arg2.method3707(class158.field2584, var43, var44 + 5, 16777215, 0);
            } else if (field718 == 4) {
                arg0.method3707(class158.field2408, field722 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3707(field720, field722 + 180, var45, 16777215, 0);
                int var118 = var45 + 15;
                arg0.method3707(field735, field722 + 180, var118, 16777215, 0);
                int var119 = var118 + 15;
                arg0.method3707(field713, field722 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                String var47 = class158.field2465;
                String var48 = Statics.field1644;
                int var49 = var48.length();
                char[] var50 = new char[var49];
                for (int var51 = 0; var51 < var49; var51++) {
                    var50[var51] = '*';
                }
                String var52 = new String(var50);
                arg0.method3705(var47 + var52 + (client.field333 % 40 < 20 ? class2.method2916(16776960) + class2.field21 : ""), field722 + 180 - 108, var120, 16777215, 0);
                var118 = var120 - 8;
                arg0.method3705(class158.field2344, field722 + 180 - 9, var118, 16776960, 0);
                var118 += 15;
                arg0.method3705(class158.field2474, field722 + 180 - 9, var118, 16776960, 0);
                int var54 = field722 + 180 - 9 + arg0.method3700(class158.field2474) + 15;
                int var55 = var118 - arg0.field3194;
                class81 var56;
                if (field726) {
                    var56 = Statics.field1466;
                } else {
                    var56 = Statics.field72;
                }
                var56.method1703(var54, var55);
                var118 += 15;
                int var57 = field722 + 180 - 80;
                short var58 = 321;
                Statics.field705.method1703(var57 - 73, var58 - 20);
                arg0.method3707(class158.field2342, var57, var58 + 5, 16777215, 0);
                int var59 = field722 + 180 + 80;
                Statics.field705.method1703(var59 - 73, var58 - 20);
                arg0.method3707(class158.field2573, var59, var58 + 5, 16777215, 0);
                arg1.method3707(class158.field2562, field722 + 180, var58 + 36, 255, 0);
            } else if (field718 == 5) {
                arg0.method3707(class158.field2580, field722 + 180, 201, 16776960, 0);
                short var60 = 221;
                arg2.method3707(field720, field722 + 180, var60, 16776960, 0);
                int var121 = var60 + 15;
                arg2.method3707(field735, field722 + 180, var121, 16776960, 0);
                int var122 = var121 + 15;
                arg2.method3707(field713, field722 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                int var124 = var123 + 14;
                arg0.method3705(class158.field2581, field722 + 180 - 145, var124, 16777215, 0);
                short var61 = 174;
                String var62;
                for (var62 = field723; arg0.method3700(var62) > var61; var62 = var62.substring(1)) {
                }
                arg0.method3705(class224.method3704(var62) + (client.field333 % 40 < 20 ? class2.method2916(16776960) + class2.field21 : ""), field722 + 180 - 34, var124, 16777215, 0);
                var121 = var124 + 15;
                int var63 = field722 + 180 - 80;
                short var64 = 321;
                Statics.field705.method1703(var63 - 73, var64 - 20);
                arg0.method3707(class158.field2514, var63, var64 + 5, 16777215, 0);
                int var65 = field722 + 180 + 80;
                Statics.field705.method1703(var65 - 73, var64 - 20);
                arg0.method3707(class158.field2583, var65, var64 + 5, 16777215, 0);
            } else if (field718 == 6) {
                short var66 = 211;
                arg0.method3707(field720, field722 + 180, var66, 16776960, 0);
                int var125 = var66 + 15;
                arg0.method3707(field735, field722 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method3707(field713, field722 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var67 = field722 + 180;
                short var68 = 321;
                Statics.field705.method1703(var67 - 73, var68 - 20);
                arg0.method3707(class158.field2583, var67, var68 + 5, 16777215, 0);
            }
        }
        if (field714 > 0) {
            Statics.method1178(field714);
            field714 = 0;
        }
        short var69 = 256;
        if (field710 > 0) {
            for (int var70 = 0; var70 < 256; var70++) {
                if (field710 > 768) {
                    Statics.field1065[var70] = method127(Statics.field2006[var70], Statics.field1635[var70], 1024 - field710);
                } else if (field710 > 256) {
                    Statics.field1065[var70] = Statics.field1635[var70];
                } else {
                    Statics.field1065[var70] = method127(Statics.field1635[var70], Statics.field2006[var70], 256 - field710);
                }
            }
        } else if (field711 > 0) {
            for (int var71 = 0; var71 < 256; var71++) {
                if (field711 > 768) {
                    Statics.field1065[var71] = method127(Statics.field2006[var71], Statics.field272[var71], 1024 - field711);
                } else if (field711 > 256) {
                    Statics.field1065[var71] = Statics.field272[var71];
                } else {
                    Statics.field1065[var71] = method127(Statics.field272[var71], Statics.field2006[var71], 256 - field711);
                }
            }
        } else {
            for (int var72 = 0; var72 < 256; var72++) {
                Statics.field1065[var72] = Statics.field2006[var72];
            }
        }
        class80.method1634(field704, 9, field704 + 128, var69 + 7);
        Statics.field1101.method1608(field704, 0);
        class80.method1675();
        int var73 = 0;
        int var74 = field704 + Statics.field1647.field1403 * 9;
        for (int var75 = 1; var75 < var69 - 1; var75++) {
            int var76 = (var69 - var75) * field708[var75] / var69;
            int var77 = var76 + 22;
            if (var77 < 0) {
                var77 = 0;
            }
            var73 += var77;
            for (int var78 = var77; var78 < 128; var78++) {
                int var79 = Statics.field753[var73++];
                if (var79 == 0) {
                    var74++;
                } else {
                    int var81 = 256 - var79;
                    int var82 = Statics.field1065[var79];
                    int var83 = Statics.field1647.field1402[var74];
                    Statics.field1647.field1402[var74++] = ((var82 & 0xFF00) * var79 + (var83 & 0xFF00) * var81 & 0xFF0000) + ((var82 & 0xFF00FF) * var79 + (var83 & 0xFF00FF) * var81 & 0xFF00FF00) >> 8;
                }
            }
            var74 += Statics.field1647.field1403 + var77 - 128;
        }
        class80.method1634(field704 + 765 - 128, 9, field704 + 765, var69 + 7);
        Statics.field706.method1608(field704 + 382, 0);
        class80.method1675();
        int var84 = 0;
        int var85 = field704 + Statics.field1647.field1403 * 9 + 24 + 637;
        for (int var86 = 1; var86 < var69 - 1; var86++) {
            int var87 = (var69 - var86) * field708[var86] / var69;
            int var88 = 103 - var87;
            int var89 = var85 + var87;
            for (int var90 = 0; var90 < var88; var90++) {
                int var91 = Statics.field753[var84++];
                if (var91 == 0) {
                    var89++;
                } else {
                    int var93 = 256 - var91;
                    int var94 = Statics.field1065[var91];
                    int var95 = Statics.field1647.field1402[var89];
                    Statics.field1647.field1402[var89++] = ((var94 & 0xFF00FF) * var91 + (var95 & 0xFF00FF) * var93 & 0xFF00FF00) + ((var94 & 0xFF00) * var91 + (var95 & 0xFF00) * var93 & 0xFF0000) >> 8;
                }
            }
            var84 += 128 - var88;
            var85 = Statics.field1647.field1403 - var88 - var87 + var89;
        }
        Statics.field712[Statics.field1989.field146 ? 1 : 0].method1703(field704 + 765 - 40, 463);
        if (client.field463 > 5 && client.field289 == 0) {
            if (Statics.field1542 == null) {
                Statics.field1542 = class77.method672(Statics.field204, "sl_button", "");
            } else {
                int var96 = field704 + 5;
                short var97 = 463;
                byte var98 = 100;
                byte var99 = 35;
                Statics.field1542.method1703(var96, var97);
                arg0.method3707(class158.field2499 + " " + client.field479, var98 / 2 + var96, var99 / 2 + var97 - 2, 16777215, 0);
                if (Statics.field970 == null) {
                    arg1.method3707(class158.field2444, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                } else {
                    arg1.method3707(class158.field2552, var98 / 2 + var96, var99 / 2 + var97 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var100 = Statics.field1222.getGraphics();
            Statics.field1647.method1459(var100, 0, 0);
        } catch (Exception var102) {
            Statics.field1222.repaint();
        }
    }

    @ObfuscatedName("af.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method955(String arg0, String arg1, String arg2) {
        field720 = arg0;
        field735 = arg1;
        field713 = arg2;
    }

    @ObfuscatedName("eu.r(Lct;B)V")
    public static final void method2785(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2679.length; var2++) {
            Statics.field2679[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2679[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field701[var8] = (Statics.field2679[var8 - 1] + Statics.field2679[var8 + 1] + Statics.field2679[var8 - 128] + Statics.field2679[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2679;
            Statics.field2679 = Statics.field701;
            Statics.field701 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1426; var11++) {
            for (int var12 = 0; var12 < arg0.field1425; var12++) {
                if (arg0.field1429[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1430;
                    int var14 = var11 + 16 + arg0.field1428;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2679[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("p.s(IIII)I")
    public static final int method127(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("av.d(Lhv;Lhv;I)V")
    public static void method631(class225 arg0, class225 arg1) {
        if (Statics.field2718 == null) {
            Statics.field2718 = class77.method941(Statics.field204, "sl_back", "");
        }
        if (Statics.field1957 == null) {
            Statics.field1957 = class77.method3630(Statics.field204, "sl_flags", "");
        }
        if (Statics.field187 == null) {
            Statics.field187 = class77.method3630(Statics.field204, "sl_arrows", "");
        }
        if (Statics.field1040 == null) {
            Statics.field1040 = class77.method3630(Statics.field204, "sl_stars", "");
        }
        class80.method1666(field704, 23, 765, 480, 0);
        class80.method1645(field704, 0, 125, 23, 12425273, 9135624);
        class80.method1645(field704 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3707(class158.field2421, field704 + 62, 15, 0, -1);
        if (Statics.field1040 != null) {
            Statics.field1040[1].method1703(field704 + 140, 1);
            arg1.method3705(class158.field2606, field704 + 152, 10, 16777215, -1);
            Statics.field1040[0].method1703(field704 + 140, 12);
            arg1.method3705(class158.field2607, field704 + 152, 21, 16777215, -1);
        }
        if (Statics.field187 != null) {
            int var2 = field704 + 280;
            if (class26.field644[0] == 0 && class26.field636[0] == 0) {
                Statics.field187[2].method1703(var2, 4);
            } else {
                Statics.field187[0].method1703(var2, 4);
            }
            if (class26.field644[0] == 0 && class26.field636[0] == 1) {
                Statics.field187[3].method1703(var2 + 15, 4);
            } else {
                Statics.field187[1].method1703(var2 + 15, 4);
            }
            arg0.method3705(class158.field2608, var2 + 32, 17, 16777215, -1);
            int var3 = field704 + 390;
            if (class26.field644[0] == 1 && class26.field636[0] == 0) {
                Statics.field187[2].method1703(var3, 4);
            } else {
                Statics.field187[0].method1703(var3, 4);
            }
            if (class26.field644[0] == 1 && class26.field636[0] == 1) {
                Statics.field187[3].method1703(var3 + 15, 4);
            } else {
                Statics.field187[1].method1703(var3 + 15, 4);
            }
            arg0.method3705(class158.field2609, var3 + 32, 17, 16777215, -1);
            int var4 = field704 + 500;
            if (class26.field644[0] == 2 && class26.field636[0] == 0) {
                Statics.field187[2].method1703(var4, 4);
            } else {
                Statics.field187[0].method1703(var4, 4);
            }
            if (class26.field644[0] == 2 && class26.field636[0] == 1) {
                Statics.field187[3].method1703(var4 + 15, 4);
            } else {
                Statics.field187[1].method1703(var4 + 15, 4);
            }
            arg0.method3705(class158.field2610, var4 + 32, 17, 16777215, -1);
            int var5 = field704 + 610;
            if (class26.field644[0] == 3 && class26.field636[0] == 0) {
                Statics.field187[2].method1703(var5, 4);
            } else {
                Statics.field187[0].method1703(var5, 4);
            }
            if (class26.field644[0] == 3 && class26.field636[0] == 1) {
                Statics.field187[3].method1703(var5 + 15, 4);
            } else {
                Statics.field187[1].method1703(var5 + 15, 4);
            }
            arg0.method3705(class158.field2611, var5 + 32, 17, 16777215, -1);
        }
        class80.method1666(field704 + 708, 4, 50, 16, 0);
        arg1.method3707(class158.field2573, field704 + 708 + 25, 16, 16777215, -1);
        field731 = -1;
        if (Statics.field2718 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class26.field630) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class26.field630) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class26.field630) {
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
            int var17 = field704 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class26.field630; var20++) {
                class26 var21 = Statics.field637[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field640);
                if (var21.field640 == -1) {
                    var23 = class158.field2612;
                    var22 = false;
                } else if (var21.field640 > 1980) {
                    var23 = class158.field2572;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method592()) {
                    if (var21.method570()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method574()) {
                    var24 = 16711680;
                    if (var21.method570()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method572()) {
                    if (var21.method570()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method570()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class141.field2193 >= var17 && class141.field2190 >= var16 && class141.field2193 < var6 + var17 && class141.field2190 < var7 + var16 && var22) {
                    field731 = var20;
                    Statics.field2718[var25].method1560(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2718[var25].method1608(var17, var16);
                }
                if (Statics.field1957 != null) {
                    Statics.field1957[(var21.method570() ? 8 : 0) + var21.field643].method1703(var17 + 29, var16);
                }
                arg0.method3707(Integer.toString(var21.field638 == 374 ? 666 : var21.field638), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3707(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3700(Statics.field637[field731].field634) + 6;
                int var27 = arg1.field3194 + 8;
                class80.method1666(class141.field2193 - var26 / 2, class141.field2190 + 20 + 5, var26, var27, 16777120);
                class80.method1653(class141.field2193 - var26 / 2, class141.field2190 + 20 + 5, var26, var27, 0);
                arg1.method3707(Statics.field637[field731].field634, class141.field2193, class141.field2190 + 20 + 5 + arg1.field3194 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1222.getGraphics();
            Statics.field1647.method1459(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1222.repaint();
        }
    }

    @ObfuscatedName("bc.l(Le;I)V")
    public static void method1491(class26 arg0) {
        if (arg0.method570() != client.field287) {
            client.field287 = arg0.method570();
            boolean var1 = arg0.method570();
            if (Statics.field1161 != var1) {
                class52.method169();
                Statics.field1161 = var1;
            }
        }
        Statics.field2671 = arg0.field641;
        client.field479 = arg0.field638;
        client.field284 = arg0.field646;
        Statics.field1940 = client.field385 == 0 ? 43594 : arg0.field638 + 40000;
        Statics.field1887 = client.field385 == 0 ? 443 : arg0.field638 + 50000;
        Statics.field783 = Statics.field1940;
    }
}

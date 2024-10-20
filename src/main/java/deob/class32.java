package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ae")
public class class32 {

    @ObfuscatedName("ae.d")
    public static int field713 = 0;

    @ObfuscatedName("ae.b")
    public static int field719 = field713 + 202;

    @ObfuscatedName("ae.r")
    public static int[] field720 = new int[256];

    @ObfuscatedName("ae.l")
    public static int field721 = 0;

    @ObfuscatedName("ae.u")
    public static int field722 = 0;

    @ObfuscatedName("ae.ao")
    public static int field723 = 0;

    @ObfuscatedName("ae.ai")
    public static int field732 = 0;

    @ObfuscatedName("ae.ab")
    public static int field727 = 0;

    @ObfuscatedName("ae.ae")
    public static int field726 = 0;

    @ObfuscatedName("ae.aw")
    public static int field714 = 10;

    @ObfuscatedName("ae.aj")
    public static String field728 = "";

    @ObfuscatedName("ae.ay")
    public static int field729 = 0;

    @ObfuscatedName("ae.af")
    public static String field725 = "";

    @ObfuscatedName("ae.al")
    public static String field724 = "";

    @ObfuscatedName("ae.aq")
    public static String field739 = "";

    @ObfuscatedName("ae.ak")
    public static String field733 = "";

    @ObfuscatedName("ae.az")
    public static String field734 = "";

    @ObfuscatedName("ae.ar")
    public static class159 field735 = class159.field2574;

    @ObfuscatedName("ae.an")
    public static boolean field737 = true;

    @ObfuscatedName("ae.au")
    public static int field738 = 0;

    @ObfuscatedName("ae.av")
    public static String field741 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ae.ac")
    public static String field740 = "1234567890";

    @ObfuscatedName("ae.ad")
    public static boolean field730 = false;

    @ObfuscatedName("ae.bf")
    public static int field742 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.y(Lfu;Lfu;I)I")
    public static int method140(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3014("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3014("logo", "")) {
            var2++;
        }
        if (arg1.method3014("titlebox", "")) {
            var2++;
        }
        if (arg1.method3014("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3014("runes", "")) {
            var2++;
        }
        if (arg1.method3014("title_mute", "")) {
            var2++;
        }
        if (arg1.method3015("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3015("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3014("sl_back", "");
        arg1.method3014("sl_flags", "");
        arg1.method3014("sl_arrows", "");
        arg1.method3014("sl_stars", "");
        arg1.method3014("sl_button", "");
        return var2;
    }

    @ObfuscatedName("b.d(B)I")
    public static int method185() {
        return 8;
    }

    @ObfuscatedName("fk.g(Ljava/awt/Component;Lfu;Lfu;ZII)V")
    public static void method3152(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field731) {
            field729 = arg4;
            class80.method1698();
            byte[] var5 = arg1.method3013("title.jpg", "");
            Statics.field3142 = new class79(var5, arg0);
            Statics.field1219 = Statics.field3142.method1573();
            Statics.field2170 = class77.method917(arg2, "logo", "");
            Statics.field715 = class77.method917(arg2, "titlebox", "");
            Statics.field2639 = class77.method917(arg2, "titlebutton", "");
            Statics.field1750 = class77.method195(arg2, "runes", "");
            Statics.field716 = class77.method195(arg2, "title_mute", "");
            Statics.field717 = class77.method917(arg2, "options_radio_buttons,0", "");
            Statics.field718 = class77.method917(arg2, "options_radio_buttons,2", "");
            Statics.field705 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field705[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field705[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field705[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field705[var9 + 192] = 16777215;
            }
            Statics.field186 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field186[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field186[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field186[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field186[var13 + 192] = 16777215;
            }
            Statics.field678 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field678[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field678[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field678[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field678[var17 + 192] = 16777215;
            }
            Statics.field1382 = new int[256];
            Statics.field622 = new int[32768];
            Statics.field70 = new int[32768];
            method3418((class81) null);
            Statics.field1393 = new int[32768];
            Statics.field2895 = new int[32768];
            if (arg3) {
                field733 = "";
                field734 = "";
            }
            Statics.field2258 = 0;
            Statics.field736 = "";
            field737 = true;
            field730 = false;
            if (Statics.field1549.field145) {
                class183.method553(2);
            } else {
                class168 var18 = Statics.field767;
                int var19 = var18.method3005("scape main");
                int var20 = var18.method3012(var19, "");
                class183.field2928 = 1;
                Statics.field2924 = var18;
                Statics.field630 = var19;
                Statics.field2930 = var20;
                Statics.field680 = 255;
                Statics.field1515 = false;
                Statics.field2931 = 2;
            }
            class171.method1749(false);
            Statics.field731 = true;
            field713 = (Statics.field2114 - client.field505 * 765) / 2;
            field719 = field713 + 202;
            Statics.field3142.method1647(field713, 0);
            Statics.field1219.method1647(field713 + 382, 0);
            Statics.field2170.method1724(field713 + 382 - Statics.field2170.field1422 / 2, 18);
        } else if (arg4 == 4) {
            field729 = 4;
        }
    }

    @ObfuscatedName("an.w(Lek;I)V")
    public static void method890(class144 arg0) {
        if (!field730) {
            if ((class140.field2137 == 1 || !Statics.field319 && class140.field2137 == 4) && class140.field2134 >= field713 + 765 - 50 && class140.field2133 >= 453) {
                Statics.field1549.field145 = !Statics.field1549.field145;
                class9.method38();
                if (Statics.field1549.field145) {
                    class183.method2657();
                } else {
                    class183.method3102(Statics.field767, "scape main", "", 255, false);
                }
            }
            if (client.field301 != 5) {
                field727++;
                if (client.field301 == 10 || client.field301 == 11) {
                    if (client.field316 == 0) {
                        if (class140.field2137 == 1 || !Statics.field319 && class140.field2137 == 4) {
                            int var6 = field713 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class140.field2134 >= var6 && class140.field2134 <= var6 + var8 && class140.field2133 >= var7 && class140.field2133 <= var7 + var9) {
                                Statics.method45();
                                return;
                            }
                        }
                        if (Statics.field1447 != null) {
                            Statics.method45();
                        }
                    }
                    int var10 = class140.field2137;
                    int var11 = class140.field2134;
                    int var12 = class140.field2133;
                    if (!Statics.field319 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field729 == 0) {
                        int var13 = field719 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            String var15 = client.method613("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class138.method2244(var15, true, "openjs", false);
                        }
                        int var16 = field719 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field409 & 0x4) != 0) {
                                if ((client.field409 & 0x400) == 0) {
                                    field725 = class157.field2432;
                                    field724 = class157.field2509;
                                    field739 = class157.field2510;
                                } else {
                                    field725 = class157.field2514;
                                    field724 = class157.field2515;
                                    field739 = class157.field2516;
                                }
                                field729 = 1;
                                field738 = 0;
                            } else if ((client.field409 & 0x400) == 0) {
                                field725 = class157.field2504;
                                field724 = class157.field2505;
                                field739 = class157.field2506;
                                field729 = 2;
                                field738 = 0;
                            } else {
                                field725 = class157.field2511;
                                field724 = class157.field2512;
                                field739 = class157.field2550;
                                field729 = 1;
                                field738 = 0;
                            }
                        }
                    } else if (field729 == 1) {
                        while (class137.method2009()) {
                            if (Statics.field2016 == 84) {
                                field725 = class157.field2504;
                                field724 = class157.field2505;
                                field739 = class157.field2506;
                                field729 = 2;
                                field738 = 0;
                            } else if (Statics.field2016 == 13) {
                                field729 = 0;
                            }
                        }
                        int var17 = field719 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field725 = class157.field2504;
                            field724 = class157.field2505;
                            field739 = class157.field2506;
                            field729 = 2;
                            field738 = 0;
                        }
                        int var19 = field719 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field729 = 0;
                        }
                    } else if (field729 == 2) {
                        short var20 = 231;
                        int var39 = var20 + 30;
                        if (var10 == 1 && var12 >= var39 - 15 && var12 < var39) {
                            field738 = 0;
                        }
                        var39 += 15;
                        if (var10 == 1 && var12 >= var39 - 15 && var12 < var39) {
                            field738 = 1;
                        }
                        var39 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method718(class157.field2349, class157.field2536, class157.field2361);
                            field729 = 5;
                            return;
                        }
                        int var22 = field719 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field733 = field733.trim();
                            if (field733.length() == 0) {
                                method718(class157.field2410, class157.field2411, class157.field2412);
                                return;
                            }
                            if (field734.length() == 0) {
                                method718(class157.field2413, class157.field2513, class157.field2415);
                                return;
                            }
                            method718(class157.field2527, class157.field2520, class157.field2521);
                            field735 = Statics.field1549.field147.containsKey(class163.method614(field733)) ? class159.field2572 : class159.field2574;
                            client.method139(20);
                            return;
                        }
                        int var24 = field719 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field729 = 0;
                            field733 = "";
                            field734 = "";
                            Statics.field2258 = 0;
                            Statics.field736 = "";
                            field737 = true;
                        }
                        while (true) {
                            while (class137.method2009()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field741.length(); var26++) {
                                    if (Statics.field183 == field741.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2016 == 13) {
                                    field729 = 0;
                                    field733 = "";
                                    field734 = "";
                                    Statics.field2258 = 0;
                                    Statics.field736 = "";
                                    field737 = true;
                                } else if (field738 == 0) {
                                    if (Statics.field2016 == 85 && field733.length() > 0) {
                                        field733 = field733.substring(0, field733.length() - 1);
                                    }
                                    if (Statics.field2016 == 84 || Statics.field2016 == 80) {
                                        field738 = 1;
                                    }
                                    if (var25 && field733.length() < 320) {
                                        field733 = field733 + Statics.field183;
                                    }
                                } else if (field738 == 1) {
                                    if (Statics.field2016 == 85 && field734.length() > 0) {
                                        field734 = field734.substring(0, field734.length() - 1);
                                    }
                                    if (Statics.field2016 == 84 || Statics.field2016 == 80) {
                                        field738 = 0;
                                    }
                                    if (Statics.field2016 == 84) {
                                        field733 = field733.trim();
                                        if (field733.length() == 0) {
                                            method718(class157.field2410, class157.field2411, class157.field2412);
                                            return;
                                        }
                                        if (field734.length() == 0) {
                                            method718(class157.field2413, class157.field2513, class157.field2415);
                                            return;
                                        }
                                        method718(class157.field2527, class157.field2520, class157.field2521);
                                        field735 = Statics.field1549.field147.containsKey(class163.method614(field733)) ? class159.field2572 : class159.field2574;
                                        client.method139(20);
                                        return;
                                    }
                                    if (var25 && field734.length() < 20) {
                                        field734 = field734 + Statics.field183;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field729 == 4) {
                        int var27 = field719 + 180 - 80;
                        short var28 = 321;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            Statics.field736.trim();
                            if (Statics.field736.length() != 6) {
                                method718(class157.field2332, class157.field2366, class157.field2401);
                                return;
                            }
                            Statics.field2258 = Integer.parseInt(Statics.field736);
                            Statics.field736 = "";
                            field735 = field737 ? class159.field2571 : class159.field2573;
                            method718(class157.field2527, class157.field2520, class157.field2521);
                            client.method139(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field719 + 180 - 9 && var11 <= field719 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field737 = !field737;
                        }
                        if (var10 == 1 && var11 >= field719 + 180 - 34 && var11 <= field719 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            String var29 = client.method613("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class138.method2244(var29, true, "openjs", false);
                        }
                        int var30 = field719 + 180 + 80;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field729 = 0;
                            field733 = "";
                            field734 = "";
                            Statics.field2258 = 0;
                            Statics.field736 = "";
                        }
                        while (class137.method2009()) {
                            boolean var31 = false;
                            for (int var32 = 0; var32 < field740.length(); var32++) {
                                if (Statics.field183 == field740.charAt(var32)) {
                                    var31 = true;
                                    break;
                                }
                            }
                            if (Statics.field2016 == 13) {
                                field729 = 0;
                                field733 = "";
                                field734 = "";
                                Statics.field2258 = 0;
                                Statics.field736 = "";
                            } else {
                                if (Statics.field2016 == 85 && Statics.field736.length() > 0) {
                                    Statics.field736 = Statics.field736.substring(0, Statics.field736.length() - 1);
                                }
                                if (Statics.field2016 == 84) {
                                    Statics.field736.trim();
                                    if (Statics.field736.length() != 6) {
                                        method718(class157.field2332, class157.field2366, class157.field2401);
                                        return;
                                    }
                                    Statics.field2258 = Integer.parseInt(Statics.field736);
                                    Statics.field736 = "";
                                    field735 = field737 ? class159.field2571 : class159.field2573;
                                    method718(class157.field2527, class157.field2520, class157.field2521);
                                    client.method139(20);
                                    return;
                                }
                                if (var31 && Statics.field736.length() < 6) {
                                    Statics.field736 = Statics.field736 + Statics.field183;
                                }
                            }
                        }
                    } else if (field729 == 5) {
                        int var33 = field719 + 180 - 80;
                        short var34 = 321;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                            method102();
                            return;
                        }
                        int var35 = field719 + 180 + 80;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                            field725 = class157.field2504;
                            field724 = class157.field2505;
                            field739 = class157.field2506;
                            field729 = 2;
                            field738 = 0;
                            field734 = "";
                        }
                        while (class137.method2009()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field741.length(); var37++) {
                                if (Statics.field183 == field741.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field2016 == 13) {
                                field725 = class157.field2504;
                                field724 = class157.field2505;
                                field739 = class157.field2506;
                                field729 = 2;
                                field738 = 0;
                                field734 = "";
                            } else {
                                if (Statics.field2016 == 85 && field733.length() > 0) {
                                    field733 = field733.substring(0, field733.length() - 1);
                                }
                                if (Statics.field2016 == 84) {
                                    method102();
                                    return;
                                }
                                if (var36 && field733.length() < 320) {
                                    field733 = field733 + Statics.field183;
                                }
                            }
                        }
                    } else if (field729 == 6) {
                        while (true) {
                            do {
                                if (!class137.method2009()) {
                                    short var38 = 321;
                                    if (var10 == 1 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                                        field725 = class157.field2504;
                                        field724 = class157.field2505;
                                        field739 = class157.field2506;
                                        field729 = 2;
                                        field738 = 0;
                                        field734 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2016 != 84 && Statics.field2016 != 13);
                            field725 = class157.field2504;
                            field724 = class157.field2505;
                            field739 = class157.field2506;
                            field729 = 2;
                            field738 = 0;
                            field734 = "";
                        }
                    }
                }
            }
        } else if (class140.field2137 == 1 || !Statics.field319 && class140.field2137 == 4) {
            int var1 = field713 + 280;
            if (class140.field2134 >= var1 && class140.field2134 <= var1 + 14 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                class26.method1055(0, 0);
            } else if (class140.field2134 >= var1 + 15 && class140.field2134 <= var1 + 80 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                class26.method1055(0, 1);
            } else {
                int var2 = field713 + 390;
                if (class140.field2134 >= var2 && class140.field2134 <= var2 + 14 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                    class26.method1055(1, 0);
                } else if (class140.field2134 >= var2 + 15 && class140.field2134 <= var2 + 80 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                    class26.method1055(1, 1);
                } else {
                    int var3 = field713 + 500;
                    if (class140.field2134 >= var3 && class140.field2134 <= var3 + 14 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                        class26.method1055(2, 0);
                    } else if (class140.field2134 >= var3 + 15 && class140.field2134 <= var3 + 80 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                        class26.method1055(2, 1);
                    } else {
                        int var4 = field713 + 610;
                        if (class140.field2134 >= var4 && class140.field2134 <= var4 + 14 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                            class26.method1055(3, 0);
                        } else if (class140.field2134 >= var4 + 15 && class140.field2134 <= var4 + 80 && class140.field2133 >= 4 && class140.field2133 <= 18) {
                            class26.method1055(3, 1);
                        } else if (class140.field2134 >= field713 + 708 && class140.field2133 >= 4 && class140.field2134 <= field713 + 708 + 50 && class140.field2133 <= 20) {
                            field730 = false;
                            Statics.field3142.method1647(field713, 0);
                            Statics.field1219.method1647(field713 + 382, 0);
                            Statics.field2170.method1724(field713 + 382 - Statics.field2170.field1422 / 2, 18);
                        } else if (field742 != -1) {
                            class26 var5 = Statics.field634[field742];
                            Statics.method980(var5);
                            field730 = false;
                            Statics.field3142.method1647(field713, 0);
                            Statics.field1219.method1647(field713 + 382, 0);
                            Statics.field2170.method1724(field713 + 382 - Statics.field2170.field1422 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.e(B)V")
    public static void method102() {
        field733 = field733.trim();
        if (field733.length() == 0) {
            method718(class157.field2349, class157.field2536, class157.field2361);
            return;
        }
        long var0 = class10.method46();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field733;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2354(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2423(var4.nextInt());
            }
            var5.method2423(var7[0]);
            var5.method2423(var7[1]);
            var5.method2316(var0);
            var5.method2316(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2423(var4.nextInt());
            }
            var5.method2346(class10.field160, class10.field161);
            var6.method2354(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2423(var4.nextInt());
            }
            var6.method2316(var4.nextLong());
            var6.method2324(var4.nextLong());
            class149.method1567(var6);
            var6.method2316(var4.nextLong());
            var6.method2346(class10.field160, class10.field161);
            int var11 = class119.method636(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class119 var12 = new class119(var11);
            var12.method2372(var3);
            var12.field1973 = var11;
            var12.method2432(var7);
            class119 var13 = new class119(var12.field1973 + var6.field1973 + var5.field1973 + 5);
            var13.method2354(2);
            var13.method2354(var5.field1973);
            var13.method2311(var5.field1974, 0, var5.field1973);
            var13.method2354(var6.field1973);
            var13.method2311(var6.field1974, 0, var6.field1973);
            var13.method2312(var12.field1973);
            var13.method2311(var12.field1974, 0, var12.field1973);
            byte[] var14 = var13.field1974;
            String var15 = class161.method570(var14, 0, var14.length);
            String var16 = var15;
            byte var23;
            try {
                URL var17 = new URL(client.method613("services", false) + "m=accountappeal/login.ws");
                URLConnection var18 = var17.openConnection();
                var18.setDoInput(true);
                var18.setDoOutput(true);
                var18.setConnectTimeout(5000);
                OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                var19.write("data2=" + class226.method888(var16) + "&dest=" + class226.method888("passwordchoice.ws"));
                var19.flush();
                InputStream var20 = var18.getInputStream();
                class119 var21 = new class119(new byte[1000]);
                while (true) {
                    int var22 = var20.read(var21.field1974, var21.field1973, 1000 - var21.field1973);
                    if (var22 == -1) {
                        var19.close();
                        var20.close();
                        String var24 = new String(var21.field1974);
                        if (var24.startsWith("OFFLINE")) {
                            var23 = 4;
                        } else if (var24.startsWith("WRONG")) {
                            var23 = 7;
                        } else if (var24.startsWith("RELOAD")) {
                            var23 = 3;
                        } else if (var24.startsWith("Not permitted for social network accounts.")) {
                            var23 = 6;
                        } else {
                            var21.method2343(var7);
                            while (var21.field1973 > 0 && var21.field1974[var21.field1973 - 1] == 0) {
                                var21.field1973--;
                            }
                            String var25 = new String(var21.field1974, 0, var21.field1973);
                            if (class10.method141(var25)) {
                                class138.method2244(var25, true, "openjs", false);
                                var23 = 2;
                            } else {
                                var23 = 5;
                            }
                        }
                        break;
                    }
                    var21.field1973 += var22;
                    if (var21.field1973 >= 1000) {
                        var23 = 5;
                        break;
                    }
                }
            } catch (Throwable var27) {
                var27.printStackTrace();
                var23 = 5;
            }
            var2 = var23;
        }
        switch(var2) {
            case 2:
                method718(class157.field2312, class157.field2539, class157.field2540);
                field729 = 6;
                break;
            case 3:
                method718(class157.field2561, class157.field2542, class157.field2543);
                break;
            case 4:
                method718(class157.field2544, class157.field2545, class157.field2546);
                break;
            case 5:
                method718(class157.field2490, class157.field2548, class157.field2549);
                break;
            case 6:
                method718(class157.field2292, class157.field2431, class157.field2328);
                break;
            case 7:
                method718(class157.field2352, class157.field2463, class157.field2555);
        }
    }

    @ObfuscatedName("dp.c(Lhi;Lhi;Lhi;ZI)V")
    public static void method2243(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field713 = (Statics.field2114 - client.field505 * 765) / 2;
            field719 = field713 + 202;
        }
        if (field730) {
            method702(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field3142.method1647(field713, 0);
            Statics.field1219.method1647(field713 + 382, 0);
            Statics.field2170.method1724(field713 + 382 - Statics.field2170.field1422 / 2, 18);
        }
        if (client.field301 == 0 || client.field301 == 5) {
            byte var4 = 20;
            arg0.method3741(class157.field2503, field719 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1703(field719 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1703(field719 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1670(field719 + 180 - 150, var5 + 2, field714 * 3, 30, 9179409);
            class80.method1670(field714 * 3 + (field719 + 180 - 150), var5 + 2, 300 - field714 * 3, 30, 0);
            arg0.method3741(field728, field719 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field301 == 20) {
            Statics.field715.method1724(field719 + 180 - Statics.field715.field1422 / 2, 271 - Statics.field715.field1423 / 2);
            short var6 = 211;
            arg0.method3741(field725, field719 + 180, var6, 16776960, 0);
            int var98 = var6 + 15;
            arg0.method3741(field724, field719 + 180, var98, 16776960, 0);
            int var99 = var98 + 15;
            arg0.method3741(field739, field719 + 180, var99, 16776960, 0);
            int var100 = var99 + 15;
            int var101 = var100 + 10;
            if (field729 != 4) {
                arg0.method3702(class157.field2522, field719 + 180 - 110, var101, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field733; arg0.method3758(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3702(class223.method3766(var8), field719 + 180 - 70, var101, 16777215, 0);
                var98 = var101 + 15;
                String var10 = class157.field2492;
                String var11 = field734;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3702(var10 + var15, field719 + 180 - 108, var98, 16777215, 0);
                var98 += 15;
            }
        }
        if (client.field301 == 10 || client.field301 == 11) {
            Statics.field715.method1724(field719, 171);
            if (field729 == 0) {
                short var17 = 251;
                arg0.method3741(class157.field2525, field719 + 180, var17, 16776960, 0);
                int var102 = var17 + 30;
                int var18 = field719 + 180 - 80;
                short var19 = 291;
                Statics.field2639.method1724(var18 - 73, var19 - 20);
                arg0.method3697(class157.field2526, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field719 + 180 + 80;
                Statics.field2639.method1724(var20 - 73, var19 - 20);
                arg0.method3697(class157.field2445, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field729 == 1) {
                arg0.method3741(class157.field2547, field719 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3741(field725, field719 + 180, var21, 16777215, 0);
                int var103 = var21 + 15;
                arg0.method3741(field724, field719 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method3741(field739, field719 + 180, var104, 16777215, 0);
                int var105 = var104 + 15;
                int var22 = field719 + 180 - 80;
                short var23 = 321;
                Statics.field2639.method1724(var22 - 73, var23 - 20);
                arg0.method3741(class157.field2298, var22, var23 + 5, 16777215, 0);
                int var24 = field719 + 180 + 80;
                Statics.field2639.method1724(var24 - 73, var23 - 20);
                arg0.method3741(class157.field2470, var24, var23 + 5, 16777215, 0);
            } else if (field729 == 2) {
                short var25 = 211;
                arg0.method3741(field725, field719 + 180, var25, 16776960, 0);
                int var106 = var25 + 15;
                arg0.method3741(field724, field719 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg0.method3741(field739, field719 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var109 = var108 + 10;
                arg0.method3702(class157.field2522, field719 + 180 - 110, var109, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field733; arg0.method3758(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3702(class223.method3766(var27) + (field738 == 0 & client.field303 % 40 < 20 ? class2.method2122(16776960) + class2.field18 : ""), field719 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                String var29 = class157.field2492;
                String var30 = field734;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3702(var29 + var34 + (field738 == 1 & client.field303 % 40 < 20 ? class2.method2122(16776960) + class2.field18 : ""), field719 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
                int var36 = field719 + 180 - 80;
                short var37 = 321;
                Statics.field2639.method1724(var36 - 73, var37 - 20);
                arg0.method3741(class157.field2528, var36, var37 + 5, 16777215, 0);
                int var38 = field719 + 180 + 80;
                Statics.field2639.method1724(var38 - 73, var37 - 20);
                arg0.method3741(class157.field2470, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3741(class157.field2530, field719 + 180, var39, 16776960, 0);
            } else if (field729 == 4) {
                arg0.method3741(class157.field2517, field719 + 180, 211, 16776960, 0);
                short var40 = 236;
                arg0.method3741(field725, field719 + 180, var40, 16777215, 0);
                int var110 = var40 + 15;
                arg0.method3741(field724, field719 + 180, var110, 16777215, 0);
                int var111 = var110 + 15;
                arg0.method3741(field739, field719 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                String var42 = class157.field2524;
                String var43 = Statics.field736;
                int var44 = var43.length();
                char[] var45 = new char[var44];
                for (int var46 = 0; var46 < var44; var46++) {
                    var45[var46] = '*';
                }
                String var47 = new String(var45);
                arg0.method3702(var42 + var47 + (client.field303 % 40 < 20 ? class2.method2122(16776960) + class2.field18 : ""), field719 + 180 - 108, var112, 16777215, 0);
                var110 = var112 - 8;
                arg0.method3702(class157.field2300, field719 + 180 - 9, var110, 16776960, 0);
                var110 += 15;
                arg0.method3702(class157.field2301, field719 + 180 - 9, var110, 16776960, 0);
                int var49 = field719 + 180 - 9 + arg0.method3758(class157.field2301) + 15;
                int var50 = var110 - arg0.field3163;
                class81 var51;
                if (field737) {
                    var51 = Statics.field718;
                } else {
                    var51 = Statics.field717;
                }
                var51.method1724(var49, var50);
                var110 += 15;
                int var52 = field719 + 180 - 80;
                short var53 = 321;
                Statics.field2639.method1724(var52 - 73, var53 - 20);
                arg0.method3741(class157.field2298, var52, var53 + 5, 16777215, 0);
                int var54 = field719 + 180 + 80;
                Statics.field2639.method1724(var54 - 73, var53 - 20);
                arg0.method3741(class157.field2470, var54, var53 + 5, 16777215, 0);
                arg1.method3741(class157.field2518, field719 + 180, var53 + 36, 255, 0);
            } else if (field729 == 5) {
                arg0.method3741(class157.field2531, field719 + 180, 201, 16776960, 0);
                short var55 = 221;
                arg2.method3741(field725, field719 + 180, var55, 16776960, 0);
                int var113 = var55 + 15;
                arg2.method3741(field724, field719 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method3741(field739, field719 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 14;
                arg0.method3702(class157.field2532, field719 + 180 - 145, var116, 16777215, 0);
                short var56 = 174;
                String var57;
                for (var57 = field733; arg0.method3758(var57) > var56; var57 = var57.substring(1)) {
                }
                arg0.method3702(class223.method3766(var57) + (client.field303 % 40 < 20 ? class2.method2122(16776960) + class2.field18 : ""), field719 + 180 - 34, var116, 16777215, 0);
                var113 = var116 + 15;
                int var58 = field719 + 180 - 80;
                short var59 = 321;
                Statics.field2639.method1724(var58 - 73, var59 - 20);
                arg0.method3741(class157.field2448, var58, var59 + 5, 16777215, 0);
                int var60 = field719 + 180 + 80;
                Statics.field2639.method1724(var60 - 73, var59 - 20);
                arg0.method3741(class157.field2534, var60, var59 + 5, 16777215, 0);
            } else if (field729 == 6) {
                short var61 = 211;
                arg0.method3741(field725, field719 + 180, var61, 16776960, 0);
                int var117 = var61 + 15;
                arg0.method3741(field724, field719 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3741(field739, field719 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var62 = field719 + 180;
                short var63 = 321;
                Statics.field2639.method1724(var62 - 73, var63 - 20);
                arg0.method3741(class157.field2534, var62, var63 + 5, 16777215, 0);
            }
        }
        if (field727 > 0) {
            method2263(field727);
            field727 = 0;
        }
        short var64 = 256;
        if (field721 > 0) {
            for (int var65 = 0; var65 < 256; var65++) {
                if (field721 > 768) {
                    Statics.field1382[var65] = method584(Statics.field705[var65], Statics.field186[var65], 1024 - field721);
                } else if (field721 > 256) {
                    Statics.field1382[var65] = Statics.field186[var65];
                } else {
                    Statics.field1382[var65] = method584(Statics.field186[var65], Statics.field705[var65], 256 - field721);
                }
            }
        } else if (field722 > 0) {
            for (int var66 = 0; var66 < 256; var66++) {
                if (field722 > 768) {
                    Statics.field1382[var66] = method584(Statics.field705[var66], Statics.field678[var66], 1024 - field722);
                } else if (field722 > 256) {
                    Statics.field1382[var66] = Statics.field678[var66];
                } else {
                    Statics.field1382[var66] = method584(Statics.field678[var66], Statics.field705[var66], 256 - field722);
                }
            }
        } else {
            for (int var67 = 0; var67 < 256; var67++) {
                Statics.field1382[var67] = Statics.field705[var67];
            }
        }
        class80.method1713(field713, 9, field713 + 128, var64 + 7);
        Statics.field3142.method1647(field713, 0);
        class80.method1707();
        int var68 = 0;
        int var69 = field713 + Statics.field2119.field1396 * 9;
        for (int var70 = 1; var70 < var64 - 1; var70++) {
            int var71 = (var64 - var70) * field720[var70] / var64;
            int var72 = var71 + 22;
            if (var72 < 0) {
                var72 = 0;
            }
            var68 += var72;
            for (int var73 = var72; var73 < 128; var73++) {
                int var74 = Statics.field1393[var68++];
                if (var74 == 0) {
                    var69++;
                } else {
                    int var76 = 256 - var74;
                    int var77 = Statics.field1382[var74];
                    int var78 = Statics.field2119.field1394[var69];
                    Statics.field2119.field1394[var69++] = ((var77 & 0xFF00) * var74 + (var78 & 0xFF00) * var76 & 0xFF0000) + ((var77 & 0xFF00FF) * var74 + (var78 & 0xFF00FF) * var76 & 0xFF00FF00) >> 8;
                }
            }
            var69 += Statics.field2119.field1396 + var72 - 128;
        }
        class80.method1713(field713 + 765 - 128, 9, field713 + 765, var64 + 7);
        Statics.field1219.method1647(field713 + 382, 0);
        class80.method1707();
        int var79 = 0;
        int var80 = field713 + Statics.field2119.field1396 * 9 + 24 + 637;
        for (int var81 = 1; var81 < var64 - 1; var81++) {
            int var82 = (var64 - var81) * field720[var81] / var64;
            int var83 = 103 - var82;
            int var84 = var80 + var82;
            for (int var85 = 0; var85 < var83; var85++) {
                int var86 = Statics.field1393[var79++];
                if (var86 == 0) {
                    var84++;
                } else {
                    int var88 = 256 - var86;
                    int var89 = Statics.field1382[var86];
                    int var90 = Statics.field2119.field1394[var84];
                    Statics.field2119.field1394[var84++] = ((var89 & 0xFF00) * var86 + (var90 & 0xFF00) * var88 & 0xFF0000) + ((var89 & 0xFF00FF) * var86 + (var90 & 0xFF00FF) * var88 & 0xFF00FF00) >> 8;
                }
            }
            var79 += 128 - var83;
            var80 = Statics.field2119.field1396 - var83 - var82 + var84;
        }
        Statics.field716[Statics.field1549.field145 ? 1 : 0].method1724(field713 + 765 - 40, 463);
        if (client.field301 > 5 && client.field316 == 0) {
            if (Statics.field3192 == null) {
                Statics.field3192 = class77.method917(Statics.field1102, "sl_button", "");
            } else {
                int var91 = field713 + 5;
                short var92 = 463;
                byte var93 = 100;
                byte var94 = 35;
                Statics.field3192.method1724(var91, var92);
                arg0.method3741(class157.field2458 + " " + client.field293, var93 / 2 + var91, var94 / 2 + var92 - 2, 16777215, 0);
                if (Statics.field1447 == null) {
                    arg1.method3741(class157.field2566, var93 / 2 + var91, var94 / 2 + var92 + 12, 16777215, 0);
                } else {
                    arg1.method3741(class157.field2489, var93 / 2 + var91, var94 / 2 + var92 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var95 = Statics.field252.getGraphics();
            Statics.field2119.method1511(var95, 0, 0);
        } catch (Exception var97) {
            Statics.field252.repaint();
        }
    }

    @ObfuscatedName("al.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method718(String arg0, String arg1, String arg2) {
        field725 = arg0;
        field724 = arg1;
        field739 = arg2;
    }

    @ObfuscatedName("gd.q(Lcr;I)V")
    public static final void method3418(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field622.length; var2++) {
            Statics.field622[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field622[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field70[var8] = (Statics.field622[var8 - 1] + Statics.field622[var8 + 1] + Statics.field622[var8 - 128] + Statics.field622[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field622;
            Statics.field622 = Statics.field70;
            Statics.field70 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1423; var11++) {
            for (int var12 = 0; var12 < arg0.field1422; var12++) {
                if (arg0.field1426[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1424;
                    int var14 = var11 + 16 + arg0.field1420;
                    int var15 = (var14 << 7) + var13;
                    Statics.field622[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("db.m(II)V")
    public static final void method2263(int arg0) {
        short var1 = 256;
        field723 += arg0 * 128;
        if (field723 > Statics.field622.length) {
            field723 -= Statics.field622.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3418(Statics.field1750[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1393[var3 + var4] - Statics.field622[field723 + var3 & Statics.field622.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1393[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1393[var9 + var10] = 255;
                } else {
                    Statics.field1393[var9 + var10] = 0;
                }
            }
        }
        if (field721 > 0) {
            field721 -= arg0 * 4;
        }
        if (field722 > 0) {
            field722 -= arg0 * 4;
        }
        if (field721 == 0 && field722 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field721 = 1024;
            }
            if (var12 == 1) {
                field722 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field720[var13] = field720[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field720[var14] = (int) (Math.sin((double) field726 / 14.0D) * 16.0D + Math.sin((double) field726 / 15.0D) * 14.0D + Math.sin((double) field726 / 16.0D) * 12.0D);
            field726++;
        }
        field732 += arg0 * 53639459;
        int var15 = ((client.field303 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field732 * 203255372; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1393[(var18 << 7) + var17] = 192;
        }
        field732 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1393[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1393[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2895[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2895[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2895[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1393[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("u.n(IIII)I")
    public static final int method584(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ay.k(Lhi;Lhi;I)V")
    public static void method702(class224 arg0, class224 arg1) {
        if (Statics.field199 == null) {
            Statics.field199 = class77.method2569(Statics.field1102, "sl_back", "");
        }
        if (Statics.field1023 == null) {
            Statics.field1023 = class77.method195(Statics.field1102, "sl_flags", "");
        }
        if (Statics.field1348 == null) {
            Statics.field1348 = class77.method195(Statics.field1102, "sl_arrows", "");
        }
        if (Statics.field1047 == null) {
            Statics.field1047 = class77.method195(Statics.field1102, "sl_stars", "");
        }
        class80.method1670(field713, 23, 765, 480, 0);
        class80.method1719(field713, 0, 125, 23, 12425273, 9135624);
        class80.method1719(field713 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3741(class157.field2556, field713 + 62, 15, 0, -1);
        if (Statics.field1047 != null) {
            Statics.field1047[1].method1724(field713 + 140, 1);
            arg1.method3702(class157.field2557, field713 + 152, 10, 16777215, -1);
            Statics.field1047[0].method1724(field713 + 140, 12);
            arg1.method3702(class157.field2558, field713 + 152, 21, 16777215, -1);
        }
        if (Statics.field1348 != null) {
            int var2 = field713 + 280;
            if (class26.field638[0] == 0 && class26.field650[0] == 0) {
                Statics.field1348[2].method1724(var2, 4);
            } else {
                Statics.field1348[0].method1724(var2, 4);
            }
            if (class26.field638[0] == 0 && class26.field650[0] == 1) {
                Statics.field1348[3].method1724(var2 + 15, 4);
            } else {
                Statics.field1348[1].method1724(var2 + 15, 4);
            }
            arg0.method3702(class157.field2559, var2 + 32, 17, 16777215, -1);
            int var3 = field713 + 390;
            if (class26.field638[0] == 1 && class26.field650[0] == 0) {
                Statics.field1348[2].method1724(var3, 4);
            } else {
                Statics.field1348[0].method1724(var3, 4);
            }
            if (class26.field638[0] == 1 && class26.field650[0] == 1) {
                Statics.field1348[3].method1724(var3 + 15, 4);
            } else {
                Statics.field1348[1].method1724(var3 + 15, 4);
            }
            arg0.method3702(class157.field2560, var3 + 32, 17, 16777215, -1);
            int var4 = field713 + 500;
            if (class26.field638[0] == 2 && class26.field650[0] == 0) {
                Statics.field1348[2].method1724(var4, 4);
            } else {
                Statics.field1348[0].method1724(var4, 4);
            }
            if (class26.field638[0] == 2 && class26.field650[0] == 1) {
                Statics.field1348[3].method1724(var4 + 15, 4);
            } else {
                Statics.field1348[1].method1724(var4 + 15, 4);
            }
            arg0.method3702(class157.field2329, var4 + 32, 17, 16777215, -1);
            int var5 = field713 + 610;
            if (class26.field638[0] == 3 && class26.field650[0] == 0) {
                Statics.field1348[2].method1724(var5, 4);
            } else {
                Statics.field1348[0].method1724(var5, 4);
            }
            if (class26.field638[0] == 3 && class26.field650[0] == 1) {
                Statics.field1348[3].method1724(var5 + 15, 4);
            } else {
                Statics.field1348[1].method1724(var5 + 15, 4);
            }
            arg0.method3702(class157.field2562, var5 + 32, 17, 16777215, -1);
        }
        class80.method1670(field713 + 708, 4, 50, 16, 0);
        arg1.method3741(class157.field2470, field713 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field409 & var7;
        for (int var9 = 0; var9 < class26.field635; var9++) {
            class26 var10 = Statics.field634[var9];
            if ((var10.field640 & var7) == var8 || (var10.field640 & var7) == 0) {
                var6++;
            }
        }
        field742 = -1;
        if (Statics.field199 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = field713 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field635; var25++) {
                class26 var26 = Statics.field634[var25];
                if ((var26.field640 & var7) == var8 || (var26.field640 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field644);
                    if (var26.field644 == -1) {
                        var28 = class157.field2563;
                        var27 = false;
                    } else if (var26.field644 > 1980) {
                        var28 = class157.field2407;
                        var27 = false;
                    }
                    byte var29;
                    if (var26.method604()) {
                        if (var26.method609()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var26.method609()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class140.field2131 >= var22 && class140.field2132 * -1076088155 >= var21 && class140.field2131 < var11 + var22 && class140.field2132 * -1076088155 < var12 + var21 && var27) {
                        field742 = var25;
                        Statics.field199[var29].method1656(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field199[var29].method1647(var22, var21);
                    }
                    if (Statics.field1023 != null) {
                        Statics.field1023[(var26.method609() ? 8 : 0) + var26.field651].method1724(var22 + 29, var21);
                    }
                    arg0.method3741(Integer.toString(var26.field641), var22 + 15, var12 / 2 + var21 + 5, 0, -1);
                    arg1.method3741(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var30 = arg1.method3758(Statics.field634[field742].field643) + 6;
                int var31 = arg1.field3163 + 8;
                class80.method1670(class140.field2131 - var30 / 2, class140.field2132 * -1076088155 + 20 + 5, var30, var31, 16777120);
                class80.method1703(class140.field2131 - var30 / 2, class140.field2132 * -1076088155 + 20 + 5, var30, var31, 0);
                arg1.method3741(Statics.field634[field742].field643, class140.field2131, class140.field2132 * -1076088155 + 20 + 5 + arg1.field3163 + 4, 0, -1);
            }
        }
        try {
            Graphics var32 = Statics.field252.getGraphics();
            Statics.field2119.method1511(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field252.repaint();
        }
    }
}

package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ap")
public class class29 {

    @ObfuscatedName("ap.f")
    public static int[] field650 = new int[256];

    @ObfuscatedName("ap.x")
    public static int field653 = 0;

    @ObfuscatedName("ap.t")
    public static int field654 = 0;

    @ObfuscatedName("ap.am")
    public static int field649 = 0;

    @ObfuscatedName("ap.ac")
    public static int field658 = 0;

    @ObfuscatedName("ap.ap")
    public static int field659 = 0;

    @ObfuscatedName("ap.aq")
    public static int field660 = 0;

    @ObfuscatedName("ap.az")
    public static int field661 = 10;

    @ObfuscatedName("ap.ae")
    public static String field684 = "";

    @ObfuscatedName("ap.at")
    public static int field663 = 0;

    @ObfuscatedName("ap.as")
    public static String field664 = "";

    @ObfuscatedName("ap.aj")
    public static String field665 = "";

    @ObfuscatedName("ap.an")
    public static String field666 = "";

    @ObfuscatedName("ap.al")
    public static String field655 = "";

    @ObfuscatedName("ap.ag")
    public static String field668 = "";

    @ObfuscatedName("ap.ah")
    public static class147 field669 = class147.field2413;

    @ObfuscatedName("ap.ax")
    public static boolean field642 = true;

    @ObfuscatedName("ap.ay")
    public static int field652 = 0;

    @ObfuscatedName("ap.ao")
    public static String field672 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ap.ad")
    public static String field673 = "1234567890";

    @ObfuscatedName("ap.af")
    public static boolean field677 = false;

    @ObfuscatedName("ap.bs")
    public static int field675 = 0;

    @ObfuscatedName("ap.by")
    public static int[] field676 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ap.br")
    public static int[] field682 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ap.be")
    public static int field678 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.g(Ljava/awt/Component;Lei;Lei;ZII)V")
    public static void method2763(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field657) {
            field663 = arg4;
            class74.method1464();
            byte[] var5 = arg1.method2677("title.jpg", "");
            Statics.field690 = new class73(var5, arg0);
            Statics.field662 = Statics.field690.method1448();
            Statics.field647 = class71.method151(arg2, "logo", "");
            Statics.field643 = class71.method151(arg2, "titlebox", "");
            Statics.field680 = class71.method151(arg2, "titlebutton", "");
            Statics.field648 = class71.method2638(arg2, "runes", "");
            Statics.field2677 = class71.method2638(arg2, "title_mute", "");
            Statics.field646 = class71.method151(arg2, "options_radio_buttons,0", "");
            Statics.field670 = class71.method151(arg2, "options_radio_buttons,2", "");
            Statics.field651 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field651[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field651[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field651[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field651[var9 + 192] = 16777215;
            }
            Statics.field202 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field202[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field202[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field202[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field202[var13 + 192] = 16777215;
            }
            Statics.field674 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field674[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field674[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field674[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field674[var17 + 192] = 16777215;
            }
            Statics.field517 = new int[256];
            Statics.field2837 = new int[32768];
            Statics.field1124 = new int[32768];
            method1829((class75) null);
            Statics.field645 = new int[32768];
            Statics.field656 = new int[32768];
            if (arg3) {
                field655 = "";
                field668 = "";
            }
            Statics.field610 = 0;
            Statics.field2089 = "";
            field642 = true;
            field677 = false;
            if (Statics.field217.field134) {
                class164.field2722 = 1;
                Statics.field2723 = null;
                Statics.field2725 = -1;
                Statics.field2720 = -1;
                Statics.field1565 = 0;
                Statics.field2726 = false;
                Statics.field582 = 2;
            } else {
                class164.method1745(2, Statics.field1860, "scape main", "", 255, false);
            }
            class153.method2336(false);
            Statics.field657 = true;
            Statics.field690.method1369(0, 0);
            Statics.field662.method1369(382, 0);
            Statics.field647.method1522(382 - Statics.field647.field1323 / 2, 18);
        } else if (arg4 == 4) {
            field663 = 4;
        }
    }

    @ObfuscatedName("x.j(Lef;B)V")
    public static void method477(class133 arg0) {
        if (field677) {
            method994(arg0);
            return;
        }
        if ((class129.field1990 == 1 || !Statics.field2927 && class129.field1990 == 4) && class129.field2002 >= 715 && class129.field2003 >= 453) {
            Statics.field217.field134 = !Statics.field217.field134;
            class9.method2526();
            if (Statics.field217.field134) {
                Statics.field2721.method3058();
                class164.field2722 = 1;
                Statics.field2723 = null;
            } else {
                class164.method1290(Statics.field1860, "scape main", "", 255, false);
            }
        }
        if (client.field250 == 5) {
            return;
        }
        field659++;
        if (client.field250 != 10 && client.field250 != 11) {
            return;
        }
        if (client.field324 == 0) {
            if (class129.field1990 == 1 || !Statics.field2927 && class129.field1990 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class129.field2002 >= var1 && class129.field2002 <= var1 + var3 && class129.field2003 >= var2 && class129.field2003 <= var2 + var4) {
                    method2401();
                    return;
                }
            }
            if (Statics.field1861 != null) {
                method2401();
            }
        }
        int var5 = class129.field1990;
        int var6 = class129.field2002;
        int var7 = class129.field2003;
        if (!Statics.field2927 && var5 == 4) {
            var5 = 1;
        }
        if (field663 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method1926("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class127.method507(var10, true, "openjs", false);
            }
            short var11 = 462;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field244 & 0x4) != 0) {
                    if ((client.field244 & 0x400) == 0) {
                        field664 = class145.field2328;
                        field665 = class145.field2364;
                        field666 = class145.field2365;
                    } else {
                        field664 = class145.field2369;
                        field665 = class145.field2370;
                        field666 = class145.field2371;
                    }
                    field663 = 1;
                    field652 = 0;
                } else if ((client.field244 & 0x400) == 0) {
                    field664 = class145.field2197;
                    field665 = class145.field2360;
                    field666 = class145.field2187;
                    field663 = 2;
                    field652 = 0;
                } else {
                    field664 = class145.field2366;
                    field665 = class145.field2367;
                    field666 = class145.field2368;
                    field663 = 1;
                    field652 = 0;
                }
            }
        } else if (field663 == 1) {
            while (class126.method2460()) {
                if (Statics.field693 == 84) {
                    field664 = class145.field2197;
                    field665 = class145.field2360;
                    field666 = class145.field2187;
                    field663 = 2;
                    field652 = 0;
                } else if (Statics.field693 == 13) {
                    field663 = 0;
                }
            }
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field664 = class145.field2197;
                field665 = class145.field2360;
                field666 = class145.field2187;
                field663 = 2;
                field652 = 0;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field663 = 0;
            }
        } else if (field663 == 2) {
            short var15 = 231;
            int var27 = var15 + 30;
            if (var5 == 1 && var7 >= var27 - 15 && var7 < var27) {
                field652 = 0;
            }
            var27 += 15;
            if (var5 == 1 && var7 >= var27 - 15 && var7 < var27) {
                field652 = 1;
            }
            var27 += 15;
            short var16 = 302;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field655 = field655.trim();
                if (field655.length() == 0) {
                    method133(class145.field2184, class145.field2266, class145.field2267);
                    return;
                }
                if (field668.length() == 0) {
                    method133(class145.field2240, class145.field2269, class145.field2270);
                    return;
                }
                method133(class145.field2268, class145.field2375, class145.field2376);
                field669 = Statics.field217.field130.containsKey(class211.method3521(field655)) ? class147.field2408 : class147.field2413;
                client.method88(20);
                return;
            }
            short var18 = 462;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field663 = 0;
                field655 = "";
                field668 = "";
                Statics.field610 = 0;
                Statics.field2089 = "";
                field642 = true;
            }
            while (true) {
                while (class126.method2460()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field672.length(); var20++) {
                        if (Statics.field2118 == field672.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field693 == 13) {
                        field663 = 0;
                        field655 = "";
                        field668 = "";
                        Statics.field610 = 0;
                        Statics.field2089 = "";
                        field642 = true;
                    } else if (field652 == 0) {
                        if (Statics.field693 == 85 && field655.length() > 0) {
                            field655 = field655.substring(0, field655.length() - 1);
                        }
                        if (Statics.field693 == 84 || Statics.field693 == 80) {
                            field652 = 1;
                        }
                        if (var19 && field655.length() < 320) {
                            field655 = field655 + Statics.field2118;
                        }
                    } else if (field652 == 1) {
                        if (Statics.field693 == 85 && field668.length() > 0) {
                            field668 = field668.substring(0, field668.length() - 1);
                        }
                        if (Statics.field693 == 84 || Statics.field693 == 80) {
                            field652 = 0;
                        }
                        if (Statics.field693 == 84) {
                            field655 = field655.trim();
                            if (field655.length() == 0) {
                                method133(class145.field2184, class145.field2266, class145.field2267);
                                return;
                            }
                            if (field668.length() == 0) {
                                method133(class145.field2240, class145.field2269, class145.field2270);
                                return;
                            }
                            method133(class145.field2268, class145.field2375, class145.field2376);
                            field669 = Statics.field217.field130.containsKey(class211.method3521(field655)) ? class147.field2408 : class147.field2413;
                            client.method88(20);
                            return;
                        }
                        if (var19 && field668.length() < 20) {
                            field668 = field668 + Statics.field2118;
                        }
                    }
                }
                return;
            }
        } else if (field663 == 4) {
            short var21 = 302;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field2089.trim();
                if (Statics.field2089.length() != 6) {
                    method133(class145.field2181, class145.field2182, class145.field2377);
                    return;
                }
                Statics.field610 = Integer.parseInt(Statics.field2089);
                Statics.field2089 = "";
                field669 = field642 ? class147.field2407 : class147.field2406;
                method133(class145.field2268, class145.field2375, class145.field2376);
                client.method88(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field642 = !field642;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                String var23 = client.method1926("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class127.method507(var23, true, "openjs", false);
            }
            short var24 = 462;
            if (var5 == 1 && var6 >= var24 - 75 && var6 <= var24 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field663 = 0;
                field655 = "";
                field668 = "";
                Statics.field610 = 0;
                Statics.field2089 = "";
            }
            while (class126.method2460()) {
                boolean var25 = false;
                for (int var26 = 0; var26 < field673.length(); var26++) {
                    if (Statics.field2118 == field673.charAt(var26)) {
                        var25 = true;
                        break;
                    }
                }
                if (Statics.field693 == 13) {
                    field663 = 0;
                    field655 = "";
                    field668 = "";
                    Statics.field610 = 0;
                    Statics.field2089 = "";
                } else {
                    if (Statics.field693 == 85 && Statics.field2089.length() > 0) {
                        Statics.field2089 = Statics.field2089.substring(0, Statics.field2089.length() - 1);
                    }
                    if (Statics.field693 == 84) {
                        Statics.field2089.trim();
                        if (Statics.field2089.length() != 6) {
                            method133(class145.field2181, class145.field2182, class145.field2377);
                            return;
                        }
                        Statics.field610 = Integer.parseInt(Statics.field2089);
                        Statics.field2089 = "";
                        field669 = field642 ? class147.field2407 : class147.field2406;
                        method133(class145.field2268, class145.field2375, class145.field2376);
                        client.method88(20);
                        return;
                    }
                    if (var25 && Statics.field2089.length() < 6) {
                        Statics.field2089 = Statics.field2089 + Statics.field2118;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.z(Lgu;Lgu;S)V")
    public static void method1827(class205 arg0, class205 arg1) {
        if (field677) {
            if (Statics.field557 == null) {
                Statics.field557 = class71.method6(Statics.field533, "sl_back", "");
            }
            if (Statics.field1866 == null) {
                Statics.field1866 = class71.method2638(Statics.field533, "sl_flags", "");
            }
            if (Statics.field1899 == null) {
                Statics.field1899 = class71.method2638(Statics.field533, "sl_arrows", "");
            }
            if (Statics.field615 == null) {
                Statics.field615 = class71.method2638(Statics.field533, "sl_stars", "");
            }
            class74.method1466(0, 23, 765, 480, 0);
            class74.method1467(0, 0, 125, 23, 12425273, 9135624);
            class74.method1467(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3363(class145.field2385, 62, 15, 0, -1);
            if (Statics.field615 != null) {
                Statics.field615[1].method1522(140, 1);
                arg1.method3361(class145.field2386, 152, 10, 16777215, -1);
                Statics.field615[0].method1522(140, 12);
                arg1.method3361(class145.field2387, 152, 21, 16777215, -1);
            }
            if (Statics.field1899 != null) {
                short var2 = 280;
                if (field676[0] == 0 && field682[0] == 0) {
                    Statics.field1899[2].method1522(var2, 4);
                } else {
                    Statics.field1899[0].method1522(var2, 4);
                }
                if (field676[0] == 0 && field682[0] == 1) {
                    Statics.field1899[3].method1522(var2 + 15, 4);
                } else {
                    Statics.field1899[1].method1522(var2 + 15, 4);
                }
                arg0.method3361(class145.field2177, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field676[0] == 1 && field682[0] == 0) {
                    Statics.field1899[2].method1522(var3, 4);
                } else {
                    Statics.field1899[0].method1522(var3, 4);
                }
                if (field676[0] == 1 && field682[0] == 1) {
                    Statics.field1899[3].method1522(var3 + 15, 4);
                } else {
                    Statics.field1899[1].method1522(var3 + 15, 4);
                }
                arg0.method3361(class145.field2389, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field676[0] == 2 && field682[0] == 0) {
                    Statics.field1899[2].method1522(var4, 4);
                } else {
                    Statics.field1899[0].method1522(var4, 4);
                }
                if (field676[0] == 2 && field682[0] == 1) {
                    Statics.field1899[3].method1522(var4 + 15, 4);
                } else {
                    Statics.field1899[1].method1522(var4 + 15, 4);
                }
                arg0.method3361(class145.field2214, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field676[0] == 3 && field682[0] == 0) {
                    Statics.field1899[2].method1522(var5, 4);
                } else {
                    Statics.field1899[0].method1522(var5, 4);
                }
                if (field676[0] == 3 && field682[0] == 1) {
                    Statics.field1899[3].method1522(var5 + 15, 4);
                } else {
                    Statics.field1899[1].method1522(var5 + 15, 4);
                }
                arg0.method3361(class145.field2391, var5 + 32, 17, 16777215, -1);
            }
            class74.method1466(708, 4, 50, 16, 0);
            arg1.method3363(class145.field2229, 733, 16, 16777215, -1);
            field678 = -1;
            if (Statics.field557 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field675) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field675) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field675) {
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
                for (int var20 = 0; var20 < field675; var20++) {
                    class23 var21 = Statics.field609[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field573);
                    if (var21.field573 == -1) {
                        var23 = class145.field2392;
                        var22 = false;
                    } else if (var21.field573 > 1980) {
                        var23 = class145.field2176;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method484()) {
                        if (var21.method485()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method485()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class129.field1996 >= var17 && class129.field1997 * -918864945 >= var16 && class129.field1996 < var6 + var17 && class129.field1997 * -918864945 < var7 + var16 && var22) {
                        field678 = var20;
                        Statics.field557[var24].method1375(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field557[var24].method1369(var17, var16);
                    }
                    if (Statics.field1866 != null) {
                        Statics.field1866[(var21.method485() ? 8 : 0) + var21.field576].method1522(var17 + 29, var16);
                    }
                    arg0.method3363(Integer.toString(var21.field578), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3363(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3371(Statics.field609[field678].field575) + 6;
                    int var26 = arg1.field2960 + 8;
                    class74.method1466(class129.field1996 - var25 / 2, class129.field1997 * -918864945 + 20 + 5, var25, var26, 16777120);
                    class74.method1510(class129.field1996 - var25 / 2, class129.field1997 * -918864945 + 20 + 5, var25, var26, 0);
                    arg1.method3363(Statics.field609[field678].field575, class129.field1996, class129.field1997 * -918864945 + 20 + 5 + arg1.field2960 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field683.getGraphics();
                Statics.field1449.method1300(var27, 0, 0);
            } catch (Exception var127) {
                Statics.field683.repaint();
            }
            return;
        }
        if (client.field250 == 0 || client.field250 == 5) {
            byte var29 = 20;
            arg0.method3363(class145.field2204, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class74.method1510(230, var30, 304, 34, 9179409);
            class74.method1510(231, var30 + 1, 302, 32, 0);
            class74.method1466(232, var30 + 2, field661 * 3, 30, 9179409);
            class74.method1466(field661 * 3 + 232, var30 + 2, 300 - field661 * 3, 30, 0);
            arg0.method3363(field684, 382, 276 - var29, 16777215, -1);
        }
        if (client.field250 == 20) {
            Statics.field643.method1522(382 - Statics.field643.field1323 / 2, 271 - Statics.field643.field1324 / 2);
            short var31 = 211;
            arg0.method3363(field664, 382, var31, 16776960, 0);
            int var129 = var31 + 15;
            arg0.method3363(field665, 382, var129, 16776960, 0);
            int var130 = var129 + 15;
            arg0.method3363(field666, 382, var130, 16776960, 0);
            int var131 = var130 + 15;
            int var132 = var131 + 10;
            if (field663 != 4) {
                arg0.method3361(class145.field2384, 272, var132, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field655; arg0.method3371(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3361(class204.method3360(var33), 312, var132, 16777215, 0);
                var129 = var132 + 15;
                String var35 = class145.field2223;
                String var36 = field668;
                String var37 = class211.method1026('*', var36.length());
                arg0.method3361(var35 + var37, 274, var129, 16777215, 0);
                var129 += 15;
            }
        }
        if (client.field250 == 10 || client.field250 == 11) {
            Statics.field643.method1522(202, 171);
            if (field663 == 0) {
                short var38 = 251;
                arg0.method3363(class145.field2380, 382, var38, 16776960, 0);
                int var133 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field680.method1522(var39 - 73, var40 - 20);
                arg0.method3372(class145.field2277, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field680.method1522(var41 - 73, var40 - 20);
                arg0.method3372(class145.field2382, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field663 == 1) {
                arg0.method3363(class145.field2390, 382, 211, 16776960, 0);
                short var42 = 236;
                arg0.method3363(field664, 382, var42, 16777215, 0);
                int var134 = var42 + 15;
                arg0.method3363(field665, 382, var134, 16777215, 0);
                int var135 = var134 + 15;
                arg0.method3363(field666, 382, var135, 16777215, 0);
                int var136 = var135 + 15;
                short var43 = 302;
                short var44 = 321;
                Statics.field680.method1522(var43 - 73, var44 - 20);
                arg0.method3363(class145.field2154, var43, var44 + 5, 16777215, 0);
                short var45 = 462;
                Statics.field680.method1522(var45 - 73, var44 - 20);
                arg0.method3363(class145.field2229, var45, var44 + 5, 16777215, 0);
            } else if (field663 == 2) {
                short var46 = 211;
                arg0.method3363(field664, 382, var46, 16776960, 0);
                int var137 = var46 + 15;
                arg0.method3363(field665, 382, var137, 16776960, 0);
                int var138 = var137 + 15;
                arg0.method3363(field666, 382, var138, 16776960, 0);
                int var139 = var138 + 15;
                int var140 = var139 + 10;
                arg0.method3361(class145.field2384, 272, var140, 16777215, 0);
                short var47 = 200;
                String var48;
                for (var48 = field655; arg0.method3371(var48) > var47; var48 = var48.substring(1)) {
                }
                arg0.method3361(class204.method3360(var48) + (field652 == 0 & client.field410 % 40 < 20 ? class2.method1265(16776960) + class2.field23 : ""), 312, var140, 16777215, 0);
                var137 = var140 + 15;
                String var50 = class145.field2223;
                String var51 = field668;
                String var52 = class211.method1026('*', var51.length());
                arg0.method3361(var50 + var52 + (field652 == 1 & client.field410 % 40 < 20 ? class2.method1265(16776960) + class2.field23 : ""), 274, var137, 16777215, 0);
                var137 += 15;
                short var53 = 302;
                short var54 = 321;
                Statics.field680.method1522(var53 - 73, var54 - 20);
                arg0.method3363(class145.field2383, var53, var54 + 5, 16777215, 0);
                short var55 = 462;
                Statics.field680.method1522(var55 - 73, var54 - 20);
                arg0.method3363(class145.field2229, var55, var54 + 5, 16777215, 0);
            } else if (field663 == 4) {
                arg0.method3363(class145.field2372, 382, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3363(field664, 382, var56, 16777215, 0);
                int var141 = var56 + 15;
                arg0.method3363(field665, 382, var141, 16777215, 0);
                int var142 = var141 + 15;
                arg0.method3363(field666, 382, var142, 16777215, 0);
                int var143 = var142 + 15;
                String var58 = class145.field2379;
                String var59 = Statics.field2089;
                String var60 = class211.method1026('*', var59.length());
                arg0.method3361(var58 + var60 + (client.field410 % 40 < 20 ? class2.method1265(16776960) + class2.field23 : ""), 274, var143, 16777215, 0);
                int var144 = var143 - 8;
                arg0.method3361(class145.field2393, 373, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method3361(class145.field2156, 373, var145, 16776960, 0);
                int var61 = 373 + arg0.method3371(class145.field2156) + 15;
                int var62 = var145 - arg0.field2960;
                class75 var63;
                if (field642) {
                    var63 = Statics.field670;
                } else {
                    var63 = Statics.field646;
                }
                var63.method1522(var61, var62);
                var141 = var145 + 15;
                short var64 = 302;
                short var65 = 321;
                Statics.field680.method1522(var64 - 73, var65 - 20);
                arg0.method3363(class145.field2154, var64, var65 + 5, 16777215, 0);
                short var66 = 462;
                Statics.field680.method1522(var66 - 73, var65 - 20);
                arg0.method3363(class145.field2229, var66, var65 + 5, 16777215, 0);
                arg1.method3363(class145.field2373, 382, var65 + 36, 255, 0);
            }
        }
        if (field659 > 0) {
            int var67 = field659;
            short var68 = 256;
            field649 += var67 * 128;
            if (field649 > Statics.field2837.length) {
                field649 -= Statics.field2837.length;
                int var69 = (int) (Math.random() * 12.0D);
                method1829(Statics.field648[var69]);
            }
            int var70 = 0;
            int var71 = var67 * 128;
            int var72 = (var68 - var67) * 128;
            for (int var73 = 0; var73 < var72; var73++) {
                int var74 = Statics.field645[var70 + var71] - Statics.field2837[field649 + var70 & Statics.field2837.length - 1] * var67 / 6;
                if (var74 < 0) {
                    var74 = 0;
                }
                Statics.field645[var70++] = var74;
            }
            for (int var75 = var68 - var67; var75 < var68; var75++) {
                int var76 = var75 * 128;
                for (int var77 = 0; var77 < 128; var77++) {
                    int var78 = (int) (Math.random() * 100.0D);
                    if (var78 < 50 && var77 > 10 && var77 < 118) {
                        Statics.field645[var76 + var77] = 255;
                    } else {
                        Statics.field645[var76 + var77] = 0;
                    }
                }
            }
            if (field653 > 0) {
                field653 -= var67 * 4;
            }
            if (field654 > 0) {
                field654 -= var67 * 4;
            }
            if (field653 == 0 && field654 == 0) {
                int var79 = (int) (Math.random() * (double) (2000 / var67));
                if (var79 == 0) {
                    field653 = 1024;
                }
                if (var79 == 1) {
                    field654 = 1024;
                }
            }
            for (int var80 = 0; var80 < var68 - var67; var80++) {
                field650[var80] = field650[var67 + var80];
            }
            for (int var81 = var68 - var67; var81 < var68; var81++) {
                field650[var81] = (int) (Math.sin((double) field660 / 14.0D) * 16.0D + Math.sin((double) field660 / 15.0D) * 14.0D + Math.sin((double) field660 / 16.0D) * 12.0D);
                field660++;
            }
            field658 += var67 * 117631975;
            int var82 = ((client.field410 & 0x1) + var67) / 2;
            if (var82 > 0) {
                for (int var83 = 0; var83 < field658 * -727658500; var83++) {
                    int var84 = (int) (Math.random() * 124.0D) + 2;
                    int var85 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field645[(var85 << 7) + var84] = 192;
                }
                field658 = 0;
                int var86 = 0;
                label494: while (true) {
                    if (var86 >= var68) {
                        int var90 = 0;
                        while (true) {
                            if (var90 >= 128) {
                                break label494;
                            }
                            int var91 = 0;
                            for (int var92 = -var82; var92 < var68; var92++) {
                                int var93 = var92 * 128;
                                if (var82 + var92 < var68) {
                                    var91 += Statics.field656[var82 * 128 + var90 + var93];
                                }
                                if (var92 - (var82 + 1) >= 0) {
                                    var91 -= Statics.field656[var90 + var93 - (var82 + 1) * 128];
                                }
                                if (var92 >= 0) {
                                    Statics.field645[var90 + var93] = var91 / (var82 * 2 + 1);
                                }
                            }
                            var90++;
                        }
                    }
                    int var87 = 0;
                    int var88 = var86 * 128;
                    for (int var89 = -var82; var89 < 128; var89++) {
                        if (var82 + var89 < 128) {
                            var87 += Statics.field645[var88 + var89 + var82];
                        }
                        if (var89 - (var82 + 1) >= 0) {
                            var87 -= Statics.field645[var88 + var89 - (var82 + 1)];
                        }
                        if (var89 >= 0) {
                            Statics.field656[var88 + var89] = var87 / (var82 * 2 + 1);
                        }
                    }
                    var86++;
                }
            }
            field659 = 0;
        }
        short var94 = 256;
        if (field653 > 0) {
            for (int var95 = 0; var95 < 256; var95++) {
                if (field653 > 768) {
                    Statics.field517[var95] = method508(Statics.field651[var95], Statics.field202[var95], 1024 - field653);
                } else if (field653 > 256) {
                    Statics.field517[var95] = Statics.field202[var95];
                } else {
                    Statics.field517[var95] = method508(Statics.field202[var95], Statics.field651[var95], 256 - field653);
                }
            }
        } else if (field654 > 0) {
            for (int var96 = 0; var96 < 256; var96++) {
                if (field654 > 768) {
                    Statics.field517[var96] = method508(Statics.field651[var96], Statics.field674[var96], 1024 - field654);
                } else if (field654 > 256) {
                    Statics.field517[var96] = Statics.field674[var96];
                } else {
                    Statics.field517[var96] = method508(Statics.field674[var96], Statics.field651[var96], 256 - field654);
                }
            }
        } else {
            for (int var97 = 0; var97 < 256; var97++) {
                Statics.field517[var97] = Statics.field651[var97];
            }
        }
        class74.method1460(0, 9, 128, var94 + 7);
        Statics.field690.method1369(0, 0);
        class74.method1459();
        int var98 = 0;
        int var99 = 6885;
        for (int var100 = 1; var100 < var94 - 1; var100++) {
            int var101 = (var94 - var100) * field650[var100] / var94;
            int var102 = var101 + 22;
            if (var102 < 0) {
                var102 = 0;
            }
            var98 += var102;
            for (int var103 = var102; var103 < 128; var103++) {
                int var104 = Statics.field645[var98++];
                if (var104 == 0) {
                    var99++;
                } else {
                    int var106 = 256 - var104;
                    int var107 = Statics.field517[var104];
                    int var108 = Statics.field1449.field1300[var99];
                    Statics.field1449.field1300[var99++] = ((var107 & 0xFF00) * var104 + (var108 & 0xFF00) * var106 & 0xFF0000) + ((var107 & 0xFF00FF) * var104 + (var108 & 0xFF00FF) * var106 & 0xFF00FF00) >> 8;
                }
            }
            var99 += var102 + 765 - 128;
        }
        class74.method1460(637, 9, 765, var94 + 7);
        Statics.field662.method1369(382, 0);
        class74.method1459();
        int var109 = 0;
        int var110 = 7546;
        for (int var111 = 1; var111 < var94 - 1; var111++) {
            int var112 = (var94 - var111) * field650[var111] / var94;
            int var113 = 103 - var112;
            int var114 = var110 + var112;
            for (int var115 = 0; var115 < var113; var115++) {
                int var116 = Statics.field645[var109++];
                if (var116 == 0) {
                    var114++;
                } else {
                    int var118 = 256 - var116;
                    int var119 = Statics.field517[var116];
                    int var120 = Statics.field1449.field1300[var114];
                    Statics.field1449.field1300[var114++] = ((var119 & 0xFF00FF) * var116 + (var120 & 0xFF00FF) * var118 & 0xFF00FF00) + ((var119 & 0xFF00) * var116 + (var120 & 0xFF00) * var118 & 0xFF0000) >> 8;
                }
            }
            var109 += 128 - var113;
            var110 = 765 - var113 - var112 + var114;
        }
        Statics.field2677[Statics.field217.field134 ? 1 : 0].method1522(725, 463);
        if (client.field250 > 5 && client.field324 == 0) {
            if (Statics.field1792 == null) {
                Statics.field1792 = class71.method151(Statics.field533, "sl_button", "");
            } else {
                byte var121 = 5;
                short var122 = 463;
                byte var123 = 100;
                byte var124 = 35;
                Statics.field1792.method1522(var121, var122);
                arg0.method3363(class145.field2351 + " " + client.field243, var123 / 2 + var121, var124 / 2 + var122 - 2, 16777215, 0);
                if (Statics.field1861 == null) {
                    arg1.method3363(class145.field2395, var123 / 2 + var121, var124 / 2 + var122 + 12, 16777215, 0);
                } else {
                    arg1.method3363(class145.field2394, var123 / 2 + var121, var124 / 2 + var122 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var125 = Statics.field683.getGraphics();
            Statics.field1449.method1300(var125, 0, 0);
        } catch (Exception var128) {
            Statics.field683.repaint();
        }
    }

    @ObfuscatedName("y.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method133(String arg0, String arg1, String arg2) {
        field664 = arg0;
        field665 = arg1;
        field666 = arg2;
    }

    @ObfuscatedName("ct.k(Lbb;I)V")
    public static final void method1829(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2837.length; var2++) {
            Statics.field2837[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2837[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1124[var8] = (Statics.field2837[var8 - 1] + Statics.field2837[var8 + 1] + Statics.field2837[var8 - 128] + Statics.field2837[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2837;
            Statics.field2837 = Statics.field1124;
            Statics.field1124 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1324; var11++) {
            for (int var12 = 0; var12 < arg0.field1323; var12++) {
                if (arg0.field1321[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1325;
                    int var14 = var11 + 16 + arg0.field1326;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2837[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("o.c(IIIB)I")
    public static final int method508(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("au.w(Lef;I)V")
    public static void method994(class133 arg0) {
        if (class129.field1990 != 1 && Statics.field2927 || class129.field1990 != 4) {
            return;
        }
        short var1 = 280;
        if (class129.field2002 >= var1 && class129.field2002 <= var1 + 14 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(0, 0);
            return;
        }
        if (class129.field2002 >= var1 + 15 && class129.field2002 <= var1 + 80 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(0, 1);
            return;
        }
        short var2 = 390;
        if (class129.field2002 >= var2 && class129.field2002 <= var2 + 14 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(1, 0);
            return;
        }
        if (class129.field2002 >= var2 + 15 && class129.field2002 <= var2 + 80 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(1, 1);
            return;
        }
        short var3 = 500;
        if (class129.field2002 >= var3 && class129.field2002 <= var3 + 14 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(2, 0);
            return;
        }
        if (class129.field2002 >= var3 + 15 && class129.field2002 <= var3 + 80 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(2, 1);
            return;
        }
        short var4 = 610;
        if (class129.field2002 >= var4 && class129.field2002 <= var4 + 14 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(3, 0);
            return;
        }
        if (class129.field2002 >= var4 + 15 && class129.field2002 <= var4 + 80 && class129.field2003 >= 4 && class129.field2003 <= 18) {
            method505(3, 1);
            return;
        }
        if (class129.field2002 >= 708 && class129.field2003 >= 4 && class129.field2002 <= 758 && class129.field2003 <= 20) {
            field677 = false;
            Statics.field690.method1369(0, 0);
            Statics.field662.method1369(382, 0);
            Statics.field647.method1522(382 - Statics.field647.field1323 / 2, 18);
            return;
        }
        if (field678 == -1) {
            return;
        }
        class23 var5 = Statics.field609[field678];
        method2612(var5);
        field677 = false;
        Statics.field690.method1369(0, 0);
        Statics.field662.method1369(382, 0);
        Statics.field647.method1522(382 - Statics.field647.field1323 / 2, 18);
        return;
    }

    @ObfuscatedName("ef.l(Le;I)V")
    public static void method2612(class23 arg0) {
        if (arg0.method485() != client.field325) {
            client.field325 = arg0.method485();
            boolean var1 = arg0.method485();
            if (Statics.field144 != var1) {
                class46.method510();
                Statics.field144 = var1;
            }
        }
        Statics.field671 = arg0.field574;
        client.field243 = arg0.field578;
        client.field244 = arg0.field572;
        Statics.field2453 = client.field438 == 0 ? 43594 : arg0.field578 + 40000;
        Statics.field1902 = client.field438 == 0 ? 443 : arg0.field578 + 50000;
        Statics.field1801 = Statics.field2453;
    }

    @ObfuscatedName("dw.n(I)V")
    public static void method2401() {
        try {
            if (Statics.field1861 == null) {
                Statics.field1861 = new class17(Statics.field519, new URL(Statics.field390));
            } else {
                byte[] var0 = Statics.field1861.method159();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field675 = var1.method2263();
                    Statics.field609 = new class23[field675];
                    int var2 = 0;
                    while (var2 < field675) {
                        class23 var3 = Statics.field609[var2] = new class23();
                        var3.field578 = var1.method2263();
                        var3.field572 = var1.method2117();
                        var3.field574 = var1.method2091();
                        var3.field575 = var1.method2091();
                        var3.field576 = var1.method2083();
                        var3.field573 = var1.method2214();
                        var3.field577 = var2++;
                    }
                    method1846(Statics.field609, 0, Statics.field609.length - 1, field676, field682);
                    field677 = true;
                    Statics.field1861 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1861 = null;
        }
    }

    @ObfuscatedName("o.d(III)V")
    public static void method505(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field676[var5] != arg0) {
                var2[var4] = field676[var5];
                var3[var4] = field682[var5];
                var4++;
            }
        }
        field676 = var2;
        field682 = var3;
        method1846(Statics.field609, 0, Statics.field609.length - 1, field676, field682);
    }

    @ObfuscatedName("cm.h([Le;II[I[II)V")
    public static void method1846(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field577;
                        var12 = var8.field577;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method485() ? 1 : 0;
                        var12 = var8.method485() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field578;
                        var12 = var8.field578;
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
                        var15 = arg0[var5].field577;
                        var16 = var8.field577;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method485() ? 1 : 0;
                        var16 = var8.method485() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field578;
                        var16 = var8.field578;
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
        method1846(arg0, arg1, var6, arg3, arg4);
        method1846(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

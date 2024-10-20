package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ah")
public class class29 {

    @ObfuscatedName("ah.q")
    public static int[] field654 = new int[256];

    @ObfuscatedName("ah.c")
    public static int field656 = 0;

    @ObfuscatedName("ah.j")
    public static int field657 = 0;

    @ObfuscatedName("ah.an")
    public static int field658 = 0;

    @ObfuscatedName("ah.ao")
    public static int field669 = 0;

    @ObfuscatedName("ah.ah")
    public static int field655 = 0;

    @ObfuscatedName("ah.ai")
    public static int field661 = 0;

    @ObfuscatedName("ah.aa")
    public static int field662 = 10;

    @ObfuscatedName("ah.ag")
    public static String field663 = "";

    @ObfuscatedName("ah.ar")
    public static int field682 = 0;

    @ObfuscatedName("ah.al")
    public static String field664 = "";

    @ObfuscatedName("ah.ae")
    public static String field666 = "";

    @ObfuscatedName("ah.ak")
    public static String field667 = "";

    @ObfuscatedName("ah.at")
    public static String field653 = "";

    @ObfuscatedName("ah.am")
    public static String field673 = "";

    @ObfuscatedName("ah.aw")
    public static class149 field670 = class149.field2434;

    @ObfuscatedName("ah.ac")
    public static boolean field671 = true;

    @ObfuscatedName("ah.aj")
    public static int field672 = 0;

    @ObfuscatedName("ah.av")
    public static String field668 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.ax")
    public static String field674 = "1234567890";

    @ObfuscatedName("ah.af")
    public static boolean field675 = false;

    @ObfuscatedName("ah.bc")
    public static int field676 = 0;

    @ObfuscatedName("ah.ba")
    public static int[] field677 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ah.be")
    public static int[] field678 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ah.bt")
    public static int field679 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.b(Lex;Lex;I)I")
    public static int method441(class151 arg0, class151 arg1) {
        int var2 = 0;
        if (arg0.method2777("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2777("logo", "")) {
            var2++;
        }
        if (arg1.method2777("titlebox", "")) {
            var2++;
        }
        if (arg1.method2777("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2777("runes", "")) {
            var2++;
        }
        if (arg1.method2777("title_mute", "")) {
            var2++;
        }
        if (arg1.method2781("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2781("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2777("sl_back", "");
        arg1.method2777("sl_flags", "");
        arg1.method2777("sl_arrows", "");
        arg1.method2777("sl_stars", "");
        arg1.method2777("sl_button", "");
        return var2;
    }

    @ObfuscatedName("es.i(I)V")
    public static void method2744() {
        if (!Statics.field665) {
            return;
        }
        Statics.field647 = null;
        Statics.field648 = null;
        Statics.field649 = null;
        Statics.field660 = null;
        Statics.field2550 = null;
        Statics.field617 = null;
        Statics.field651 = null;
        Statics.field83 = null;
        Statics.field1285 = null;
        Statics.field1806 = null;
        Statics.field1915 = null;
        Statics.field2112 = null;
        Statics.field835 = null;
        Statics.field956 = null;
        Statics.field1765 = null;
        Statics.field178 = null;
        Statics.field646 = null;
        Statics.field2146 = null;
        Statics.field1909 = null;
        Statics.field1281 = null;
        Statics.field1280 = null;
        Statics.field1895 = null;
        class166.method2738(2);
        class155.method2606(true);
        Statics.field665 = false;
    }

    @ObfuscatedName("g.k(Leq;B)V")
    public static void method97(class135 arg0) {
        if (field675) {
            method126(arg0);
            return;
        }
        if ((class131.field2032 == 1 || !Statics.field2049 && class131.field2032 == 4) && class131.field2021 >= 715 && class131.field2035 >= 453) {
            Statics.field1422.field134 = !Statics.field1422.field134;
            class9.method2557();
            if (Statics.field1422.field134) {
                Statics.field1963.method3101();
                class166.field2749 = 1;
                Statics.field2750 = null;
            } else {
                class152 var1 = Statics.field162;
                int var2 = var1.method2778("scape main");
                int var3 = var1.method2839(var2, "");
                class166.method2949(var1, var2, var3, 255, false);
            }
        }
        if (client.field352 == 5) {
            return;
        }
        field655++;
        if (client.field352 != 10 && client.field352 != 11) {
            return;
        }
        if (client.field293 == 0) {
            if (class131.field2032 == 1 || !Statics.field2049 && class131.field2032 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class131.field2021 >= var4 && class131.field2021 <= var4 + var6 && class131.field2035 >= var5 && class131.field2035 <= var5 + var7) {
                    method1300();
                    return;
                }
            }
            if (Statics.field69 != null) {
                method1300();
            }
        }
        int var8 = class131.field2032;
        int var9 = class131.field2021;
        int var10 = class131.field2035;
        if (!Statics.field2049 && var8 == 4) {
            var8 = 1;
        }
        if (field682 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class129.method531(client.method56("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field241 & 0x4) != 0) {
                    if ((client.field241 & 0x400) == 0) {
                        field664 = class147.field2187;
                        field666 = class147.field2380;
                        field667 = class147.field2175;
                    } else {
                        field664 = class147.field2289;
                        field666 = class147.field2397;
                        field667 = class147.field2398;
                    }
                    field682 = 1;
                    field672 = 0;
                } else if ((client.field241 & 0x400) == 0) {
                    field664 = class147.field2273;
                    field666 = class147.field2387;
                    field667 = class147.field2251;
                    field682 = 2;
                    field672 = 0;
                } else {
                    field664 = class147.field2393;
                    field666 = class147.field2394;
                    field667 = class147.field2391;
                    field682 = 1;
                    field672 = 0;
                }
            }
        } else if (field682 == 1) {
            while (class128.method1862()) {
                if (Statics.field1005 == 84) {
                    field664 = class147.field2273;
                    field666 = class147.field2387;
                    field667 = class147.field2251;
                    field682 = 2;
                    field672 = 0;
                } else if (Statics.field1005 == 13) {
                    field682 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field664 = class147.field2273;
                field666 = class147.field2387;
                field667 = class147.field2251;
                field682 = 2;
                field672 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field682 = 0;
            }
        } else if (field682 == 2) {
            short var17 = 231;
            int var28 = var17 + 30;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field672 = 0;
            }
            var28 += 15;
            if (var8 == 1 && var10 >= var28 - 15 && var10 < var28) {
                field672 = 1;
            }
            var28 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field653 = field653.trim();
                if (field653.length() == 0) {
                    method148(class147.field2292, class147.field2320, class147.field2365);
                    return;
                }
                if (field673.length() == 0) {
                    method148(class147.field2295, class147.field2296, class147.field2297);
                    return;
                }
                method148(class147.field2401, class147.field2402, class147.field2403);
                field670 = Statics.field1422.field131.containsKey(class213.method3484(field653)) ? class149.field2437 : class149.field2434;
                client.method2950(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field682 = 0;
                field653 = "";
                field673 = "";
                Statics.field721 = 0;
                Statics.field588 = "";
                field671 = true;
            }
            while (true) {
                while (class128.method1862()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field668.length(); var22++) {
                        if (Statics.field2858 == field668.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1005 == 13) {
                        field682 = 0;
                        field653 = "";
                        field673 = "";
                        Statics.field721 = 0;
                        Statics.field588 = "";
                        field671 = true;
                    } else if (field672 == 0) {
                        if (Statics.field1005 == 85 && field653.length() > 0) {
                            field653 = field653.substring(0, field653.length() - 1);
                        }
                        if (Statics.field1005 == 84 || Statics.field1005 == 80) {
                            field672 = 1;
                        }
                        if (var21 && field653.length() < 320) {
                            field653 = field653 + Statics.field2858;
                        }
                    } else if (field672 == 1) {
                        if (Statics.field1005 == 85 && field673.length() > 0) {
                            field673 = field673.substring(0, field673.length() - 1);
                        }
                        if (Statics.field1005 == 84 || Statics.field1005 == 80) {
                            field672 = 0;
                        }
                        if (Statics.field1005 == 84) {
                            field653 = field653.trim();
                            if (field653.length() == 0) {
                                method148(class147.field2292, class147.field2320, class147.field2365);
                                return;
                            }
                            if (field673.length() == 0) {
                                method148(class147.field2295, class147.field2296, class147.field2297);
                                return;
                            }
                            method148(class147.field2401, class147.field2402, class147.field2403);
                            field670 = Statics.field1422.field131.containsKey(class213.method3484(field653)) ? class149.field2437 : class149.field2434;
                            client.method2950(20);
                            return;
                        }
                        if (var21 && field673.length() < 20) {
                            field673 = field673 + Statics.field2858;
                        }
                    }
                }
                return;
            }
        } else if (field682 == 4) {
            short var23 = 302;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                Statics.field588.trim();
                if (Statics.field588.length() != 6) {
                    method148(class147.field2208, class147.field2209, class147.field2219);
                    return;
                }
                Statics.field721 = Integer.parseInt(Statics.field588);
                Statics.field588 = "";
                field670 = field671 ? class149.field2433 : class149.field2435;
                method148(class147.field2401, class147.field2402, class147.field2403);
                client.method2950(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field671 = !field671;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                class129.method531(client.method56("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var25 = 462;
            if (var8 == 1 && var9 >= var25 - 75 && var9 <= var25 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field682 = 0;
                field653 = "";
                field673 = "";
                Statics.field721 = 0;
                Statics.field588 = "";
            }
            while (class128.method1862()) {
                boolean var26 = false;
                for (int var27 = 0; var27 < field674.length(); var27++) {
                    if (Statics.field2858 == field674.charAt(var27)) {
                        var26 = true;
                        break;
                    }
                }
                if (Statics.field1005 == 13) {
                    field682 = 0;
                    field653 = "";
                    field673 = "";
                    Statics.field721 = 0;
                    Statics.field588 = "";
                } else {
                    if (Statics.field1005 == 85 && Statics.field588.length() > 0) {
                        Statics.field588 = Statics.field588.substring(0, Statics.field588.length() - 1);
                    }
                    if (Statics.field1005 == 84) {
                        Statics.field588.trim();
                        if (Statics.field588.length() != 6) {
                            method148(class147.field2208, class147.field2209, class147.field2219);
                            return;
                        }
                        Statics.field721 = Integer.parseInt(Statics.field588);
                        Statics.field588 = "";
                        field670 = field671 ? class149.field2433 : class149.field2435;
                        method148(class147.field2401, class147.field2402, class147.field2403);
                        client.method2950(20);
                        return;
                    }
                    if (var26 && Statics.field588.length() < 6) {
                        Statics.field588 = Statics.field588 + Statics.field2858;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.h(Lgl;Lgl;B)V")
    public static void method580(class207 arg0, class207 arg1) {
        if (field675) {
            method2492(arg0, arg1);
            return;
        }
        if (client.field352 == 0 || client.field352 == 5) {
            byte var2 = 20;
            arg0.method3502(class147.field2201, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class74.method1526(230, var3, 304, 34, 9179409);
            class74.method1526(231, var3 + 1, 302, 32, 0);
            class74.method1512(232, var3 + 2, field662 * 3, 30, 9179409);
            class74.method1512(field662 * 3 + 232, var3 + 2, 300 - field662 * 3, 30, 0);
            arg0.method3502(field663, 382, 276 - var2, 16777215, -1);
        }
        if (client.field352 == 20) {
            Statics.field647.method1576(382 - Statics.field647.field1324 / 2, 271 - Statics.field647.field1325 / 2);
            short var4 = 211;
            arg0.method3502(field664, 382, var4, 16776960, 0);
            int var62 = var4 + 15;
            arg0.method3502(field666, 382, var62, 16776960, 0);
            int var63 = var62 + 15;
            arg0.method3502(field667, 382, var63, 16776960, 0);
            int var64 = var63 + 15;
            int var65 = var64 + 10;
            if (field682 != 4) {
                arg0.method3500(class147.field2404, 272, var65, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field653; arg0.method3559(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3500(class206.method3540(var6), 312, var65, 16777215, 0);
                var62 = var65 + 15;
                arg0.method3500(class147.field2405 + class213.method2491(field673), 274, var62, 16777215, 0);
                var62 += 15;
            }
        }
        if (client.field352 == 10 || client.field352 == 11) {
            Statics.field647.method1576(202, 171);
            if (field682 == 0) {
                short var7 = 251;
                arg0.method3502(class147.field2407, 382, var7, 16776960, 0);
                int var66 = var7 + 30;
                short var8 = 302;
                short var9 = 291;
                Statics.field648.method1576(var8 - 73, var9 - 20);
                arg0.method3503(class147.field2408, var8 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var10 = 462;
                Statics.field648.method1576(var10 - 73, var9 - 20);
                arg0.method3503(class147.field2409, var10 - 73, var9 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field682 == 1) {
                arg0.method3502(class147.field2389, 382, 211, 16776960, 0);
                short var11 = 236;
                arg0.method3502(field664, 382, var11, 16777215, 0);
                int var67 = var11 + 15;
                arg0.method3502(field666, 382, var67, 16777215, 0);
                int var68 = var67 + 15;
                arg0.method3502(field667, 382, var68, 16777215, 0);
                int var69 = var68 + 15;
                short var12 = 302;
                short var13 = 321;
                Statics.field648.method1576(var12 - 73, var13 - 20);
                arg0.method3502(class147.field2181, var12, var13 + 5, 16777215, 0);
                short var14 = 462;
                Statics.field648.method1576(var14 - 73, var13 - 20);
                arg0.method3502(class147.field2411, var14, var13 + 5, 16777215, 0);
            } else if (field682 == 2) {
                short var15 = 211;
                arg0.method3502(field664, 382, var15, 16776960, 0);
                int var70 = var15 + 15;
                arg0.method3502(field666, 382, var70, 16776960, 0);
                int var71 = var70 + 15;
                arg0.method3502(field667, 382, var71, 16776960, 0);
                int var72 = var71 + 15;
                int var73 = var72 + 10;
                arg0.method3500(class147.field2404, 272, var73, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field653; arg0.method3559(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method3500(class206.method3540(var17) + (field672 == 0 & client.field249 % 40 < 20 ? class2.method459(16776960) + class2.field22 : ""), 312, var73, 16777215, 0);
                var70 = var73 + 15;
                arg0.method3500(class147.field2405 + class213.method2491(field673) + (field672 == 1 & client.field249 % 40 < 20 ? class2.method459(16776960) + class2.field22 : ""), 274, var70, 16777215, 0);
                var70 += 15;
                short var18 = 302;
                short var19 = 321;
                Statics.field648.method1576(var18 - 73, var19 - 20);
                arg0.method3502(class147.field2410, var18, var19 + 5, 16777215, 0);
                short var20 = 462;
                Statics.field648.method1576(var20 - 73, var19 - 20);
                arg0.method3502(class147.field2411, var20, var19 + 5, 16777215, 0);
            } else if (field682 == 4) {
                arg0.method3502(class147.field2399, 382, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3502(field664, 382, var21, 16777215, 0);
                int var74 = var21 + 15;
                arg0.method3502(field666, 382, var74, 16777215, 0);
                int var75 = var74 + 15;
                arg0.method3502(field667, 382, var75, 16777215, 0);
                int var76 = var75 + 15;
                arg0.method3500(class147.field2406 + class213.method2491(Statics.field588) + (client.field249 % 40 < 20 ? class2.method459(16776960) + class2.field22 : ""), 274, var76, 16777215, 0);
                int var77 = var76 - 8;
                arg0.method3500(class147.field2182, 373, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg0.method3500(class147.field2314, 373, var78, 16776960, 0);
                int var22 = 373 + arg0.method3559(class147.field2314) + 15;
                int var23 = var78 - arg0.field2975;
                class75 var24;
                if (field671) {
                    var24 = Statics.field1285;
                } else {
                    var24 = Statics.field83;
                }
                var24.method1576(var22, var23);
                var74 = var78 + 15;
                short var25 = 302;
                short var26 = 321;
                Statics.field648.method1576(var25 - 73, var26 - 20);
                arg0.method3502(class147.field2181, var25, var26 + 5, 16777215, 0);
                short var27 = 462;
                Statics.field648.method1576(var27 - 73, var26 - 20);
                arg0.method3502(class147.field2411, var27, var26 + 5, 16777215, 0);
                arg1.method3502(class147.field2400, 382, var26 + 36, 255, 0);
            }
        }
        if (field655 > 0) {
            int var28 = field655;
            short var29 = 256;
            field658 += var28 * 128;
            if (field658 > Statics.field1909.length) {
                field658 -= Statics.field1909.length;
                int var30 = (int) (Math.random() * 12.0D);
                method514(Statics.field649[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field1280[var31 + var32] - Statics.field1909[field658 + var31 & Statics.field1909.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field1280[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field1280[var37 + var38] = 255;
                    } else {
                        Statics.field1280[var37 + var38] = 0;
                    }
                }
            }
            if (field656 > 0) {
                field656 -= var28 * 4;
            }
            if (field657 > 0) {
                field657 -= var28 * 4;
            }
            if (field656 == 0 && field657 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field656 = 1024;
                }
                if (var40 == 1) {
                    field657 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field654[var41] = field654[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field654[var42] = (int) (Math.sin((double) field661 / 14.0D) * 16.0D + Math.sin((double) field661 / 15.0D) * 14.0D + Math.sin((double) field661 / 16.0D) * 12.0D);
                field661++;
            }
            field669 += var28 * -2065190941;
            int var43 = ((client.field249 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field669 * -1519295668; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1280[(var46 << 7) + var45] = 192;
                }
                field669 = 0;
                int var47 = 0;
                label207: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label207;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field1895[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field1895[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field1280[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field1280[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field1280[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field1895[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field655 = 0;
        }
        method2088();
        Statics.field651[Statics.field1422.field134 ? 1 : 0].method1576(725, 463);
        if (client.field352 > 5 && client.field293 == 0) {
            if (Statics.field956 == null) {
                Statics.field956 = class71.method588(Statics.field795, "sl_button", "");
            } else {
                byte var55 = 5;
                short var56 = 463;
                byte var57 = 100;
                byte var58 = 35;
                Statics.field956.method1576(var55, var56);
                arg0.method3502(class147.field2384 + " " + client.field443, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                if (Statics.field69 == null) {
                    arg1.method3502(class147.field2422, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                } else {
                    arg1.method3502(class147.field2421, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var59 = Statics.field2149.getGraphics();
            Statics.field1952.method1342(var59, 0, 0);
        } catch (Exception var61) {
            Statics.field2149.repaint();
        }
    }

    @ObfuscatedName("v.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method148(String arg0, String arg1, String arg2) {
        field664 = arg0;
        field666 = arg1;
        field667 = arg2;
    }

    @ObfuscatedName("d.n(Lbf;I)V")
    public static final void method514(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1909.length; var2++) {
            Statics.field1909[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1909[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1281[var8] = (Statics.field1909[var8 - 1] + Statics.field1909[var8 + 1] + Statics.field1909[var8 - 128] + Statics.field1909[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1909;
            Statics.field1909 = Statics.field1281;
            Statics.field1281 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1325; var11++) {
            for (int var12 = 0; var12 < arg0.field1324; var12++) {
                if (arg0.field1327[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1326;
                    int var14 = var11 + 16 + arg0.field1322;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1909[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("an.o(IIII)I")
    public static final int method535(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dv.g(I)V")
    public static final void method2088() {
        short var0 = 256;
        if (field656 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field656 > 768) {
                    Statics.field2146[var1] = method535(Statics.field1765[var1], Statics.field178[var1], 1024 - field656);
                } else if (field656 > 256) {
                    Statics.field2146[var1] = Statics.field178[var1];
                } else {
                    Statics.field2146[var1] = method535(Statics.field178[var1], Statics.field1765[var1], 256 - field656);
                }
            }
        } else if (field657 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field657 > 768) {
                    Statics.field2146[var2] = method535(Statics.field1765[var2], Statics.field646[var2], 1024 - field657);
                } else if (field657 > 256) {
                    Statics.field2146[var2] = Statics.field646[var2];
                } else {
                    Statics.field2146[var2] = method535(Statics.field646[var2], Statics.field1765[var2], 256 - field657);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2146[var3] = Statics.field1765[var3];
            }
        }
        class74.method1507(0, 9, 128, var0 + 7);
        Statics.field660.method1418(0, 0);
        class74.method1506();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field654[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1280[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2146[var10];
                    int var14 = Statics.field1952.field1301[var5];
                    Statics.field1952.field1301[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class74.method1507(637, 9, 765, var0 + 7);
        Statics.field2550.method1418(382, 0);
        class74.method1506();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field654[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1280[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2146[var22];
                    int var26 = Statics.field1952.field1301[var20];
                    Statics.field1952.field1301[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("dz.z(Lgl;Lgl;I)V")
    public static void method2492(class207 arg0, class207 arg1) {
        if (Statics.field1806 == null) {
            Statics.field1806 = class71.method500(Statics.field795, "sl_back", "");
        }
        if (Statics.field1915 == null) {
            Statics.field1915 = class71.method1765(Statics.field795, "sl_flags", "");
        }
        if (Statics.field2112 == null) {
            Statics.field2112 = class71.method1765(Statics.field795, "sl_arrows", "");
        }
        if (Statics.field835 == null) {
            Statics.field835 = class71.method1765(Statics.field795, "sl_stars", "");
        }
        class74.method1512(0, 23, 765, 480, 0);
        class74.method1513(0, 0, 125, 23, 12425273, 9135624);
        class74.method1513(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3502(class147.field2285, 62, 15, 0, -1);
        if (Statics.field835 != null) {
            Statics.field835[1].method1576(140, 1);
            arg1.method3500(class147.field2413, 152, 10, 16777215, -1);
            Statics.field835[0].method1576(140, 12);
            arg1.method3500(class147.field2361, 152, 21, 16777215, -1);
        }
        if (Statics.field2112 != null) {
            short var2 = 280;
            if (field677[0] == 0 && field678[0] == 0) {
                Statics.field2112[2].method1576(var2, 4);
            } else {
                Statics.field2112[0].method1576(var2, 4);
            }
            if (field677[0] == 0 && field678[0] == 1) {
                Statics.field2112[3].method1576(var2 + 15, 4);
            } else {
                Statics.field2112[1].method1576(var2 + 15, 4);
            }
            arg0.method3500(class147.field2236, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field677[0] == 1 && field678[0] == 0) {
                Statics.field2112[2].method1576(var3, 4);
            } else {
                Statics.field2112[0].method1576(var3, 4);
            }
            if (field677[0] == 1 && field678[0] == 1) {
                Statics.field2112[3].method1576(var3 + 15, 4);
            } else {
                Statics.field2112[1].method1576(var3 + 15, 4);
            }
            arg0.method3500(class147.field2416, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field677[0] == 2 && field678[0] == 0) {
                Statics.field2112[2].method1576(var4, 4);
            } else {
                Statics.field2112[0].method1576(var4, 4);
            }
            if (field677[0] == 2 && field678[0] == 1) {
                Statics.field2112[3].method1576(var4 + 15, 4);
            } else {
                Statics.field2112[1].method1576(var4 + 15, 4);
            }
            arg0.method3500(class147.field2417, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field677[0] == 3 && field678[0] == 0) {
                Statics.field2112[2].method1576(var5, 4);
            } else {
                Statics.field2112[0].method1576(var5, 4);
            }
            if (field677[0] == 3 && field678[0] == 1) {
                Statics.field2112[3].method1576(var5 + 15, 4);
            } else {
                Statics.field2112[1].method1576(var5 + 15, 4);
            }
            arg0.method3500(class147.field2418, var5 + 32, 17, 16777215, -1);
        }
        class74.method1512(708, 4, 50, 16, 0);
        arg1.method3502(class147.field2411, 733, 16, 16777215, -1);
        field679 = -1;
        if (Statics.field1806 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field676) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field676) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field676) {
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
            for (int var20 = 0; var20 < field676; var20++) {
                class23 var21 = Statics.field3026[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field583);
                if (var21.field583 == -1) {
                    var23 = class147.field2383;
                    var22 = false;
                } else if (var21.field583 > 1980) {
                    var23 = class147.field2322;
                    var22 = false;
                }
                byte var24;
                if (var21.method510()) {
                    if (var21.method506()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method506()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class131.field2022 >= var17 && class131.field2036 * -379793861 >= var16 && class131.field2022 < var6 + var17 && class131.field2036 * -379793861 < var7 + var16 && var22) {
                    field679 = var20;
                    Statics.field1806[var24].method1424(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1806[var24].method1418(var17, var16);
                }
                if (Statics.field1915 != null) {
                    Statics.field1915[(var21.method506() ? 8 : 0) + var21.field572].method1576(var17 + 29, var16);
                }
                arg0.method3502(Integer.toString(var21.field580), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3502(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3559(Statics.field3026[field679].field571) + 6;
                int var26 = arg1.field2975 + 8;
                class74.method1512(class131.field2022 - var25 / 2, class131.field2036 * -379793861 + 20 + 5, var25, var26, 16777120);
                class74.method1526(class131.field2022 - var25 / 2, class131.field2036 * -379793861 + 20 + 5, var25, var26, 0);
                arg1.method3502(Statics.field3026[field679].field571, class131.field2022, class131.field2036 * -379793861 + 20 + 5 + arg1.field2975 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2149.getGraphics();
            Statics.field1952.method1342(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2149.repaint();
        }
    }

    @ObfuscatedName("w.t(Leq;B)V")
    public static void method126(class135 arg0) {
        if (class131.field2032 != 1 && Statics.field2049 || class131.field2032 != 4) {
            return;
        }
        short var1 = 280;
        if (class131.field2021 >= var1 && class131.field2021 <= var1 + 14 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(0, 0);
            return;
        }
        if (class131.field2021 >= var1 + 15 && class131.field2021 <= var1 + 80 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(0, 1);
            return;
        }
        short var2 = 390;
        if (class131.field2021 >= var2 && class131.field2021 <= var2 + 14 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(1, 0);
            return;
        }
        if (class131.field2021 >= var2 + 15 && class131.field2021 <= var2 + 80 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(1, 1);
            return;
        }
        short var3 = 500;
        if (class131.field2021 >= var3 && class131.field2021 <= var3 + 14 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(2, 0);
            return;
        }
        if (class131.field2021 >= var3 + 15 && class131.field2021 <= var3 + 80 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(2, 1);
            return;
        }
        short var4 = 610;
        if (class131.field2021 >= var4 && class131.field2021 <= var4 + 14 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(3, 0);
            return;
        }
        if (class131.field2021 >= var4 + 15 && class131.field2021 <= var4 + 80 && class131.field2035 >= 4 && class131.field2035 <= 18) {
            method772(3, 1);
            return;
        }
        if (class131.field2021 >= 708 && class131.field2035 >= 4 && class131.field2021 <= 758 && class131.field2035 <= 20) {
            field675 = false;
            Statics.field660.method1418(0, 0);
            Statics.field2550.method1418(382, 0);
            Statics.field617.method1576(382 - Statics.field617.field1324 / 2, 18);
            return;
        }
        if (field679 == -1) {
            return;
        }
        class23 var5 = Statics.field3026[field679];
        method1864(var5);
        field675 = false;
        Statics.field660.method1418(0, 0);
        Statics.field2550.method1418(382, 0);
        Statics.field617.method1576(382 - Statics.field617.field1324 / 2, 18);
        return;
    }

    @ObfuscatedName("cv.y(Ld;S)V")
    public static void method1864(class23 arg0) {
        if (arg0.method506() != client.field435) {
            client.field435 = arg0.method506();
            Statics.method2059(arg0.method506());
        }
        Statics.field1830 = arg0.field570;
        client.field443 = arg0.field580;
        client.field241 = arg0.field578;
        Statics.field276 = client.field372 == 0 ? 43594 : arg0.field580 + 40000;
        Statics.field1492 = client.field372 == 0 ? 443 : arg0.field580 + 50000;
        Statics.field122 = Statics.field276;
    }

    @ObfuscatedName("bh.w(B)V")
    public static void method1300() {
        try {
            if (Statics.field69 == null) {
                Statics.field69 = new class17(Statics.field1532, new URL(Statics.field163));
            } else {
                byte[] var0 = Statics.field69.method157();
                if (var0 != null) {
                    class110 var1 = new class110(var0);
                    field676 = var1.method2292();
                    Statics.field3026 = new class23[field676];
                    int var2 = 0;
                    while (var2 < field676) {
                        class23 var3 = Statics.field3026[var2] = new class23();
                        var3.field580 = var1.method2292();
                        var3.field578 = var1.method2195();
                        var3.field570 = var1.method2150();
                        var3.field571 = var1.method2150();
                        var3.field572 = var1.method2142();
                        var3.field583 = var1.method2256();
                        var3.field573 = var2++;
                    }
                    method26(Statics.field3026, 0, Statics.field3026.length - 1, field677, field678);
                    field675 = true;
                    Statics.field69 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field69 = null;
        }
    }

    @ObfuscatedName("as.x(III)V")
    public static void method772(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field677[var5] != arg0) {
                var2[var4] = field677[var5];
                var3[var4] = field678[var5];
                var4++;
            }
        }
        field677 = var2;
        field678 = var3;
        method26(Statics.field3026, 0, Statics.field3026.length - 1, field677, field678);
    }

    @ObfuscatedName("k.v([Ld;II[I[IB)V")
    public static void method26(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field583;
                        var12 = var8.field583;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method506() ? 1 : 0;
                        var12 = var8.method506() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field580;
                        var12 = var8.field580;
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
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field583;
                        var16 = var8.field583;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method506() ? 1 : 0;
                        var16 = var8.method506() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field580;
                        var16 = var8.field580;
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
        method26(arg0, arg1, var6, arg3, arg4);
        method26(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
